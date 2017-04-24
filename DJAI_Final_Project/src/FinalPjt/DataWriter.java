package FinalPjt;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

// TODO: Auto-generated Javadoc
/**
 * The Class DataWriter.
 */
public class DataWriter {
	
	/**
	 * Write new data.
	 *
	 * @param Value the value
	 * @param Date the date
	 */
	public static void writeNewData(String Value, String Date){

		PrintWriter pw = null;

		try {
 			FileWriter fw = new FileWriter("DJAI_Clean.txt",true);
 			pw = new PrintWriter(fw);
 		} catch (FileNotFoundException e) {
 			System.out.println("File cannot be found.");
 		} catch (IOException e) {
 			System.out.println("File cannot be found.");
 		}
		String newData = Date + "  " + Value;
		pw.println(newData);
		pw.close();
	}
}
