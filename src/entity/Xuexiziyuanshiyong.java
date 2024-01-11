package entity;

/**
 * 实体类 Xuexiziyuanshiyong 用于映射数据库中的学习资源使用记录表
 */
public class Xuexiziyuanshiyong implements java.io.Serializable {

	// 使用记录ID
	private Integer id;

	/**
	 * 获取使用记录ID
	 * @return 返回使用记录ID
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * 设置使用记录ID
	 * @param id 要设置的使用记录ID
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	// 学习资源
	private String xuexiziyuan;

	/**
	 * 获取学习资源
	 * @return 返回学习资源
	 */
	public String getXuexiziyuan() {
		return this.xuexiziyuan;
	}

	/**
	 * 设置学习资源
	 * @param xuexiziyuan 要设置的学习资源
	 */
	public void setXuexiziyuan(String xuexiziyuan) {
		this.xuexiziyuan = xuexiziyuan;
	}

	// 使用人
	private String shiyongren;

	/**
	 * 获取使用人
	 * @return 返回使用人
	 */
	public String getShiyongren() {
		return this.shiyongren;
	}

	/**
	 * 设置使用人
	 * @param shiyongren 要设置的使用人
	 */
	public void setShiyongren(String shiyongren) {
		this.shiyongren = shiyongren;
	}

	// 使用日期
	private String shiyongriqi;

	/**
	 * 获取使用日期
	 * @return 返回使用日期
	 */
	public String getShiyongriqi() {
		return this.shiyongriqi;
	}

	/**
	 * 设置使用日期
	 * @param shiyongriqi 要设置的使用日期
	 */
	public void setShiyongriqi(String shiyongriqi) {
		this.shiyongriqi = shiyongriqi;
	}

	// 使用场景
	private String shiyongchangjing;

	/**
	 * 获取使用场景
	 * @return 返回使用场景
	 */
	public String getShiyongchangjing() {
		return this.shiyongchangjing;
	}

	/**
	 * 设置使用场景
	 * @param shiyongchangjing 要设置的使用场景
	 */
	public void setShiyongchangjing(String shiyongchangjing) {
		this.shiyongchangjing = shiyongchangjing;
	}

}
