package dao.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DAO_sqlServer implements daoAll {

	protected Connection con;

	public DAO_sqlServer() {

	}

	public String connectionName() {
		return "sqlserver";
	}

	public Connection getDAO() {
		String jdbcURL = "jdbc:sqlserver://THANH\\SQLSERVER:1433;" + "databaseName=carogame;user=sa;password=thanh?";
//        + ";encrypt=false";;
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			try {
				con = DriverManager.getConnection(jdbcURL);
				return con;
			} catch (Exception e) {
				System.out.println("Không thể kết nối với SQLServer");
			}
		} catch (Exception e) {
			e.printStackTrace();

		}
		return null;
	}

}
