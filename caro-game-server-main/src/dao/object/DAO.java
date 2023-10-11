package dao.object;

import java.sql.Connection;
import java.sql.SQLException;

import dao.database.DAO_mySQL;
import dao.database.DAO_sqlServer;
import dao.database.daoAll;

public class DAO {
	protected daoAll dao;
	protected Connection con;
	
	public DAO() {	
		try {
			dao = new DAO_mySQL();
			con = dao.getDAO();
		} catch(Exception e ) {
			
		}
		
		
		if (con != null) {
			System.out.println("Kết nối với MySQL");
		}
		
		else {
			dao = new DAO_sqlServer();
			con = dao.getDAO();
			
			if (con != null) {
				System.out.println("Kết nối với SQLServer");
			}
		}
	}
}
