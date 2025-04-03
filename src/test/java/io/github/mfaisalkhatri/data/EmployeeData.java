package io.github.mfaisalkhatri.data;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;

@Data
public class EmployeeData {

    @ExcelProperty ("age")
    private Integer age;
    @ExcelProperty ("emailAddress")
    private String  emailAddress;
    @ExcelProperty ("empNo")
    private Integer empNo;
    @ExcelProperty ("isValid")
    private Boolean isValid;
    @ExcelProperty ("mobileNumber")
    private String  mobileNumber;
    @ExcelProperty ("name")
    private String  name;
}