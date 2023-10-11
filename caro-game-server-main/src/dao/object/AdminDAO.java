/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.object;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Admin;
import model.User;

/**
 *
 * @author Admin
 */
public class AdminDAO extends DAO {

	public AdminDAO() {
		super();
//		super.getDAO();
	}

	public Admin verifyAdmin(Admin admin) {
		try {
			PreparedStatement preparedStatement = con
					.prepareStatement("SELECT *\n" + "FROM admin\n" + "WHERE username = ?\n" + "AND password = ?");
			preparedStatement.setString(1, admin.getUsername());
			preparedStatement.setString(2, admin.getPassword());
			System.out.println(preparedStatement);
			ResultSet rs = preparedStatement.executeQuery();

			if (rs.next() && admin.getRole() == 1) {
				return new Admin(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public Admin getAdminByID(int ID) {
		try {
			PreparedStatement preparedStatement = con.prepareStatement("SELECT * FROM admin\n" + "WHERE ID=?");
			preparedStatement.setInt(1, ID);
			System.out.println(preparedStatement);
			ResultSet rs = preparedStatement.executeQuery();
			if (rs.next()) {
				return new Admin(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4));

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}


}
