package org.erptools.reports.export;

import java.util.*;

public class ExportExcelReport implements ReportsExport {
    @Override
    public List<Map<String, Object>> findExportData() {
        List<Map<String, Object>> datas = new ArrayList<>();
        int count = 1;
        while (count > 0) {
            Map<String, Object> rowData = new HashMap<>();
            for (int i = 0; i < 10; i++) {
                rowData.put(String.valueOf(i), i);
            }
            datas.add(rowData);
            count--;
        }
        return datas;
    }

    @Override
    public void buildReport() {

    }

    @Override
    public void exportReport() {

    }

    public static void main(String[] args) {
        ReportsExport reportsExport = new ExportExcelReport();
        List<Map<String, Object>> datas = reportsExport.findExportData();
        for (Map<String, Object> rowData : datas) {
            Set<Map.Entry<String, Object>> entries = rowData.entrySet();
            Iterator<Map.Entry<String, Object>> iterator = entries.iterator();
            while (iterator.hasNext()){
                Map.Entry<String, Object> entry = iterator.next();
                System.out.println("key:"+entry.getKey()+"value:"+entry.getValue());
            }
        }
    }
}
