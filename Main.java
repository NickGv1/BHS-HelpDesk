package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception {
		try {
			Pane mainPane = (Pane) FXMLLoader.load(Main.class.getResource("BHSProblemManagement.fxml"));
			
			primaryStage.setScene(new Scene(mainPane));
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
