package FinalPjt;

import javafx.application.Application;
import javafx.stage.Stage;

// TODO: Auto-generated Javadoc
/**
 * The Class Demo.
 */
public class Demo extends Application{
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		DataClean.DataClean();
		launch(args);
	}
		
	/* (non-Javadoc)
	 * @see javafx.application.Application#start(javafx.stage.Stage)
	 */
        @Override
	public void start(Stage primaryStage){
		GUI view = new GUI(primaryStage);
		Controller cont = new Controller(view);
		ListController Lcont = new ListController(view);
		GraphController Gcont = new GraphController(view);
	}
}