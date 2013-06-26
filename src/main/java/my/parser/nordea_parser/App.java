package my.parser.nordea_parser;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import au.com.bytecode.opencsv.CSVReader;

/**
 * Hello world!
 *
 */
public class App 
{
	static final String filePath =new File(".").getAbsolutePath() +"//src//main//resources//"
			+"export.csv";
    public static void main( String[] args )
    {
    	CSVReader filereader = null;
    	try {
			filereader = new CSVReader(new FileReader(filePath));
			List<String[]> entriesList = filereader.readAll();
			for(String[] row : entriesList){
				System.out.println(row[3]);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	finally{
    		try {
				filereader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	}
        
    }
}
