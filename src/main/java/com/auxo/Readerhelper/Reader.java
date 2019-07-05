package com.auxo.Readerhelper;



import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Reader {
//    public static void main(String[] args) {
//        Reader reader=new Reader();
//        reader.read("C:\\Users\\Admin\\IdeaProjects\\PatternSearch\\src\\main\\java\\com\\auxo\\file\\Template Builder.xlsx");
//
//    }

    public List<Row> read(String Path)
    {
        List<Row> cellResult=new ArrayList<Row>();
        String result="";
        try
        {
            FileInputStream file=new FileInputStream(new File(Path));

            XSSFWorkbook workbook =new XSSFWorkbook(file);
            XSSFSheet sheet=workbook.getSheetAt(0);
            Iterator<Row> rowIterator=sheet.iterator();
            int rowcount=0;
            while(rowIterator.hasNext())
            {
                Row row=rowIterator.next();
                rowcount++;
                if(rowcount>1)
                {
                    cellResult.add(row);

                }

            }
            file.close();

        }catch (Exception e)
        {
            e.printStackTrace();
        }
        return  cellResult;
    }
}
