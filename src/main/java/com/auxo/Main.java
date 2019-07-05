package com.auxo;

import com.auxo.Readerhelper.Reader;
import com.auxo.model.Questions;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

import java.util.*;

public class Main {


    public List<String> breakDown(String value)
    {
        List <String> result=new ArrayList<String>();
        StringTokenizer st=new StringTokenizer(value,"|");
        while(st.hasMoreTokens())
        {
            result.add(st.nextToken());
        }




        return result;
    }
    public float qsnoDetect(Cell cell)
    {
        float value=Float.MAX_VALUE;
        if(cell!=null)
        {
            value=(float)cell.getNumericCellValue();
        }
        return value;
    }
    public List<String>  Detect(Cell cell)
    {
        List<String> result= null;
        if(cell!=null)
        {
            result=breakDown(cell.getStringCellValue());
        }
        return result;
    }
    public String stringDetect(Cell cell)
    {
        String result=null;
        if(cell!=null)
        {
            result=cell.getStringCellValue();
        }
        return result;

    }
    public void print(List<Questions> questions)
    {
        for (int i=0;i<questions.size();i++)
        {
            Questions temp=questions.get(i);
            System.out.println(temp.getQsno()+" "+temp.getQuestion()+" "+temp.getAnswer()+" "+temp.getEhrField()+" "+temp.getFieldType()+" "+temp.getFieldValue()+" "+temp.getInference()+" "+temp.getDs()+" "+temp.getGo_to());
        }
    }

    public static void main(String[] args) {
        Main main=new Main();
        List<Questions> questions=new ArrayList<Questions>();
        Reader reader=new Reader();
        System.out.println("enter the path to get the details");
        Scanner scanner=new Scanner(System.in);
        //String path=scanner.next();
        List<Row> cells=new ArrayList<Row>();
        cells=reader.read("C:\\Users\\Admin\\IdeaProjects\\PatternSearch\\src\\main\\java\\com\\auxo\\file\\Template Builder.xlsx");

        System.out.println("Now store int its object");
        for(int i=0;i<cells.size();i++)
        {
            Questions temp=null;
           Row row=cells.get(i);

            temp=new Questions(main.qsnoDetect(row.getCell(2)),main.Detect(row.getCell(3)),main.Detect(row.getCell(4)),main.stringDetect(row.getCell(5)),main.stringDetect(row.getCell(6)),main.stringDetect(row.getCell(7))
                    ,main.stringDetect(row.getCell(8)),main.Detect(row.getCell(9)),main.stringDetect(row.getCell(10)));
            questions.add(temp);


        }
        System.out.println("Now printing phase");
        main.print(questions);


    }
}
