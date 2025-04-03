package io.github.mfaisalkhatri.data;

import java.util.ArrayList;
import java.util.List;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.read.listener.ReadListener;
import lombok.Getter;

@Getter
public class RegistrationDataListener implements ReadListener<RegistrationData> {

    private final List<RegistrationData> registrationDataList = new ArrayList<> ();

    @Override
    public void doAfterAllAnalysed (final AnalysisContext analysisContext) {
        System.out.println ("Finished reading file. Total Records: " + registrationDataList.size ());
    }

    @Override
    public void invoke (final RegistrationData registrationData, final AnalysisContext analysisContext) {
        System.out.println ("Reading row: " + registrationData);
        registrationDataList.add (registrationData);
    }
}