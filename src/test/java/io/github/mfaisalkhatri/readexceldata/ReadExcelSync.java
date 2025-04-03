package io.github.mfaisalkhatri.readexceldata;

import java.nio.file.Path;
import java.util.List;

import com.alibaba.excel.EasyExcel;
import io.github.mfaisalkhatri.data.EmployeeData;

public class ReadExcelSync {

    public static void main (String[] args) {

        String fileName = Path.of (System.getProperty ("user.dir") + "/src/test/resources/employee-data.xlsx")
            .toString ();
        long begin = System.currentTimeMillis ();

        List<EmployeeData> userList = EasyExcel.read (fileName)
            .head (EmployeeData.class)
            .sheet ()
            .doReadSync ();

        userList.forEach (System.out::println);
        long end = System.currentTimeMillis ();
        long totalTime = end - begin;

        System.out.println ("Total time taken to run program(in millis): " + totalTime);

        System.out.println (userList.get (0)
            .getName ());
        System.out.println (userList.get (1)
            .getEmailAddress ());

    }
}