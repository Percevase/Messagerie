package GUI;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.scene.control.Button;

public class Main extends Application{

    private HBox root = new HBox();

    public static void main (String[] args){
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        initRoot(root);
        initStage(primaryStage);
        primaryStage.show();
    }

    public void initRoot(HBox root) {
        root.setPrefSize(640,200);
        root.setMinSize(640, 200);
        TextField login = new TextField();
        login.setPrefWidth(500);
        login.setMinWidth(500);
        Button OK = new Button("OK");
        root.getChildren().addAll(login,OK);
    }

    private void initStage (Stage stage){
        stage.setTitle("Login");
        stage.setHeight(200);
        stage.setWidth(640);
        stage.setScene(new Scene(root,640, 200));
    }
}
