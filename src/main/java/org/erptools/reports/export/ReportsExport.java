package org.erptools.reports.export;

import java.util.List;
import java.util.Map;

public interface ReportsExport {

    List<Map<String,Object>> findExportData();

    void buildReport();

    void exportReport();
}
