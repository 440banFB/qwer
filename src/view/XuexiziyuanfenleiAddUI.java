
package  view;

import  dao.*;    //  导入数据访问文件
import  entity.*;    //  导入实体类文件
import  java.io.File;    //  导入文件类
import  java.io.FileInputStream;    //  导入文件输入流类
import  java.io.FileOutputStream;    //  导入文件输出流类
import  java.io.IOException;    //  导入IO异常类
import  java.io.InputStream;    //  导入输入流类
import  java.io.OutputStream;    //  导入输出流类
import  javafx.stage.FileChooser;    //  导入JavaFX文件选择类
import  javafx.event.ActionEvent;    //  导入JavaFX事件动作类
import  javafx.event.Event;    //  导入JavaFX事件类
import  javafx.scene.control.Alert;    //  导入JavaFX警告提示框类
import  javafx.scene.image.Image;    //  导入JavaFX图像类
import  javafx.scene.image.ImageView;    //  导入JavaFX图像视图类
import  javafx.scene.paint.Color;    //  导入JavaFX画布颜色类
import  javafx.scene.control.TextArea;    //  导入JavaFX文本区域类
import  javafx.scene.text.Text;    //  导入JavaFX文本类
import  javafx.scene.control.PasswordField;    //  导入JavaFX密码框类
import  javafx.scene.control.RadioButton;    //  导入JavaFX单选按钮类
import  java.util.List;    //  导入列表类
import  java.util.TreeMap;    //  导入树形映射类
import  java.util.Map;    //  导入映射类
import  java.util.ArrayList;    //  导入数组列表类
import  javafx.util.Callback;    //  导入JavaFX回调类
import  javafx.scene.control.TreeItem;    //  导入JavaFX树形项类
import  javafx.scene.control.TreeView;    //  导入JavaFX树形视图类
import  javafx.scene.control.TableColumn.SortType;    //  导入JavaFX表格列排序类型类
import  javafx.scene.shape.Rectangle;    //  导入JavaFX矩形类
import  javafx.scene.control.Alert.AlertType;    //  导入JavaFX警告提示框类型类
import  java.util.UUID;    //  导入UUID类
import  java.text.SimpleDateFormat;    //  导入简单日期格式化类
import  java.util.Date;    //  导入日期类
import  javafx.event.EventHandler;    //  导入JavaFX事件处理器类
import  javafx.collections.FXCollections;    //  导入JavaFX可观察集合类
import  javafx.collections.ObservableList;    //  导入JavaFX可观察列表类
import  javafx.scene.control.Button;    //  导入JavaFX按钮类
import  javafx.scene.Scene;    //  导入场景类
import  javafx.stage.Stage;    //  导入舞台类
import  javafx.scene.shape.Line;    //  导入JavaFX直线类
import  javafx.scene.control.CheckBox;    //  导入JavaFX复选框类
import  javafx.scene.control.DatePicker;    //  导入JavaFX日期选择器类
import  javafx.scene.control.TableCell;    //  导入JavaFX表格单元格类
import  javafx.scene.control.ComboBox;    //  导入JavaFX组合框类
import  javafx.scene.control.Label;    //  导入JavaFX标签类
import  javafx.scene.control.TableColumn;    //  导入JavaFX表格列类
import  javafx.scene.control.TableView;    //  导入JavaFX表格视图类
import  javafx.scene.control.TextField;    //  导入JavaFX文本框类
import  javafx.scene.control.cell.PropertyValueFactory;    //  导入JavaFX属性值工厂类
import  javafx.scene.layout.AnchorPane;    //  导入JavaFX锚点布局类
import  javafx.scene.text.Font;    //  导入JavaFX字体类

public  class  XuexiziyuanfenleiAddUI  extends  AnchorPane  {    //  定义公共类XuexiziyuanfenleiAddUI继承自锚点布局类

	private  String  mainid;    //  主id
	public  String  getMainid()  {
		return  mainid;    //  返回主id
	}
	public  void  setMainid(String  mainid)  {
		this.mainid  =  mainid;    //  设置主id
	}
	Dao<Xuexiziyuanfenlei>  table_1783004dao  =  new  Dao(new  Xuexiziyuanfenlei());    //  实例化数据访问对象并传入学习资源分类对象
	ObservableList<Xuexiziyuanfenlei>  table_1783004data  =  FXCollections.observableArrayList();    //  创建可观察列表对象并传入学习资源分类对象
	public  XuexiziyuanfenleiAddUI(String  param)  {
		this.mainid=param;    //  设置主id为参数
		Label  label_1260620=new  Label("分类名称");    //  创建标签对象并设置文本
		label_1260620.setFont(new  Font("宋体",  14));    //  设置标签字体
		label_1260620.setPrefWidth(Double.valueOf(100));    //  设置标签宽度
		label_1260620.setPrefHeight(Double.valueOf(23));    //  设置标签高度
		this.setLeftAnchor(label_1260620,  Double.valueOf(150));    //  设置标签相对于左边的锚点
		this.setTopAnchor(label_1260620,  Double.valueOf(60));    //  设置标签相对于顶部的锚点
		this.getChildren().add(label_1260620);    //  将标签添加到当前视图
		TextField  textField_1510833  =  new  TextField();    //  创建文本框对象
		textField_1510833.setFont(new  Font("宋体",  14));    //  设置文本框字体
		textField_1510833.setPrefWidth(Double.valueOf(93));    //  设置文本框宽度
		textField_1510833.setPrefHeight(Double.valueOf(23));    //  设置文本框高度
		this.setLeftAnchor(textField_1510833,  Double.valueOf(220));    //  设置文本框相对于左边的锚点
		this.setTopAnchor(textField_1510833,  Double.valueOf(60));    //  设置文本框相对于顶部的锚点
		this.getChildren().add(textField_1510833);    //  将文本框添加到当前视图
		TableView  table_1783004=new  TableView();    //  创建表格视图对象
		table_1783004.setPrefWidth(Double.valueOf(0));    //  设置表格视图宽度
		table_1783004.setPrefHeight(Double.valueOf(0));    //  设置表格视图高度
		table_1783004.setMaxWidth(Double.valueOf(0));    //  设置表格视图最大宽度
		table_1783004.setMaxHeight(Double.valueOf(0));    //  设置表格视图最大高度
		table_1783004.setMinWidth(Double.valueOf(0));    //  设置表格视图最小宽度
		table_1783004.setMinHeight(Double.valueOf(0));    //  设置表格视图最小高度
		this.setLeftAnchor(table_1783004,  Double.valueOf(0));    //  设置表格视图相对于左边的锚点
		this.setTopAnchor(table_1783004,  Double.valueOf(0));    //  设置表格视图相对于顶部的锚点
		TableColumn  table_1783004id=new  TableColumn("编号");    //  创建表格列对象并设置名称
		table_1783004id.setCellValueFactory(new  PropertyValueFactory<>("id"));    //  设置表格列值工厂
		table_1783004.getColumns().add(table_1783004id);    //  将表格列加入表格视图
		TableColumn  table_17830040=new  TableColumn("分类名称");    //  创建表格列对象并设置名称
		table_17830040.setCellValueFactory(new  PropertyValueFactory<>("fenleimingcheng"));    //  设置表格列值工厂
		table_1783004.getColumns().add(table_17830040);    //  将表格列加入表格视图
		table_1783004.setItems(table_1783004data);    //  设置表格视图数据
		this.getChildren().add(table_1783004);    //  将表格视图添加到当前视图
		table_1783004refresh();    //  调用刷新方法
		Button  btn_1159309=new  Button("保存");    //  创建按钮对象并设置文本
		btn_1159309.setFont(new  Font("宋体",  14));    //  设置按钮字体
		btn_1159309.setPrefWidth(Double.valueOf(93));    //  设置按钮宽度
		btn_1159309.setPrefHeight(Double.valueOf(23));    //  设置按钮高度
		this.setLeftAnchor(btn_1159309,  Double.valueOf(200));    //  设置按钮相对于左边的锚点
		this.setTopAnchor(btn_1159309,  Double.valueOf(350));    //  设置按钮相对于顶部的锚点
		btn_1159309.setOnAction(new  EventHandler<ActionEvent>()  {    //  设置按钮点击事件
			public  void  handle(ActionEvent  e)  {
				Xuexiziyuanfenlei  bean=new  Xuexiziyuanfenlei();    //  创建学习资源分类对象
				bean.setFenleimingcheng(textField_1510833.getText());    //  设置分类名称
				table_1783004dao.add(bean);    //  添加学习资源分类对象
				showMsg("新增成功");    //  调用显示消息方法
				table_1783004refresh();    //  调用刷新方法
			}
		});
		this.getChildren().add(btn_1159309);    //  将按钮添加到当前视图
		Button  btn_1371685=new  Button("关闭");    //  创建按钮对象并设置文本
		btn_1371685.setFont(new  Font("宋体",  14));    //  设置按钮字体
		btn_1371685.setPrefWidth(Double.valueOf(93));    //  设置按钮宽度
		btn_1371685.setPrefHeight(Double.valueOf(23));    //  设置按钮高度
		this.setLeftAnchor(btn_1371685,  Double.valueOf(300));    //  设置按钮相对于左边的锚点
		this.setTopAnchor(btn_1371685,  Double.valueOf(350));    //  设置按钮相对于顶部的锚点
		btn_1371685.setOnAction(new  EventHandler<ActionEvent>()  {    //  设置按钮点击事件
			public  void  handle(ActionEvent  e)  {
				((Stage)  ((Button)e.getSource()).getScene().getWindow()).close();    //  关闭当前舞台
			}
		});
		this.getChildren().add(btn_1371685);    //  将按钮添加到当前视图
		table_1783004.setOnMouseClicked(new  EventHandler<Event>()  {    //  设置表格视图鼠标点击事件
			public  void  handle(Event  event)  {
				int  row  =  table_1783004.getSelectionModel().getSelectedIndex();    //  获取选中行号
				if  (row  ==  -1)  {
					return;
				}
				Xuexiziyuanfenlei  bean  =  (Xuexiziyuanfenlei)table_1783004.getSelectionModel().getSelectedItems().get(0);    //  获取所选行的学习资源分类对象
				textField_1510833.setText(bean.getFenleimingcheng());    //  设置文本框内容
			};
		});
		table_1783004refresh();    //  调用刷新方法
	}
	public  void  table_1783004refresh(){    //  刷新方法
		table_1783004data.clear();    //  清空表格视图数据
		table_1783004data.addAll(table_1783004dao.getAll());    //  添加数据到表格视图
	}
	public  void  showMsg(String  msg){    //  显示消息方法
		Alert  alert  =  new  Alert(AlertType.INFORMATION);    //  创建消息提示框
		alert.titleProperty().set("提示");    //  设置标题
		alert.headerTextProperty().set(msg);    //  设置消息内容
		alert.showAndWait();    //  显示消息提示框
	}
}