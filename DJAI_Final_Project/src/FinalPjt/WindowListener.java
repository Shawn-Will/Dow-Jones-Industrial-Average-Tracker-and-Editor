package FinalPjt;
import java.util.EventListener;

// TODO: Auto-generated Javadoc
/**
 * The listener interface for receiving window events.
 * The class that is interested in processing a window
 * event implements this interface, and the object created
 * with that class is registered with a component using the
 * component's <code>addWindowListener<code> method. When
 * the window event occurs, that object's appropriate
 * method is invoked.
 *
 * @see WindowEvent
 */
public interface WindowListener extends EventListener {
	
	/**
	 * Button clicked.
	 *
	 * @param ev the ev
	 */
	public void buttonClicked(InputTextEvent ev);
}