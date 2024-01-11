package entity;

/**
 * 实体类 Guanliyuan 用于映射数据库中的管理员表
 */
public class Guanliyuan implements java.io.Serializable {


	// 管理员ID
	private Integer id;

	/**
	 * 获取管理员ID
	 * @return 返回管理员ID
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * 设置管理员ID
	 * @param id 要设置的管理员ID
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	// 用户名
	private String yonghuming;
	/**
	 * 获取用户名
	 * @return 返回用户名
	 */
	public String getYonghuming() {
		return this.yonghuming;
	}
	/**
	 * 设置用户名
	 * @param yonghuming 要设置的用户名
	 */
	public void setYonghuming(String yonghuming) {
		this.yonghuming = yonghuming;
	}
	// 密码
	private String mima;
	/**
	 * 获取密码
	 * @return 返回密码
	 */
	public String getMima() {
		return this.mima;
	}
	/**
	 * 设置密码
	 * @param mima 要设置的密码
	 */
	public void setMima(String mima) {
		this.mima = mima;
	}
	
}
