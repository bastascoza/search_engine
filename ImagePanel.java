package Projets;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class ImagePanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Image image=null;
	private int iWidth2;
	private int iHeight2;
	
	public ImagePanel(String img) {
		this(new ImageIcon(img).getImage());
		
	}

	public ImagePanel(Image img) {
		image = img;
		this.iWidth2 = img.getWidth(this)/2;
	    this.iHeight2 = img.getHeight(this)/2;
	}

	@Override
	public void paintComponents(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponents(g);
		if(image!=null){
			int x = this.getParent().getWidth()/2 - iWidth2;
	        int y = this.getParent().getHeight()/2 - iHeight2;
			g.drawImage(image, x, y, this);
		}
	}

}
