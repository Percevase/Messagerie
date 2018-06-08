package GUI;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class MainFrame extends Application {

    private BorderPane root = new BorderPane();

    @Override
    public void start(Stage primaryStage) throws Exception {
        initRoot(root);
        initPage(primaryStage);
        primaryStage.show();
    }

    private void initRoot (BorderPane root){
        Label label = new Label("MESSAGERIE");
        label.setAlignment(Pos.CENTER);
        root.setTop(label);
        HBox writeBar = new HBox();
        initWriteArea(writeBar);
        root.setBottom(writeBar);
    }

    private void initWriteArea(HBox writeBar) {
        writeBar.setAlignment(Pos.CENTER);
        writeBar.setSpacing(50);
        TextField writeArea = new TextField();
        Button sendButton = new Button("Send");
        sendButton.setAlignment(Pos.CENTER_RIGHT);
        writeBar.getChildren().addAll(writeArea, sendButton);
    }

    private void initPage (Stage myStage){
        myStage.setTitle("Messagerie");
        myStage.setHeight(480);
        myStage.setWidth(640);
        myStage.setResizable(false);
        myStage.setScene(new Scene(root, 640, 480));
    }
}
