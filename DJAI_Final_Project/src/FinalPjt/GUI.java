package FinalPjt;

import java.util.ArrayList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

// TODO: Auto-generated Javadoc
/**
 * The Class GUI.
 */
public class GUI{
	
	/** The Data. */
	private ArrayList<String> Data;
	
	/** The btn1. */
	private Button btn1;
	
	/** The btn2. */
	private Button btn2;
	
	/** The btn3. */
	private Button btn3;
	
	/** The add date. */
	private TextArea addDate;
	
	/** The add value. */
	private TextArea addValue;
	
	/** The add. */
	private Label add;
	
	/** The window listener. */
	private WindowListener windowListener;
	
	/** The lv window listener. */
	private LvWindowListener lvWindowListener;
	
	/** The gv window listener. */
	private GvWindowListener gvWindowListener;
	
	/** The s. */
	private Stage s;
	
	/**
	 * Instantiates a new gui.
	 *
	 * @param stage the stage
	 */
	public GUI(Stage stage){
		s = stage;
		s.setTitle("DJAI Tracker Application");
		btn1 = new Button("Graph DJAI Data");
		btn2 = new Button("Create Data List");
		btn3 = new Button("Add New Data");
		addDate = new TextArea();
		addDate.setPrefSize(80, 20);
		addDate.setPromptText("Date (YYYY-MM-DD)");
		addValue = new TextArea();
		addValue.setPrefSize(80, 20);
		addValue.setPromptText("DJAI Value(00000.00)");
		add = new Label("Add Data: ");

		btn1.setOnAction(e -> {
			String Date = null;
			String Value = null;
			GraphingEvent ge = new GraphingEvent(this, new DJAI_GV(Date, Value));
			if(gvWindowListener != null){
				gvWindowListener.buttonClicked(ge);
			}	
		});
		
		btn2.setOnAction(e -> {
			ArrayList<String> DataList = Data;
			ListDataEvent le = new ListDataEvent(this, new DJAI_LV(DataList));
			if(lvWindowListener != null){
				lvWindowListener.buttonClicked(le);
			}		
		});
		
		btn3.setOnAction(e -> {
			String Date = addDate.getText();
			String Value = addValue.getText();		
			InputTextEvent ev = new InputTextEvent(this, new DJAI(Date,Value));			
			if(windowListener != null){
				windowListener.buttonClicked(ev);
			}		
		});
		
		GridPane gp = new GridPane();
		gp.setAlignment(Pos.CENTER);
		gp.setHgap(10);
		gp.setVgap(10);
		gp.setPadding(new Insets(25, 25, 25, 25));		
		gp.add(btn1, 0, 0);
		gp.add(btn2, 1, 0);
		gp.add(btn3, 1, 3);
		gp.add(addDate, 0, 2);
		gp.add(addValue, 0, 3);
		gp.add(add, 0, 1);		
		s.setScene(new Scene(gp));
		s.show();
	}
	
	/**
	 * Sets the window listener.
	 *
	 * @param listener the new window listener
	 */
	public void setWindowListener(WindowListener listener){
		windowListener = listener;
	}
	
	/**
	 * Sets the lv window listener.
	 *
	 * @param listener the new lv window listener
	 */
	public void setLvWindowListener(LvWindowListener listener){
		lvWindowListener = listener;
	}
	
	/**
	 * Sets the gv window listener.
	 *
	 * @param listener the new gv window listener
	 */
	public void setGvWindowListener(GvWindowListener listener){
		gvWindowListener = listener;
	}
}