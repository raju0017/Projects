<SOAP-ENV:Envelope
	SOAP-ENV:encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"
	xmlns:SOAP-ENV="http://schemas.xmlsoap.org/soap/envelope/"
	xmlns:xsd="http://www.w3.org/2001/XMLSchema"
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xmlns:SOAP-ENC="http://schemas.xmlsoap.org/soap/encoding/"
	xmlns:tns="urn:prepay">
	<SOAP-ENV:Body>
		<ns1:prepayRechargeResponse xmlns:ns1="prepay">
			<return xsi:type="tns:PrepayRechargeResponse"> <status
				xsi:type="xsd:string">IE000</status> <correlation
				xsi:type="tns:Correlation"> <mobiquityTransactionId
				xsi:type="xsd:string">18364982</mobiquityTransactionId> <thirdPartyTransactionId
				xsi:type="xsd:string">000116932705701</thirdPartyTransactionId> </correlation> </return>
		</ns1:prepayRechargeResponse>
	</SOAP-ENV:Body>
</SOAP-ENV:Envelope>