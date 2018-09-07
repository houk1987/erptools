package org.erptools.reports.export;

import org.springframework.stereotype.Component;

import java.io.File;
import java.util.LinkedList;
import java.util.Map;


@Component
public class ReportExportToExcelFile  implements ReportExport{


    @Override
    public File export(LinkedList<Map<String, String>> reportData) {
        return new File("1.txt");
    }
}
