package io.github.mfaisalkhatri.data;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;

@Data
public class RegistrationData {

    @ExcelProperty ("city")
    private String city;
    @ExcelProperty ("country")
    private String country;
    @ExcelProperty ("dob")
    private String dob;
    @ExcelProperty ("emailAddress")
    private String emailAddress;
    @ExcelProperty ("firstName")
    private String firstName;
    @ExcelProperty ("lastName")
    private String lastName;
    @ExcelProperty ("password")
    private String password;
    @ExcelProperty ("phone")
    private String phone;
    @ExcelProperty ("postalCode")
    private String postalCode;
    @ExcelProperty ("state")
    private String state;
    @ExcelProperty ("street")
    private String street;
}