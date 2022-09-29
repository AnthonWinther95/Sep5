package application.View;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.Node;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class ViewModel {

	private static ViewModel handler = new ViewModel();
	
	private Stage stage;
	private Parent root;
	private Scene scene;
	
	public static ViewModel getInstance() {
		return handler;
	}
	
	public void start(Stage stage) {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(getClass().getResource("View/TempView.fxml"));
		try {
			AnchorPane root = (AnchorPane) loader.load();
			Scene scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public Scene getScene() {
		return scene;
	}

	public void setScene(Scene scene) {
		this.scene = scene;
	}

	public Parent getRoot() {
		return root;
	}

	public void setRoot(Parent root) {
		this.root = root;
	}

	public void gototemp(javafx.event.ActionEvent event) throws IOException {
		// TODO Auto-generated method stub
		root = FXMLLoader.load(getClass().getResource("View/TempView.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
		stage.setTitle("Temperature View");
	}

	public void gotoheat(javafx.event.ActionEvent event) throws IOException {
		// TODO Auto-generated method stub
		root = FXMLLoader.load(getClass().getResource("View/Heatview.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
		stage.setTitle("Heater View");
	}
	
	
	
}
