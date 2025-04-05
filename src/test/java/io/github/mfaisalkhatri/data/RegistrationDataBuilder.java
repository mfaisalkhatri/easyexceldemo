package io.github.mfaisalkhatri.data;

import java.nio.file.Path;
import java.util.List;

import com.alibaba.excel.EasyExcel;

public class RegistrationDataBuilder {
    private static final String TEST_DATA_FILE = Path.of (
            System.getProperty ("user.dir") + "/src/test/resources/registration-test-data.xlsx")
        .toString ();

    public List<RegistrationData> getRegistrationData () {
        RegistrationDataListener registrationDataListener = new RegistrationDataListener ();
        EasyExcel.read (TEST_DATA_FILE, RegistrationData.class, registrationDataListener)
            .sheet ()
            .doRead ();
        return registrationDataListener.getRegistrationDataList ();
    }
}