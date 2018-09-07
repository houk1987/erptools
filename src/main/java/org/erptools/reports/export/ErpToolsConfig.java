package org.erptools.reports.export;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ErpToolsConfig {

    @Bean
    public ReportExport getReportExportToExcelFile(){
        return new ReportExportToExcelFile();
    }
}
