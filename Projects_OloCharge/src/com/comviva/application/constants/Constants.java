package com.comviva.application.constants;

public class Constants
{
	// Transaction Id Generator Constants
	public static final String DATE_FORMAT = "yy:MM:dd:HH:mm:ss";
	public static final int MIN_LEGTH_FIXED = 20;
	public static final String NODE_ID = "1";
	public static final String PREFIX_ENABLED = "PREFIX_ENABLED";
	public static final String PREFIX_ID = "PREFIX";
	public static final int NUMBER_LIMIT = 12;
	public static final int MAX_LENGTH = 10;
	public static final String PREFIX_DEFAULT = "123";
	public static final String ZERO_STRING = "0";

	// Prepare Response Constants
	public static final String UTF_CODE = "UTF-8";
	public static final String HEADER_FREEFLOWSTATE = "Freeflow";
	public static final String FREEFLOW_BREAK = "FB";
	public static final String FREEFLOW_CONTINUE = "FC";
	public static final String EMPTY_RESPONSE = "EMPTY_RESPONSE";
	public static final String DEFAULT_MESSAGE = "Default_message";

	// CDREDR Utils Constants
	public static final String CDR_DEFAULT_VALUE = "default";
	public static final String CDR_DELIMITER = "delimiter";
	public static final String CDR_END = "end";
	public static final String CDR_DATE_FORMAT = "dateformat";
	public static final String CDR_TIMESTAMP = "timestamp";
	public static final String COLON = ":";

	// Utils Constants
	public static final String DEFAULT_FAILURE_MESSAGE = "Default_failure_message";
	public static final String UNDERSCORE = "_";
	public static final int ZERO = 0;
	public static final String TRUE_VALUE1 = "T";
	public static final String TRUE_VALUE2 = "Y";
	public static final String TRUE_VALUE3 = "1";
	public static final String TRUE_VALUE4 = "true";
	public static final int MINUS_ONE = -1;
	
	// Configurations Props Constants
	public static final String EDR_SECTION_NAME = "EDR";
	public static final String BLANK_EDR_ENTRY_PERIOD = "blankEdrEntryPeriod";
	public static final String EDR_PIN_REQ = "isEdrPinReq";
	public static final String EDR_DELIMITER = "delimiter";
	public static final String EDR_DEFAULT_VALUE = "default";
	public static final String EDR_END = "end";
	public static final String EDR_DATE_FORMAT = "dateformat";
	public static final String EDR_EXTERNALTNX_DEFAULT_VALUE = "external_transaction_default";
	public static final String EDR_EXTERNALTNX_DELIMITER = "external_trsansaction_delimiter";
	public static final String DEFAULT_EXPIRY_DATE_FORMAT = "yyyy-MM-dd";
	
	public static final String REFNUM = "REFNUM";
	public static final String SESSION_TIME_OUT = "SESSION_TIME_OUT";
	public static final String MSISDN_LENGTH = "MSISDN_LENGTH";
	public static final String COUNTRYCODE = "COUNTRYCODE";
	public static final String COUNTRYCODE_REQ = "COUNTRYCODE_REQ";
	public static final String REMOVE_ZERO = "REMOVE_ZERO";
	public static final String COMPANY_CODE = "COMPANY_CODE";
	public static final String MOBIQUITY_TRANSACTION_ID = "MOBIQUITY_TRANSACTION_ID";
	
	public static final String USERNAME = "USERNAME";
	public static final String PASSWORD = "PASSWORD";
	public static final String END_POINT_URL = "END_POINT_URL";
	public static final String CONNECTION_TIME_OUT = "CONNECTION_TIME_OUT";

	// Property Reader Constants
	public static final String LOG4J_PROPERTIES = "log4j.properties";
	public static final String APPLICATION_INI = "application.ini";
	public static final String GLOBAL = "Global";
	public static final String BAR = "./";
	public static final String CONF = "conf";
	public static final String INSTALL_PATH = "app.install.path";
	public static final String RESOURCE_BUNDLE_OLO_RECHARGE = "MessageResources";
	
	// CommonUtils Constatns
	public static final String AMPERSAND = "&";
	public static final String EQUALS = "=";

	// RequestParser Constants
	public static final String LOGID_FORMAT = "[ <APPNAME>:<MSISDN>:<COMMON_TRANS_ID> ]";
	public static final String INPUT_COMMON_TRANSACTION_ID = "commonTransactionId";
	public static final String MSISDN = "<MSISDN>";
	public static final String APP_NAME = "<APPNAME>";
	public static final String COMMON_TRANSACTION_ID = "<COMMON_TRANS_ID>";
	public static final String INPUT_LANGUAGE = "language";
	public static final String DEFAULT_LANGUAGE = "es";
	public static final String INPUT_CUSTOMER_ID = "customerId";
	public static final String IS_NEW_REQUEST = "isNewRequest";
	public static final String IS_REQUEST = "isRequest";
	public static final String SUBSCRIBER_INPUT = "subscriberInput";
	public static final String INPUT_MSISDN = "msisdn";
	public static final String INPUT_PIN = "pin";
	public static final String YES = "Y";
	public static final String NO = "N";

	// Common Constants
	public static final String EMPTY = "";
	public static final String NEW_LINE = "\n";
	
	// Olo Recharge Servlet Constants
	public static final String APP_ID_OLO_RECHARGE = "OLO"; 
	public static final String ONE_STRING = "1";
	public static final String TWO_STRING = "2";
	public static final String QUESTIONARY1 = "QUESTION1";
	public static final String MENU = "MENU";
	public static final String CONFIRM = "CONFIRM";
	public static final String ABORT_MESSAGE = "101";
	public static final String INVALID_OPTION_MESSAGE = "102";
	public static final String MANDATORY_PARAM_MESSAGE = "103";
	public static final String REPLACE_PLAN = "<PLAN>";
	public static final String REPLACE_CUSTOMER_ID = "<CUSTOMER_ID>";
	
	// Olo Recharge Processor
	public static final String EDR_LOGGER_SUFFIX = "_EDR";
	

}
