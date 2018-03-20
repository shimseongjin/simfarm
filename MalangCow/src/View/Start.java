package View;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import Buliding.*;
import Draw.DrawBackGround;
import Draw.Map;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;


public class Start extends JPanel {
	ContestBuliding contestbuliding;
	FarmBuliding farmBuliding;
	AlbaBuliding albaBuliding;
	TranningBuliding tranningBuliding;
	MarketBuliding marketBuliding;
	
	public Start(Main main) {
		setLayout(null);
		
		/////////////////////////////////////////////////////////////////
		farmBuliding = new FarmBuliding();
		farmBuliding.setBounds(72, 234, 149, 150);
		add(farmBuliding);
		
		farmBuliding.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent arg0) {
				setVisible(false);
				main.farm.setVisible(true);
			}
		});
		
		////////////////////////////////////////////////////////////
		contestbuliding = new ContestBuliding();
		contestbuliding.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent arg0) {
				if(main.state.check != true){
				JOptionPane.showMessageDialog(null, "°æ±âÀå ÀÔÀå ½Ã°£ÀÌ ¾Æ´Õ´Ï´Ù.");
				}
				else new CowSellect(main);
			}
		});
		contestbuliding.setBounds(142, 23, 149, 150);
		add(contestbuliding);
		
		
		/////////////////////////////////////////////////////////////
		albaBuliding = new AlbaBuliding();
		albaBuliding.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				new AlbaFrame(main);
			}
		});
		albaBuliding.setBounds(583, 234, 149, 150);
		add(albaBuliding);
		
		///////////////////////////////////////////////////////////////
		tranningBuliding = new TranningBuliding();
		tranningBuliding.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				new Tranning(main);
			}
		});
		tranningBuliding.setBounds(541, 23, 149, 150);
		add(tranningBuliding);
		
		
		////////////////////////////////////////////////////////////////
		marketBuliding = new MarketBuliding();
		marketBuliding.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				new Market(main);
			}
		});
		marketBuliding.setBounds(319, 291, 149, 150);
		add(marketBuliding);
		
		JLabel lblNewLabel = new JLabel("\uBAA9\uC7A5");
		lblNewLabel.setFont(new Font("ÈÞ¸Õ¸ðÀ½T", Font.BOLD, 18));
		lblNewLabel.setBounds(131, 394, 47, 27);
		add(lblNewLabel);
		
		JLabel label = new JLabel("\uACB0\uD22C\uC7A5");
		label.setFont(new Font("ÈÞ¸Õ¸ðÀ½T", Font.BOLD, 18));
		label.setBounds(192, 183, 99, 27);
		add(label);
		
		JLabel label_1 = new JLabel("\uD6C8\uB828\uC18C");
		label_1.setFont(new Font("ÈÞ¸Õ¸ðÀ½T", Font.BOLD, 18));
		label_1.setBounds(591, 183, 99, 27);
		add(label_1);
		
		JLabel label_2 = new JLabel("\uC778\uB825\uC18C");
		label_2.setFont(new Font("ÈÞ¸Õ¸ðÀ½T", Font.BOLD, 18));
		label_2.setBounds(633, 394, 99, 27);
		add(label_2);
		
		JLabel label_3 = new JLabel("\uC2DC\uC7A5");
		label_3.setFont(new Font("ÈÞ¸Õ¸ðÀ½T", Font.BOLD, 18));
		label_3.setBounds(364, 254, 99, 27);
		add(label_3);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("¹Ù´Ú.jpg"));
		lblNewLabel_1.setBounds(0, 0, 512, 480);
		add(lblNewLabel_1);
		
		JLabel label_4 = new JLabel("");
		label_4.setIcon(new ImageIcon("¹Ù´Ú.jpg"));
		label_4.setBounds(512, 0, 512, 480);
		add(label_4);
		
		
		//////////////////////////////////////////////////////////////////////
		
		

		

	
	
	
}
}