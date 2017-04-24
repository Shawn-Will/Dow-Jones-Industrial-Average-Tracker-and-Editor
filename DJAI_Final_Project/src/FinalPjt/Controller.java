package FinalPjt;

// TODO: Auto-generated Javadoc
/**
 * The Class Controller.
 */
public class Controller {
	
	/** The view. */
	private GUI view;
	
	/** The model. */
	private DJAI model;
	
	/** The value. */
	private String value;
	
	/** The date. */
	private String date;
	
	/**
	 * Instantiates a new controller.
	 *
	 * @param view the view
	 */
	public Controller(GUI view){
		view.setWindowListener(new WindowListener(){
			
			public void buttonClicked(InputTextEvent ev) {
				model = ev.getDJAI();
				model.setValue(ev.getDJAI().getValue());
				model.setDate(ev.getDJAI().getDate());
				System.out.println(ev.getSource());
				value = ev.getDJAI().getValue();
				date = ev.getDJAI().getDate();
				DataWriter.writeNewData(value,date);
			}
		});	
	}
}