package FinalPjt;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

// TODO: Auto-generated Javadoc
/**
 * The Class DataClean.
 */
public class DataClean {
	
	/** The dow array. */
	private static ArrayList<String> dowArray = new ArrayList<>();
	
	/**
	 * Data clean.
	 */
	public static void DataClean(){
		String fileName = "C:\\Users\\sbw73\\Desktop\\OfficalGitHub\\DJAI_Final_Project\\src\\DJIA.txt";
        String line = null;
        String LineToRemove = ".";

        try {
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            while((line = bufferedReader.readLine()) != null) {
            	
            	if (!line.trim().endsWith(LineToRemove)) {
            		dowArray.add(line);
            		}
            	} 
            
            dowArray.remove(0);
            bufferedReader.close();         
        }
        catch(FileNotFoundException ex) {
            System.out.println("Unable to open file '" + fileName + "'");                
        }
        catch(IOException ex) {
            System.out.println("Error reading file '" + fileName + "'");                  
        }  
        
        DataSaver.DataSave(dowArray);
  	}
}
