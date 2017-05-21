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
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class HandleEvent extends Application{

	@Override
	public void start(Stage primaryStage){

		//create the pane and set its properties
		HBox pane = new HBox(10);
		pane.setAlignment(Pos.CENTER);
		Button btOK = new Button("OK");
		Button btCancel = new Button("Cancel");
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

			System.out.println("OK button clicked");


		}

	}

	//create a Handler for the Cancel button
	class CancelHandlerClass implements EventHandler<ActionEvent>{

		@Override
		public void handle(ActionEvent e){

			System.out.println("Cancel button clicked");
		}

	}

}
