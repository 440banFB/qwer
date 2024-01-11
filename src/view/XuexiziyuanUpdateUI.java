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

public class XuexiziyuanUpdateUI extends AnchorPane {

	private String mainid;
	public String getMainid() {
		return mainid;
	}
	public void setMainid(String mainid) {
		this.mainid = mainid;
	}
	Dao<Xuexiziyuan> table_1576058dao = new Dao(new Xuexiziyuan());
	ObservableList<Xuexiziyuan> table_1576058data = FXCollections.observableArrayList();
	Dao<Xuexiziyuanfenlei> combox_1428197dao = new Dao(new Xuexiziyuanfenlei());
	public XuexiziyuanUpdateUI(String param) {
		this.mainid=param;
		Label label_1560350=new Label("名称");
		label_1560350.setFont(new Font("宋体", 14));
		label_1560350.setPrefWidth(Double.valueOf(100));
		label_1560350.setPrefHeight(Double.valueOf(23));
		this.setLeftAnchor(label_1560350, Double.valueOf(150));
		this.setTopAnchor(label_1560350, Double.valueOf(60));
		this.getChildren().add(label_1560350);
		TextField textField_1861655 = new TextField();
		textField_1861655.setFont(new Font("宋体", 14));
		textField_1861655.setPrefWidth(Double.valueOf(93));
		textField_1861655.setPrefHeight(Double.valueOf(23));
		this.setLeftAnchor(textField_1861655, Double.valueOf(220));
		this.setTopAnchor(textField_1861655, Double.valueOf(60));
		this.getChildren().add(textField_1861655);
		Label label_1391798=new Label("分类");
		label_1391798.setFont(new Font("宋体", 14));
		label_1391798.setPrefWidth(Double.valueOf(100));
		label_1391798.setPrefHeight(Double.valueOf(23));
		this.setLeftAnchor(label_1391798, Double.valueOf(370));
		this.setTopAnchor(label_1391798, Double.valueOf(60));
		this.getChildren().add(label_1391798);
		ComboBox<String> combox_1428197 = new ComboBox<>();
		combox_1428197.setPrefWidth(Double.valueOf(93));
		combox_1428197.setPrefHeight(Double.valueOf(23));
		this.setLeftAnchor(combox_1428197, Double.valueOf(440));
		this.setTopAnchor(combox_1428197, Double.valueOf(60));
		List<Xuexiziyuanfenlei> combox_1428197list=combox_1428197dao.getAll();
		combox_1428197.getItems().add("");
		for (int i = 0; i < combox_1428197list.size(); i++) {
			combox_1428197.getItems().add(combox_1428197list.get(i).getFenleimingcheng());
		}
		this.getChildren().add(combox_1428197);
		 TableView table_1576058=new TableView();
		table_1576058.setPrefWidth(Double.valueOf(0));
		table_1576058.setPrefHeight(Double.valueOf(0));
		table_1576058.setMaxWidth(Double.valueOf(0));
		table_1576058.setMaxHeight(Double.valueOf(0));
		table_1576058.setMinWidth(Double.valueOf(0));
		table_1576058.setMinHeight(Double.valueOf(0));
		this.setLeftAnchor(table_1576058, Double.valueOf(0));
		this.setTopAnchor(table_1576058, Double.valueOf(0));
		 TableColumn table_1576058id=new TableColumn("编号");
		 table_1576058id.setCellValueFactory(new PropertyValueFactory<>("id"));
		 table_1576058.getColumns().add(table_1576058id);
		 TableColumn table_15760580=new TableColumn("名称");
		 table_15760580.setCellValueFactory(new PropertyValueFactory<>("mingcheng"));
		 table_1576058.getColumns().add(table_15760580);
		 TableColumn table_15760581=new TableColumn("分类");
		 table_15760581.setCellValueFactory(new PropertyValueFactory<>("fenlei"));
		 table_1576058.getColumns().add(table_15760581);
		table_1576058.setItems(table_1576058data);
		this.getChildren().add(table_1576058);
		table_1576058refresh();
		Button btn_1479573=new Button("保存");
		btn_1479573.setFont(new Font("宋体", 14));
		btn_1479573.setPrefWidth(Double.valueOf(93));
		btn_1479573.setPrefHeight(Double.valueOf(23));
		this.setLeftAnchor(btn_1479573, Double.valueOf(200));
		this.setTopAnchor(btn_1479573, Double.valueOf(350));
		/**
			修改按钮触发事件
		*/
		btn_1479573.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent e) {
		 			Xuexiziyuan bean = table_1576058data.get(Integer.valueOf(param));
				bean.setMingcheng(textField_1861655.getText());
				bean.setFenlei(combox_1428197.getSelectionModel().getSelectedItem());
				table_1576058dao.update(bean);
				showMsg("修改成功");
			}
		});
		this.getChildren().add(btn_1479573);
		Button btn_1556042=new Button("关闭");
		btn_1556042.setFont(new Font("宋体", 14));
		btn_1556042.setPrefWidth(Double.valueOf(93));
		btn_1556042.setPrefHeight(Double.valueOf(23));
		this.setLeftAnchor(btn_1556042, Double.valueOf(300));
		this.setTopAnchor(btn_1556042, Double.valueOf(350));
		btn_1556042.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent e) {
			    ((Stage) ((Button)e.getSource()).getScene().getWindow()).close();
			}
		});
		this.getChildren().add(btn_1556042);
		table_1576058.setOnMouseClicked(new EventHandler<Event>() {
			public void handle(Event event) {
				int row = table_1576058.getSelectionModel().getSelectedIndex();
				if (row == -1) {
					return;
				}
		 			Xuexiziyuan bean = (Xuexiziyuan)table_1576058.getSelectionModel().getSelectedItems().get(0);
				textField_1861655.setText(bean.getMingcheng());
				combox_1428197.setValue(bean.getFenlei());
				
			};
		});
		table_1576058refresh();
		 			Xuexiziyuan bean = table_1576058data.get(Integer.valueOf(param));
				textField_1861655.setText(bean.getMingcheng());
				combox_1428197.setValue(bean.getFenlei());
		
	}
	public void table_1576058refresh(){
		table_1576058data.clear();
    	table_1576058data.addAll(table_1576058dao.getAll());
	}
 	public void showMsg(String msg){
   	 Alert alert = new Alert(AlertType.INFORMATION);
        alert.titleProperty().set("提示");
        alert.headerTextProperty().set(msg);
        alert.showAndWait();
   }
}
