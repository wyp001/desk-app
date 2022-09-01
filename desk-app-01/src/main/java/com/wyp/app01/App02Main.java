package com.wyp.app01;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;


/**
 * @Description:
 * @author: wyupeng
 * @date: 2022/9/1 17:26
 */
public class App02Main extends Application {

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
    public void start(Stage stage) throws Exception {
        Label label = new Label("Hello World!");
        Button button = new Button("按钮aaa");
        String question = "功夫熊猫的主演是谁";
        button.setOnAction(e->{
            getHostServices().showDocument("https://www.baidu.com/s?wd=" + question);
        });
        BorderPane borderPane = new BorderPane(button);
        Scene scene = new Scene(borderPane, 300, 200);
        stage.setScene(scene);
        stage.setTitle("我是一个窗口");
        stage.show();
    }
}
