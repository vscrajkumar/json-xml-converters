package com.csw.converters.implementation;

import java.util.Set;

import org.json.simple.JSONObject;

public class ObjectConverter implements Converter {

    @Override
    public boolean isConverter(Object object) {
        return object != null && object.getClass().getSimpleName().equals("JSONObject");
    }

    @Override
    public String convertToXML(Object object, String name) {
        JSONObject jsonObject = (JSONObject) object;
        StringBuffer xmlString = new StringBuffer();
        if (name != null && !name.isEmpty()) {
            xmlString.append("<object name=" + "\"" + name + "\">");
        } else {
            xmlString.append("<object>");
        }

        @SuppressWarnings("unchecked")
        Set<String> keySet = jsonObject.keySet();

        for (String key : keySet) {
            Object value = jsonObject.get(key);
            xmlString.append(new ConverterManager().convertToXml(value, key));
        }

        xmlString.append("</object>");

        return xmlString.toString();

    }
}
