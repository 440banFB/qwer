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

public class XuexiziyuanshiyongAddUI extends AnchorPane {

	private String mainid;
	public String getMainid() {
		return mainid;
	}
	public void setMainid(String mainid) {
		this.mainid = mainid;
	}
	Dao<Xuexiziyuanshiyong> table_1589284dao = new Dao(new Xuexiziyuanshiyong());
	ObservableList<Xuexiziyuanshiyong> table_1589284data = FXCollections.observableArrayList();
	Dao<Xuexiziyuan> combox_1712230dao = new Dao(new Xuexiziyuan());
	public XuexiziyuanshiyongAddUI(String param) {
		this.mainid=param;
		Label label_1564600=new Label("学习资源");
		label_1564600.setFont(new Font("宋体", 14));
		label_1564600.setPrefWidth(Double.valueOf(100));
		label_1564600.setPrefHeight(Double.valueOf(23));
		this.setLeftAnchor(label_1564600, Double.valueOf(150));
		this.setTopAnchor(label_1564600, Double.valueOf(60));
		this.getChildren().add(label_1564600);
		ComboBox<String> combox_1712230 = new ComboBox<>();
		combox_1712230.setPrefWidth(Double.valueOf(93));
		combox_1712230.setPrefHeight(Double.valueOf(23));
		this.setLeftAnchor(combox_1712230, Double.valueOf(220));
		this.setTopAnchor(combox_1712230, Double.valueOf(60));
		List<Xuexiziyuan> combox_1712230list=combox_1712230dao.getAll();
		combox_1712230.getItems().add("");
		for (int i = 0; i < combox_1712230list.size(); i++) {
			combox_1712230.getItems().add(combox_1712230list.get(i).getMingcheng());
		}
		this.getChildren().add(combox_1712230);
		Label label_1746433=new Label("使用人");
		label_1746433.setFont(new Font("宋体", 14));
		label_1746433.setPrefWidth(Double.valueOf(100));
		label_1746433.setPrefHeight(Double.valueOf(23));
		this.setLeftAnchor(label_1746433, Double.valueOf(370));
		this.setTopAnchor(label_1746433, Double.valueOf(60));
		this.getChildren().add(label_1746433);
		TextField textField_1736972 = new TextField();
		textField_1736972.setFont(new Font("宋体", 14));
		textField_1736972.setPrefWidth(Double.valueOf(93));
		textField_1736972.setPrefHeight(Double.valueOf(23));
		this.setLeftAnchor(textField_1736972, Double.valueOf(440));
		this.setTopAnchor(textField_1736972, Double.valueOf(60));
		this.getChildren().add(textField_1736972);
		Label label_1246752=new Label("使用日期");
		label_1246752.setFont(new Font("宋体", 14));
		label_1246752.setPrefWidth(Double.valueOf(100));
		label_1246752.setPrefHeight(Double.valueOf(23));
		this.setLeftAnchor(label_1246752, Double.valueOf(150));
		this.setTopAnchor(label_1246752, Double.valueOf(120));
		this.getChildren().add(label_1246752);
		DatePicker textField_1916697 = new DatePicker();
		textField_1916697.setPrefWidth(Double.valueOf(93));
		textField_1916697.setPrefHeight(Double.valueOf(23));
		this.setLeftAnchor(textField_1916697, Double.valueOf(220));
		this.setTopAnchor(textField_1916697, Double.valueOf(120));
		this.getChildren().add(textField_1916697);
		Label label_1829904=new Label("使用场景");
		label_1829904.setFont(new Font("宋体", 14));
		label_1829904.setPrefWidth(Double.valueOf(100));
		label_1829904.setPrefHeight(Double.valueOf(23));
		this.setLeftAnchor(label_1829904, Double.valueOf(370));
		this.setTopAnchor(label_1829904, Double.valueOf(120));
		this.getChildren().add(label_1829904);
		TextField textField_13106 = new TextField();
		textField_13106.setFont(new Font("宋体", 14));
		textField_13106.setPrefWidth(Double.valueOf(93));
		textField_13106.setPrefHeight(Double.valueOf(23));
		this.setLeftAnchor(textField_13106, Double.valueOf(440));
		this.setTopAnchor(textField_13106, Double.valueOf(120));
		this.getChildren().add(textField_13106);
		 TableView table_1589284=new TableView();
		table_1589284.setPrefWidth(Double.valueOf(0));
		table_1589284.setPrefHeight(Double.valueOf(0));
		table_1589284.setMaxWidth(Double.valueOf(0));
		table_1589284.setMaxHeight(Double.valueOf(0));
		table_1589284.setMinWidth(Double.valueOf(0));
		table_1589284.setMinHeight(Double.valueOf(0));
		this.setLeftAnchor(table_1589284, Double.valueOf(0));
		this.setTopAnchor(table_1589284, Double.valueOf(0));
		 TableColumn table_1589284id=new TableColumn("编号");
		 table_1589284id.setCellValueFactory(new PropertyValueFactory<>("id"));
		 table_1589284.getColumns().add(table_1589284id);
		 TableColumn table_15892840=new TableColumn("学习资源");
		 table_15892840.setCellValueFactory(new PropertyValueFactory<>("xuexiziyuan"));
		 table_1589284.getColumns().add(table_15892840);
		 TableColumn table_15892841=new TableColumn("使用人");
		 table_15892841.setCellValueFactory(new PropertyValueFactory<>("shiyongren"));
		 table_1589284.getColumns().add(table_15892841);
		 TableColumn table_15892842=new TableColumn("使用日期");
		 table_15892842.setCellValueFactory(new PropertyValueFactory<>("shiyongriqi"));
		 table_1589284.getColumns().add(table_15892842);
		 TableColumn table_15892843=new TableColumn("使用场景");
		 table_15892843.setCellValueFactory(new PropertyValueFactory<>("shiyongchangjing"));
		 table_1589284.getColumns().add(table_15892843);
		table_1589284.setItems(table_1589284data);
		this.getChildren().add(table_1589284);
		table_1589284refresh();
		Button btn_1298480=new Button("保存");
		btn_1298480.setFont(new Font("宋体", 14));
		btn_1298480.setPrefWidth(Double.valueOf(93));
		btn_1298480.setPrefHeight(Double.valueOf(23));
		this.setLeftAnchor(btn_1298480, Double.valueOf(200));
		this.setTopAnchor(btn_1298480, Double.valueOf(350));
		btn_1298480.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent e) {
				Xuexiziyuanshiyong bean=new Xuexiziyuanshiyong();
				bean.setXuexiziyuan(combox_1712230.getSelectionModel().getSelectedItem());
				bean.setShiyongren(textField_1736972.getText());
				if(textField_1916697.getValue()!=null)
				bean.setShiyongriqi(textField_1916697.getValue().toString());
				bean.setShiyongchangjing(textField_13106.getText());
				table_1589284dao.add(bean);
				showMsg("新增成功");
				table_1589284refresh();
				
			}
		});
		this.getChildren().add(btn_1298480);
		Button btn_1586931=new Button("关闭");
		btn_1586931.setFont(new Font("宋体", 14));
		btn_1586931.setPrefWidth(Double.valueOf(93));
		btn_1586931.setPrefHeight(Double.valueOf(23));
		this.setLeftAnchor(btn_1586931, Double.valueOf(300));
		this.setTopAnchor(btn_1586931, Double.valueOf(350));
		btn_1586931.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent e) {
			    ((Stage) ((Button)e.getSource()).getScene().getWindow()).close();
			}
		});
		this.getChildren().add(btn_1586931);
		table_1589284.setOnMouseClicked(new EventHandler<Event>() {
			public void handle(Event event) {
				int row = table_1589284.getSelectionModel().getSelectedIndex();
				if (row == -1) {
					return;
				}
		 			Xuexiziyuanshiyong bean = (Xuexiziyuanshiyong)table_1589284.getSelectionModel().getSelectedItems().get(0);
				combox_1712230.setValue(bean.getXuexiziyuan());
				textField_1736972.setText(bean.getShiyongren());
				textField_13106.setText(bean.getShiyongchangjing());
				
			};
		});
		table_1589284refresh();
		
	}
	public void table_1589284refresh(){
		table_1589284data.clear();
    	table_1589284data.addAll(table_1589284dao.getAll());
	}
 	public void showMsg(String msg){
   	 Alert alert = new Alert(AlertType.INFORMATION);
        alert.titleProperty().set("提示");
        alert.headerTextProperty().set(msg);
        alert.showAndWait();
   }
}
