package FinalPjt;

import java.util.ArrayList;


import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

// TODO: Auto-generated Javadoc
/**
 * The Class GraphController.
 */
public class GraphController {
	
	/** The view. */
	private GUI view;
	
	/** The model. */
	private DJAI_GV model;
	
	/** The Data. */
	private ArrayList<String> Data;
	
	/** The value. */
	private double[] value;
	
	/**
	 * Instantiates a new graph controller.
	 *
	 * @param view the view
	 */
	public GraphController(GUI view){
		view.setGvWindowListener(new GvWindowListener(){
			public void buttonClicked(GraphingEvent ge){
				model = ge.getDJAI_GV();
				model.setDate(ge.getDJAI_GV().getDate());
				model.setValue(ge.getDJAI_GV().getValue());
				System.out.println(ge.getSource());
				
				Data = new ArrayList<String>();
				Data = DataSaver.dowArray_C;
				
				value = new double[Data.size()];
				
				for(int i = 0; i < Data.size(); i++){
					value[i] = Double.parseDouble(Data.get(i).substring(10));
				}
				
				Parent root;
				Stage stage = new Stage();
				stage.setTitle("Graph Data");
				
				final CategoryAxis xAxis = new CategoryAxis();
			    final NumberAxis yAxis = new NumberAxis();
			    xAxis.setLabel("Number of Month");
			    final LineChart<String, Number> lineChart = new LineChart<String, Number>(
			        xAxis, yAxis);		    
			    xAxis.setLabel("Date");
			    xAxis.setTickMarkVisible(false);
			    
			    yAxis.setLabel("DJAI Value");
			    yAxis.setAutoRanging(false);
			    yAxis.setTickMarkVisible(false);
			    yAxis.setUpperBound(20000);
			    yAxis.setLowerBound(6000);
			    yAxis.setTickUnit(2000);
			    yAxis.setMinorTickCount(14);
			    XYChart.Series<String, Number> series = new XYChart.Series<String, Number>();
			    series.setName("DJAI Chart ");
			
			    for(int i = 0; i < Data.size(); i++){
			    	series.getData().add(new XYChart.Data<String, Number>(Data.get(i).substring(0, 10),
			 						 								  value[i]));
			    }
			    lineChart.setCreateSymbols(false);
			    lineChart.getData().add(series);
				lineChart.isResizable();
			    Scene scene  = new Scene(lineChart,14000,600);
			    stage.setScene(scene);
				stage.show();
			}
		});
	}
}