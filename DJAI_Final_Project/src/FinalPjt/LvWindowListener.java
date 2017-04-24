package FinalPjt;
import java.util.EventListener;

// TODO: Auto-generated Javadoc
/**
 * The listener interface for receiving lvWindow events.
 * The class that is interested in processing a lvWindow
 * event implements this interface, and the object created
 * with that class is registered with a component using the
 * component's <code>addLvWindowListener<code> method. When
 * the lvWindow event occurs, that object's appropriate
 * method is invoked.
 *
 * @see LvWindowEvent
 */
public interface LvWindowListener extends EventListener {
	
	/**
	 * Button clicked.
	 *
	 * @param le the le
	 */
	public void buttonClicked(ListDataEvent le);
}