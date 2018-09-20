package application;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Dialog {
	final Stage dialog = new Stage();
	Dialog(Stage owner)
	{
		
        //dialog.initModality(Modality.APPLICATION_MODAL);
        dialog.initOwner(owner);
        GridPane gp = new GridPane();
        HBox buttGroup = new HBox();
        Button refresh = new Button();
        Scene dialogScene = new Scene(gp, 300, 200);
        dialog.setScene(dialogScene);
        dialog.show();
	}

	
	void toFront()
	{
		dialog.toFront();
	}
}
