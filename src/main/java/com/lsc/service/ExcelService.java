package com.lsc.service;

import com.lsc.entity.ExcelData;
import org.springframework.stereotype.Service;

@Service
public class ExcelService {
    //假装调用了数据库保存操作
    public void save(ExcelData excelData) {
        System.out.println("调用了保存方法 " + excelData);
    }
}
