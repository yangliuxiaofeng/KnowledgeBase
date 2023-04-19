package com.lsc.controller;

import com.alibaba.excel.EasyExcel;
import com.lsc.entity.ExcelData;
import com.lsc.service.ExcelService;
import com.lsc.util.ExcelListener;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;

@RestController
@Api(value = "ExcelController", tags = { "接口" })
@RequestMapping("/ExcelController")
public class ExcelCtrler {

    @Autowired
    public ExcelService excelService;

    @PostMapping("/upload/excel")
    public String writeAddSave(MultipartFile excelFile){
        try {
            InputStream inputStream = excelFile.getInputStream();
            EasyExcel.read(inputStream, ExcelData.class, new ExcelListener(excelService)).sheet().doRead();
        } catch (IOException e) {
            e.printStackTrace();
            return "保存失败";
        }
        return "保存成功";
    }
}
