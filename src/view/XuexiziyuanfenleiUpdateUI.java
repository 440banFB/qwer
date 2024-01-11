package view;


import dao.*;
import entity.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import javafx.stage.FileChooser;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.scene.control.Alert;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.control.TextArea;
import javafx.scene.text.Text;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import java.util.List;
import java.util.TreeMap;
import java.util.Map;
import java.util.ArrayList;
import javafx.util.Callback;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.control.TableColumn.SortType;
import javafx.scene.shape.Rectangle;
import javafx.scene.control.Alert.AlertType;
import java.util.UUID;
import java.text.SimpleDateFormat;
import java.util.Date;
import javafx.event.EventHandler;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Button;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.shape.Line;
import javafx.scene.control.CheckBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableCell;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;

public class XuexiziyuanfenleiUpdateUI extends AnchorPane {

	private String mainid;
	public String getMainid() {
		return mainid;
	}
	public void setMainid(String mainid) {
		this.mainid = mainid;
	}
	Dao<Xuexiziyuanfenlei> table_1100007dao = new Dao(new Xuexiziyuanfenlei());
	ObservableList<Xuexiziyuanfenlei> table_1100007data = FXCollections.observableArrayList();
	public XuexiziyuanfenleiUpdateUI(String param) {
		this.mainid=param;
		Label label_1495576=new Label("分类名称");
		label_1495576.setFont(new Font("宋体", 14));
		label_1495576.setPrefWidth(Double.valueOf(100));
		label_1495576.setPrefHeight(Double.valueOf(23));
		this.setLeftAnchor(label_1495576, Double.valueOf(150));
		this.setTopAnchor(label_1495576, Double.valueOf(60));
		this.getChildren().add(label_1495576);
		TextField textField_1275851 = new TextField();
		textField_1275851.setFont(new Font("宋体", 14));
		textField_1275851.setPrefWidth(Double.valueOf(93));
		textField_1275851.setPrefHeight(Double.valueOf(23));
		this.setLeftAnchor(textField_1275851, Double.valueOf(220));
		this.setTopAnchor(textField_1275851, Double.valueOf(60));
		this.getChildren().add(textField_1275851);
		 TableView table_1100007=new TableView();
		table_1100007.setPrefWidth(Double.valueOf(0));
		table_1100007.setPrefHeight(Double.valueOf(0));
		table_1100007.setMaxWidth(Double.valueOf(0));
		table_1100007.setMaxHeight(Double.valueOf(0));
		table_1100007.setMinWidth(Double.valueOf(0));
		table_1100007.setMinHeight(Double.valueOf(0));
		this.setLeftAnchor(table_1100007, Double.valueOf(0));
		this.setTopAnchor(table_1100007, Double.valueOf(0));
		 TableColumn table_1100007id=new TableColumn("编号");
		 table_1100007id.setCellValueFactory(new PropertyValueFactory<>("id"));
		 table_1100007.getColumns().add(table_1100007id);
		 TableColumn table_11000070=new TableColumn("分类名称");
		 table_11000070.setCellValueFactory(new PropertyValueFactory<>("fenleimingcheng"));
		 table_1100007.getColumns().add(table_11000070);
		table_1100007.setItems(table_1100007data);
		this.getChildren().add(table_1100007);
		table_1100007refresh();
		Button btn_1269366=new Button("保存");
		btn_1269366.setFont(new Font("宋体", 14));
		btn_1269366.setPrefWidth(Double.valueOf(93));
		btn_1269366.setPrefHeight(Double.valueOf(23));
		this.setLeftAnchor(btn_1269366, Double.valueOf(200));
		this.setTopAnchor(btn_1269366, Double.valueOf(350));
		/**
			修改按钮触发事件
		*/
		btn_1269366.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent e) {
		 			Xuexiziyuanfenlei bean = table_1100007data.get(Integer.valueOf(param));
				bean.setFenleimingcheng(textField_1275851.getText());
				table_1100007dao.update(bean);
				showMsg("修改成功");
			}
		});
		this.getChildren().add(btn_1269366);
		Button btn_1951548=new Button("关闭");
		btn_1951548.setFont(new Font("宋体", 14));
		btn_1951548.setPrefWidth(Double.valueOf(93));
		btn_1951548.setPrefHeight(Double.valueOf(23));
		this.setLeftAnchor(btn_1951548, Double.valueOf(300));
		this.setTopAnchor(btn_1951548, Double.valueOf(350));
		btn_1951548.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent e) {
			    ((Stage) ((Button)e.getSource()).getScene().getWindow()).close();
			}
		});
		this.getChildren().add(btn_1951548);
		table_1100007.setOnMouseClicked(new EventHandler<Event>() {
			public void handle(Event event) {
				int row = table_1100007.getSelectionModel().getSelectedIndex();
				if (row == -1) {
					return;
				}
		 			Xuexiziyuanfenlei bean = (Xuexiziyuanfenlei)table_1100007.getSelectionModel().getSelectedItems().get(0);
				textField_1275851.setText(bean.getFenleimingcheng());
				
			};
		});
		table_1100007refresh();
		 			Xuexiziyuanfenlei bean = table_1100007data.get(Integer.valueOf(param));
				textField_1275851.setText(bean.getFenleimingcheng());
		
	}
	public void table_1100007refresh(){
		table_1100007data.clear();
    	table_1100007data.addAll(table_1100007dao.getAll());
	}
 	public void showMsg(String msg){
   	 Alert alert = new Alert(AlertType.INFORMATION);
        alert.titleProperty().set("提示");
        alert.headerTextProperty().set(msg);
        alert.showAndWait();
   }
}
