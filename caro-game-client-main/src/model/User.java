
package model;

public abstract class User {
	protected int ID;
	protected String username;
	protected String password;
	protected int role;
	protected String nickname;
	
	public User() {
		
	}
	
	public User(int id, String username, String pass, String nick) {
		this.ID = id;
		this.username = username;
		this.password = pass;
		this.nickname = nick;
	}

	public abstract int checkRole();

	public int getID() {
		return ID;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public void setID(int ID) {
		this.ID = ID;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getRole() {
		return role;
	}

	public void setRole(int role) {
		this.role = role;
	}

}
