package com.example;

import org.apache.poi.openxml4j.exceptions.OpenXML4JException;

import java.io.IOException;
import java.io.InputStream;

public interface ExcelSaxReader<T> {

 T read(InputStream in, Integer relId) throws OpenXML4JException, IOException;


 T read(InputStream in) throws IOException, OpenXML4JException;
}
