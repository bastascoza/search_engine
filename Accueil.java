package Projets;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.FileDialog;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Accueil extends JFrame implements ActionListener {

	private JPanel NPanel, CPanel, SPanel;
	private JButton btn_search;
	private JButton btn_choose;
	private JTextField txt_search;
	



	public void initTextfeild() {
		txt_search = new JTextField();
		txt_search.setFont(new Font("calibri", Font.BOLD, 20));
		txt_search.setBackground(Color.white);
		txt_search.setHorizontalAlignment(JTextField.CENTER);
		txt_search.setBounds(100, 50, 400, 30);

	}

	public void initButtons() {
		btn_choose=new JButton("Choisir dossier");
		btn_choose.setFont(new Font("Calibri", Font.BOLD, 15));
		btn_choose.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btn_choose.setBackground(new Color(30, 70, 100));
		btn_choose.setBounds(100, 100, 150, 30);
		btn_choose.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				  JFileChooser chooser = new JFileChooser();
				  
				  chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
			        chooser.setAcceptAllFileFilterUsed(false);
			        
			        int returnVal = chooser.showOpenDialog(null);
			        if(returnVal == JFileChooser.APPROVE_OPTION) {
			                    System.out.println("You chose to open this file: " +
			                    chooser.getSelectedFile().getAbsolutePath());
			                    System.out.println("File name : "+chooser.getSelectedFile().getName());
			        }
			}
		} );
		
		btn_search = new JButton("Rechercher");
		btn_search.setFont(new Font("Calibri", Font.BOLD, 15));
		// btn_search.setForeground(new Color(10,30,40));
		btn_search.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btn_search.setBackground(new Color(30, 70, 100));
		// btn_search.setSize(70, 50);
		btn_search.setBounds(500, 50, 150, 30);
		btn_search.addActionListener(new ActionListener() {

		    @Override
		    public void actionPerformed(ActionEvent e) {
		    	
		    	
		    	System.out.println(txt_search.getText());
		    }
		});
	}

	public void initPanels() {
		  
		initTextfeild();
		initButtons();
		CPanel = new JPanel();
		CPanel.setLayout(null);
		CPanel.setBackground(Color.LIGHT_GRAY);
		CPanel.add(btn_search);
		CPanel.add(txt_search);
		CPanel.add(btn_choose);
	}
	
	

	public Accueil(String T) {
		Container cp = getContentPane();
		initPanels();
		cp.setBackground(Color.LIGHT_GRAY);
		cp.add(CPanel, BorderLayout.CENTER);
		setSize(2000, 650);
		setTitle(T);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Accueil("Recherche");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

}
