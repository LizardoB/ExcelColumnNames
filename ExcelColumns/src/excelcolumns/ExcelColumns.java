/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excelcolumns;

/**
 *
 * @author Lizardo
 */
public class ExcelColumns {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String [] columnNames = generateExcelColumnNames(10000);
        for (String columnName:columnNames)
        {
            System.out.println(columnName + " ");
        }
    }
    
    public static String[] generateExcelColumnNames (int columnCount)
    {
        String [] letter = new String [columnCount];  
        for (int i = 0; i< columnCount; i++)
        {
            letter[i]=ColumnIndexToColumnLetter(i);
        }
         return letter;
    }
    
    static String ColumnIndexToColumnLetter(int colIndex)
    {
        int div = colIndex+1;
        String colLetter = "";
        int mod = 0;

        while (div > 0)
        {
            mod = (div - 1) % 26;
            colLetter = (char)(65 + mod) + colLetter;
            div = (int)((div - mod) / 26);
        }
        return colLetter;
    }
    
}
