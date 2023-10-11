/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Admin
 */
public class Player extends User {

	private String avatar;
	private int numberOfGame;
	private int numberOfwin;
	private int numberOfDraw;
	private boolean isOnline;
	private boolean isPlaying;

	public Player() {
	}

	public Player(Player a) {
		super(a.ID,a.username,a.password,a.nickname);
		this.avatar = a.avatar;
		this.numberOfGame = a.numberOfGame;
		this.numberOfwin = a.numberOfwin;
		this.numberOfDraw = a.numberOfDraw;
		this.isOnline = a.isOnline;
		this.isPlaying = a.isPlaying;
		this.role = a.role;
	}

	public Player(int ID, String username, String password, String nickname, String avatar, int numberOfGame,
			int numberOfwin, int numberOfDraw, boolean isOnline, boolean isPlaying) {
		super(ID,username,password,nickname);
		this.avatar = avatar;
		this.numberOfGame = numberOfGame;
		this.numberOfwin = numberOfwin;
		this.numberOfDraw = numberOfDraw;
		this.isOnline = isOnline;
		this.isPlaying = isPlaying;
		this.role = 0;
	}

	public Player(int ID, String nickname) {
		this.ID = ID;
		this.nickname = nickname;
	}

	public Player(int ID, String nickname, boolean isOnline, boolean isPlaying) {
		this.ID = ID;
		this.nickname = nickname;
		this.isOnline = isOnline;
		this.isPlaying = isPlaying;
	}

	public Player(String username, String password) {
		this.username = username;
		this.password = password;
	}

	public Player(String username, String password, String nickname, String avatar) {
		this.username = username;
		this.password = password;
		this.nickname = nickname;
		this.avatar = avatar;
	}

	@Override
	public int checkRole() {
		if (this.role == 0) {
			System.out.println("Đây là người chơi");
		}
		return role;
	}

	public String getAvatar() {
		return avatar;
	}

	public int getNumberOfGame() {
		return numberOfGame;
	}

	public int getNumberOfwin() {
		return numberOfwin;
	}

	public boolean getIsOnline() {
		return isOnline;
	}

	public boolean getIsPlaying() {
		return isPlaying;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public void setNumberOfGame(int numberOfGame) {
		this.numberOfGame = numberOfGame;
	}

	public void setNumberOfwin(int numberOfwin) {
		this.numberOfwin = numberOfwin;
	}

	public void setIsOnline(boolean isOnline) {
		this.isOnline = isOnline;
	}

	public void setIsPlaying(boolean isPlaying) {
		this.isPlaying = isPlaying;
	}

	public Player(int ID, String nickname, int numberOfGame, int numberOfDraw) {
		this.ID = ID;
		this.nickname = nickname;
		this.numberOfGame = numberOfGame;
		this.numberOfDraw = numberOfDraw;
	}

	public int getNumberOfDraw() {
		return numberOfDraw;
	}

	public void setNumberOfDraw(int numberOfDraw) {
		this.numberOfDraw = numberOfDraw;
	}
}
