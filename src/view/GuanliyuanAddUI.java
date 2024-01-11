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
 * 管理员添加界面类 GuanliyuanAddUI
 */
public class GuanliyuanAddUI extends AnchorPane {

	private String mainid;
	public String getMainid() {
		return mainid;
	}
	public void setMainid(String mainid) {
		this.mainid = mainid;
	}
	// 创建数据库操作对象
	Dao<Guanliyuan> table_1875147dao = new Dao(new Guanliyuan());
	// 创建可观察列表用于绑定表格数据
	ObservableList<Guanliyuan> table_1875147data = FXCollections.observableArrayList();
	/**
	 * 构造方法，创建管理员添加界面
	 *
	 * @param param 主界面传递的参数
	 */
	public GuanliyuanAddUI(String param) {
		this.mainid=param;
		// 创建用户名标签
		Label label_1948133=new Label("用户名");
		label_1948133.setFont(new Font("宋体", 14));
		label_1948133.setPrefWidth(Double.valueOf(100));
		label_1948133.setPrefHeight(Double.valueOf(23));
		this.setLeftAnchor(label_1948133, Double.valueOf(150));
		this.setTopAnchor(label_1948133, Double.valueOf(60));
		this.getChildren().add(label_1948133);
		// 创建用户名文本框
		TextField textField_1714492 = new TextField();
		textField_1714492.setFont(new Font("宋体", 14));
		textField_1714492.setPrefWidth(Double.valueOf(93));
		textField_1714492.setPrefHeight(Double.valueOf(23));
		this.setLeftAnchor(textField_1714492, Double.valueOf(220));
		this.setTopAnchor(textField_1714492, Double.valueOf(60));
		this.getChildren().add(textField_1714492);
		// 创建密码标签
		Label label_1853505=new Label("密码");
		label_1853505.setFont(new Font("宋体", 14));
		label_1853505.setPrefWidth(Double.valueOf(100));
		label_1853505.setPrefHeight(Double.valueOf(23));
		this.setLeftAnchor(label_1853505, Double.valueOf(370));
		this.setTopAnchor(label_1853505, Double.valueOf(60));
		this.getChildren().add(label_1853505);
		// 创建密码文本框
		TextField textField_1235157 = new TextField();
		textField_1235157.setFont(new Font("宋体", 14));
		textField_1235157.setPrefWidth(Double.valueOf(93));
		textField_1235157.setPrefHeight(Double.valueOf(23));
		this.setLeftAnchor(textField_1235157, Double.valueOf(440));
		this.setTopAnchor(textField_1235157, Double.valueOf(60));
		this.getChildren().add(textField_1235157);
		// 创建表格
		 TableView table_1875147=new TableView();
		table_1875147.setPrefWidth(Double.valueOf(0));
		table_1875147.setPrefHeight(Double.valueOf(0));
		table_1875147.setMaxWidth(Double.valueOf(0));
		table_1875147.setMaxHeight(Double.valueOf(0));
		table_1875147.setMinWidth(Double.valueOf(0));
		table_1875147.setMinHeight(Double.valueOf(0));
		this.setLeftAnchor(table_1875147, Double.valueOf(0));
		this.setTopAnchor(table_1875147, Double.valueOf(0));
		// 创建表格列
		 TableColumn table_1875147id=new TableColumn("编号");
		 table_1875147id.setCellValueFactory(new PropertyValueFactory<>("id"));
		 table_1875147.getColumns().add(table_1875147id);

		 TableColumn table_18751470=new TableColumn("用户名");
		 table_18751470.setCellValueFactory(new PropertyValueFactory<>("yonghuming"));
		 table_1875147.getColumns().add(table_18751470);

		 TableColumn table_18751471=new TableColumn("密码");
		 table_18751471.setCellValueFactory(new PropertyValueFactory<>("mima"));
		 table_1875147.getColumns().add(table_18751471);
		// 设置表格数据
		table_1875147.setItems(table_1875147data);
		this.getChildren().add(table_1875147);
		// 刷新表格数据
		table_1875147refresh();
		// 创建保存按钮
		Button btn_1690685=new Button("保存");
		btn_1690685.setFont(new Font("宋体", 14));
		btn_1690685.setPrefWidth(Double.valueOf(93));
		btn_1690685.setPrefHeight(Double.valueOf(23));
		this.setLeftAnchor(btn_1690685, Double.valueOf(200));
		this.setTopAnchor(btn_1690685, Double.valueOf(350));
		btn_1690685.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent e) {
				// 创建管理员对象并设置属性值
				Guanliyuan bean=new Guanliyuan();
				bean.setYonghuming(textField_1714492.getText());
				bean.setMima(textField_1235157.getText());
				// 调用数据库操作对象的add方法将数据保存到数据库
				table_1875147dao.add(bean);
				// 提示保存成功
				showMsg("新增成功");
				// 刷新表格数据
				table_1875147refresh();
				
			}
		});
		this.getChildren().add(btn_1690685);
		// 创建关闭按钮
		Button btn_1277250=new Button("关闭");
		btn_1277250.setFont(new Font("宋体", 14));
		btn_1277250.setPrefWidth(Double.valueOf(93));
		btn_1277250.setPrefHeight(Double.valueOf(23));
		this.setLeftAnchor(btn_1277250, Double.valueOf(300));
		this.setTopAnchor(btn_1277250, Double.valueOf(350));
		btn_1277250.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent e) {
				// 关闭当前窗口
				((Stage) ((Button)e.getSource()).getScene().getWindow()).close();
			}
		});
		this.getChildren().add(btn_1277250);
		// 表格点击事件处理
		table_1875147.setOnMouseClicked(new EventHandler<Event>() {
			public void handle(Event event) {
				int row = table_1875147.getSelectionModel().getSelectedIndex();
				if (row == -1) {
					return;
				}
		 			Guanliyuan bean = (Guanliyuan)table_1875147.getSelectionModel().getSelectedItems().get(0);
				textField_1714492.setText(bean.getYonghuming());
				textField_1235157.setText(bean.getMima());
				
			};
		});
		// 刷新表格数据
		table_1875147refresh();
		
	}
	/**
	 * 刷新表格数据
	 */
	public void table_1875147refresh(){
		// 清空数据列表
		table_1875147data.clear();
		// 将数据库中的数据添加到数据列表
    	table_1875147data.addAll(table_1875147dao.getAll());
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
