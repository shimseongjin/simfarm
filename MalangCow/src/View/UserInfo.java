package View;

import javax.swing.JPanel;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class UserInfo extends JPanel {
	JLabel label_5;
	JLabel label_3;

	public UserInfo(Main main) {
		setForeground(Color.WHITE);
		setLayout(null);
		Thread thread;
		
		JPanel close = new JPanel(){
			ImageIcon icon = new ImageIcon("base/close.png");
			Image img = icon.getImage();			
			public void paintComponent(Graphics g){
				g.drawImage(img, 0, 0, 50, 50, this);
			}
		};
		close.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent arg0) {
				setVisible(false);
			}
		});
		close.setBounds(447, 3, 50, 50);
		add(close);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(0, 0, 3, 350);
		lblNewLabel.setOpaque(true);
		lblNewLabel.setBackground(Color.BLACK);
		add(lblNewLabel);
		
		JLabel label = new JLabel("New label");
		label.setOpaque(true);
		label.setBackground(Color.BLACK);
		label.setBounds(497, 0, 3, 350);
		add(label);
		
		JLabel label_1 = new JLabel("New label");
		label_1.setOpaque(true);
		label_1.setBackground(Color.BLACK);
		label_1.setBounds(0, 0, 500, 3);
		add(label_1);
		
		JLabel label_2 = new JLabel("New label");
		label_2.setOpaque(true);
		label_2.setBackground(Color.BLACK);
		label_2.setBounds(0, 347, 500, 3);
		add(label_2);
		
		JLabel money = new JLabel("\uBCF4\uC720 \uD604\uAE08  :");
		money.setFont(new Font("ÈÞ¸Õ¿¾Ã¼", Font.BOLD, 22));
		money.setBounds(15, 26, 147, 44);
		add(money);
		
		label_3 = new JLabel("");
		label_3.setFont(new Font("ÈÞ¸Õ¿¾Ã¼", Font.BOLD, 22));
		label_3.setBounds(165, 26, 283, 44);
		add(label_3);
		
		JLabel label_4 = new JLabel("\uBCF4\uC720 \uC18C  :");
		label_4.setFont(new Font("ÈÞ¸Õ¿¾Ã¼", Font.BOLD, 22));
		label_4.setBounds(15, 80, 147, 44);
		add(label_4);
		

		
		label_5 = new JLabel("");
		label_5.setFont(new Font("ÈÞ¸Õ¿¾Ã¼", Font.BOLD, 22));
		label_5.setBounds(165, 80, 283, 44);
		add(label_5);
		
		JLabel label_6 = new JLabel("\uBC43\uC9C0 \uD604\uD669");
		label_6.setFont(new Font("ÈÞ¸Õ¿¾Ã¼", Font.BOLD, 22));
		label_6.setBounds(15, 134, 147, 44);
		add(label_6);
		
		JPanel panel = new JPanel(){
			ImageIcon icon = new ImageIcon("bat/¹îÁö1.png");
			Image img = icon.getImage();			
			public void paintComponent(Graphics g){
				g.drawImage(img, 0, 0, 62, 62, this);
			}
		};
		panel.setBounds(69, 178, 62, 62);
		add(panel);
		

		
		JPanel panel_1 = new JPanel(){
			ImageIcon icon = new ImageIcon("bat/¹îÁö2.png");
			Image img = icon.getImage();			
			public void paintComponent(Graphics g){
				g.drawImage(img, 0, 0, 62, 62, this);
			}
		};
		panel_1.setBounds(164, 178, 62, 62);
		add(panel_1);
		
		
		
		JPanel panel_2 = new JPanel(){
			ImageIcon icon = new ImageIcon("bat/¹îÁö3.png");
			Image img = icon.getImage();			
			public void paintComponent(Graphics g){
				g.drawImage(img, 0, 0, 62, 62, this);
			}
		};
		panel_2.setBounds(263, 178, 62, 62);
		add(panel_2);
		
		
		JPanel panel_3 = new JPanel(){
			ImageIcon icon = new ImageIcon("bat/¹îÁö4.png");
			Image img = icon.getImage();			
			public void paintComponent(Graphics g){
				g.drawImage(img, 0, 0, 62, 62, this);
			}
		};
		panel_3.setBounds(367, 178, 62, 62);
		add(panel_3);
		

		
		JPanel panel_4 = new JPanel(){
			ImageIcon icon = new ImageIcon("bat/¹îÁö5.png");
			Image img = icon.getImage();			
			public void paintComponent(Graphics g){
				g.drawImage(img, 0, 0, 62, 62, this);
			}
		};
		panel_4.setBounds(367, 261, 62, 62);
		add(panel_4);
		

		
		JPanel panel_5 = new JPanel(){
			ImageIcon icon = new ImageIcon("bat/¹îÁö6.png");
			Image img = icon.getImage();			
			public void paintComponent(Graphics g){
				g.drawImage(img, 0, 0, 62, 62, this);
			}
		};
		panel_5.setBounds(263, 261, 62, 62);
		add(panel_5);
		

		
		
		JPanel panel_6 = new JPanel(){
			ImageIcon icon = new ImageIcon("bat/¹îÁö7.png");
			Image img = icon.getImage();			
			public void paintComponent(Graphics g){
				g.drawImage(img, 0, 0, 62, 62, this);
			}
		};
		panel_6.setBounds(164, 261, 62, 62);
		add(panel_6);

		
		
		JPanel panel_7 = new JPanel(){
			ImageIcon icon = new ImageIcon("bat/¹îÁö8.png");
			Image img = icon.getImage();			
			public void paintComponent(Graphics g){
				g.drawImage(img, 0, 0, 62, 62, this);
			}
		};
		panel_7.setBounds(69, 261, 62, 62);
		add(panel_7);

		
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setOpaque(true);
		lblNewLabel_1.setBackground(Color.WHITE);
		lblNewLabel_1.setBounds(0, 0, 500, 350);
		add(lblNewLabel_1);
		
		
		
		thread = new Thread(new Runnable(){
			@Override
			public void run() {
				while(true){
					// TODO Auto-generated method stub
					try {
						Thread.currentThread().sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					if(main.me.Badge[0] == false){
						panel.setVisible(false);
					}
					else panel.setVisible(true);
					
					if(main.me.Badge[1] == false){
						panel_1.setVisible(false);
					}
					else {panel_1.setVisible(true);}
					
					if(main.me.Badge[2] == false){
						panel_2.setVisible(false);
					}
					else panel_2.setVisible(true);
					
					if(main.me.Badge[3] == false){
						panel_3.setVisible(false);
					}
					else panel_3.setVisible(true);
					
					if(main.me.Badge[4] == false){
						panel_4.setVisible(false);
					}
					else panel_4.setVisible(true);
					
					if(main.me.Badge[5] == false){
						panel_5.setVisible(false);
					}
					else panel_5.setVisible(true);
					
					if(main.me.Badge[6] == false){
						panel_6.setVisible(false);
					}
					else panel_6.setVisible(true);
					
					if(main.me.Badge[7] == false){
						panel_7.setVisible(false);
					}
					else panel_7.setVisible(true);
        
				}	
				
			}
		});
		thread.start();
		

	}
	

	
	void sett(int i, int j){
		label_3.setText(j+"¿ø");
		label_5.setText(i +"¸¶¸®");
	}
}
