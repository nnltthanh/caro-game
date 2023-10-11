/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;

import dao.object.PlayerDAO;
import model.Player;

/**
 *
 * @author Admin
 */
public class Room {
    private int ID;
    private ServerThread user1;
    private ServerThread user2;
    private String password;
    private PlayerDAO playerDAO;

    public int getID() {
        return ID;
    }

    public ServerThread getUser2() {
        return user2;
    }

    public ServerThread getUser1() {
        return user1;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    
    public Room(ServerThread user1) {
        System.out.println("Tạo phòng thành công, ID là: "+Server.ID_room);
        this.password=" ";
        this.ID = Server.ID_room++;
        playerDAO = new PlayerDAO();
        this.user1 = user1;
        this.user2 = null;
    }
    
    public int getNumberOfUser(){
        return user2==null?1:2;
    }
    
    public void setUser2(ServerThread user2){
        this.user2 = user2;
    }
    
    public void boardCast(String message){
        try {
            user1.write(message);
            user2.write(message);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    public int getCompetitorID(int ID_ClientNumber){
        if(user1.getClientNumber()==ID_ClientNumber)
            return user2.getUser().getID();
        return user1.getUser().getID();
    }
    public ServerThread getCompetitor(int ID_ClientNumber){
        if(user1.getClientNumber()==ID_ClientNumber)
            return user2;
        return user1;
    }
    
    public void setUsersToPlaying(){
        playerDAO.updateToPlaying(user1.getUser().getID());
        if(user2!=null){
            playerDAO.updateToPlaying(user2.getUser().getID());
        }
    }
    public void setUsersToNotPlaying(){
        playerDAO.updateToNotPlaying(user1.getUser().getID());
        if(user2!=null){
            playerDAO.updateToNotPlaying(user2.getUser().getID());
        }
    }

    
    public void increaseNumberOfGame(){
        playerDAO.addGame(user1.getUser().getID());
        playerDAO.addGame(user2.getUser().getID());
    }
    
    public void increaseNumberOfDraw(){
        playerDAO.addDrawGame(user1.getUser().getID());
        playerDAO.addDrawGame(user2.getUser().getID());
    }
    
    public void decreaseNumberOfGame(){
        playerDAO.decreaseGame(user1.getUser().getID());
        playerDAO.decreaseGame(user2.getUser().getID());
    }
    
    
}
