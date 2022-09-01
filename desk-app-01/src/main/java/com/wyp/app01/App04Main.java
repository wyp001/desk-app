package com.wyp.app01;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;


/**
 * @Description:
 * @author: wyupeng
 * @date: 2022/9/1 17:26
 */
public class App04Main extends Application {

    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void init() throws Exception {
        super.init();
        System.out.println("----App01Main----init()--------");
    }

    @Override
    public void stop() throws Exception {
        super.stop();
        System.out.println("----App01Main----stop()--------");
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Button button0 = new Button("窗口0");
        button0.setLayoutX(100);
        button0.setLayoutY(100);
        Button button1 = new Button("窗口1");
        button1.setLayoutX(100);
        button1.setLayoutY(100);
        AnchorPane pane = new AnchorPane();
        pane.getChildren().addAll(button0);

        // 点击 窗口0 按钮时 弹出一个新的窗口
        button0.setOnAction(event -> {
            System.out.println("----App04Main----setOnAction()--------" );
            Stage stage1 = new Stage();
            stage1.setHeight(200);
            stage1.setWidth(300);
            stage1.initOwner(primaryStage);
            // 默认是 Modality.NONE：弹出的窗口在操作时，源窗口没有限制，仍可继续操作
            // stage1.initModality(Modality.NONE);

            // Modality.APPLICATION_MODAL：弹出的窗口在操作时，源窗口不可操作
            stage1.initModality(Modality.APPLICATION_MODAL);
            stage1.setTitle("这是一个子窗口");
            stage1.show();
        });
        Scene scene = new Scene(pane, 500, 500);

        primaryStage.setScene(scene);
        primaryStage.setTitle("我是一个窗口");
        primaryStage.show();
    }
}
