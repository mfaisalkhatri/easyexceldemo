package io.github.mfaisalkhatri.readexceldata;

import java.nio.file.Path;

import com.alibaba.excel.EasyExcel;
import io.github.mfaisalkhatri.data.EmployeeData;
import io.github.mfaisalkhatri.data.EmployeeDataListener;

public class ReadExcelAsync {

    public static void main (String[] args) {
        long begin = System.currentTimeMillis ();

        String fileName = Path.of (System.getProperty ("user.dir") + "/src/test/resources/employee-data.xlsx")
            .toString ();
        EmployeeDataListener employeeDataListener = new EmployeeDataListener ();
        EasyExcel.read (fileName, EmployeeData.class, employeeDataListener)
            .sheet ()
            .doRead ();
        String email = employeeDataListener.getEmployeeDataList ()
            .get (0)
            .getEmailAddress ();
        System.out.println (email);

        long end = System.currentTimeMillis ();
        long totalTime = end - begin;
        System.out.println ("Total time taken to run the program(in millis): " + totalTime);
    }
}