package application.View;

	import java.io.IOException;

import javafx.event.ActionEvent;
	import javafx.fxml.FXML;
	import javafx.scene.control.Button;
	import javafx.scene.control.Label;

	public class HeatViewController {

	    @FXML
	    private Label currState;

	    @FXML
	    private Button heatDown;

	    @FXML
	    private Button heatUp;

	    
	    void gototemp_onAction(ActionEvent event) throws IOException {
	    	ViewModel.getInstance().gototemp(event);
	    }
	    
	    @FXML
	    void heatDown_onAction(ActionEvent event) {

	    }

	    @FXML
	    void heatUp_onAction(ActionEvent event) {

	    }

	}

