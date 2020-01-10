package Projets;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class LogIn extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel NPanel,CPanel, SPanel;
	
	private JButton bt_Login, bt_Cancel;
	private JLabel lbl_title, lbl_login, lbl_password;
	private JTextField txt_login;
	private JPasswordField txt_password;
	private JCheckBox showpassword;
	
	
	public void initLabel() {
		lbl_title = new JLabel("Memeber Login");
		lbl_title.setForeground(new Color(90, 80, 80));
		lbl_title.setHorizontalAlignment(JLabel.CENTER);
		
		lbl_login = new JLabel("Log IN :");
	
		lbl_login.setForeground(Color.lightGray);
		lbl_login.setBounds(5, 20, 100, 20);
		lbl_login.setHorizontalAlignment(JLabel.CENTER);

		lbl_password = new JLabel("Password:");
		lbl_password.setBounds(5,60,100,20);
		lbl_password.setForeground(Color.LIGHT_GRAY);
		lbl_password.setHorizontalAlignment(JLabel.CENTER);

	}

	public void initTextField() {
		txt_login = new JTextField(70);
		txt_login.setFont(new Font("Candara", Font.BOLD, 20));
		txt_login.setBounds(150, 20, 200, 20);
		//txt_login.setPreferredSize(new Dimension(200,80));
		txt_login.setHorizontalAlignment(JTextField.CENTER);

		txt_password = new JPasswordField(70);
		txt_password.setBounds(150,60,200,20);
		txt_password.setEchoChar('*');
		txt_password.setHorizontalAlignment(JPasswordField.CENTER);

		showpassword = new JCheckBox("show password");
		showpassword.setForeground(Color.LIGHT_GRAY);
		showpassword.setBackground(Color.darkGray);
		showpassword.setFont(new Font("Calibri",Font.BOLD|Font.ITALIC,14));
		showpassword.setBounds(190, 100, 120, 20);

	}

	public void initButtons() {
		bt_Cancel = new JButton("Annuler");
		bt_Cancel.setBackground(new Color(70, 80, 90));
		bt_Cancel.setFont(new Font("Candara", Font.BOLD, 20));
		bt_Cancel.setPreferredSize(new Dimension(70, 30));
		bt_Cancel.addActionListener(this);

		bt_Login = new JButton("Se connecter");
		bt_Login.setBackground(new Color(70, 80, 90));
		bt_Login.setFont(new Font("Candara", Font.BOLD, 20));
		bt_Login.setPreferredSize(new Dimension(70, 30));
		bt_Login.addActionListener(this);

	}

	public void initPanels() {
		initLabel();
		NPanel = new JPanel();
		NPanel.setLayout(null);
		NPanel.setBorder(new EmptyBorder(10, 10, 10, 10));
		NPanel.add(lbl_title);

		initTextField();
	
		CPanel = new JPanel();
		
		CPanel.setLayout(null);
		CPanel.setOpaque(false);
		
		JLabel lbl_back = new JLabel(new ImageIcon("images/back.jpg"));
		CPanel.setPreferredSize(new Dimension(120,20));
		CPanel.setBounds(10, 10, 600, 90);
		//CPanel.setBorder(new EmptyBorder(10,10,10,10));
		CPanel.add(lbl_back);
		CPanel.add(lbl_login);
		CPanel.add(txt_login);
			
		CPanel.add(lbl_password);
		CPanel.add(txt_password);
		CPanel.add(showpassword);
		
		initButtons();
		SPanel = new JPanel();
		SPanel.setLayout(new GridLayout(2, 2));
		SPanel.setBackground(Color.LIGHT_GRAY);
		SPanel.setBorder(new EmptyBorder(10, 10, 10, 10));
		SPanel.add(bt_Login);
		SPanel.add(bt_Cancel);
	//	SPanel.add(showpassword);

	}

	public LogIn(String T) {
		initPanels();
		Container cp = getContentPane();
		ImageIcon back = new ImageIcon(getClass().getResource("back.jpg"));
		Image im = back.getImage();
		Image modifierimage = im.getScaledInstance(500, 300, Image.SCALE_SMOOTH);
		back=new ImageIcon(modifierimage);
		JLabel l = new JLabel(back);
		
		
		
		//cp.add(CPanel);
		cp.setBackground(new Color(90, 80, 90));
		cp.setLayout(new BorderLayout());
		
		cp.add(NPanel, BorderLayout.NORTH);
		cp.add(l, BorderLayout.CENTER);
		l.add(NPanel);
		l.add(CPanel);
		cp.add(SPanel, BorderLayout.SOUTH);
		
		//setBackground(new Color(90, 80, 90));
		setSize(500, 400);
		setTitle(T);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}

	public static void main(String[] args) {

		new LogIn("Se Connecter");
		// TODO Auto-generated method stub

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == showpassword) {
			if (showpassword.isSelected()) {
				txt_password.setEchoChar((char) 0);
			} else {
				txt_password.setEchoChar('*');
			}
		}
		// TODO Auto-generated method stub

	}

}
