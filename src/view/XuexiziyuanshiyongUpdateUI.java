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

public class XuexiziyuanshiyongUpdateUI extends AnchorPane {

	private String mainid;
	public String getMainid() {
		return mainid;
	}
	public void setMainid(String mainid) {
		this.mainid = mainid;
	}
	Dao<Xuexiziyuanshiyong> table_1978364dao = new Dao(new Xuexiziyuanshiyong());
	ObservableList<Xuexiziyuanshiyong> table_1978364data = FXCollections.observableArrayList();
	Dao<Xuexiziyuan> combox_1191165dao = new Dao(new Xuexiziyuan());
	public XuexiziyuanshiyongUpdateUI(String param) {
		this.mainid=param;
		Label label_1727442=new Label("学习资源");
		label_1727442.setFont(new Font("宋体", 14));
		label_1727442.setPrefWidth(Double.valueOf(100));
		label_1727442.setPrefHeight(Double.valueOf(23));
		this.setLeftAnchor(label_1727442, Double.valueOf(150));
		this.setTopAnchor(label_1727442, Double.valueOf(60));
		this.getChildren().add(label_1727442);
		ComboBox<String> combox_1191165 = new ComboBox<>();
		combox_1191165.setPrefWidth(Double.valueOf(93));
		combox_1191165.setPrefHeight(Double.valueOf(23));
		this.setLeftAnchor(combox_1191165, Double.valueOf(220));
		this.setTopAnchor(combox_1191165, Double.valueOf(60));
		List<Xuexiziyuan> combox_1191165list=combox_1191165dao.getAll();
		combox_1191165.getItems().add("");
		for (int i = 0; i < combox_1191165list.size(); i++) {
			combox_1191165.getItems().add(combox_1191165list.get(i).getMingcheng());
		}
		this.getChildren().add(combox_1191165);
		Label label_169783=new Label("使用人");
		label_169783.setFont(new Font("宋体", 14));
		label_169783.setPrefWidth(Double.valueOf(100));
		label_169783.setPrefHeight(Double.valueOf(23));
		this.setLeftAnchor(label_169783, Double.valueOf(370));
		this.setTopAnchor(label_169783, Double.valueOf(60));
		this.getChildren().add(label_169783);
		TextField textField_1118664 = new TextField();
		textField_1118664.setFont(new Font("宋体", 14));
		textField_1118664.setPrefWidth(Double.valueOf(93));
		textField_1118664.setPrefHeight(Double.valueOf(23));
		this.setLeftAnchor(textField_1118664, Double.valueOf(440));
		this.setTopAnchor(textField_1118664, Double.valueOf(60));
		this.getChildren().add(textField_1118664);
		Label label_1871805=new Label("使用日期");
		label_1871805.setFont(new Font("宋体", 14));
		label_1871805.setPrefWidth(Double.valueOf(100));
		label_1871805.setPrefHeight(Double.valueOf(23));
		this.setLeftAnchor(label_1871805, Double.valueOf(150));
		this.setTopAnchor(label_1871805, Double.valueOf(120));
		this.getChildren().add(label_1871805);
		DatePicker textField_12773 = new DatePicker();
		textField_12773.setPrefWidth(Double.valueOf(93));
		textField_12773.setPrefHeight(Double.valueOf(23));
		this.setLeftAnchor(textField_12773, Double.valueOf(220));
		this.setTopAnchor(textField_12773, Double.valueOf(120));
		this.getChildren().add(textField_12773);
		Label label_1692054=new Label("使用场景");
		label_1692054.setFont(new Font("宋体", 14));
		label_1692054.setPrefWidth(Double.valueOf(100));
		label_1692054.setPrefHeight(Double.valueOf(23));
		this.setLeftAnchor(label_1692054, Double.valueOf(370));
		this.setTopAnchor(label_1692054, Double.valueOf(120));
		this.getChildren().add(label_1692054);
		TextField textField_1342762 = new TextField();
		textField_1342762.setFont(new Font("宋体", 14));
		textField_1342762.setPrefWidth(Double.valueOf(93));
		textField_1342762.setPrefHeight(Double.valueOf(23));
		this.setLeftAnchor(textField_1342762, Double.valueOf(440));
		this.setTopAnchor(textField_1342762, Double.valueOf(120));
		this.getChildren().add(textField_1342762);
		 TableView table_1978364=new TableView();
		table_1978364.setPrefWidth(Double.valueOf(0));
		table_1978364.setPrefHeight(Double.valueOf(0));
		table_1978364.setMaxWidth(Double.valueOf(0));
		table_1978364.setMaxHeight(Double.valueOf(0));
		table_1978364.setMinWidth(Double.valueOf(0));
		table_1978364.setMinHeight(Double.valueOf(0));
		this.setLeftAnchor(table_1978364, Double.valueOf(0));
		this.setTopAnchor(table_1978364, Double.valueOf(0));
		 TableColumn table_1978364id=new TableColumn("编号");
		 table_1978364id.setCellValueFactory(new PropertyValueFactory<>("id"));
		 table_1978364.getColumns().add(table_1978364id);
		 TableColumn table_19783640=new TableColumn("学习资源");
		 table_19783640.setCellValueFactory(new PropertyValueFactory<>("xuexiziyuan"));
		 table_1978364.getColumns().add(table_19783640);
		 TableColumn table_19783641=new TableColumn("使用人");
		 table_19783641.setCellValueFactory(new PropertyValueFactory<>("shiyongren"));
		 table_1978364.getColumns().add(table_19783641);
		 TableColumn table_19783642=new TableColumn("使用日期");
		 table_19783642.setCellValueFactory(new PropertyValueFactory<>("shiyongriqi"));
		 table_1978364.getColumns().add(table_19783642);
		 TableColumn table_19783643=new TableColumn("使用场景");
		 table_19783643.setCellValueFactory(new PropertyValueFactory<>("shiyongchangjing"));
		 table_1978364.getColumns().add(table_19783643);
		table_1978364.setItems(table_1978364data);
		this.getChildren().add(table_1978364);
		table_1978364refresh();
		Button btn_1169514=new Button("保存");
		btn_1169514.setFont(new Font("宋体", 14));
		btn_1169514.setPrefWidth(Double.valueOf(93));
		btn_1169514.setPrefHeight(Double.valueOf(23));
		this.setLeftAnchor(btn_1169514, Double.valueOf(200));
		this.setTopAnchor(btn_1169514, Double.valueOf(350));
		/**
			修改按钮触发事件
		*/
		btn_1169514.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent e) {
		 			Xuexiziyuanshiyong bean = table_1978364data.get(Integer.valueOf(param));
				bean.setXuexiziyuan(combox_1191165.getSelectionModel().getSelectedItem());
				bean.setShiyongren(textField_1118664.getText());
				if(textField_12773.getValue()!=null)
				bean.setShiyongriqi(textField_12773.getValue().toString());
				bean.setShiyongchangjing(textField_1342762.getText());
				table_1978364dao.update(bean);
				showMsg("修改成功");
			}
		});
		this.getChildren().add(btn_1169514);
		Button btn_1711136=new Button("关闭");
		btn_1711136.setFont(new Font("宋体", 14));
		btn_1711136.setPrefWidth(Double.valueOf(93));
		btn_1711136.setPrefHeight(Double.valueOf(23));
		this.setLeftAnchor(btn_1711136, Double.valueOf(300));
		this.setTopAnchor(btn_1711136, Double.valueOf(350));
		btn_1711136.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent e) {
			    ((Stage) ((Button)e.getSource()).getScene().getWindow()).close();
			}
		});
		this.getChildren().add(btn_1711136);
		table_1978364.setOnMouseClicked(new EventHandler<Event>() {
			public void handle(Event event) {
				int row = table_1978364.getSelectionModel().getSelectedIndex();
				if (row == -1) {
					return;
				}
		 			Xuexiziyuanshiyong bean = (Xuexiziyuanshiyong)table_1978364.getSelectionModel().getSelectedItems().get(0);
				combox_1191165.setValue(bean.getXuexiziyuan());
				textField_1118664.setText(bean.getShiyongren());
				textField_1342762.setText(bean.getShiyongchangjing());
				
			};
		});
		table_1978364refresh();
		 			Xuexiziyuanshiyong bean = table_1978364data.get(Integer.valueOf(param));
				combox_1191165.setValue(bean.getXuexiziyuan());
				textField_1118664.setText(bean.getShiyongren());
				textField_1342762.setText(bean.getShiyongchangjing());
		
	}
	public void table_1978364refresh(){
		table_1978364data.clear();
    	table_1978364data.addAll(table_1978364dao.getAll());
	}
 	public void showMsg(String msg){
   	 Alert alert = new Alert(AlertType.INFORMATION);
        alert.titleProperty().set("提示");
        alert.headerTextProperty().set(msg);
        alert.showAndWait();
   }
}
