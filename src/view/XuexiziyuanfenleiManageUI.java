package view;

// 导入包
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

public class XuexiziyuanfenleiManageUI extends AnchorPane {

	private String mainid;
	public String getMainid() {
		return mainid;
	}
	public void setMainid(String mainid) {
		this.mainid = mainid;
	}
	Dao<Xuexiziyuanfenlei> table_1834131dao = new Dao(new Xuexiziyuanfenlei());
	ObservableList<Xuexiziyuanfenlei> table_1834131data = FXCollections.observableArrayList();
	public XuexiziyuanfenleiManageUI(String param) {
		this.mainid=param;
		Label label_1357698=new Label("分类名称");
		label_1357698.setFont(new Font("宋体", 14));
		label_1357698.setPrefWidth(Double.valueOf(100));
		label_1357698.setPrefHeight(Double.valueOf(23));
		this.setLeftAnchor(label_1357698, Double.valueOf(150));
		this.setTopAnchor(label_1357698, Double.valueOf(30));
		this.getChildren().add(label_1357698);
		TextField textField_1578807 = new TextField();
		textField_1578807.setFont(new Font("宋体", 14));
		textField_1578807.setPrefWidth(Double.valueOf(93));
		textField_1578807.setPrefHeight(Double.valueOf(23));
		this.setLeftAnchor(textField_1578807, Double.valueOf(220));
		this.setTopAnchor(textField_1578807, Double.valueOf(30));
		this.getChildren().add(textField_1578807);
		TableView table_1834131=new TableView();
		table_1834131.setPrefWidth(Double.valueOf(800));
		table_1834131.setPrefHeight(Double.valueOf(400));
		table_1834131.setMaxWidth(Double.valueOf(800));
		table_1834131.setMaxHeight(Double.valueOf(400));
		table_1834131.setMinWidth(Double.valueOf(800));
		table_1834131.setMinHeight(Double.valueOf(400));
		this.setLeftAnchor(table_1834131, Double.valueOf(190));
		this.setTopAnchor(table_1834131, Double.valueOf(145));
		TableColumn table_1834131id=new TableColumn("编号");
		table_1834131id.setCellValueFactory(new PropertyValueFactory<>("id"));
		table_1834131.getColumns().add(table_1834131id);
		TableColumn table_18341310=new TableColumn("分类名称");
		table_18341310.setCellValueFactory(new PropertyValueFactory<>("fenleimingcheng"));
		table_1834131.getColumns().add(table_18341310);
		table_1834131.setItems(table_1834131data);
		this.getChildren().add(table_1834131);
		table_1834131refresh();
		Button btn_1309513=new Button("新增");
		btn_1309513.setFont(new Font("宋体", 14));
		btn_1309513.setPrefWidth(Double.valueOf(93));
		btn_1309513.setPrefHeight(Double.valueOf(23));
		this.setLeftAnchor(btn_1309513, Double.valueOf(200));
		this.setTopAnchor(btn_1309513, Double.valueOf(100));
		btn_1309513.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent e) {
				Stage stage=new Stage();
				stage.setTitle("新增");
				stage.setScene(new Scene(new XuexiziyuanfenleiAddUI(""),600,600));
				stage.show();
			}
		});
		this.getChildren().add(btn_1309513);
		Button btn_1107836=new Button("修改");
		btn_1107836.setFont(new Font("宋体", 14));
		btn_1107836.setPrefWidth(Double.valueOf(93));
		btn_1107836.setPrefHeight(Double.valueOf(23));
		this.setLeftAnchor(btn_1107836, Double.valueOf(300));
		/**
		 // 修改按钮触发事件
		 */
		btn_1107836.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent e) {
				int row = table_1834131.getSelectionModel().getSelectedIndex();
				if (row == -1) {
					showMsg("请选择一行");
					return;
				}
				Stage stage=new Stage();
				stage.setTitle("修改");
				stage.setScene(new Scene(new XuexiziyuanfenleiUpdateUI(String.valueOf(row)),600,600));
				stage.show();
			}
		});
		this.getChildren().add(btn_1107836);
		Button btn_1727204=new Button("删除");
		btn_1727204.setFont(new Font("宋体", 14));
		btn_1727204.setPrefWidth(Double.valueOf(93));
		btn_1727204.setPrefHeight(Double.valueOf(23));
		this.setLeftAnchor(btn_1727204, Double.valueOf(400));
		btn_1727204.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent e) {
				int row = table_1834131.getSelectionModel().getSelectedIndex();
				if (row == -1) {
					showMsg("请选择一行");
					return;
				}
				Xuexiziyuanfenlei bean = (Xuexiziyuanfenlei)table_1834131.getSelectionModel().getSelectedItems().get(0);
				table_1834131dao.delBykey("id", bean.getId().toString());
				showMsg("删除成功");
				table_1834131refresh();

			}
		});
		this.getChildren().add(btn_1727204);
		Button btn_1449598=new Button("查询");
		btn_1449598.setFont(new Font("宋体", 14));
		btn_1449598.setPrefWidth(Double.valueOf(93));
		btn_1449598.setPrefHeight(Double.valueOf(23));
		this.setLeftAnchor(btn_1449598, Double.valueOf(500));
		btn_1449598.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent e) {
				Xuexiziyuanfenlei bean=new Xuexiziyuanfenlei();
				bean.setFenleimingcheng(textField_1578807.getText());
				table_1834131data.clear();
				table_1834131data.addAll(table_1834131dao.query(bean));

			}
		});
		this.getChildren().add(btn_1449598);
		Button btn_1758368=new Button("重置");
		btn_1758368.setFont(new Font("宋体", 14));
		btn_1758368.setPrefWidth(Double.valueOf(93));
		btn_1758368.setPrefHeight(Double.valueOf(23));
		this.setLeftAnchor(btn_1758368, Double.valueOf(600));
		btn_1758368.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent e) {
				textField_1578807.setText("");
			}
		});
		this.getChildren().add(btn_1758368);
		table_1834131.setOnMouseClicked(new EventHandler<Event>() {
			public void handle(Event event) {
				int row = table_1834131.getSelectionModel().getSelectedIndex();
				if (row == -1) {
					return;
				}
				Xuexiziyuanfenlei bean = (Xuexiziyuanfenlei)table_1834131.getSelectionModel().getSelectedItems().get(0);
				textField_1578807.setText(bean.getFenleimingcheng());
			};
		});
		table_1834131refresh();

	}
	public void table_1834131refresh(){
		table_1834131data.clear();
		table_1834131data.addAll(table_1834131dao.getAll());
	}
	public void showMsg(String msg){
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.titleProperty().set("提示");
		alert.headerTextProperty().set(msg);
		alert.showAndWait();
	}
}
