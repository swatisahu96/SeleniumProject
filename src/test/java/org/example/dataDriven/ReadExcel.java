package org.example.dataDriven;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

public class ReadExcel {

    public static void main(String[] args) throws IOException {

        FileInputStream inputStream = new FileInputStream("CTD.xlsx");

        XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
        XSSFSheet sheet= workbook.getSheet("Main");

        Iterator<Row> rowIterator= sheet.rowIterator();

        while(rowIterator.hasNext())
        {
            Row row = rowIterator.next();

            Iterator<Cell> cellIterator= row.cellIterator();
            while(cellIterator.hasNext()){
                Cell cell= cellIterator.next();
                if(cell.getCellType() == CellType.NUMERIC){
                    System.out.println(cell.getStringCellValue());
                }
                if(cell.getCellType() == CellType.STRING){
                    System.out.println(cell.getStringCellValue());
                }

            }
        }

    }

}
