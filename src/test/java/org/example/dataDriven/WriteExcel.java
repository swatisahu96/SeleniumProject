package org.example.dataDriven;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class WriteExcel {


    @Test
    public void writeIntoExcel() throws IOException {


        Map<String, Object> excelData = new TreeMap<>();
        excelData.put("1", new Object[]{"Email", "Password"});
        excelData.put("2", new Object[]{"93npu2yyb0@esiix.co", "wingify@123"});
        excelData.put("3", new Object[]{"Pramod@live.com", "123456"});

        createExcel(excelData, "CTD.xlsx");


    }

    public static String createExcel(Map Data, String fileName) throws IOException {
        Set<String> keyset = Data.keySet();

        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("Main");

        int rownum = 0;

        for (String key : keyset) {

            Row r = sheet.createRow(rownum++);
            Object[] objectA = (Object[]) Data.get(key);

            int cellnum = 0;
            for (Object o : objectA) {
                Cell cell = r.createCell(cellnum++);
                if (o instanceof String) {
                    cell.setCellValue((String) o);
                }
                if (o instanceof Integer) {
                    cell.setCellValue((Integer) o);
                }

            }
        }

        FileOutputStream fileOutputStream = new FileOutputStream(new File(fileName));
        workbook.write(fileOutputStream);
        fileOutputStream.close();
        return fileName;

    }
}
