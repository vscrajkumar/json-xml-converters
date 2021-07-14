package com.csw.converters.implementation;

public interface Converter {

    String convertToXML(Object object, String name);

    boolean isConverter(Object object);
}
