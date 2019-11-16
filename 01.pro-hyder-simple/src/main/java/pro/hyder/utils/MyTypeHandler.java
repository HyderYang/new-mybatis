package pro.hyder.utils;

import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.TypeHandler;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * 自定义类型转化器
 *
 * @author Hyder
 * @version 1.0
 * @date 2019/11/16 下午7:56
 */
public class MyTypeHandler implements TypeHandler {

	/**
	 * 在生成 sql 语句时候调用
	 * @param ps            preparedStatement对象
	 * @param i             占位符位置
	 * @param parameter     占位符关联数据
	 * @param jdbcType
	 * @throws SQLException
	 */
	public void setParameter(PreparedStatement ps, int i, Object parameter, JdbcType jdbcType) throws SQLException {
		if (parameter == null){
			ps.setInt(i, 0);
			return;
		}

		Boolean flag = (Boolean) parameter;
		int value = flag ? 1:0;
		ps.setInt(i, value);
	}

	/**
	 * 查询结束之后 将 ResultSet数据行转换为实体类对象时
	 * 通知 TypeHandler 将当前数据行某个字段转换为何种类型
	 * @param rs
	 * @param columnName
	 * @return
	 * @throws SQLException
	 */
	public Object getResult(ResultSet rs, String columnName) throws SQLException {
		int flag = rs.getInt(columnName);
		return flag == 1 ? Boolean.TRUE : Boolean.FALSE;
	}

	public Object getResult(ResultSet rs, int columnIndex) throws SQLException {
		return null;
	}

	public Object getResult(CallableStatement cs, int columnIndex) throws SQLException {
		return null;
	}
}
