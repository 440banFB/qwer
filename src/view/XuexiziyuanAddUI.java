
package  view;
import  dao.*;  //  导入DAO层
import  entity.*;  //  导入实体类
import  java.io.File;  //  导入文件类
import  java.io.FileInputStream;  //  导入读取文件类
import  java.io.FileOutputStream;  //  导入写入文件类
import  java.io.IOException;  //  导入IO异常类
import  java.io.InputStream;  //  导入输入流类
import  java.io.OutputStream;  //  导入输出流类
import  javafx.stage.FileChooser;  //  导入文件选择类
import  javafx.event.ActionEvent;  //  导入事件-动作类
import  javafx.event.Event;  //  导入事件类
import  javafx.scene.control.Alert;  //  导入警报控件类
import  javafx.scene.image.Image;  //  导入图像类
import  javafx.scene.image.ImageView;  //  导入图像视图类
import  javafx.scene.paint.Color;  //  导入颜色类
import  javafx.scene.control.TextArea;  //  导入文本区域控件类
import  javafx.scene.text.Text;  //  导入文本控件类
import  javafx.scene.control.PasswordField;  //  导入密码字段控件类
import  javafx.scene.control.RadioButton;  //  导入单选按钮控件类
import  java.util.List;  //  导入列表类
import  java.util.TreeMap;  //  导入树状映射类
import  java.util.Map;  //  导入映射类
import  java.util.ArrayList;  //  导入数组列表类
import  javafx.util.Callback;  //  导入回调类
import  javafx.scene.control.TreeItem;  //  导入树项目类
import  javafx.scene.control.TreeView;  //  导入树视图控件类
import  javafx.scene.control.TableColumn.SortType;  //  导入表列排序类型类
import  javafx.scene.shape.Rectangle;  //  导入矩形类
import  javafx.scene.control.Alert.AlertType;  //  导入警报类型类
import  java.util.UUID;  //  导入UUID类
import  java.text.SimpleDateFormat;  //  导入简单日期格式化类
import  java.util.Date;  //  导入日期类
import  javafx.event.EventHandler;  //  导入事件处理器类
import  javafx.collections.FXCollections;  //  导入FX集合类
import  javafx.collections.ObservableList;  //  导入可观察列表类
import  javafx.scene.control.Button;  //  导入按钮类
import  javafx.scene.Scene;  //  导入场景类
import  javafx.stage.Stage;  //  导入舞台类
import  javafx.scene.shape.Line;  //  导入线条类
import  javafx.scene.control.CheckBox;  //  导入复选框类
import  javafx.scene.control.DatePicker;  //  导入日期选择器类
import  javafx.scene.control.TableCell;  //  导入表格单元格类
import  javafx.scene.control.ComboBox;  //  导入下拉框类
import  javafx.scene.control.Label;  //  导入标签类
import  javafx.scene.control.TableColumn;  //  导入表列类
import  javafx.scene.control.TableView;  //  导入表视图类
import  javafx.scene.control.TextField;  //  导入文本字段类
import  javafx.scene.control.cell.PropertyValueFactory;  //  导入属性值工厂类
import  javafx.scene.layout.AnchorPane;  //  导入锚点面板类
import  javafx.scene.text.Font;  //  导入字体类

public  class  XuexiziyuanAddUI  extends  AnchorPane  {
	//  成员变量
	private  String  mainid;

	//  获取主要ID
	public  String  getMainid()  {
		return  mainid;
	}

	//  设置主要ID
	public  void  setMainid(String  mainid)  {
		this.mainid  =  mainid;
	}

	//  表DAO层实例化
	Dao<Xuexiziyuan>  table_1490216dao  =  new  Dao(new  Xuexiziyuan());
	//  表数据可观察列表
	ObservableList<Xuexiziyuan>  table_1490216data  =  FXCollections.observableArrayList();
	//  下拉框DAO层实例化
	Dao<Xuexiziyuanfenlei>  combox_1209597dao  =  new  Dao(new  Xuexiziyuanfenlei());

	//  构造函数
	public  XuexiziyuanAddUI(String  param)  {
		this.mainid  =  param;

		//  创建标签
		Label  label_1699970  =  new  Label("名称");
		label_1699970.setFont(new  Font("宋体",  14));
		label_1699970.setPrefWidth(Double.valueOf(100));
		label_1699970.setPrefHeight(Double.valueOf(23));
		this.setLeftAnchor(label_1699970,  Double.valueOf(150));
		this.setTopAnchor(label_1699970,  Double.valueOf(60));
		this.getChildren().add(label_1699970);

		//  创建文本字段
		TextField  textField_1353496  =  new  TextField();
		textField_1353496.setFont(new  Font("宋体",  14));
		textField_1353496.setPrefWidth(Double.valueOf(93));
		textField_1353496.setPrefHeight(Double.valueOf(23));
		this.setLeftAnchor(textField_1353496,  Double.valueOf(220));
		this.setTopAnchor(textField_1353496,  Double.valueOf(60));
		this.getChildren().add(textField_1353496);

		//  创建标签
		Label  label_1132561  =  new  Label("分类");
		label_1132561.setFont(new  Font("宋体",  14));
		label_1132561.setPrefWidth(Double.valueOf(100));
		label_1132561.setPrefHeight(Double.valueOf(23));
		this.setLeftAnchor(label_1132561,  Double.valueOf(370));
		this.setTopAnchor(label_1132561,  Double.valueOf(60));
		this.getChildren().add(label_1132561);

		//  创建下拉框
		ComboBox<String>  combox_1209597  =  new  ComboBox<>();
		combox_1209597.setPrefWidth(Double.valueOf(93));
		combox_1209597.setPrefHeight(Double.valueOf(23));
		this.setLeftAnchor(combox_1209597,  Double.valueOf(440));
		this.setTopAnchor(combox_1209597,  Double.valueOf(60));
		List<Xuexiziyuanfenlei>  combox_1209597list  =  combox_1209597dao.getAll();
		combox_1209597.getItems().add("");
		for  (int  i  =  0;  i  <  combox_1209597list.size();  i++)  {
			combox_1209597.getItems().add(combox_1209597list.get(i).getFenleimingcheng());
		}
		this.getChildren().add(combox_1209597);

		//  创建表视图
		TableView  table_1490216  =  new  TableView();
		table_1490216.setPrefWidth(Double.valueOf(0));
		table_1490216.setPrefHeight(Double.valueOf(0));
		table_1490216.setMaxWidth(Double.valueOf(0));
		table_1490216.setMaxHeight(Double.valueOf(0));
		table_1490216.setMinWidth(Double.valueOf(0));
		table_1490216.setMinHeight(Double.valueOf(0));
		this.setLeftAnchor(table_1490216,  Double.valueOf(0));
		this.setTopAnchor(table_1490216,  Double.valueOf(0));

		//  创建表列
		TableColumn  table_1490216id  =  new  TableColumn("编号");
		table_1490216id.setCellValueFactory(new  PropertyValueFactory<>("id"));
		table_1490216.getColumns().add(table_1490216id);
		TableColumn  table_14902160  =  new  TableColumn("名称");
		table_14902160.setCellValueFactory(new  PropertyValueFactory<>("mingcheng"));
		table_1490216.getColumns().add(table_14902160);
		TableColumn  table_14902161  =  new  TableColumn("分类");
		table_14902161.setCellValueFactory(new  PropertyValueFactory<>("fenlei"));
		table_1490216.getColumns().add(table_14902161);

		table_1490216.setItems(table_1490216data);
		this.getChildren().add(table_1490216);

		//  刷新表视图
		table_1490216refresh();

		//  创建保存按钮
		Button  btn_1145690  =  new  Button("保存");
		btn_1145690.setFont(new  Font("宋体",  14));
		btn_1145690.setPrefWidth(Double.valueOf(93));
		btn_1145690.setPrefHeight(Double.valueOf(23));
		this.setLeftAnchor(btn_1145690,  Double.valueOf(200));
		this.setTopAnchor(btn_1145690,  Double.valueOf(350));
		btn_1145690.setOnAction(new  EventHandler<ActionEvent>()  {
			public  void  handle(ActionEvent  e)  {
				//  创建学习资源对象
				Xuexiziyuan  bean  =  new  Xuexiziyuan();
				bean.setMingcheng(textField_1353496.getText());
				bean.setFenlei(combox_1209597.getSelectionModel().getSelectedItem());
				table_1490216dao.add(bean);
				//  显示消息
				showMsg("新增成功");
				//  刷新表视图
				table_1490216refresh();
			}
		});
		this.getChildren().add(btn_1145690);

		//  创建关闭按钮
		Button  btn_1796085  =  new  Button("关闭");
		btn_1796085.setFont(new  Font("宋体",  14));
		btn_1796085.setPrefWidth(Double.valueOf(93));
		btn_1796085.setPrefHeight(Double.valueOf(23));
		this.setLeftAnchor(btn_1796085,  Double.valueOf(300));
		this.setTopAnchor(btn_1796085,  Double.valueOf(350));
		btn_1796085.setOnAction(new  EventHandler<ActionEvent>()  {
			public  void  handle(ActionEvent  e)  {
				//  关闭窗口
				((Stage)  ((Button)  e.getSource()).getScene().getWindow()).close();
			}
		});
		this.getChildren().add(btn_1796085);

		//  选中表视图事件
		table_1490216.setOnMouseClicked(new  EventHandler<Event>()  {
			public  void  handle(Event  event)  {
				//  获取选中行
				int  row  =  table_1490216.getSelectionModel().getSelectedIndex();
				if  (row  ==  -1)  {
					return;
				}
				//  获取选中学习资源对象
				Xuexiziyuan  bean  =  (Xuexiziyuan)  table_1490216.getSelectionModel().getSelectedItems().get(0);
				textField_1353496.setText(bean.getMingcheng());
				combox_1209597.setValue(bean.getFenlei());
			};
		});
		//  刷新表视图
		table_1490216refresh();
	}

	//  刷新表视图
	public  void  table_1490216refresh()  {
		table_1490216data.clear();
		table_1490216data.addAll(table_1490216dao.getAll());
	}

	//  显示消息
	public  void  showMsg(String  msg)  {
		Alert  alert  =  new  Alert(AlertType.INFORMATION);
		alert.titleProperty().set("提示");
		alert.headerTextProperty().set(msg);
		alert.showAndWait();
	}
}