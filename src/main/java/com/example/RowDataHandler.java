package com.example;

import java.util.List;

public interface RowDataHandler {

   /**
    *
    * @param sheetIndex sheet表
    * @param curRow 当前行
    * @param rowData 每行的数据
    */
   void  handle(int sheetIndex, int curRow, List<String> rowData);
}
