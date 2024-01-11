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

public class GuanliyuanUpdateUI extends AnchorPane {
	private String mainid;  // 主界面的id
	public String getMainid() {   // 获取主界面的id
		return mainid;
	}
	public void setMainid(String mainid) {  // 设置主界面的id
		this.mainid = mainid;
	}
	Dao<Guanliyuan> table_1845402dao = new Dao(new Guanliyuan());  // 数据库操作
	ObservableList<Guanliyuan> table_1845402data = FXCollections.observableArrayList();   // 可观察列表
	/**
	 * 构造方法，创建管理员注册界面
	 *
	 * @param param 主界面传递的参数
	 */
	public GuanliyuanUpdateUI(String param) {  // 构造方法
		this.mainid=param;  // 初始化主界面id
		// UI 组件
		Label label_1142126=new Label("用户名");  // 用户名标签
		label_1142126.setFont(new Font("宋体", 14));  // 设置字体
		label_1142126.setPrefWidth(Double.valueOf(100));  // 设置宽度
		label_1142126.setPrefHeight(Double.valueOf(23));  // 设置高度
		this.setLeftAnchor(label_1142126, Double.valueOf(150));  // 设置左侧锚点
		this.setTopAnchor(label_1142126, Double.valueOf(60));  // 设置顶部锚点
		this.getChildren().add(label_1142126);  // 添加到界面
		TextField textField_1629402 = new TextField();  // 文本框
		textField_1629402.setFont(new Font("宋体", 14));  // 设置字体
		textField_1629402.setPrefWidth(Double.valueOf(93));  // 设置宽度
		textField_1629402.setPrefHeight(Double.valueOf(23));  // 设置高度
		this.setLeftAnchor(textField_1629402, Double.valueOf(220));  // 设置左侧锚点
		this.setTopAnchor(textField_1629402, Double.valueOf(60));  // 设置顶部锚点
		this.getChildren().add(textField_1629402);  // 添加到界面
		Label label_1735700=new Label("密码");  // 密码标签
		label_1735700.setFont(new Font("宋体", 14));  // 设置字体
		label_1735700.setPrefWidth(Double.valueOf(100));  // 设置宽度
		label_1735700.setPrefHeight(Double.valueOf(23));  // 设置高度
		this.setLeftAnchor(label_1735700, Double.valueOf(370));  // 设置左侧锚点
		this.setTopAnchor(label_1735700, Double.valueOf(60));  // 设置顶部锚点
		this.getChildren().add(label_1735700);  // 添加到界面
		TextField textField_1429470 = new TextField();  // 文本框
		textField_1429470.setFont(new Font("宋体", 14));  // 设置字体
		textField_1429470.setPrefWidth(Double.valueOf(93));  // 设置宽度
		textField_1429470.setPrefHeight(Double.valueOf(23));  // 设置高度
		this.setLeftAnchor(textField_1429470, Double.valueOf(440));  // 设置左侧锚点
		this.setTopAnchor(textField_1429470, Double.valueOf(60));  // 设置顶部锚点
		this.getChildren().add(textField_1429470);  // 添加到界面
		TableView table_1845402=new TableView();  // 表格
		table_1845402.setPrefWidth(Double.valueOf(0));  // 设置宽度
		table_1845402.setPrefHeight(Double.valueOf(0));  // 设置高度
		table_1845402.setMaxWidth(Double.valueOf(0));  // 设置最大宽度
		table_1845402.setMaxHeight(Double.valueOf(0));  // 设置最大高度
		table_1845402.setMinWidth(Double.valueOf(0));  // 设置最小宽度
		table_1845402.setMinHeight(Double.valueOf(0));  // 设置最小高度
		this.setLeftAnchor(table_1845402, Double.valueOf(0));  // 设置左侧锚点
		this.setTopAnchor(table_1845402, Double.valueOf(0));  // 设置顶部锚点
		TableColumn table_1845402id=new TableColumn("编号");  // 表格列
		table_1845402id.setCellValueFactory(new PropertyValueFactory<>("id"));  // 设置数据源
		table_1845402.getColumns().add(table_1845402id);  // 添加到表格中
		TableColumn table_18454020=new TableColumn("用户名");  // 表格列
		table_18454020.setCellValueFactory(new PropertyValueFactory<>("yonghuming"));  // 设置数据源
		table_1845402.getColumns().add(table_18454020);  // 添加到表格中
		TableColumn table_18454021=new TableColumn("密码");  // 表格列
		table_18454021.setCellValueFactory(new PropertyValueFactory<>("mima"));  // 设置数据源
		table_1845402.getColumns().add(table_18454021);  // 添加到表格中
		table_1845402.setItems(table_1845402data);  // 设置表格数据源
		this.getChildren().add(table_1845402);  // 添加到界面
		table_1845402refresh();  // 刷新表格
		Button btn_1685102=new Button("保存");  // 按钮
		btn_1685102.setFont(new Font("宋体", 14));  // 设置字体
		btn_1685102.setPrefWidth(Double.valueOf(93));  // 设置宽度
		btn_1685102.setPrefHeight(Double.valueOf(23));  // 设置高度
		this.setLeftAnchor(btn_1685102, Double.valueOf(200));  // 设置左侧锚点
		this.setTopAnchor(btn_1685102, Double.valueOf(350));  // 设置顶部锚点
		/**
		 修改按钮触发事件
		 */
		btn_1685102.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent e) {
				Guanliyuan bean = table_1845402data.get(Integer.valueOf(param));  // 获取选中行的数据
				bean.setYonghuming(textField_1629402.getText());  // 设置用户名
				bean.setMima(textField_1429470.getText());  // 设置密码
				table_1845402dao.update(bean);  // 更新数据库
				showMsg("修改成功");  // 显示提示
			}
		});
		this.getChildren().add(btn_1685102);  // 添加到界面
		Button btn_1660939=new Button("关闭");  // 按钮
		btn_1660939.setFont(new Font("宋体", 14));  // 设置字体
		btn_1660939.setPrefWidth(Double.valueOf(93));  // 设置宽度
		btn_1660939.setPrefHeight(Double.valueOf(23));  // 设置高度
		this.setLeftAnchor(btn_1660939, Double.valueOf(300));  // 设置左侧锚点
		this.setTopAnchor(btn_1660939, Double.valueOf(350));  // 设置顶部锚点
		btn_1660939.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent e) {
				((Stage) ((Button)e.getSource()).getScene().getWindow()).close();  // 关闭窗口
			}
		});
		this.getChildren().add(btn_1660939);  // 添加到界面
		table_1845402.setOnMouseClicked(new EventHandler<Event>() {
			public void handle(Event event) {
				int row = table_1845402.getSelectionModel().getSelectedIndex();  // 获取选中行
				if (row == -1) {
					return;  // 无选中行，退出
				}
				Guanliyuan bean = (Guanliyuan)table_1845402.getSelectionModel().getSelectedItems().get(0);  // 获取选中行的数据
				textField_1629402.setText(bean.getYonghuming());  // 设置用户名
				textField_1429470.setText(bean.getMima());  // 设置密码
			};
		});
		table_1845402refresh();  // 刷新表格
		Guanliyuan bean = table_1845402data.get(Integer.valueOf(param));  // 获取选中行的数据
		textField_1629402.setText(bean.getYonghuming());  // 设置用户名
		textField_1429470.setText(bean.getMima());  // 设置密码
	}
	public void table_1845402refresh(){
		table_1845402data.clear();  // 清空数据
		table_1845402data.addAll(table_1845402dao.getAll());  // 添加全部数据
	}
	public void showMsg(String msg){  // 显示提示
		Alert alert = new Alert(AlertType.INFORMATION);  // 信息提示框
		alert.titleProperty().set("提示");  // 设置标题
		alert.headerTextProperty().set(msg);  // 设置提示内容
		alert.showAndWait();  // 弹出提示
	}
}
