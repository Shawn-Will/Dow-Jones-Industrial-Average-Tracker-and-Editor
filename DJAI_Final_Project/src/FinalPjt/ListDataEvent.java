package FinalPjt;

import java.util.EventObject;

// TODO: Auto-generated Javadoc
/**
 * The Class ListDataEvent.
 */
public class ListDataEvent extends EventObject{
	
	/** The Djai_ lv. */
	private DJAI_LV Djai_Lv;

	/**
	 * Instantiates a new list data event.
	 *
	 * @param arg0 the arg0
	 */
	public ListDataEvent(Object arg0) {
		super(arg0);
	}
	
	/**
	 * Instantiates a new list data event.
	 *
	 * @param source the source
	 * @param djai_lv the djai_lv
	 */
	public ListDataEvent(Object source, DJAI_LV djai_lv){
		super(source);
		Djai_Lv = djai_lv;
	}
	
	/**
	 * Gets the djai lv.
	 *
	 * @return the djai lv
	 */
	public DJAI_LV getDJAI_LV(){
		return Djai_Lv;
	}
}