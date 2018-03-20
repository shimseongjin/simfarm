package Buliding;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class MarketBuliding extends JPanel {
	ImageIcon icon = new ImageIcon("buliding/¸¶ÄÏ.png");
	Image img = icon.getImage();
	
	public MarketBuliding() {
	}

	
	public void paintComponent(Graphics g){
		g.drawImage(img, 0, 0, 150, 150, this);
	}
	
}
