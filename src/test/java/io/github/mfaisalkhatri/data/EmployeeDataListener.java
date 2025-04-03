package io.github.mfaisalkhatri.data;

import java.util.ArrayList;
import java.util.List;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.read.listener.ReadListener;
import lombok.Getter;

@Getter
public class EmployeeDataListener implements ReadListener<EmployeeData> {

    private final List<EmployeeData> employeeDataList = new ArrayList<> ();

    @Override
    public void doAfterAllAnalysed (final AnalysisContext analysisContext) {
        System.out.println ("Finished reading file. Total Records: " + employeeDataList.size ());
    }

    @Override
    public void invoke (final EmployeeData employeeData, final AnalysisContext analysisContext) {
        System.out.println ("Reading row: " + employeeData);
        employeeDataList.add (employeeData);
    }
}