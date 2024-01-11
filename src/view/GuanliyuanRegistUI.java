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
 * 管理员注册界面类 GuanliyuanRegistUI
 */

public  class  GuanliyuanRegistUI  extends  AnchorPane  {

	private  String  mainid;
	public  String  getMainid()  {
		return  mainid;
	}
	public  void  setMainid(String  mainid)  {
		this.mainid  =  mainid;
	}
	Dao<Guanliyuan>  table_1248886dao  =  new  Dao(new  Guanliyuan());
	ObservableList<Guanliyuan>  table_1248886data  =  FXCollections.observableArrayList();
	/**
	 *  构造方法，创建管理员注册界面
	 *
	 *  @param  param  主界面传递的参数
	 */
	public  GuanliyuanRegistUI(String  param)  {
		this.mainid=param;
		//  UI  组件
		Label  label_1722254=new  Label("用户名");  //  创建一个标签，用于显示“用户名”
		label_1722254.setFont(new  Font("宋体",  14));  //  设置标签的字体
		label_1722254.setPrefWidth(Double.valueOf(100));  //  设置标签的宽度
		label_1722254.setPrefHeight(Double.valueOf(23));  //  设置标签的高度
		this.setLeftAnchor(label_1722254,  Double.valueOf(150));  //  设置标签的左侧锚点
		this.setTopAnchor(label_1722254,  Double.valueOf(60));  //  设置标签的顶部锚点
		this.getChildren().add(label_1722254);  //  将标签添加到界面中
		TextField  textField_1984023  =  new  TextField();  //  创建一个文本框
		textField_1984023.setFont(new  Font("宋体",  14));  //  设置文本框的字体
		textField_1984023.setPrefWidth(Double.valueOf(93));  //  设置文本框的宽度
		textField_1984023.setPrefHeight(Double.valueOf(23));  //  设置文本框的高度
		this.setLeftAnchor(textField_1984023,  Double.valueOf(220));  //  设置文本框的左侧锚点
		this.setTopAnchor(textField_1984023,  Double.valueOf(60));  //  设置文本框的顶部锚点
		this.getChildren().add(textField_1984023);  //  将文本框添加到界面中
		Label  label_1214657=new  Label("密码");  //  创建一个标签，用于显示“密码”
		label_1214657.setFont(new  Font("宋体",  14));  //  设置标签的字体
		label_1214657.setPrefWidth(Double.valueOf(100));  //  设置标签的宽度
		label_1214657.setPrefHeight(Double.valueOf(23));  //  设置标签的高度
		this.setLeftAnchor(label_1214657,  Double.valueOf(370));  //  设置标签的左侧锚点
		this.setTopAnchor(label_1214657,  Double.valueOf(60));  //  设置标签的顶部锚点
		this.getChildren().add(label_1214657);  //  将标签添加到界面中
		TextField  textField_171258  =  new  TextField();  //  创建一个文本框
		textField_171258.setFont(new  Font("宋体",  14));  //  设置文本框的字体
		textField_171258.setPrefWidth(Double.valueOf(93));  //  设置文本框的宽度
		textField_171258.setPrefHeight(Double.valueOf(23));  //  设置文本框的高度
		this.setLeftAnchor(textField_171258,  Double.valueOf(440));  //  设置文本框的左侧锚点
		this.setTopAnchor(textField_171258,  Double.valueOf(60));  //  设置文本框的顶部锚点
		this.getChildren().add(textField_171258);  //  将文本框添加到界面中
		TableView  table_1248886=new  TableView();  //  创建一个表格视图
		table_1248886.setPrefWidth(Double.valueOf(0));  //  设置表格视图的宽度
		table_1248886.setPrefHeight(Double.valueOf(0));  //  设置表格视图的高度
		table_1248886.setMaxWidth(Double.valueOf(0));  //  设置表格视图的最大宽度
		table_1248886.setMaxHeight(Double.valueOf(0));  //  设置表格视图的最大高度
		table_1248886.setMinWidth(Double.valueOf(0));  //  设置表格视图的最小宽度
		table_1248886.setMinHeight(Double.valueOf(0));  //  设置表格视图的最小高度
		this.setLeftAnchor(table_1248886,  Double.valueOf(0));  //  设置表格视图的左侧锚点
		this.setTopAnchor(table_1248886,  Double.valueOf(0));  //  设置表格视图的顶部锚点
		TableColumn  table_1248886id=new  TableColumn("编号");  //  创建一个表格列，用于显示“编号”
		table_1248886id.setCellValueFactory(new  PropertyValueFactory<>("id"));  //  设置表格列的数值工厂
		table_1248886.getColumns().add(table_1248886id);  //  将表格列添加到表格视图中
		TableColumn  table_12488860=new  TableColumn("用户名");  //  创建一个表格列，用于显示“用户名”
		table_12488860.setCellValueFactory(new  PropertyValueFactory<>("yonghuming"));  //  设置表格列的数值工厂
		table_1248886.getColumns().add(table_12488860);  //  将表格列添加到表格视图中
		TableColumn  table_12488861=new  TableColumn("密码");  //  创建一个表格列，用于显示“密码”
		table_12488861.setCellValueFactory(new  PropertyValueFactory<>("mima"));  //  设置表格列的数值工厂
		table_1248886.getColumns().add(table_12488861);  //  将表格列添加到表格视图中
		table_1248886.setItems(table_1248886data);  //  设置表格视图的数据
		this.getChildren().add(table_1248886);  //  将表格视图添加到界面中
		table_1248886refresh();  //  刷新表格数据
		Button  btn_1924341=new  Button("注册");  //  创建一个按钮，用于注册
		btn_1924341.setFont(new  Font("宋体",  14));  //  设置按钮的字体
		btn_1924341.setPrefWidth(Double.valueOf(93));  //  设置按钮的宽度
		btn_1924341.setPrefHeight(Double.valueOf(23));  //  设置按钮的高度
		this.setLeftAnchor(btn_1924341,  Double.valueOf(200));  //  设置按钮的左侧锚点
		this.setTopAnchor(btn_1924341,  Double.valueOf(350));  //  设置按钮的顶部锚点
		btn_1924341.setOnAction(new  EventHandler<ActionEvent>()  {
			/**
			 *  处理“注册”按钮的动作。
			 */
			public  void  handle(ActionEvent  e)  {
				Guanliyuan  bean=new  Guanliyuan();  //  创建一个管理员对象
				bean.setYonghuming(textField_1984023.getText());  //  设置管理员对象的用户名
				bean.setMima(textField_171258.getText());  //  设置管理员对象的密码
				table_1248886dao.add(bean);  //  将管理员对象添加到数据访问对象中
				showMsg("新增成功");  //  显示新增成功的提示信息
				table_1248886refresh();  //  刷新表格数据

			}
		});
		this.getChildren().add(btn_1924341);  //  将按钮添加到界面中
		Button  btn_1614868=new  Button("关闭");  //  创建一个按钮，用于关闭
		btn_1614868.setFont(new  Font("宋体",  14));  //  设置按钮的字体
		btn_1614868.setPrefWidth(Double.valueOf(93));  //  设置按钮的宽度
		btn_1614868.setPrefHeight(Double.valueOf(23));  //  设置按钮的高度
		this.setLeftAnchor(btn_1614868,  Double.valueOf(300));  //  设置按钮的左侧锚点
		this.setTopAnchor(btn_1614868,  Double.valueOf(350));  //  设置按钮的顶部锚点
		btn_1614868.setOnAction(new  EventHandler<ActionEvent>()  {
			public  void  handle(ActionEvent  e)  {
				((Stage)  ((Button)e.getSource()).getScene().getWindow()).close();
			}
		});
		//  将组件添加到布局
		this.getChildren().add(btn_1614868);  //  将按钮添加到界面中
		//  刷新表格数据
		table_1248886.setOnMouseClicked(new  EventHandler<Event>()  {
			public  void  handle(Event  event)  {
				int  row  =  table_1248886.getSelectionModel().getSelectedIndex();  //  获取所选行的索引
				if  (row  ==  -1)  {  //  如果索引为-1
					return;  //  返回
				}
				Guanliyuan  bean  =  (Guanliyuan)table_1248886.getSelectionModel().getSelectedItems().get(0);  //  获取选中的管理员对象
				textField_1984023.setText(bean.getYonghuming());  //  显示管理员对象的用户名
				textField_171258.setText(bean.getMima());  //  显示管理员对象的密码

			};
		});
		table_1248886refresh();  //  刷新表格数据

	}
	/**
	 *  处理“关闭”按钮的动作。
	 */
	public  void  table_1248886refresh(){
		table_1248886data.clear();  //  清空表格数据
		table_1248886data.addAll(table_1248886dao.getAll());  //  将全部数据添加到表格数据中
	}
	/**
	 *  使用  Alert  显示消息。
	 */
	public  void  showMsg(String  msg){
		Alert  alert  =  new  Alert(AlertType.INFORMATION);  //  创建一个信息提示对话框
		alert.titleProperty().set("提示");  //  设置对话框的标题
		alert.headerTextProperty().set(msg);  //  设置对话框的消息内容
		alert.showAndWait();  //  显示对话框
	}
}