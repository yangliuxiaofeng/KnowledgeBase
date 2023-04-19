package com.lsc.entity;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;

@Data
public class ExcelData {

    @ExcelProperty(value = "第一列", index = 0)
    private String data1;

    @ExcelProperty(value = "第二列", index = 1)
    private String data2;
}
