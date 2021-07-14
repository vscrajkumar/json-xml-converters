package com.csw.converters.implementation;

public class NullConverter implements Converter {

    @Override
    public boolean isConverter(Object object) {
        return object == null;
    }

    @Override
    public String convertToXML(Object object, String name) {
        String xmlString = null;
        if (name != null && !name.isEmpty()) {
            xmlString = "<null name=" + "\"" + name + "\"/>";
        } else {
            xmlString = "<null/>";
        }
        return xmlString;
    }

}
