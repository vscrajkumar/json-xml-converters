package com.csw.converters.implementation;

public class NumberConverter implements Converter {

    @Override
    public boolean isConverter(Object object) {
        return object != null && object.getClass().getSimpleName().equals("Long");
    }

    @Override
    public String convertToXML(Object object, String name) {
        String xmlString = null;
        if (name != null && !name.isEmpty()) {
            xmlString = "<number name=" + "\"" + name + "\">" + object;
        } else {
            xmlString = "<number>" + object;
        }
        return xmlString + "</number>";
    }
}
