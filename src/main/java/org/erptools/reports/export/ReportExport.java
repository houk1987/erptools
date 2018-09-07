package org.erptools.reports.export;

import java.io.File;
import java.util.LinkedList;
import java.util.Map;


public interface ReportExport {

    File export(LinkedList<Map<String,String>> reportData);
}
