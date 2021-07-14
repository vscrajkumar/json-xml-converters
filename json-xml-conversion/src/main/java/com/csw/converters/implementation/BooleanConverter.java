package com.csw.converters.implementation;

public class BooleanConverter implements Converter {
    
    @Override
    public boolean isConverter(Object object) {
        return object != null && object.getClass().getSimpleName().equals("Boolean");
    }

    @Override
    public String convertToXML(Object object, String name) {
        String xmlString = null;
        if (name != null && !name.isEmpty()) {
            xmlString = "<boolean name=" + "\"" + name + "\">" + object;
        } else {
            xmlString = "<boolean>" + object;
        }
        return xmlString + "</boolean>";
    }
}
