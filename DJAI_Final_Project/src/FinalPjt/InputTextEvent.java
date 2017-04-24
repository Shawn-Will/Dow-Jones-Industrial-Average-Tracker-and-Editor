package FinalPjt;

import java.util.EventObject;

// TODO: Auto-generated Javadoc
/**
 * The Class InputTextEvent.
 */
public class InputTextEvent extends EventObject{
	
	/** The Djai. */
	private DJAI Djai;
	
	/**
	 * Instantiates a new input text event.
	 *
	 * @param arg0 the arg0
	 */
	public InputTextEvent(Object arg0) {
		super(arg0);
	}
	
	/**
	 * Instantiates a new input text event.
	 *
	 * @param source the source
	 * @param djai the djai
	 */
	public InputTextEvent(Object source, DJAI djai){
		super(source);
		Djai = djai;
	}
	
	/**
	 * Gets the djai.
	 *
	 * @return the djai
	 */
	public DJAI getDJAI(){
		return Djai;
	}
}