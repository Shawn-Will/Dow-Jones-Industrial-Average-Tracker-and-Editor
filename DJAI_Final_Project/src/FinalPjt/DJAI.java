package FinalPjt;

// TODO: Auto-generated Javadoc
/**
 * The Class DJAI.
 */
public class DJAI {
	
	/** The date. */
	public String date;
	
	/** The value. */
	private String value;
	
	/**
	 * Instantiates a new djai.
	 *
	 * @param date the date
	 * @param value the value
	 */
	public DJAI(String date, String value){
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
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return "New Value Added [Date=" + date + ", Value=" + value + "]";
	}
}
