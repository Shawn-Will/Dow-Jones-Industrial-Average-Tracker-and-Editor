package FinalPjt;

import java.util.ArrayList;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.stage.Stage;

// TODO: Auto-generated Javadoc
/**
 * The Class ListController.
 */
public class ListController {
	
	/** The view. */
	private GUI view;
	
	/** The model. */
	private DJAI_LV model;
	
	/** The Data. */
	private ArrayList<String> Data;
	
	/**
	 * Instantiates a new list controller.
	 *
	 * @param view the view
	 */
	public ListController(GUI view){
		view.setLvWindowListener(new LvWindowListener(){
			public void buttonClicked(ListDataEvent le) {
				model = le.getDJAI_LV();
				model.setDJAI_V(le.getDJAI_LV());
				System.out.println(le.getSource());
				System.out.println(le.getDJAI_LV());
				Data = new ArrayList<String>();
				Data = DataSaver.dowArray_C;
				Parent root;
				Stage stage = new Stage();
				stage.setTitle("Listed Data");
				ListView<String> list = new ListView<String>();
				ObservableList<String> DJAI_L = FXCollections.observableArrayList(Data);
				list.setItems(DJAI_L);
				Scene scene = new Scene(list, 200, 600);
				stage.setScene(scene);
				stage.show();
			}
		});
	}
}