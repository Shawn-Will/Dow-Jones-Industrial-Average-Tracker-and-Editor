package FinalPjt;
import java.util.EventListener;

// TODO: Auto-generated Javadoc
/**
 * The listener interface for receiving gvWindow events.
 * The class that is interested in processing a gvWindow
 * event implements this interface, and the object created
 * with that class is registered with a component using the
 * component's <code>addGvWindowListener<code> method. When
 * the gvWindow event occurs, that object's appropriate
 * method is invoked.
 *
 * @see GvWindowEvent
 */
public interface GvWindowListener extends EventListener {
	
	/**
	 * Button clicked.
	 *
	 * @param ge the ge
	 */
	public void buttonClicked(GraphingEvent ge);
}