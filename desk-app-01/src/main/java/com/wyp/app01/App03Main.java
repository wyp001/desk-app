package com.wyp.app01;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;


/**
 * @Description:
 * @author: wyupeng
 * @date: 2022/9/1 17:26
 */
public class App03Main extends Application {

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
        Button button = new Button("按钮aaa");
        button.setLayoutX(100);
        button.setLayoutY(100);
        button.setOnAction(e->{
            System.out.println("--------点击了按钮-----------");
        });

        AnchorPane pane = new AnchorPane();
        pane.getChildren().add(button);

        Scene scene = new Scene(pane, 300, 200);

        stage.setScene(scene);
        stage.setTitle("我是一个窗口");
        // 设置窗口的左上角图标
        stage.getIcons().add(new Image("images/苹果02.jpeg"));
        // 是否可以改变窗口大小
        stage.setResizable(false);
        stage.show();
    }
}
