package com.csw.converters;

/**
 * Factory class for creating instances of {@link XMLJSONConverterI}.
 */
public final class ConverterFactory {

    /**
     * You should implement this method having it return your version of
     * {@link com.csw.converters.XMLJSONConverterI}.
     *
     * @return {@link com.csw.converters.XMLJSONConverterI} implementation you
     *         created.
     */
    public static final XMLJSONConverterI createXMLJSONConverter() {

        XMLJSONConverterI xMLJSONConverterl = null;
        try {
            xMLJSONConverterl = new JSONXMLConverter();
        } catch (Exception e) {
            throw new UnsupportedOperationException("Please implement me!");
        }
        return xMLJSONConverterl;
    }
}
