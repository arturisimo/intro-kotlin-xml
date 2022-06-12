# Parse XML KOTLIN

## XSD

Generate XSD from XML using trang: https://github.com/relaxng/jing-trang

    java -jar .\trang.jar -I xml -O xsd pms.xml pms.xsd


## XJC 

Generate JAXB classes using org.unbroken-dome.xjc plugin - https://unbroken-dome.github.io/projects/gradle-xjc-plugin/

Read schema/pms.xsd and generates classes in build/generated/xjx/java/main/generated

    ./gradlew :xjcGenerate


## JAXB XML Parse

JAXB provides a fast and convenient way to marshal (write) Java objects into XML and unmarshal (read) XML into objects. It supports a binding framework that maps XML elements and attributes to Java fields and properties using Java annotations:

* @XmlRootElement: The name of the root XML element is derived from the class name, and we can also specify the name of the root element of the XML using its name attribute.
* @XmlType: define the order in which the fields are written in the XML file
* @XmlElement: define the actual XML element name that will be used
* @XmlAttribute: define the id field is mapped as an attribute instead of an element
* @XmlTransient: annotate fields that we don't want to be included in XML

https://javaee.github.io/jaxb-v2/

## Unirest HTTP Client

http://kong.github.io/unirest-java/

## Public XML API

https://informo.madrid.es/informo/tmadrid/pm.xml

## DOM Parsers

https://mkyong.com/java/how-to-read-xml-file-in-java-dom-parser/
