<soap-env:envelope
	soap-env:encodingstyle="http://schemas.xmlsoap.org/soap/encoding/"
	xmlns:soap-env="http://schemas.xmlsoap.org/soap/envelope/"
	xmlns:xsd="http://www.w3.org/2001/xmlschema"
	xmlns:xsi="http://www.w3.org/2001/xmlschema-instance"
	xmlns:soap-enc="http://schemas.xmlsoap.org/soap/encoding/"
	xmlns:tns="urn:prepay">
	<soap-env:body>
		<ns1:validatecustomerresponse xmlns:ns1="prepay">
			<return xsi:type="tns:validatecustomerresponse"> 
				<status xsi:type="xsd:string">ie000</status> 
				<name xsi:type="xsd:string">julio eduardo</name> 
				<type xsi:type="xsd:string">0</type> 
				<num_plans xsi:type="xsd:string">5</num_plans> 
				<plans xsi:type="soap-enc:array" soap-enc:arraytype="tns:validatecustomerplan[5]"> 
					<item xsi:type="tns:validatecustomerplan"> 
						<id xsi:type="xsd:string">98</id> 
						<name xsi:type="xsd:string">olo ilim 5mbps veloc. 30 d (topup) (s/.129)</name> 
						<price xsi:type="xsd:string">129</price>
					</item> 
					<item xsi:type="tns:validatecustomerplan"> 
						<id xsi:type="xsd:string">538</id> 
						<name xsi:type="xsd:string">new olo ilim 1mbps veloc. 30 d (topup) (s/.99)</name> 
						<price xsi:type="xsd:string">99</price> 
					</item> 
					<item xsi:type="tns:validatecustomerplan"> 
						<id xsi:type="xsd:string">326</id> 
						<name xsi:type="xsd:string">new olo ilim 7-1mbps veloc. 30 d (topup) (s/.149)</name> 
						<price xsi:type="xsd:string">149</price> 
					</item> 
					<item xsi:type="tns:validatecustomerplan"> 
						<id xsi:type="xsd:string">249</id> 
						<name xsi:type="xsd:string">olo ilim 10-1mbps veloc. 30 d (topup) (s/.159)</name> 
						<price xsi:type="xsd:string">159</price> 
					</item> 
					<item xsi:type="tns:validatecustomerplan"> 
						<id xsi:type="xsd:string">502</id> 
						<name xsi:type="xsd:string">new olo ilim 3-1mbps veloc. 30 d (topup) (s/.119)</name> 
						<price xsi:type="xsd:string">119</price> 
					</item> 
				</plans> 
			</return>
		</ns1:validatecustomerresponse>
	</soap-env:body>
</soap-env:envelope>