package com.lsc.util;

import com.alibaba.excel.EasyExcel;
import com.lsc.entity.ExcelData;

import java.util.ArrayList;
import java.util.List;

public class ExcelUtil {
    public static void main(String[] args){
        String fileName = "C:\\Users\\lsc\\Desktop\\easyexcel\\demo.xlsx";
        //写入excel
        EasyExcel.write(fileName, ExcelData.class).sheet("easyexecl写demo").doWrite(getData());
        //读excel
        EasyExcel.read(fileName, ExcelData.class, new ExcelListener()).sheet().doRead();
    }

    public static List<ExcelData> getData(){
        ArrayList<ExcelData> list = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            ExcelData excelData = new ExcelData();
            excelData.setData1("第一列" + i);
            excelData.setData2("第二列" + i);
            list.add(excelData);
        }
        return list;
    }
}
