package FinalPjt;

import java.util.EventObject;

// TODO: Auto-generated Javadoc
/**
 * The Class GraphingEvent.
 */
public class GraphingEvent extends EventObject{
	
	/** The Djai. */
	private DJAI_GV Djai;
	
	/**
	 * Instantiates a new graphing event.
	 *
	 * @param arg0 the arg0
	 */
	public GraphingEvent(Object arg0) {
		super(arg0);
	}
	
	/**
	 * Instantiates a new graphing event.
	 *
	 * @param source the source
	 * @param djai the djai
	 */
	public GraphingEvent(Object source, DJAI_GV djai){
		super(source);
		Djai = djai;
	}
	
	/**
	 * Gets the djai gv.
	 *
	 * @return the djai gv
	 */
	public DJAI_GV getDJAI_GV(){
		return Djai;
	}
}