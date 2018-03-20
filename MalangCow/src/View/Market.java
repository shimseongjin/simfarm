package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Market extends JFrame {

	private JPanel contentPane;

	public Market(Main main) {

		setBounds(100, 100, 755, 274);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		ImageIcon icon1 = new ImageIcon("base/잡초1.png");
		Image img1 = icon1.getImage();
		
		ImageIcon icon2 = new ImageIcon("base/잡초2.png");
		Image img2 = icon2.getImage();
		
		ImageIcon icon3 = new ImageIcon("base/잡초3.png");
		Image img3 = icon3.getImage();
		
		ImageIcon icon4 = new ImageIcon("base/잡초4.png");
		Image img4 = icon3.getImage();
		
		
		
		
		
		JPanel panel = new JPanel(){
			public void paintComponent(Graphics g){
				g.drawImage(img1, 0,0, null);
			}
		};
		panel.setBounds(47, 36, 117, 110);
		contentPane.add(panel);
		
		JPanel panel_1 = new JPanel(){
			public void paintComponent(Graphics g){
				g.drawImage(img2, 0,0, null);
			}
		};
		panel_1.setBounds(230, 36, 117, 110);
		contentPane.add(panel_1);
		
		JPanel panel_2 = new JPanel(){
			public void paintComponent(Graphics g){
				g.drawImage(img3, 0,0, null);
			}
		};
		panel_2.setBounds(409, 36, 117, 110);
		contentPane.add(panel_2);
		
		JPanel panel_3 = new JPanel(){
			public void paintComponent(Graphics g){
				g.drawImage(img4, 0,0, null);
			}
		};
		
		panel_3.setBounds(590, 36, 117, 110);
		contentPane.add(panel_3);
		
		JButton button = new JButton("\uAD6C\uB9E4\uC644\uB8CC");
		button.setBounds(56, 185, 97, 23);
		contentPane.add(button);
		
		JButton button_1 = new JButton("\uAD6C\uB9E4");
		button_1.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if(main.me.Jobcho[1] == false)
				{
					if(main.me.Money < 300000){
						  JOptionPane.showMessageDialog(null, "돈이 모자랍니다.");
						}
					else{
						 main.me.UseMoney(300000);
						 main.me.Jobcho[1] = true;
						 button_1.enable(false);
						 button_1.setText("구매완료");
					}
						
				}
			}
		});
		if(main.me.Jobcho[1] == true){
			 button_1.enable(false);
			 button_1.setText("구매완료");
		}
			
		button_1.setBounds(243, 185, 97, 23);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("\uAD6C\uB9E4");
		button_2.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if(main.me.Jobcho[2] == false)
				{
					if(main.me.Money < 500000){
						  JOptionPane.showMessageDialog(null, "돈이 모자랍니다.");
						}
					else{
						 main.me.UseMoney(500000);
						 main.me.Jobcho[2] = true;
						 button_2.enable(false);
						 button_2.setText("구매완료");
					}
						
				}
				
			}
		});
		if(main.me.Jobcho[2] == true){
			 button_2.enable(false);
			 button_2.setText("구매완료");
		}
		button_2.setBounds(420, 185, 97, 23);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("\uAD6C\uB9E4");
		button_3.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if(main.me.Jobcho[3] == false)
				{
					if(main.me.Money < 700000){
						  JOptionPane.showMessageDialog(null, "돈이 모자랍니다.");
						}
					else{
						 main.me.UseMoney(700000);
						 main.me.Jobcho[3] = true;
						 button_3.enable(false);
						 button_3.setText("구매완료");
					}
						
				}
				
				
			}
		});
		if(main.me.Jobcho[3] == true){
			 button_3.enable(false);
			 button_3.setText("구매완료");
		}
		button_3.setBounds(601, 185, 97, 23);
		contentPane.add(button_3);
		
		JLabel lblNewLabel = new JLabel("\uAE30\uBCF8");
		lblNewLabel.setBounds(96, 169, 57, 15);
		contentPane.add(lblNewLabel);
		
		JLabel label = new JLabel("300000 \uC6D0");
		label.setBounds(267, 169, 74, 15);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("500000 \uC6D0");
		label_1.setBounds(443, 173, 74, 15);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("700000 \uC6D0");
		label_2.setBounds(624, 173, 74, 15);
		contentPane.add(label_2);
		
		JLabel lblNewLabel_1 = new JLabel("5\uCD08 \uB2F9 \uCCB4\uB825 1\uC0C1\uC2B9");
		lblNewLabel_1.setBounds(57, 156, 103, 15);
		contentPane.add(lblNewLabel_1);
		
		JLabel label_3 = new JLabel("5\uCD08 \uB2F9 \uCCB4\uB825 2\uC0C1\uC2B9");
		label_3.setBounds(240, 156, 103, 15);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("5\uCD08 \uB2F9 \uCCB4\uB825 3\uC0C1\uC2B9");
		label_4.setBounds(419, 156, 103, 15);
		contentPane.add(label_4);
		
		JLabel label_5 = new JLabel("5\uCD08 \uB2F9 \uCCB4\uB825 4\uC0C1\uC2B9");
		label_5.setBounds(600, 156, 103, 15);
		contentPane.add(label_5);
		
		setVisible(true);
	}
}
