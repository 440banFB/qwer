package view;


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
 * 管理员主界面类 GuanliyuanMainUI
 */
public class GuanliyuanMainUI extends AnchorPane {

	private String username;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	private String mainid;
	public String getMainid() {
		return mainid;
	}
	public void setMainid(String mainid) {
		this.mainid = mainid;
	}
	/**
	 * 构造方法，创建管理员主界面
	 *
	 * @param param 主界面传递的参数
	 */
	public GuanliyuanMainUI(String param) {

		// 加载 CSS 文件
		String cssPath = getClass().getResource("styles.css").toExternalForm();
		this.getStylesheets().add(cssPath);

		this.mainid=param;
		// 创建按钮-管理员管理
		Button btn_1333348=new Button("管理员管理");
		btn_1333348.setFont(new Font("楷体", 20));
		btn_1333348.setPrefWidth(Double.valueOf(180));
		btn_1333348.setPrefHeight(Double.valueOf(40));
		this.setLeftAnchor(btn_1333348, Double.valueOf(200));
		this.setTopAnchor(btn_1333348, Double.valueOf(10));
		btn_1333348.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent e) {
				// 打开管理员管理界面
			    Stage stage=new Stage();
			    stage.setTitle("管理员管理");
			    stage.setScene(new Scene(new GuanliyuanManageUI(""),1200,730));
			    stage.show();
			}
		});
		this.getChildren().add(btn_1333348);
		// 创建按钮-学习资源分类管理
		Button btn_1104991=new Button("学习资源分类管理");
		btn_1104991.setFont(new Font("楷体", 20));
		btn_1104991.setPrefWidth(Double.valueOf(180));
		btn_1104991.setPrefHeight(Double.valueOf(40));
		this.setLeftAnchor(btn_1104991, Double.valueOf(200));
		this.setTopAnchor(btn_1104991, Double.valueOf(60));
		btn_1104991.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent e) {
				// 打开学习资源分类管理界面
			    Stage stage=new Stage();
			    stage.setTitle("学习资源分类管理");
			    stage.setScene(new Scene(new XuexiziyuanfenleiManageUI(""),1200,730));
			    stage.show();
			}
		});
		this.getChildren().add(btn_1104991);
		// 创建按钮-学习资源管理
		Button btn_1568748=new Button("学习资源管理");
		btn_1568748.setFont(new Font("楷体", 20));
		btn_1568748.setPrefWidth(Double.valueOf(180));
		btn_1568748.setPrefHeight(Double.valueOf(40));
		this.setLeftAnchor(btn_1568748, Double.valueOf(200));
		this.setTopAnchor(btn_1568748, Double.valueOf(110));
		btn_1568748.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent e) {
				// 打开学习资源管理界面
			    Stage stage=new Stage();
			    stage.setTitle("学习资源管理");
			    stage.setScene(new Scene(new XuexiziyuanManageUI(""),1200,730));
			    stage.show();
			}
		});
		this.getChildren().add(btn_1568748);
		// 创建按钮-学习资源使用管理
		Button btn_1206715=new Button("学习资源使用管理");
		btn_1206715.setFont(new Font("楷体", 20));
		btn_1206715.setPrefWidth(Double.valueOf(180));
		btn_1206715.setPrefHeight(Double.valueOf(40));
		this.setLeftAnchor(btn_1206715, Double.valueOf(200));
		this.setTopAnchor(btn_1206715, Double.valueOf(160));
		btn_1206715.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent e) {
				// 打开学习资源使用管理界面
			    Stage stage=new Stage();
			    stage.setTitle("学习资源使用管理");
			    stage.setScene(new Scene(new XuexiziyuanshiyongManageUI(""),1200,730));
			    stage.show();
			}
		});
		this.getChildren().add(btn_1206715);
		// 创建按钮-退出
		Button btn_1899864=new Button("退出");
		btn_1899864.setFont(new Font("楷体", 20));
		btn_1899864.setPrefWidth(Double.valueOf(180));
		btn_1899864.setPrefHeight(Double.valueOf(40));
		this.setLeftAnchor(btn_1899864, Double.valueOf(200));
		this.setTopAnchor(btn_1899864, Double.valueOf(210));
		btn_1899864.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent e) {
				// 退出系统
				System.exit(0);
			}
		});
		this.getChildren().add(btn_1899864);
		
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
