package Buliding;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class ContestBuliding extends JPanel {
	ImageIcon icon = new ImageIcon("buliding/µµÀü.png");
	Image img = icon.getImage();
	
	public ContestBuliding() {	
	}
	
	public void paintComponent(Graphics g){
		g.drawImage(img, 0, 0, 150, 150, this);
	}

}
