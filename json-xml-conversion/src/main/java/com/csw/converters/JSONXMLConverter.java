package com.csw.converters;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.csw.converters.implementation.ConverterManager;

public class JSONXMLConverter implements XMLJSONConverterI {

    @Override
    public void convertJSONtoXML(File jsonFile, File xmlFile) throws IOException {
        JSONParser parser = new JSONParser();
        StringBuffer xmlContent = new StringBuffer();
        try (FileReader fileReader = new FileReader(jsonFile)) {
            Object object = parser.parse(fileReader);
            xmlContent.append(new ConverterManager().convertToXml(object, null));
        } catch (ParseException e) {
            e.printStackTrace();
            throw new IOException();
        }

        writeXMLFile(xmlContent.toString(), xmlFile);
    }

    private void writeXMLFile(String xmlString, File xmlFile) throws IOException {
        try (FileWriter fw = new FileWriter(xmlFile); BufferedWriter bw = new BufferedWriter(fw)) {
            bw.write(xmlString);
            bw.newLine();
        }
    }

}