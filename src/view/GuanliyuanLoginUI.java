package view;


import dao.*;
import entity.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javafx.embed.swing.JFXPanel;
import javafx.scene.Parent;
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

import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
/**
 * 管理员登录界面类 GuanliyuanLoginUI
 */
public class GuanliyuanLoginUI extends AnchorPane {

	public static String username;
	public static String role;
	private String mainid;
	public String getMainid() {
		return mainid;
	}
	public void setMainid(String mainid) {
		this.mainid = mainid;
	}
	// 创建数据库操作对象
	Dao<Guanliyuan> table_1966618dao = new Dao(new Guanliyuan());
	// 创建可观察列表用于绑定表格数据
	ObservableList<Guanliyuan> table_1966618data = FXCollections.observableArrayList();
	/**
	 * 构造方法，创建管理员登录界面
	 *
	 * @param param 主界面传递的参数
	 */
	public GuanliyuanLoginUI(String param) {

		// 加载 CSS 文件
		String cssPath = getClass().getResource("styles.css").toExternalForm();
		this.getStylesheets().add(cssPath);

		this.mainid=param;
		// 创建标题标签
		Label label_1127564=new Label("学习资源管理系统");
		label_1127564.setFont(new Font("楷体", 25));
		label_1127564.setPrefWidth(Double.valueOf(410));
		label_1127564.setPrefHeight(Double.valueOf(62));
		this.setLeftAnchor(label_1127564, Double.valueOf(184));
		this.setTopAnchor(label_1127564, Double.valueOf(25));
		this.getChildren().add(label_1127564);
		// 创建用户名标签
		Label label_15872=new Label("用户名");
		label_15872.setFont(new Font("楷体", 20));
		label_15872.setPrefWidth(Double.valueOf(110));
		label_15872.setPrefHeight(Double.valueOf(32));
		this.setLeftAnchor(label_15872, Double.valueOf(104));
		this.setTopAnchor(label_15872, Double.valueOf(125));
		this.getChildren().add(label_15872);
		// 创建用户名文本框
		TextField textField_1581461 = new TextField();
		textField_1581461.setFont(new Font("宋体", 14));
		textField_1581461.setPrefWidth(Double.valueOf(227));
		textField_1581461.setPrefHeight(Double.valueOf(38));
		this.setLeftAnchor(textField_1581461, Double.valueOf(224));
		this.setTopAnchor(textField_1581461, Double.valueOf(119));
		this.getChildren().add(textField_1581461);
		// 创建密码标签
		Label label_1837673=new Label("密码");
		label_1837673.setFont(new Font("楷体", 20));
		label_1837673.setPrefWidth(Double.valueOf(110));
		label_1837673.setPrefHeight(Double.valueOf(32));
		this.setLeftAnchor(label_1837673, Double.valueOf(104));
		this.setTopAnchor(label_1837673, Double.valueOf(210));
		this.getChildren().add(label_1837673);
		// 创建密码输入框
		PasswordField password_1729164=new PasswordField();
		password_1729164.setPromptText("");
		password_1729164.setFont(new Font("宋体", 14));
		password_1729164.setPrefWidth(Double.valueOf(227));
		password_1729164.setPrefHeight(Double.valueOf(38));
		this.setLeftAnchor(password_1729164, Double.valueOf(224));
		this.setTopAnchor(password_1729164, Double.valueOf(210));
		this.getChildren().add(password_1729164);
		// 创建表格
		 TableView table_1966618=new TableView();
		table_1966618.setPrefWidth(Double.valueOf(0));
		table_1966618.setPrefHeight(Double.valueOf(0));
		table_1966618.setMaxWidth(Double.valueOf(0));
		table_1966618.setMaxHeight(Double.valueOf(0));
		table_1966618.setMinWidth(Double.valueOf(0));
		table_1966618.setMinHeight(Double.valueOf(0));
		this.setLeftAnchor(table_1966618, Double.valueOf(0));
		this.setTopAnchor(table_1966618, Double.valueOf(0));
		// 创建表格列
		 TableColumn table_1966618id=new TableColumn("编号");
		 table_1966618id.setCellValueFactory(new PropertyValueFactory<>("id"));
		 table_1966618.getColumns().add(table_1966618id);

		 TableColumn table_19666180=new TableColumn("用户名");
		 table_19666180.setCellValueFactory(new PropertyValueFactory<>("yonghuming"));
		 table_1966618.getColumns().add(table_19666180);

		 TableColumn table_19666181=new TableColumn("密码");
		 table_19666181.setCellValueFactory(new PropertyValueFactory<>("mima"));
		 table_1966618.getColumns().add(table_19666181);
		// 设置表格数据
		table_1966618.setItems(table_1966618data);
		this.getChildren().add(table_1966618);
		// 刷新表格数据
		table_1966618refresh();
		// 创建注册按钮
		Button btn_1308910=new Button("注册");
		btn_1308910.setFont(new Font("楷体", 20));
		btn_1308910.setPrefWidth(Double.valueOf(105));
		btn_1308910.setPrefHeight(Double.valueOf(38));
		this.setLeftAnchor(btn_1308910, Double.valueOf(332));
		this.setTopAnchor(btn_1308910, Double.valueOf(350));
		btn_1308910.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent e) {
				// 打开注册界面
			    Stage stage=new Stage();
			    stage.setTitle("注册");
			    stage.setScene(new Scene(new GuanliyuanRegistUI(""),600,600));
			    stage.show();
			}
		});
		this.getChildren().add(btn_1308910);
		// 创建登录按钮
		Button btn_1790355=new Button("登录");
		btn_1790355.setFont(new Font("楷体", 20));
		btn_1790355.setPrefWidth(Double.valueOf(105));
		btn_1790355.setPrefHeight(Double.valueOf(38));
		this.setLeftAnchor(btn_1790355, Double.valueOf(175));
		this.setTopAnchor(btn_1790355, Double.valueOf(350));
		/**
			登录按钮触发事件
		*/
		btn_1790355.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent e) {
				// 通过用户名查询数据库中的管理员信息
				List<Guanliyuan> list = table_1966618dao.queryByKey("yonghuming", textField_1581461.getText());
				if(list.size()>0){
					// 如果用户名存在，检查密码是否匹配
					if(list.get(0).getMima().equals(password_1729164.getText())){
						username=list.get(0).getYonghuming();
						showMsg("登录成功");
						// 打开系统功能界面
			    		Stage stage=new Stage();
			    		stage.setTitle("系统功能");
			    		GuanliyuanMainUI mainui = new GuanliyuanMainUI("");
						mainui.setUsername(username);
			    		stage.setScene(new Scene(mainui,600,600));
			    		stage.show();
			    		((Stage) ((Button)e.getSource()).getScene().getWindow()).close();
						return;
					}
				}

							showMsg("用户名或密码错误,登录失败");
			}
		});
		this.getChildren().add(btn_1790355);
		// 表格点击事件
		table_1966618.setOnMouseClicked(new EventHandler<Event>() {
			public void handle(Event event) {
				int row = table_1966618.getSelectionModel().getSelectedIndex();
				if (row == -1) {
					return;
				}
		 			Guanliyuan bean = (Guanliyuan)table_1966618.getSelectionModel().getSelectedItems().get(0);
				textField_1581461.setText(bean.getYonghuming());
				password_1729164.setText(bean.getMima());
				
			};
		});
		// 刷新表格数据
		table_1966618refresh();
		
	}
	/**
	 * 刷新表格数据
	 */
	public void table_1966618refresh(){
		// 清空数据列表
		table_1966618data.clear();
		// 将数据库中的数据添加到数据列表
    	table_1966618data.addAll(table_1966618dao.getAll());
	}
	/**
	 * 显示提示信息
	 *
	 * @param msg 提示信息
	 */
 	public void showMsg(String msg){
   	 Alert alert = new Alert(AlertType.INFORMATION);
        alert.titleProperty().set("提示");
        alert.headerTextProperty().set(msg);
        alert.showAndWait();
   }
}
