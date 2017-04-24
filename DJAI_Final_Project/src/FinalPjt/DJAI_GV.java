package FinalPjt;

import java.util.ArrayList;

// TODO: Auto-generated Javadoc
/**
 * The Class DJAI_GV.
 */
public class DJAI_GV {
	
	/** The date. */
	public String date;
	
	/** The value. */
	private String value;

	/**
	 * Instantiates a new djai gv.
	 *
	 * @param date the date
	 * @param value the value
	 */
	public DJAI_GV(String date, String value) {
		super();
		this.date = date;
		this.value = value;
	}
	
	/**
	 * Gets the value.
	 *
	 * @return the value
	 */
	public String getValue() {
		return value;
	}
	
	/**
	 * Sets the value.
	 *
	 * @param value the new value
	 */
	public void setValue(String value) {
		this.value = value;
	}
	
	/**
	 * Gets the date.
	 *
	 * @return the date
	 */
	public String getDate() {
		return date;
	}
	
	/**
	 * Sets the date.
	 *
	 * @param date the new date
	 */
	public void setDate(String date) {
		this.date = date;
	}
}