package com.lsc.util;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import com.lsc.entity.ExcelData;

import java.util.Map;


public class ExcelListener extends AnalysisEventListener<ExcelData> {

    /**
     * 读取表头
     *
     * @param headMap  表头
     * @param context
     */
    public void invokeHeadMap(Map<Integer, String> headMap, AnalysisContext context) {
        System.out.println("表头内容 = " + headMap);
    }

    /**
     * 一行一行的读取
     *
     * @param readData        实体类
     * @param analysisContext
     */
    @Override
    public void invoke(ExcelData readData, AnalysisContext analysisContext) {
        System.out.println("readData = " + readData);
        System.out.println("readData.getData1() = " + readData.getData1());
        System.out.println("readData.getData2() = " + readData.getData2());
    }

    /**
     * 读取完成后要做的事
     *
     * @param analysisContext
     */
    @Override
    public void doAfterAllAnalysed(AnalysisContext analysisContext) {

    }
}
