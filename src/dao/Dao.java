package dao;


import java.beans.PropertyDescriptor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

public class Dao<T> {
	String clazzname;
	Class clazz;
	// 构造函数接受一个实体以初始化类信息
	public Dao(T entity) {
		clazz=entity.getClass();
		clazzname=clazz.getSimpleName().toLowerCase();
	}
	// 根据键值对查询数据库记录
	public List<T> queryByKey(String key,String keyvalue){
		String sql="select * from "+clazzname+" where "+key+"=?";
		List<T> list = (List<T>) DBUnitHelper.executeQuery(sql, clazz, keyvalue);
		return list;
	}
	// 根据提供的实体的非空字段查询数据库记录
	public List<T> query(T entity){
		StringBuffer sbf=new StringBuffer("select * from "+clazzname+" where 1=1 ");
		for (Field field : clazz.getDeclaredFields()) {
			if(!field.getName().equals("id")){
				if(getValue(entity, field.getName(), clazz)!=null&&!getValue(entity, field.getName(), clazz).equals("")){
					sbf.append(" and "+field.getName()+" like '%"+getValue(entity, field.getName(), clazz)+"%'");
				}
			}
		}
		System.out.println(sbf.toString());
		List<T> list = (List<T>) DBUnitHelper.executeQuery(sbf.toString(), clazz);
		return list;
	}
	// 从数据库检索与关联实体相关的所有记录
	public List<T> getAll(){
		String sql="select * from "+clazzname;
		List<T> list = (List<T>) DBUnitHelper.executeQuery(sql, clazz);
		return list;
	}
	// 执行自定义的SQL查询
	public void executeSql(String sql) {
		System.out.println(sql);
		DBUnitHelper.executeUpdate(sql);
	}
	// 根据主键更新数据库中的记录
	public void update(T entity) {
		Integer value1=(Integer) getValue(entity, getKey(), clazz);
		StringBuffer sbf=new StringBuffer();
		sbf.append("update "+clazzname+" set ");
		for (Field field : clazz.getDeclaredFields()) {
			Object o=getValue(entity, field.getName(), clazz);
			sbf.append(field.getName().toLowerCase()).append("='").
			append(getValue(entity, field.getName(), clazz)).append("'").append(",");
		}
		sbf=new StringBuffer(sbf.subSequence(0, sbf.length()-1));
		sbf.append(" where id='"+value1+"'");
		executeSql(sbf.toString());
	}
	// 在数据库中插入新记录
	public void add(T t) {
		StringBuffer sbf=new StringBuffer();
		sbf.append("insert into "+clazzname).append("(");
		for (Field field : clazz.getDeclaredFields()) {
			if(!field.getName().equals("id")){
				sbf.append(field.getName().toLowerCase()).append(",");
			}
		}
		sbf=new StringBuffer(sbf.subSequence(0, sbf.length()-1));
		sbf.append(") values(");
		for (Field field : clazz.getDeclaredFields()) {
			if(!field.getName().equals("id")){
				sbf.append("'").append(getValue(t, field.getName(), clazz)).append("'").append(",");
			}
		}
		sbf=new StringBuffer(sbf.subSequence(0, sbf.length()-1));
		sbf.append(")");
		executeSql(sbf.toString());

	}
	// 根据键值对从数据库中删除记录
	public Integer delBykey(String key, String keyvalue) {
		String sql = "delete from "+clazzname+" where "+key+"=?";
		return DBUnitHelper.executeUpdate(sql, keyvalue);
	}
	// 使用反射从实体中检索字段的值
	public Object getValue(Object entity, String fieldName, Class clazz) {
		PropertyDescriptor pd;
		try {
			pd = new PropertyDescriptor(fieldName, clazz);
			Method wM = pd.getReadMethod();
			return wM.invoke(entity)==null?"":wM.invoke(entity);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;

	}
	// 使用反射在实体中设置字段的值
	public void setValue(String fieldName,Class clazz,Object o,Object fieldValue){
		try {
			PropertyDescriptor pd = new PropertyDescriptor(fieldName, clazz);
			Method wM = pd.getWriteMethod();
			wM.invoke(o, fieldValue);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	// 获取主键字段的名称
	public String getKey() {
		try {
			for (Field field : clazz.getDeclaredFields()) {
					return field.getName();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
