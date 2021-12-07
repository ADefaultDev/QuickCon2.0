package com.example.QuickCon20.GUI;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TableView;
import javafx.scene.control.TreeView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.TreeMap;

public class QuickConGUI extends Application {

    private static final String version = "0.3";
    private static final String title = "QuickCon " + version;
    private static final int width = 1440; // 960 // 1440
    private static final int height = 810; // 540 // 810

    private Stage stage;
    private BorderPane rootNode;
    private VBox vBoxLeft, vBoxCenter, vBoxRight, vBoxTop, vBoxBottom;

    private TreeView<String> treeView;
    private TableView tableView;

    private String tableN;
    private ArrayList<String> tableNames;
    private ArrayList<String> columnNames;

    private TreeMap<String, TreeMap<String, String>> dataForQueries;
    private TreeMap<String, TreeMap<String, String>> dataForQueriesForNewRow;
    private ArrayList<String> queries;
    private ArrayList<String> dataTypes;
    private ArrayList<Integer> indexNewRows;
    //

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage none) {

        stage = none;
        stage.setTitle(title);
        rootNode = new BorderPane();
        vBoxLeft = new VBox();
        vBoxCenter = new VBox();
        vBoxTop = new VBox();

        rootNode.setLeft(vBoxLeft);
        rootNode.setTop(vBoxTop);

        Scene myScene = new Scene(rootNode, width, height);
        stage.setScene(myScene);
        stage.show();
    }


    @Override
    public void stop(){

    }

}
