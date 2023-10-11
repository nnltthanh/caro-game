/*


 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JOptionPane;

import controller.Room;
import controller.Server;
import controller.ServerThread;
import dao.object.PlayerDAO;
import model.Player;


/**
 *
 * @author Admin
 */
public class AdminView extends javax.swing.JFrame implements Runnable {
	private PlayerDAO userDAO;
	/**
	 * Creates new form Admin
	 */
	private boolean isCheck;

	public enum View {
		LOGIN, GAMENOTICE
	}

	public static GameNoticeFrm gameNoticeFrm;
	public static LoginFrm loginFrm;

	public AdminView() {
		
	}
	
	public void loginProcess() {
		isCheck = false;
		loginFrm = new LoginFrm();
		loginFrm.setVisible(true);
	}

	public AdminView(boolean isLogin) {
		isCheck = isLogin;
		if (isLogin) {
			initComponents();
			this.setResizable(false);
			this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
//			this.setDefaultCloseOperation(EXIT_ON_CLOSE);
			this.setLocationRelativeTo(null);
			jTextArea1.setEditable(false);
			jTextArea2.setEditable(false);
			userDAO = new PlayerDAO();
			this.setTitle("Caro Game - Admin");
//			loginFrm.setVisible(false);
			
			this.addWindowListener(new WindowAdapter() {
	            @Override
	            public void windowClosing(WindowEvent e) {
	                int confirm = JOptionPane.showOptionDialog(
	                        null, "Xác nhận đóng kết nối server?",
	                        "Đóng server", JOptionPane.YES_NO_OPTION,
	                        JOptionPane.QUESTION_MESSAGE, null, null, null);
	                if (confirm == JOptionPane.YES_OPTION) {
	                    dispose();
	                    for (ServerThread serverThread : Server.serverThreadBus.getListServerThreads()) {
	            			userDAO.updateToOffline(serverThread.getUser().getID());
	            		}
	                    
	                    System.exit(0);
	                }
	                
	                
	            }

	        });
			
			this.setVisible(true);
			System.out.println("Server đang kết nối!");
		
		} else {
			System.out.println("Server kết nối không thành công!");
		}
//  		isCheck = false;
//      loginFrm = new LoginFrm();
//      loginFrm.setVisible(true);
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated
	// Code">//GEN-BEGIN:initComponents
	public void initComponents() {

		jTextField2 = new javax.swing.JTextField();
		jScrollPane1 = new javax.swing.JScrollPane();
		jTextArea1 = new javax.swing.JTextArea();
		jButton1 = new javax.swing.JButton();
		jButton2 = new javax.swing.JButton();
		jPanel1 = new javax.swing.JPanel();
		jLabel1 = new javax.swing.JLabel();
		jTextField1 = new javax.swing.JTextField();
		jButton3 = new javax.swing.JButton();
		jScrollPane2 = new javax.swing.JScrollPane();
		jTextArea2 = new javax.swing.JTextArea();
		jTextField3 = new javax.swing.JTextField();
		jButton4 = new javax.swing.JButton();
		jButton5 = new javax.swing.JButton();
		jButton6 = new javax.swing.JButton();
		jComboBox1 = new javax.swing.JComboBox<>();

		jTextField2.setText("jTextField2");

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jTextArea1.setColumns(20);
		jTextArea1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		jTextArea1.setRows(5);
		jScrollPane1.setViewportView(jTextArea1);

		jButton1.setText("Xem danh sách luồng");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		jButton2.setText("Xem danh sách phòng");
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});

		jPanel1.setBackground(new java.awt.Color(102, 102, 102));

		jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
		jLabel1.setForeground(new java.awt.Color(255, 255, 255));
		jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel1.setText("Admin");

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE,
						javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addGap(20, 20, 20).addComponent(jLabel1)
						.addContainerGap(21, Short.MAX_VALUE)));

		jTextField1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
		jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
			public void keyPressed(java.awt.event.KeyEvent evt) {
				jTextField1KeyPressed(evt);
			}
		});

		jButton3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
		jButton3.setText("Phát thông báo");
		jButton3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton3ActionPerformed(evt);
			}
		});

		jTextArea2.setColumns(20);
		jTextArea2.setRows(5);
		jScrollPane2.setViewportView(jTextArea2);

		jButton4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
		jButton4.setText("Ban");
		jButton4.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton4ActionPerformed(evt);
			}
		});

		jButton5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
		jButton5.setText("Cảnh cáo");
		jButton5.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton5ActionPerformed(evt);
			}
		});

		jButton6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
		jButton6.setText("Huỷ Ban");
		jButton6.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton6ActionPerformed(evt);
			}
		});

		jComboBox1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
		jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chọn lý do",
				"Ngôn ngữ thô tục - xúc phạm người khác", "Spam đăng nhập", "Sử dụng game với mục đích xấu",
				"Phát hiện rò rỉ bảo mật - tài khoản tạm thời bị khoá để kiểm tra thêm" }));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
						Short.MAX_VALUE)
				.addGroup(layout.createSequentialGroup().addGap(62, 62, 62)
						.addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 197,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(114, 114, 114)
						.addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
						.addGap(61, 61, 61))
				.addGroup(layout.createSequentialGroup().addGroup(layout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
								.addGroup(layout.createSequentialGroup().addGap(31, 31, 31).addComponent(jScrollPane2))
								.addGroup(javax.swing.GroupLayout.Alignment.LEADING,
										layout.createSequentialGroup().addGap(30, 30, 30).addComponent(jScrollPane1,
												javax.swing.GroupLayout.PREFERRED_SIZE, 582,
												javax.swing.GroupLayout.PREFERRED_SIZE)))
						.addGroup(layout.createSequentialGroup().addGap(30, 30, 30)
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
										.addGroup(layout.createSequentialGroup()
												.addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 441,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
												.addComponent(jButton3))
										.addGroup(layout.createSequentialGroup()
												.addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 58,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addGap(18, 18, 18)
												.addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 214,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
												.addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 100,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
												.addComponent(jButton5)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
												.addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 65,
														javax.swing.GroupLayout.PREFERRED_SIZE)))))
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout
				.createSequentialGroup()
				.addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
						javax.swing.GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
				.addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 170,
						javax.swing.GroupLayout.PREFERRED_SIZE)
				.addGap(18, 18, 18)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jButton2)
						.addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING))
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
				.addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 157,
						javax.swing.GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
						.addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 25,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addComponent(jButton3))
				.addGap(18, 18, 18)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
						.addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 29,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addComponent(jButton4).addComponent(jButton5).addComponent(jButton6).addComponent(jComboBox1,
								javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
				.addContainerGap(20, Short.MAX_VALUE)));

		pack();
	}// </editor-fold>//GEN-END:initComponents

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton1ActionPerformed
		String res = "";
		String room = "";
		int i = 1;
		for (ServerThread serverThread : Server.serverThreadBus.getListServerThreads()) {
			if (serverThread.getRoom() == null)
				room = null;
			else
				room = "" + serverThread.getRoom().getID();
			if (serverThread.getUser() != null) {
				res += i + ". Client-number: " + serverThread.getClientNumber() + ", User-ID: "
						+ serverThread.getUser().getID() + ", Room: " + room + "\n";
			} else {
				res += i + ". Client-number: " + serverThread.getClientNumber() + ", User-ID: null, Room: " + room
						+ "\n";
			}
			i++;
		}
		jTextArea1.setText(res);
	}// GEN-LAST:event_jButton1ActionPerformed

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton2ActionPerformed
		String res = "";
		int i = 1;
		for (ServerThread serverThread : Server.serverThreadBus.getListServerThreads()) {
			Room room1 = serverThread.getRoom();
			String listUser = "List user ID: ";
			if (room1 != null) {
				if (room1.getNumberOfUser() == 1) {
					listUser += room1.getUser1().getUser().getID();
				} else {
					listUser += room1.getUser1().getUser().getID() + ", " + room1.getUser2().getUser().getID();
				}
				res += i + ". Room_ID: " + room1.getID() + ", Number of player: " + room1.getNumberOfUser() + ", "
						+ listUser + "\n";
				i++;
			}

		}
		jTextArea1.setText(res);
	}// GEN-LAST:event_jButton2ActionPerformed

	private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton3ActionPerformed
		sendMessage();
	}// GEN-LAST:event_jButton3ActionPerformed

	private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_jTextField1KeyPressed
		if (evt.getKeyCode() == 10) {
			sendMessage();
		}
	}// GEN-LAST:event_jTextField1KeyPressed

	private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton4ActionPerformed
		try {
			if (jTextField3.getText().length() == 0) {
				JOptionPane.showMessageDialog(rootPane, "Vui lòng nhập ID của User");
				return;
			}
			if (jComboBox1.getSelectedIndex() < 1) {
				JOptionPane.showMessageDialog(rootPane, "Vui lòng chọn lý do");
				return;
			}
			int userId = Integer.parseInt(jTextField3.getText());
			Player user = new Player();
			user.setID(userId);
			userDAO.updateBannedStatus(user, true);
			ServerThread serverThread = Server.serverThreadBus.getServerThreadByUserID(userId);
			serverThread.write("banned-notice," + jComboBox1.getSelectedItem());
			if (serverThread.getRoom() != null) {
				Room room = serverThread.getRoom();
				ServerThread competitorThread = room.getCompetitor(serverThread.getClientNumber());
				room.setUsersToNotPlaying();
				if (competitorThread != null) {
					room.decreaseNumberOfGame();
					competitorThread.write("left-room,");
					competitorThread.setRoom(null);
				}
				serverThread.setRoom(null);
			}
			Server.admin.addMessage("User có ID " + userId + " đã bị BAN");
			serverThread.setUser(null);
			Server.serverThreadBus.boardCast(-1, "chat-server," + "User có ID " + userId + " đã bị BAN");
			JOptionPane.showMessageDialog(rootPane, "Đã BAN user " + userId);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(rootPane, "Có lỗi xảy ra");
		}
	}// GEN-LAST:event_jButton4ActionPerformed

	private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton6ActionPerformed
		try {
			if (jTextField3.getText().length() == 0) {
				JOptionPane.showMessageDialog(rootPane, "Vui lòng nhập ID của User");
				return;
			}
			int userId = Integer.parseInt(jTextField3.getText());
			Player user = new Player();
			user.setID(userId);
			userDAO.updateBannedStatus(user, false);
			jTextField3.setText("");
			JOptionPane.showMessageDialog(rootPane, "Đã huỷ BAN user " + userId);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(rootPane, "Có lỗi xảy ra");
		}
	}// GEN-LAST:event_jButton6ActionPerformed

	public static void closeAllViews() {
		if (loginFrm != null)
			loginFrm.dispose();
		if (gameNoticeFrm != null)
			gameNoticeFrm.dispose();
	}

	public static void openView(View viewName, String arg1, String arg2) {
		if (viewName != null) {
			switch (viewName) {
			case GAMENOTICE:
				gameNoticeFrm = new GameNoticeFrm(arg1, arg2);
				gameNoticeFrm.setVisible(true);
				break;
			case LOGIN:
				loginFrm = new LoginFrm(arg1, arg2);
				loginFrm.setVisible(true);
			}
		}
	}

	public static void closeView(View viewName) {
		if (viewName != null) {
			switch (viewName) {
			case LOGIN:
				loginFrm.dispose();
				break;

//                case HOMEPAGE:
//                    homePageFrm.dispose();
//                    break;

			case GAMENOTICE:
				gameNoticeFrm.dispose();
				break;
			}

		}
	}

	private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton5ActionPerformed
		try {
			if (jTextField3.getText().length() == 0) {
				JOptionPane.showMessageDialog(rootPane, "Vui lòng nhập ID của User");
				return;
			}
			if (jComboBox1.getSelectedIndex() < 1) {
				JOptionPane.showMessageDialog(rootPane, "Vui lòng chọn lý do");
				return;
			}
			int userId = Integer.parseInt(jTextField3.getText());
			Server.serverThreadBus.sendMessageToUserID(userId, "warning-notice," + jComboBox1.getSelectedItem());
			JOptionPane.showMessageDialog(rootPane, "Đã cảnh cáo user " + userId);

		} catch (Exception e) {
			JOptionPane.showMessageDialog(rootPane, "Có lỗi xảy ra");
		}
	}// GEN-LAST:event_jButton5ActionPerformed

	private void sendMessage() {
		String message = jTextField1.getText();
		if (message.length() == 0)
			return;
		String temp = jTextArea2.getText();
		temp += "Thông báo từ máy chủ : " + message + "\n";
		jTextArea2.setText(temp);
		jTextArea2.setCaretPosition(jTextArea2.getDocument().getLength());
		Server.serverThreadBus.boardCast(-1, "chat-server,Thông báo từ máy chủ : " + message);
		jTextField1.setText("");
	}

	public void addMessage(String message) {
		String tmp = jTextArea2.getText();
		tmp = tmp + message + "\n";
		jTextArea2.setText(tmp);
		try {
			jTextArea2.setCaretPosition(jTextArea1.getDocument().getLength());
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton2;
	private javax.swing.JButton jButton3;
	private javax.swing.JButton jButton4;
	private javax.swing.JButton jButton5;
	private javax.swing.JButton jButton6;
	private javax.swing.JComboBox<String> jComboBox1;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JScrollPane jScrollPane2;
	private javax.swing.JTextArea jTextArea1;
	public static javax.swing.JTextArea jTextArea2;
	private javax.swing.JTextField jTextField1;
	private javax.swing.JTextField jTextField2;
	private javax.swing.JTextField jTextField3;
	// End of variables declaration//GEN-END:variables

	@Override
	public void run() {
		loginProcess();
	}
}
