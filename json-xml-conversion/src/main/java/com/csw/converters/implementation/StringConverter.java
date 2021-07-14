package com.csw.converters.implementation;

public class StringConverter implements Converter {

    @Override
    public boolean isConverter(Object object) {
        return object != null && object.getClass().getSimpleName().equals("String");
    }

    @Override
    public String convertToXML(Object object, String name) {
        String xmlString = null;
        if (name != null && !name.isEmpty()) {
            xmlString = "<string name=" + "\"" + name + "\">" + object;
        } else {
            xmlString = "<string>" + object;
        }
        return xmlString + "</string>";
    }

}
