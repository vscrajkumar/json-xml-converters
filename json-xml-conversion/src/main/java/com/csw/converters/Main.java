package com.csw.converters;

import java.io.File;

public class Main {

    public static void main(String commandLineArgumants[]) throws Exception {
        
        int argsLength = commandLineArgumants.length;
        if( argsLength!=2 ) {
            System.out.println("USAGE : json-xml-conversion.jar <json-fileName> <xml_fileName> ");
            return;
        }
        
        XMLJSONConverterI xmlJsonConverter=ConverterFactory.createXMLJSONConverter();
        File jsonFile = new File (commandLineArgumants[0]);
        File xmlFile = new File (commandLineArgumants[1]);
        xmlJsonConverter.convertJSONtoXML(jsonFile,xmlFile);
    }
}
