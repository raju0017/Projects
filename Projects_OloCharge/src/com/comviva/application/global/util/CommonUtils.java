/*********************************************************************
 * COPYRIGHT: JATAAYU SOFTWARE (P) LTD.
 *
 * This software is the sole property of  Jataayu and is protected
 * by copyright law and international treaty provisions. Unauthorized
 * reproduction or redistribution of this program, or any portion of
 * it may result in severe civil and criminal penalties and will be
 * prosecuted to the maxmimum extent possible under the law.
 *
 * Jataayu reserves all rights not expressly granted. You may not
 * reverse engineer, decompile, or disassemble the  software, except
 * and only to the extent that such activity is expressly permitted
 * by applicable law notwithstanding this limitation.
 *
 * THIS SOFTWARE IS PROVIDED TO YOU "AS IS" WITHOUT  WARRANTY  OF ANY
 * KIND, EITHER EXPRESS OR IMPLIED, INCLUDING BUT  NOT LIMITED TO
 * THE  IMPLIED  WARRANTIES  OF MERCHANTABILITY AND/OR FITNESS FOR A
 * PARTICULAR PURPOSE. YOU  ASSUME THE ENTIRE RISK AS TO THE ACCURACY
 * AND THE  USE  OF  THIS  SOFTWARE.  JATAAYU SHALL NOT BE LIABLE FOR
 * ANY DAMAGES WHATSOEVER ARISING OUT OF THE USE OF OR INABILITY TO
 * USE THIS SOFTWARE, EVEN IF JATAAYU  HAS  BEEN  ADVISED  OF  THE
 * POSSIBILITY OF SUCH DAMAGE.
 *********************************************************************
 *
 * @author alankar
 * 06-May-2010
 */

package com.comviva.application.global.util;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;

import com.comviva.application.constants.Constants;

public class CommonUtils
{
	private static final Logger LOGGER = Logger.getLogger(CommonUtils.class);

	/**
	 * This method is responsible for reading HTTP get and post method
	 * parameters by considering the unicode request parameter values.
	 * 
	 * @param request
	 *            - HttpServletRequest
	 * @return map - Parameters Map
	 */
	public static Map<String, String> getParametersMap(HttpServletRequest request)
	{
		Map<String, String> reqParamsMap = new HashMap<String, String>();

		String queryString = request.getQueryString();
		if (queryString != null && queryString.trim().isEmpty() == false)
		{
			String[] arr = queryString.split(Constants.AMPERSAND);
			for (String param : arr)
			{
				try
				{
					int indexOf = param.indexOf(Constants.EQUALS);
					if (indexOf != -1)
					{
						String parameterName = param.substring(0, indexOf);
						String parameterValue = param.substring(indexOf + 1);
						reqParamsMap.put(parameterName, decodeString(parameterValue));
					}
				}
				catch (StringIndexOutOfBoundsException e)
				{
					LOGGER.error("Error in getting parameters", e);
				}
			}
		}

		String line = null;
		BufferedReader br = null;
		InputStream inputStream = null;
		StringBuilder sb = new StringBuilder();
		try
		{
			inputStream = request.getInputStream();
			br = new BufferedReader(new InputStreamReader(inputStream));
			while ((line = br.readLine()) != null)
			{
				sb.append(line);
			}
		}
		catch (Exception e)
		{
			LOGGER.error("Error : ", e);
		}
		finally
		{
			if (br != null)
			{
				try
				{
					br.close();
				}
				catch (Exception e)
				{
					LOGGER.error("Error : ", e);
				}
			}
		}

		String postData = sb.toString();

		if (postData != null && postData.trim().isEmpty() == false)
		{
			String[] arr = postData.split(Constants.AMPERSAND);
			for (String param : arr)
			{
				try
				{
					int indexOf = param.indexOf(Constants.EQUALS);
					if (indexOf != -1)
					{
						String parameterName = param.substring(0, indexOf);
						String parameterValue = param.substring(indexOf + 1);
						reqParamsMap.put(parameterName, decodeString(parameterValue));
					}
				}
				catch (Exception e)
				{
					LOGGER.error("Error in getting parameters", e);
				}
			}
		}

		if (LOGGER.isTraceEnabled())
		{
			LOGGER.trace("Request Parameters Map : " + reqParamsMap);
		}
		return reqParamsMap;
	}

	public static String decodeString(String encodedString)
	{
		String retVal = null;
		try
		{
			retVal = URLDecoder.decode(encodedString, "UTF-8");
		}
		catch (UnsupportedEncodingException e)
		{
			LOGGER.error("Error in decoding", e);
		}
		return retVal;
	}

	private static final byte[] HEX = "0123456789ABCDEF".getBytes();

	private static final char[] DIGITS = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e',
			'f' };

	public static void hexDump(byte[] data, int off, int len)
	{
		int count = (len - off + 1);
		int size = (count / 16 + 1) * 2 + (count + 15) * 4;
		char[] buffer = new char[size];
		int i = 0, j = 0, k = 0;

		for (i = off; i < len; i++, j++)
		{
			if (j > 0 && j % 16 == 0)
			{
				buffer[k++] = ' ';
				for (int p = i - 16; p < i; p++)
				{
					if (data[p] >= 0x20)
					{
						buffer[k++] = (char) data[p];
					}
					else
					{
						buffer[k++] = '.';
					}
				}
				buffer[k++] = '\n';
			}

			buffer[k++] = (char) (HEX[(data[i] >> 4) & 0x0F]);
			buffer[k++] = (char) (HEX[data[i] & 0x0F]);
			buffer[k++] = ' ';
		}

		if (j % 16 > 0)
		{
			for (int p = 0; p < (16 - (j % 16)) * 3 + 1; p++)
			{
				buffer[k++] = ' ';
			}

			for (int p = i - (j % 16); p < i && p < len; p++)
			{
				if (data[p] >= 0x20)
				{
					buffer[k++] = (char) data[p];
				}
				else
				{
					buffer[k++] = '.';
				}
			}
		}
		buffer[k++] = '\n';
		if (LOGGER.isDebugEnabled())
		{
			LOGGER.debug("/***************************START RESPONSE******************************************/");
			LOGGER.debug(new String(buffer, 0, k));
			LOGGER.debug("/***************************END RESPONSE********************************************/");
		}
		// System.out.println((new String(buffer, 0, k)));
	}

	public static char[] encodeHex(byte[] data)
	{
		int l = data.length;

		char[] out = new char[l << 1];

		// two characters form the hex value.
		for (int i = 0, j = 0; i < l; i++)
		{
			out[j++] = DIGITS[(0xF0 & data[i]) >>> 4];
			out[j++] = DIGITS[0x0F & data[i]];
		}

		return out;
	}

	public byte[] hexStringToByteArray(String s)
	{
		int len = s.length();
		byte[] data = new byte[len / 2];
		for (int i = 0; i < len; i += 2)
		{
			data[i / 2] = (byte) ((Character.digit(s.charAt(i), 16) << 4) + Character.digit(s.charAt(i + 1), 16));
		}
		return data;
	}

}
