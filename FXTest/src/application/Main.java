package application;
//Hoping this push works
import java.awt.List;
import java.util.Random;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Rectangle2D;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.effect.DropShadow;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Sphere;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Screen;
import javafx.stage.Stage;




public class Main extends Application{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}
	Dialog dio;
	TableView table;
	
	
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
		
		//=========== Button Stuff ==============================================
		
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
		showList.setOnAction(
		        new EventHandler<ActionEvent>() {
		            @Override
		            public void handle(ActionEvent event) {
		            	if(dio == null)
		            		dio = new Dialog(arg0);
		            	else
		            		dio.toFront();
		            }
		         });
		//=================================================================================
		
		createTable();
		
		redraw(g1,rand);
		
		s.setFill(Color.BLACK);
	
		arg0.setScene(s);
		arg0.show();
		
	}
	//random int: rand.nextInt(primaryScreenBounds.getMaxX()-primaryScreenBounds.getMinX())+primaryScreenBounds.getMinX()
	void redraw(Group g,Random rand)
	{
	
		Rectangle2D primaryScreenBounds = Screen.getPrimary().getVisualBounds();
		SmartRectangle sr = new SmartRectangle(primaryScreenBounds.getMinX()+(primaryScreenBounds.getMaxX()-primaryScreenBounds.getMinX())* rand.nextDouble(),
						   primaryScreenBounds.getMinY()+(primaryScreenBounds.getMaxY()-primaryScreenBounds.getMinY())* rand.nextDouble());
		
		
		sr.setFill(new Color(rand.nextDouble(),rand.nextDouble(),rand.nextDouble(), 1));
		g.getChildren().add(sr);
	}
	
	void createTable()
	{
		table = new TableView();
		table.setEditable(false);
		
		TableColumn boxID = new TableColumn("Box ID");
		TableColumn boxXPos = new TableColumn("X Position");
		TableColumn boxYPos = new TableColumn("Y Position");
		
		table.getColumns().addAll(boxID,boxXPos,boxYPos);
	
	}
}
