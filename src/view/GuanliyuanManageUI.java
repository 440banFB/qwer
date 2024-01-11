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

/**
 * 管理员管理界面类 GuanliyuanManageUI
 */
public class GuanliyuanManageUI extends AnchorPane {

	private String mainid;
	public String getMainid() {
		return mainid;
	}
	public void setMainid(String mainid) {
		this.mainid = mainid;
	}
	Dao<Guanliyuan> table_1370595dao = new Dao(new Guanliyuan());
	ObservableList<Guanliyuan> table_1370595data = FXCollections.observableArrayList();
	/**
	 * 构造方法，创建管理员管理界面
	 *
	 * @param param 主界面传递的参数
	 */
	public GuanliyuanManageUI(String param) {



		this.mainid=param;
		// UI 组件
		// 用户名标签
		Label label_1800376=new Label("用户名");
		label_1800376.setFont(new Font("宋体", 14));
		label_1800376.setPrefWidth(Double.valueOf(100));
		label_1800376.setPrefHeight(Double.valueOf(23));
		this.setLeftAnchor(label_1800376, Double.valueOf(150));
		this.setTopAnchor(label_1800376, Double.valueOf(30));
		this.getChildren().add(label_1800376);
		// 用户名文本框
		TextField textField_1408953 = new TextField();
		textField_1408953.setFont(new Font("宋体", 14));
		textField_1408953.setPrefWidth(Double.valueOf(93));
		textField_1408953.setPrefHeight(Double.valueOf(23));
		this.setLeftAnchor(textField_1408953, Double.valueOf(220));
		this.setTopAnchor(textField_1408953, Double.valueOf(30));
		this.getChildren().add(textField_1408953);
		// 密码标签
		Label label_1390972=new Label("密码");
		label_1390972.setFont(new Font("宋体", 14));
		label_1390972.setPrefWidth(Double.valueOf(100));
		label_1390972.setPrefHeight(Double.valueOf(23));
		this.setLeftAnchor(label_1390972, Double.valueOf(370));
		this.setTopAnchor(label_1390972, Double.valueOf(30));
		this.getChildren().add(label_1390972);
		// 密码文本框
		TextField textField_1237174 = new TextField();
		textField_1237174.setFont(new Font("宋体", 14));
		textField_1237174.setPrefWidth(Double.valueOf(93));
		textField_1237174.setPrefHeight(Double.valueOf(23));
		this.setLeftAnchor(textField_1237174, Double.valueOf(440));
		this.setTopAnchor(textField_1237174, Double.valueOf(30));
		this.getChildren().add(textField_1237174);
		// 表格视图
		 TableView table_1370595=new TableView();
		table_1370595.setPrefWidth(Double.valueOf(800));
		table_1370595.setPrefHeight(Double.valueOf(400));
		table_1370595.setMaxWidth(Double.valueOf(800));
		table_1370595.setMaxHeight(Double.valueOf(400));
		table_1370595.setMinWidth(Double.valueOf(800));
		table_1370595.setMinHeight(Double.valueOf(400));
		this.setLeftAnchor(table_1370595, Double.valueOf(190));
		this.setTopAnchor(table_1370595, Double.valueOf(145));
		// 创建 TableColumn 列，设置列名和属性关联
		 TableColumn table_1370595id=new TableColumn("编号");
		 table_1370595id.setCellValueFactory(new PropertyValueFactory<>("id"));
		 table_1370595.getColumns().add(table_1370595id);

		 TableColumn table_13705950=new TableColumn("用户名");
		 table_13705950.setCellValueFactory(new PropertyValueFactory<>("yonghuming"));
		 table_1370595.getColumns().add(table_13705950);

		 TableColumn table_13705951=new TableColumn("密码");
		 table_13705951.setCellValueFactory(new PropertyValueFactory<>("mima"));
		 table_1370595.getColumns().add(table_13705951);
		// 将数据集合绑定到 TableView 控件
		table_1370595.setItems(table_1370595data);
		this.getChildren().add(table_1370595);
		// 刷新 TableView 数据
		table_1370595refresh();
		// 创建新增按钮
		Button btn_1150123=new Button("新增");
		btn_1150123.setFont(new Font("宋体", 14));
		btn_1150123.setPrefWidth(Double.valueOf(93));
		btn_1150123.setPrefHeight(Double.valueOf(23));
		this.setLeftAnchor(btn_1150123, Double.valueOf(200));
		this.setTopAnchor(btn_1150123, Double.valueOf(100));
		// 设置新增按钮点击事件
		btn_1150123.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent e) {
			    Stage stage=new Stage();
			    stage.setTitle("新增");
			    stage.setScene(new Scene(new GuanliyuanAddUI(""),600,600));
			    stage.show();
			}
		});
		// 将新增按钮添加到布局
		this.getChildren().add(btn_1150123);
		// 创建修改按钮
		Button btn_1734068=new Button("修改");
		btn_1734068.setFont(new Font("宋体", 14));
		btn_1734068.setPrefWidth(Double.valueOf(93));
		btn_1734068.setPrefHeight(Double.valueOf(23));
		this.setLeftAnchor(btn_1734068, Double.valueOf(300));
		this.setTopAnchor(btn_1734068, Double.valueOf(100));
		/**
			修改按钮触发事件
		*/
		// 设置修改按钮点击事件
		btn_1734068.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent e) {
				int row = table_1370595.getSelectionModel().getSelectedIndex();
				if (row == -1) {
					showMsg("请选择一行");
					return;
				}
			    Stage stage=new Stage();
			    stage.setTitle("修改");
			    stage.setScene(new Scene(new GuanliyuanUpdateUI(String.valueOf(row)),600,600));
			    stage.show();
			}
		});
		// 创建修改按钮
		this.getChildren().add(btn_1734068);
		// 创建删除按钮
		Button btn_167681=new Button("删除");
		btn_167681.setFont(new Font("宋体", 14));
		btn_167681.setPrefWidth(Double.valueOf(93));
		btn_167681.setPrefHeight(Double.valueOf(23));
		this.setLeftAnchor(btn_167681, Double.valueOf(400));
		this.setTopAnchor(btn_167681, Double.valueOf(100));
		// 设置删除按钮点击事件
		btn_167681.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent e) {
				int row = table_1370595.getSelectionModel().getSelectedIndex();
				if (row == -1) {
					showMsg("请选择一行");
					return;
				}
				Guanliyuan bean = (Guanliyuan)table_1370595.getSelectionModel().getSelectedItems().get(0);
				table_1370595dao.delBykey("id", bean.getId().toString());
				showMsg("删除成功");
				table_1370595refresh();
				
			}
		});
		// 将删除按钮添加到布局
		this.getChildren().add(btn_167681);
		// 创建查询按钮
		Button btn_1326939=new Button("查询");
		btn_1326939.setFont(new Font("宋体", 14));
		btn_1326939.setPrefWidth(Double.valueOf(93));
		btn_1326939.setPrefHeight(Double.valueOf(23));
		this.setLeftAnchor(btn_1326939, Double.valueOf(500));
		this.setTopAnchor(btn_1326939, Double.valueOf(100));
		// 设置查询按钮点击事件
		btn_1326939.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent e) {
				Guanliyuan bean=new Guanliyuan();
				bean.setYonghuming(textField_1408953.getText());
				bean.setMima(textField_1237174.getText());
				table_1370595data.clear();
				table_1370595data.addAll(table_1370595dao.query(bean));
				
			}
		});
		// 将查询按钮添加到布局
		this.getChildren().add(btn_1326939);
		// 创建重置按钮
		Button btn_1131467=new Button("重置");
		btn_1131467.setFont(new Font("宋体", 14));
		btn_1131467.setPrefWidth(Double.valueOf(93));
		btn_1131467.setPrefHeight(Double.valueOf(23));
		this.setLeftAnchor(btn_1131467, Double.valueOf(600));
		this.setTopAnchor(btn_1131467, Double.valueOf(100));
		// 设置重置按钮点击事件
		btn_1131467.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent e) {
				textField_1408953.setText("");
				textField_1237174.setText("");
			}
		});
		// 将重置按钮添加到布局
		this.getChildren().add(btn_1131467);
		// 设置 TableView 点击事件
		table_1370595.setOnMouseClicked(new EventHandler<Event>() {
			public void handle(Event event) {
				int row = table_1370595.getSelectionModel().getSelectedIndex();
				if (row == -1) {
					return;
				}
		 			Guanliyuan bean = (Guanliyuan)table_1370595.getSelectionModel().getSelectedItems().get(0);
				textField_1408953.setText(bean.getYonghuming());
				textField_1237174.setText(bean.getMima());
				
			};
		});
		// 刷新 TableView 数据
		table_1370595refresh();
		
	}
	/**
	 * 刷新表格数据的方法
	 */
	public void table_1370595refresh(){
		// 清空表格数据
		table_1370595data.clear();
		// 加载所有数据到表格数据集合中
    	table_1370595data.addAll(table_1370595dao.getAll());
	}
	/**
	 * 显示信息提示框的方法
	 *
	 * @param msg 要显示的消息文本
	 */
 	public void showMsg(String msg){
		// 创建信息提示框
   	 Alert alert = new Alert(AlertType.INFORMATION);
		// 设置提示框标题
        alert.titleProperty().set("提示");
		// 设置提示框消息头部
        alert.headerTextProperty().set(msg);
		// 显示提示框并等待用户关闭
        alert.showAndWait();
   }
}
