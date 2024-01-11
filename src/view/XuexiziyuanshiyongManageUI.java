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

public class XuexiziyuanshiyongManageUI extends AnchorPane {

	private String mainid;
	public String getMainid() {
		return mainid;
	}
	public void setMainid(String mainid) {
		this.mainid = mainid;
	}
	Dao<Xuexiziyuanshiyong> table_1657126dao = new Dao(new Xuexiziyuanshiyong());
	ObservableList<Xuexiziyuanshiyong> table_1657126data = FXCollections.observableArrayList();
	Dao<Xuexiziyuan> combox_17629dao = new Dao(new Xuexiziyuan());
	public XuexiziyuanshiyongManageUI(String param) {
		this.mainid=param;
		Label label_1454271=new Label("学习资源");
		label_1454271.setFont(new Font("宋体", 14));
		label_1454271.setPrefWidth(Double.valueOf(100));
		label_1454271.setPrefHeight(Double.valueOf(23));
		this.setLeftAnchor(label_1454271, Double.valueOf(150));
		this.setTopAnchor(label_1454271, Double.valueOf(30));
		this.getChildren().add(label_1454271);
		ComboBox<String> combox_17629 = new ComboBox<>();
		combox_17629.setPrefWidth(Double.valueOf(93));
		combox_17629.setPrefHeight(Double.valueOf(23));
		this.setLeftAnchor(combox_17629, Double.valueOf(220));
		this.setTopAnchor(combox_17629, Double.valueOf(30));
		List<Xuexiziyuan> combox_17629list=combox_17629dao.getAll();
		combox_17629.getItems().add("");
		for (int i = 0; i < combox_17629list.size(); i++) {
			combox_17629.getItems().add(combox_17629list.get(i).getMingcheng());
		}
		this.getChildren().add(combox_17629);
		Label label_1126319=new Label("使用人");
		label_1126319.setFont(new Font("宋体", 14));
		label_1126319.setPrefWidth(Double.valueOf(100));
		label_1126319.setPrefHeight(Double.valueOf(23));
		this.setLeftAnchor(label_1126319, Double.valueOf(370));
		this.setTopAnchor(label_1126319, Double.valueOf(30));
		this.getChildren().add(label_1126319);
		TextField textField_1249334 = new TextField();
		textField_1249334.setFont(new Font("宋体", 14));
		textField_1249334.setPrefWidth(Double.valueOf(93));
		textField_1249334.setPrefHeight(Double.valueOf(23));
		this.setLeftAnchor(textField_1249334, Double.valueOf(440));
		this.setTopAnchor(textField_1249334, Double.valueOf(30));
		this.getChildren().add(textField_1249334);
		Label label_1201018=new Label("使用日期");
		label_1201018.setFont(new Font("宋体", 14));
		label_1201018.setPrefWidth(Double.valueOf(100));
		label_1201018.setPrefHeight(Double.valueOf(23));
		this.setLeftAnchor(label_1201018, Double.valueOf(590));
		this.setTopAnchor(label_1201018, Double.valueOf(30));
		this.getChildren().add(label_1201018);
		DatePicker textField_1100750 = new DatePicker();
		textField_1100750.setPrefWidth(Double.valueOf(93));
		textField_1100750.setPrefHeight(Double.valueOf(23));
		this.setLeftAnchor(textField_1100750, Double.valueOf(660));
		this.setTopAnchor(textField_1100750, Double.valueOf(30));
		this.getChildren().add(textField_1100750);
		Label label_1695972=new Label("使用场景");
		label_1695972.setFont(new Font("宋体", 14));
		label_1695972.setPrefWidth(Double.valueOf(100));
		label_1695972.setPrefHeight(Double.valueOf(23));
		this.setLeftAnchor(label_1695972, Double.valueOf(810));
		this.setTopAnchor(label_1695972, Double.valueOf(30));
		this.getChildren().add(label_1695972);
		TextField textField_1902814 = new TextField();
		textField_1902814.setFont(new Font("宋体", 14));
		textField_1902814.setPrefWidth(Double.valueOf(93));
		textField_1902814.setPrefHeight(Double.valueOf(23));
		this.setLeftAnchor(textField_1902814, Double.valueOf(880));
		this.setTopAnchor(textField_1902814, Double.valueOf(30));
		this.getChildren().add(textField_1902814);
		 TableView table_1657126=new TableView();
		table_1657126.setPrefWidth(Double.valueOf(800));
		table_1657126.setPrefHeight(Double.valueOf(400));
		table_1657126.setMaxWidth(Double.valueOf(800));
		table_1657126.setMaxHeight(Double.valueOf(400));
		table_1657126.setMinWidth(Double.valueOf(800));
		table_1657126.setMinHeight(Double.valueOf(400));
		this.setLeftAnchor(table_1657126, Double.valueOf(190));
		this.setTopAnchor(table_1657126, Double.valueOf(145));
		 TableColumn table_1657126id=new TableColumn("编号");
		 table_1657126id.setCellValueFactory(new PropertyValueFactory<>("id"));
		 table_1657126.getColumns().add(table_1657126id);
		 TableColumn table_16571260=new TableColumn("学习资源");
		 table_16571260.setCellValueFactory(new PropertyValueFactory<>("xuexiziyuan"));
		 table_1657126.getColumns().add(table_16571260);
		 TableColumn table_16571261=new TableColumn("使用人");
		 table_16571261.setCellValueFactory(new PropertyValueFactory<>("shiyongren"));
		 table_1657126.getColumns().add(table_16571261);
		 TableColumn table_16571262=new TableColumn("使用日期");
		 table_16571262.setCellValueFactory(new PropertyValueFactory<>("shiyongriqi"));
		 table_1657126.getColumns().add(table_16571262);
		 TableColumn table_16571263=new TableColumn("使用场景");
		 table_16571263.setCellValueFactory(new PropertyValueFactory<>("shiyongchangjing"));
		 table_1657126.getColumns().add(table_16571263);
		table_1657126.setItems(table_1657126data);
		this.getChildren().add(table_1657126);
		table_1657126refresh();
		Button btn_1436684=new Button("新增");
		btn_1436684.setFont(new Font("宋体", 14));
		btn_1436684.setPrefWidth(Double.valueOf(93));
		btn_1436684.setPrefHeight(Double.valueOf(23));
		this.setLeftAnchor(btn_1436684, Double.valueOf(200));
		this.setTopAnchor(btn_1436684, Double.valueOf(100));
		btn_1436684.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent e) {
			    Stage stage=new Stage();
			    stage.setTitle("新增");
			    stage.setScene(new Scene(new XuexiziyuanshiyongAddUI(""),600,600));
			    stage.show();
			}
		});
		this.getChildren().add(btn_1436684);
		Button btn_1452024=new Button("修改");
		btn_1452024.setFont(new Font("宋体", 14));
		btn_1452024.setPrefWidth(Double.valueOf(93));
		btn_1452024.setPrefHeight(Double.valueOf(23));
		this.setLeftAnchor(btn_1452024, Double.valueOf(300));
		this.setTopAnchor(btn_1452024, Double.valueOf(100));
		/**
			修改按钮触发事件
		*/
		btn_1452024.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent e) {
				int row = table_1657126.getSelectionModel().getSelectedIndex();
				if (row == -1) {
					showMsg("请选择一行");
					return;
				}
			    Stage stage=new Stage();
			    stage.setTitle("修改");
			    stage.setScene(new Scene(new XuexiziyuanshiyongUpdateUI(String.valueOf(row)),600,600));
			    stage.show();
			}
		});
		this.getChildren().add(btn_1452024);
		Button btn_1125120=new Button("删除");
		btn_1125120.setFont(new Font("宋体", 14));
		btn_1125120.setPrefWidth(Double.valueOf(93));
		btn_1125120.setPrefHeight(Double.valueOf(23));
		this.setLeftAnchor(btn_1125120, Double.valueOf(400));
		this.setTopAnchor(btn_1125120, Double.valueOf(100));
		btn_1125120.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent e) {
				int row = table_1657126.getSelectionModel().getSelectedIndex();
				if (row == -1) {
					showMsg("请选择一行");
					return;
				}
				Xuexiziyuanshiyong bean = (Xuexiziyuanshiyong)table_1657126.getSelectionModel().getSelectedItems().get(0);
				table_1657126dao.delBykey("id", bean.getId().toString());
				showMsg("删除成功");
				table_1657126refresh();
				
			}
		});
		this.getChildren().add(btn_1125120);
		Button btn_1445449=new Button("查询");
		btn_1445449.setFont(new Font("宋体", 14));
		btn_1445449.setPrefWidth(Double.valueOf(93));
		btn_1445449.setPrefHeight(Double.valueOf(23));
		this.setLeftAnchor(btn_1445449, Double.valueOf(500));
		this.setTopAnchor(btn_1445449, Double.valueOf(100));
		btn_1445449.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent e) {
				Xuexiziyuanshiyong bean=new Xuexiziyuanshiyong();
				bean.setXuexiziyuan(combox_17629.getSelectionModel().getSelectedItem());
				bean.setShiyongren(textField_1249334.getText());
				if(textField_1100750.getValue()!=null)
				bean.setShiyongriqi(textField_1100750.getValue().toString());
				bean.setShiyongchangjing(textField_1902814.getText());
				table_1657126data.clear();
				table_1657126data.addAll(table_1657126dao.query(bean));
				
			}
		});
		this.getChildren().add(btn_1445449);
		Button btn_1953343=new Button("重置");
		btn_1953343.setFont(new Font("宋体", 14));
		btn_1953343.setPrefWidth(Double.valueOf(93));
		btn_1953343.setPrefHeight(Double.valueOf(23));
		this.setLeftAnchor(btn_1953343, Double.valueOf(600));
		this.setTopAnchor(btn_1953343, Double.valueOf(100));
		btn_1953343.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent e) {
				combox_17629.setValue("");
				textField_1249334.setText("");
				textField_1100750.setValue(null);
				textField_1902814.setText("");
			}
		});
		this.getChildren().add(btn_1953343);
		table_1657126.setOnMouseClicked(new EventHandler<Event>() {
			public void handle(Event event) {
				int row = table_1657126.getSelectionModel().getSelectedIndex();
				if (row == -1) {
					return;
				}
		 			Xuexiziyuanshiyong bean = (Xuexiziyuanshiyong)table_1657126.getSelectionModel().getSelectedItems().get(0);
				combox_17629.setValue(bean.getXuexiziyuan());
				textField_1249334.setText(bean.getShiyongren());
				textField_1902814.setText(bean.getShiyongchangjing());
				
			};
		});
		table_1657126refresh();
		
	}
	public void table_1657126refresh(){
		table_1657126data.clear();
    	table_1657126data.addAll(table_1657126dao.getAll());
	}
 	public void showMsg(String msg){
   	 Alert alert = new Alert(AlertType.INFORMATION);
        alert.titleProperty().set("提示");
        alert.headerTextProperty().set(msg);
        alert.showAndWait();
   }
}
