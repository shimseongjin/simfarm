package Buliding;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class TranningBuliding extends JPanel {
	ImageIcon icon = new ImageIcon("buliding/Æ®·¹ÀÌ´×.png");
	Image img = icon.getImage();
	
	public TranningBuliding() {
	}

	
	public void paintComponent(Graphics g){
		g.drawImage(img, 0, 0, 150, 150, this);
	}
	
}
