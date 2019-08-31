package com.example;


import org.apache.poi.openxml4j.exceptions.OpenXML4JException;

import java.io.IOException;
import java.io.InputStream;

public abstract class AbstractExcelSaxReader<T> implements ExcelSaxReader<T> {

    @Override
    public T read(InputStream in) throws IOException, OpenXML4JException {
        return read(in,-1);
    }
}
