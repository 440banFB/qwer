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

public class XuexiziyuanManageUI extends AnchorPane {

	private String mainid;
	public String getMainid() {
		return mainid;
	}
	public void setMainid(String mainid) {
		this.mainid = mainid;
	}
	Dao<Xuexiziyuan> table_1378668dao = new Dao(new Xuexiziyuan());
	ObservableList<Xuexiziyuan> table_1378668data = FXCollections.observableArrayList();
	Dao<Xuexiziyuanfenlei> combox_1878442dao = new Dao(new Xuexiziyuanfenlei());
	public XuexiziyuanManageUI(String param) {
		this.mainid=param;
		Label label_141651=new Label("名称");
		label_141651.setFont(new Font("宋体", 14));
		label_141651.setPrefWidth(Double.valueOf(100));
		label_141651.setPrefHeight(Double.valueOf(23));
		this.setLeftAnchor(label_141651, Double.valueOf(150));
		this.setTopAnchor(label_141651, Double.valueOf(30));
		this.getChildren().add(label_141651);
		TextField textField_1774597 = new TextField();
		textField_1774597.setFont(new Font("宋体", 14));
		textField_1774597.setPrefWidth(Double.valueOf(93));
		textField_1774597.setPrefHeight(Double.valueOf(23));
		this.setLeftAnchor(textField_1774597, Double.valueOf(220));
		this.setTopAnchor(textField_1774597, Double.valueOf(30));
		this.getChildren().add(textField_1774597);
		Label label_1480167=new Label("分类");
		label_1480167.setFont(new Font("宋体", 14));
		label_1480167.setPrefWidth(Double.valueOf(100));
		label_1480167.setPrefHeight(Double.valueOf(23));
		this.setLeftAnchor(label_1480167, Double.valueOf(370));
		this.setTopAnchor(label_1480167, Double.valueOf(30));
		this.getChildren().add(label_1480167);
		ComboBox<String> combox_1878442 = new ComboBox<>();
		combox_1878442.setPrefWidth(Double.valueOf(93));
		combox_1878442.setPrefHeight(Double.valueOf(23));
		this.setLeftAnchor(combox_1878442, Double.valueOf(440));
		this.setTopAnchor(combox_1878442, Double.valueOf(30));
		List<Xuexiziyuanfenlei> combox_1878442list=combox_1878442dao.getAll();
		combox_1878442.getItems().add("");
		for (int i = 0; i < combox_1878442list.size(); i++) {
			combox_1878442.getItems().add(combox_1878442list.get(i).getFenleimingcheng());
		}
		this.getChildren().add(combox_1878442);
		 TableView table_1378668=new TableView();
		table_1378668.setPrefWidth(Double.valueOf(800));
		table_1378668.setPrefHeight(Double.valueOf(400));
		table_1378668.setMaxWidth(Double.valueOf(800));
		table_1378668.setMaxHeight(Double.valueOf(400));
		table_1378668.setMinWidth(Double.valueOf(800));
		table_1378668.setMinHeight(Double.valueOf(400));
		this.setLeftAnchor(table_1378668, Double.valueOf(190));
		this.setTopAnchor(table_1378668, Double.valueOf(145));
		 TableColumn table_1378668id=new TableColumn("编号");
		 table_1378668id.setCellValueFactory(new PropertyValueFactory<>("id"));
		 table_1378668.getColumns().add(table_1378668id);
		 TableColumn table_13786680=new TableColumn("名称");
		 table_13786680.setCellValueFactory(new PropertyValueFactory<>("mingcheng"));
		 table_1378668.getColumns().add(table_13786680);
		 TableColumn table_13786681=new TableColumn("分类");
		 table_13786681.setCellValueFactory(new PropertyValueFactory<>("fenlei"));
		 table_1378668.getColumns().add(table_13786681);
		table_1378668.setItems(table_1378668data);
		this.getChildren().add(table_1378668);
		table_1378668refresh();
		Button btn_1237232=new Button("新增");
		btn_1237232.setFont(new Font("宋体", 14));
		btn_1237232.setPrefWidth(Double.valueOf(93));
		btn_1237232.setPrefHeight(Double.valueOf(23));
		this.setLeftAnchor(btn_1237232, Double.valueOf(200));
		this.setTopAnchor(btn_1237232, Double.valueOf(100));
		btn_1237232.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent e) {
			    Stage stage=new Stage();
			    stage.setTitle("新增");
			    stage.setScene(new Scene(new XuexiziyuanAddUI(""),600,600));
			    stage.show();
			}
		});
		this.getChildren().add(btn_1237232);
		Button btn_1436776=new Button("修改");
		btn_1436776.setFont(new Font("宋体", 14));
		btn_1436776.setPrefWidth(Double.valueOf(93));
		btn_1436776.setPrefHeight(Double.valueOf(23));
		this.setLeftAnchor(btn_1436776, Double.valueOf(300));
		this.setTopAnchor(btn_1436776, Double.valueOf(100));
		/**
			修改按钮触发事件
		*/
		btn_1436776.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent e) {
				int row = table_1378668.getSelectionModel().getSelectedIndex();
				if (row == -1) {
					showMsg("请选择一行");
					return;
				}
			    Stage stage=new Stage();
			    stage.setTitle("修改");
			    stage.setScene(new Scene(new XuexiziyuanUpdateUI(String.valueOf(row)),600,600));
			    stage.show();
			}
		});
		this.getChildren().add(btn_1436776);
		Button btn_1980696=new Button("删除");
		btn_1980696.setFont(new Font("宋体", 14));
		btn_1980696.setPrefWidth(Double.valueOf(93));
		btn_1980696.setPrefHeight(Double.valueOf(23));
		this.setLeftAnchor(btn_1980696, Double.valueOf(400));
		this.setTopAnchor(btn_1980696, Double.valueOf(100));
		btn_1980696.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent e) {
				int row = table_1378668.getSelectionModel().getSelectedIndex();
				if (row == -1) {
					showMsg("请选择一行");
					return;
				}
				Xuexiziyuan bean = (Xuexiziyuan)table_1378668.getSelectionModel().getSelectedItems().get(0);
				table_1378668dao.delBykey("id", bean.getId().toString());
				showMsg("删除成功");
				table_1378668refresh();
				
			}
		});
		this.getChildren().add(btn_1980696);
		Button btn_1748245=new Button("查询");
		btn_1748245.setFont(new Font("宋体", 14));
		btn_1748245.setPrefWidth(Double.valueOf(93));
		btn_1748245.setPrefHeight(Double.valueOf(23));
		this.setLeftAnchor(btn_1748245, Double.valueOf(500));
		this.setTopAnchor(btn_1748245, Double.valueOf(100));
		btn_1748245.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent e) {
				Xuexiziyuan bean=new Xuexiziyuan();
				bean.setMingcheng(textField_1774597.getText());
				bean.setFenlei(combox_1878442.getSelectionModel().getSelectedItem());
				table_1378668data.clear();
				table_1378668data.addAll(table_1378668dao.query(bean));
				
			}
		});
		this.getChildren().add(btn_1748245);
		Button btn_1770089=new Button("重置");
		btn_1770089.setFont(new Font("宋体", 14));
		btn_1770089.setPrefWidth(Double.valueOf(93));
		btn_1770089.setPrefHeight(Double.valueOf(23));
		this.setLeftAnchor(btn_1770089, Double.valueOf(600));
		this.setTopAnchor(btn_1770089, Double.valueOf(100));
		btn_1770089.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent e) {
				textField_1774597.setText("");
				combox_1878442.setValue("");
			}
		});
		this.getChildren().add(btn_1770089);
		table_1378668.setOnMouseClicked(new EventHandler<Event>() {
			public void handle(Event event) {
				int row = table_1378668.getSelectionModel().getSelectedIndex();
				if (row == -1) {
					return;
				}
		 			Xuexiziyuan bean = (Xuexiziyuan)table_1378668.getSelectionModel().getSelectedItems().get(0);
				textField_1774597.setText(bean.getMingcheng());
				combox_1878442.setValue(bean.getFenlei());
				
			};
		});
		table_1378668refresh();
		
	}
	public void table_1378668refresh(){
		table_1378668data.clear();
    	table_1378668data.addAll(table_1378668dao.getAll());
	}
 	public void showMsg(String msg){
   	 Alert alert = new Alert(AlertType.INFORMATION);
        alert.titleProperty().set("提示");
        alert.headerTextProperty().set(msg);
        alert.showAndWait();
   }
}
