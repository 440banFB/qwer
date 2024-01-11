
package view; // 视图包
import javafx.application.Application; // 导入JavaFX的应用程序类
import javafx.scene.Scene; // 导入JavaFX的场景类
import javafx.scene.layout.BorderPane; // 导入JavaFX的边界布局类
import javafx.stage.Stage; // 导入JavaFX的舞台类
public class Main extends Application { // Main类继承自Application类
	public void start(Stage primaryStage) { // start方法，传入舞台作为参数
		try {
			GuanliyuanLoginUI root = new GuanliyuanLoginUI(""); // 创建GuanliyuanLoginUI对象
			Scene scene = new Scene(root,600,600); // 创建场景，设置宽高为600
			primaryStage.setScene(scene); // 设置舞台的场景为scene
			primaryStage.show(); // 显示舞台
		} catch(Exception e) { // 捕获异常
			e.printStackTrace(); // 打印异常信息
		}
	}
	public static void main(String[] args) { // 主方法
		launch(args); // 启动应用程序
	}
}