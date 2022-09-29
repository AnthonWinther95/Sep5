package application;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;

import application.View.HeatViewController;
import application.View.TempViewController;
import application.View.ViewModel;
import application.Model.Heater;

public class Main extends Application {
	
	private static final String TEMP_VIEW_FXML = "view/TempView.fxml";
	
	private ViewModel viewmodel = new ViewModel (viewmodel);
	private TempViewController tempViewController;
	
	@Override
	public void start(Stage stage) throws IOException {
		try {
			AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("View/TempView.fxml"));
			Scene scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
			stage.setTitle("Temperature View");
		
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	private TempViewController createTempView (Stage stage) throws Exception {
		FXMLLoader loader = new FXMLLoader();
		
		loader.setLocation(getClass().getResource( TEMP_VIEW_FXML ));
		Parent root = loader.load();
		stage.setScene(new Scene(root, 400, 275));
		
		return loader.getController();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
