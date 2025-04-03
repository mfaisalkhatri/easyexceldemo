package io.github.mfaisalkhatri.data;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;

@Data
public class SalaryData {
    @ExcelProperty ("amount")
    private Double  amount;
    @ExcelProperty ("designation")
    private String  designation;
    @ExcelProperty ("employeeNo")
    private Integer employeeNo;
}