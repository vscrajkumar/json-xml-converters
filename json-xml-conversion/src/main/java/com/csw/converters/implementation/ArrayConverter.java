package com.csw.converters.implementation;

import org.json.simple.JSONArray;

public class ArrayConverter implements Converter {

    @Override
    public boolean isConverter(Object object) {
        return object != null && object.getClass().getSimpleName().equals("JSONArray");
    }

    @Override
    public String convertToXML(Object object, String name) {
        StringBuffer xmlString = new StringBuffer();
        if (name != null && !name.isEmpty()) {
            xmlString.append("<array name=" + "\"" + name + "\">");
        } else {
            xmlString.append("<array>");
        }

        for (Object obj : (JSONArray) object) {
            xmlString.append(new ConverterManager().convertToXml(obj, null));
        }

        xmlString.append("</array>");

        return xmlString.toString();
    }
}
