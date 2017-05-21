/**
 *
 *	Author: Ethan McKinley
 *	Program: EventHandler
 *	Date: 5/7/17
 *
 *	purpose: Create two buttons and handlers. The handlers will print test/string 
 *	output to the console.
 *
 *
 *
 *
 **/
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class HandleEventCopy extends Application{

	@Override
	public void start(Stage primaryStage){

		//create the pane and set its properties
		HBox pane = new HBox(10);
		pane.setAlignment(Pos.CENTER);
		Button btOK = new Button("Circle");
		Button btCancel = new Button("Square");
		OKHandlerClass handler1 = new OKHandlerClass();
		btOK.setOnAction(handler1);
		CancelHandlerClass handler2 = new CancelHandlerClass();
		btCancel.setOnAction(handler2);
		pane.getChildren().addAll(btOK, btCancel);

		//Create a scene and place it in the stage
		
		Scene scene = new Scene(pane);
		primaryStage.setTitle("HandleEven");
		primaryStage.setScene(scene);
		primaryStage.show();

	}

	//create Handler for the Ok button
	class OKHandlerClass implements EventHandler<ActionEvent>{

		@Override
		public void handle(ActionEvent e){

			Circle circle = new Circle();
			circle.setCenterX(100);
			circle.setCenterY(100);
			circle.setRadius(50);
			circle.setStroke(Color.BLACK);
			circle.setFill(Color.WHITE);


			Pane circlePane = new Pane();
			circlePane.getChildren().add(circle);

			Scene scene2 = new Scene(circlePane, 200, 200);
			Stage secondaryStage = new Stage();
			secondaryStage.setTitle("ShowCircle");
			secondaryStage.setScene(scene2);
			secondaryStage.show();


		}

	}

	//create a Handler for the Cancel button
	class CancelHandlerClass implements EventHandler<ActionEvent>{

		@Override
		public void handle(ActionEvent e){

			Rectangle r = new Rectangle();
			r.setX(50);
			r.setY(50);
			r.setWidth(100);
			r.setHeight(100);
			r.setStroke(Color.BLACK);
			r.setFill(Color.WHITE);

			Pane rPane = new Pane();
			rPane.getChildren().add(r);

			Scene scene3 = new Scene(rPane, 200, 200);
			Stage thirdStage = new Stage();
			thirdStage.setTitle("ShowSquare");
			thirdStage.setScene(scene3);
			thirdStage.show();

			
		}

	}

}
