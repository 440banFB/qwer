package entity;

/**
 * 实体类 Xuexiziyuan 用于映射数据库中的学习资源表
 */
public class Xuexiziyuan implements java.io.Serializable {

	// 资源ID
	private Integer id;

	/**
	 * 获取资源ID
	 * @return 返回资源ID
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * 设置资源ID
	 * @param id 要设置的资源ID
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	// 资源名称
	private String mingcheng;

	/**
	 * 获取资源名称
	 * @return 返回资源名称
	 */
	public String getMingcheng() {
		return this.mingcheng;
	}

	/**
	 * 设置资源名称
	 * @param mingcheng 要设置的资源名称
	 */
	public void setMingcheng(String mingcheng) {
		this.mingcheng = mingcheng;
	}

	// 资源分类
	private String fenlei;

	/**
	 * 获取资源分类
	 * @return 返回资源分类
	 */
	public String getFenlei() {
		return this.fenlei;
	}

	/**
	 * 设置资源分类
	 * @param fenlei 要设置的资源分类
	 */
	public void setFenlei(String fenlei) {
		this.fenlei = fenlei;
	}

}

