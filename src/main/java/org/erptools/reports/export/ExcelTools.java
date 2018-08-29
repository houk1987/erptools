package org.erptools.reports.export;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;

import java.io.*;

public class ExcelTools {

    private final static ExcelTools EXCEL_TOOLS = new ExcelTools();

    public static ExcelTools getInstance() {
        return EXCEL_TOOLS;
    }

    private ExcelTools(){

    }

    private Workbook createWorkBook(){
        Workbook workbook = new HSSFWorkbook();
        Sheet sheet = workbook.createSheet("new sheet");
        Row row = sheet.createRow(1);
        createCell(workbook,row,0,HorizontalAlignment.CENTER,VerticalAlignment.CENTER,"1");
        return workbook;
    }

    /**
     * Creates a cell and aligns it a certain way.
     *
     * @param wb     the workbook
     * @param row    the row to create the cell in
     * @param column the column number to create the cell in
     * @param halign the horizontal alignment for the cell.
     * @param valign the vertical alignment for the cell.
     */
    private static void createCell(Workbook wb, Row row, int column, HorizontalAlignment halign, VerticalAlignment valign,String value) {
        Cell cell = row.createCell(column);
        cell.setCellValue(value);
        CellStyle cellStyle = wb.createCellStyle();
        cellStyle.setAlignment(halign);
        cellStyle.setVerticalAlignment(valign);
        cell.setCellStyle(cellStyle);
    }


    public void buildExcelFile(String fileName){
        try {
            Workbook workbook  = this.createWorkBook();
            workbook.write(new FileOutputStream(fileName));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Workbook wb = new HSSFWorkbook();
        String path = "/Users/xuxiongli/java/erptools/";
        try  (OutputStream fileOut = new FileOutputStream(path+"workbook.xls")) {
            wb.write(fileOut);
        } catch (IOException e) {
            e.printStackTrace();
        }
        while (true){

        }
    }
}
