package application.View;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class TempViewController {
	   @FXML
	    private Button gotoheat;

	    @FXML
	    private Label t0value;

	    @FXML
	    private Label t0value1;

	    @FXML
	    private Label t0value11;

	    @FXML
	    void gotoheat_onAction(ActionEvent event) throws IOException {
	    	ViewModel.getInstance().gotoheat(event);
	    	
	    }

}
