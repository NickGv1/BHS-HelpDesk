package application;
/**
 * Sample Skeleton for 'BHSProblemManagement.fxml' Controller Class
 */

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class BHSController {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="tf_ProblemReferenceNumber"
    private TextField tf_ProblemReferenceNumber; // Value injected by FXMLLoader

    @FXML
    void OnClickNewBtn(ActionEvent event) {

    }

    @FXML
    void OnClickFindBtn(ActionEvent event) {

    }

    @FXML
    void OnClickClearBtn(ActionEvent event) {

    }

    @FXML
    void OnClickSaveBtn(ActionEvent event) {

    }

    @FXML
    void OnClickExitBtn(ActionEvent event) {

    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert tf_ProblemReferenceNumber != null : "fx:id=\"tf_ProblemReferenceNumber\" was not injected: check your FXML file 'BHSProblemManagement.fxml'.";

    }
}
