package application;
//Hoping this push works
import java.awt.List;
import java.util.Random;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.effect.DropShadow;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;



/*
   Button btn = new Button();
    btn.setText("Open Dialog");
    btn.setOnAction(
        new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                final Stage dialog = new Stage();
                dialog.initModality(Modality.APPLICATION_MODAL);
                dialog.initOwner(primaryStage);
                VBox dialogVbox = new VBox(20);
                dialogVbox.getChildren().add(new Text("This is a Dialog"));
                Scene dialogScene = new Scene(dialogVbox, 300, 200);
                dialog.setScene(dialogScene);
                dialog.show();
            }
         }); 
 
 */
public class Main extends Application{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

	@Override
	public void start(Stage arg0) throws Exception {
		// TODO Auto-generated method stub
		Group g1 = new Group();
		BorderPane bp = new BorderPane();
		Scene s = new Scene(bp,400,400);
		
		
		Random rand = new Random();
		DropShadow shadow = new DropShadow();
		Button butt = new Button("Again");
		Button clear = new Button("Clear");
		Button showList = new Button("Show List");
		HBox hb = new HBox();
		hb.setPadding(new Insets(15, 12, 15, 12));
		hb.setSpacing(10);
		hb.setStyle("-fx-background-color: #336699;");
		hb.getChildren().addAll(butt,clear,showList);
		bp.setTop(hb);
		bp.setCenter(g1);
		
		bp.autosize();
		butt.addEventHandler(MouseEvent.MOUSE_ENTERED, 
				new EventHandler<MouseEvent>()
				{

					@Override
					public void handle(MouseEvent arg0) {
						butt.setEffect(shadow);
						
				}
			});
		butt.addEventHandler(MouseEvent.MOUSE_EXITED, 
				new EventHandler<MouseEvent>()
				{

					@Override
					public void handle(MouseEvent arg0) {
						butt.setEffect(null);
						
				}
			});
		butt.addEventHandler(MouseEvent.MOUSE_PRESSED, 
				new EventHandler<MouseEvent>()
				{

					@Override
					public void handle(MouseEvent arg0) {
						redraw(g1,rand);
						
				}
			});
		clear.addEventHandler(MouseEvent.MOUSE_ENTERED,
				new EventHandler<MouseEvent>()
				{
		
					@Override
					public void handle(MouseEvent arg0) {
						clear.setEffect(shadow);
						
				}
			});
		clear.addEventHandler(MouseEvent.MOUSE_EXITED, 
				new EventHandler<MouseEvent>()
				{
		
					@Override
					public void handle(MouseEvent arg0) {
						clear.setEffect(null);
						
				}
			});
		clear.addEventHandler(MouseEvent.MOUSE_PRESSED, 
				new EventHandler<MouseEvent>()
				{
		
					@Override
					public void handle(MouseEvent arg0) {
						g1.getChildren().clear();
						
				}
			});
		showList.addEventHandler(MouseEvent.MOUSE_ENTERED, 
				new EventHandler<MouseEvent>()
				{

					@Override
					public void handle(MouseEvent arg0) {
						showList.setEffect(shadow);
						
				}
			});
		showList.addEventHandler(MouseEvent.MOUSE_EXITED, 
				new EventHandler<MouseEvent>()
				{

					@Override
					public void handle(MouseEvent arg0) {
						showList.setEffect(null);
						
				}
			});
		showList.addEventHandler(MouseEvent.MOUSE_PRESSED, 
				new EventHandler<MouseEvent>()
				{

					@Override
					public void handle(MouseEvent arg0) {
						
						
				}
			});
		
		redraw(g1,rand);
		s.setFill(Color.BLACK);
	
		arg0.setScene(s);
		arg0.show();
		
	}
	
	void redraw(Group g,Random rand)
	{
		for(int i = 0;i<20;i++)
		{
			Rectangle r = new Rectangle();
			r.setY(rand.nextDouble()*(i*30));
			r.setX(rand.nextDouble()*(i*30)+30);
			r.setWidth(i*5+20);
			r.setHeight(i*3 + 50);
			r.setFill(new Color(rand.nextDouble(),rand.nextDouble(),rand.nextDouble(), 1));
			g.getChildren().add(r);
		}
	}
	

}
