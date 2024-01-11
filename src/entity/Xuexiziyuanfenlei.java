package entity;

/**
 * 实体类 Xuexiziyuanfenlei 用于映射数据库中的学习资源分类表
 */
public class Xuexiziyuanfenlei implements java.io.Serializable {

	// 分类ID
	private Integer id;

	/**
	 * 获取分类ID
	 * @return 返回分类ID
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * 设置分类ID
	 * @param id 要设置的分类ID
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	// 分类名称
	private String fenleimingcheng;

	/**
	 * 获取分类名称
	 * @return 返回分类名称
	 */
	public String getFenleimingcheng() {
		return this.fenleimingcheng;
	}

	/**
	 * 设置分类名称
	 * @param fenleimingcheng 要设置的分类名称
	 */
	public void setFenleimingcheng(String fenleimingcheng) {
		this.fenleimingcheng = fenleimingcheng;
	}

}
