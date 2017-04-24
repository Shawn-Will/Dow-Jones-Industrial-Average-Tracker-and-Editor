package FinalPjt;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

// TODO: Auto-generated Javadoc
/**
 * The Class DataSaver.
 */
public class DataSaver {

/** The dow array_ c. */
public static ArrayList<String> dowArray_C;
	
	/**
	 * Data save.
	 *
	 * @param dowArray the dow array
	 */
	public static void DataSave(ArrayList<String> dowArray){
				
		 dowArray_C = new ArrayList<String>();
		 dowArray_C = dowArray;
		 PrintWriter pw = null;

    	 try {
 			FileWriter fw = new FileWriter("DJAI_Clean.txt",true);
 			pw = new PrintWriter(fw);
 		} catch (FileNotFoundException e) {
 			System.out.println("File cannot be found.");
 		} catch (IOException e) {
 			System.out.println("File cannot be found.");
 		} 
    	 
    	for(int i = 0; i < 2518; i++){
	           pw.println(dowArray_C.get(i));
	    }
    	
    	pw.close();
	}
	
	/**
	 * Save new data.
	 *
	 * @param newData the new data
	 */
	public static void saveNewData(String newData){
		PrintWriter pw2 = null;

		try {
			FileWriter fw = new FileWriter("DJAI_Clean.txt",true);
			pw2 = new PrintWriter(fw);
		} catch (FileNotFoundException e) {
			System.out.println("File cannot be found.");
		} catch (IOException e) {
			System.out.println("File cannot be found.");
		} 
   	 	
   	 
	}
	
	/**
	 * Gets the array.
	 *
	 * @return the array
	 */
	ArrayList<String>getArray(){
		return dowArray_C;
	}
}