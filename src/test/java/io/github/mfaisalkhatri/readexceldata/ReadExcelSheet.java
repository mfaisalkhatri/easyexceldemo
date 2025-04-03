package io.github.mfaisalkhatri.readexceldata;

import java.nio.file.Path;
import java.util.List;

import com.alibaba.excel.EasyExcel;
import io.github.mfaisalkhatri.data.SalaryData;

public class ReadExcelSheet {
    public static void main (String[] args) {
        String fileName = Path.of (System.getProperty ("user.dir") + "/src/test/resources/employee-data.xlsx")
            .toString ();
        List<SalaryData> salaryDataList = EasyExcel.read (fileName)
            .head (SalaryData.class)
            .sheet ("salaryData")
            .doReadSync ();
        salaryDataList.forEach (System.out::println);
        System.out.println (salaryDataList.get (0)
            .getAmount ());
    }
}