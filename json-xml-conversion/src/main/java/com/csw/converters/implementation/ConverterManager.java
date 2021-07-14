package com.csw.converters.implementation;

import java.util.ArrayList;
import java.util.List;

public class ConverterManager {

    List<Converter> converterImpl = new ArrayList<>();

    public ConverterManager() {
        converterImpl.add(new ArrayConverter());
        converterImpl.add(new NumberConverter());
        converterImpl.add(new StringConverter());
        converterImpl.add(new ObjectConverter());
        converterImpl.add(new NullConverter());
        converterImpl.add(new BooleanConverter());
    }

    public String convertToXml(Object object, String name) {
        for (Converter converter : converterImpl) {
            if (converter.isConverter(object)) {
                return converter.convertToXML(object, name);
            }
        }
        return null;
    }
}
