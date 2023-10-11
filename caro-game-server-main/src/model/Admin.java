package model;

import dao.object.AdminDAO;

public class Admin extends User {

	public Admin(int ID, String username, String password, String nickname) {
		super(ID,username,password,nickname);
		this.role = 1;
	}

	@Override
	public int checkRole() {
		if (this.role == 1) {
			System.out.println("Đây là quản trị viên");
		}
		return role;
	}

}
