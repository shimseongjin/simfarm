package View;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import Character.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AlbaFrame extends JFrame {
	Cow cow;
	private JPanel contentPane;
	JPanel albasellect;
	public AlbaFrame(Main main) {

		ImageIcon icon1 = new ImageIcon("base/밭 갈기.png");
		Image img1 = icon1.getImage();
		
		ImageIcon icon2 = new ImageIcon("base/지하 투기장.png");
		Image img2 = icon2.getImage();
		
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 657, 416);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Random random = new Random();
		JPanel albasellect = new JPanel();
		albasellect.setBounds(0, 1, 640, 376);
		contentPane.add(albasellect);
			albasellect.setLayout(null);
		
			
			JPanel panel_1 = new JPanel(){
				public void paintComponent(Graphics g){//배경 화면을 출력하기 위한 것
				super.paintComponent(g);	
				g.drawImage(img1,0, 0, 165, 150, 0, 0, 487, 426, null);
				}
			};
			panel_1.setBounds(90, 33, 165, 150);
			albasellect.add(panel_1);
			
			JLabel lblNewLabelk = new JLabel("\uBC2D \uAC08\uAE30");
			lblNewLabelk.setFont(new Font("휴먼모음T", Font.PLAIN, 20));
			lblNewLabelk.setBounds(146, 205, 59, 24);
			albasellect.add(lblNewLabelk);
			
			JLabel labelk = new JLabel("\uC9C0\uD558 \uD22C\uAE30\uC7A5");
			labelk.setFont(new Font("휴먼모음T", Font.PLAIN, 20));
			labelk.setBounds(431, 205, 91, 24);
			albasellect.add(labelk);
			
			JButton btnNewButtonk = new JButton("\uC120\uD0DD");
			btnNewButtonk.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {
					cow.strength -= 10;
					main.me.MakeMoney((cow.power*50+cow.quick*50));
					JOptionPane.showMessageDialog(null, "열심히 노동하여 "+ (cow.power*50+cow.quick*50)+"원을 벌었습니다.");
					dispose();
				}
			});
			btnNewButtonk.setBounds(132, 299, 73, 23);
			albasellect.add(btnNewButtonk);
			
			JButton buttonk = new JButton("\uC120\uD0DD");
			buttonk.setBounds(431, 299, 76, 23);
			albasellect.add(buttonk);
			
			JLabel label_1k = new JLabel("\uCCB4\uB825 10\uC18C\uBAA8");
			label_1k.setBounds(100, 239, 155, 15);
			albasellect.add(label_1k);
			
			JLabel label_2k = new JLabel("\uD655\uB960 100%");
			label_2k.setBounds(100, 255, 135, 15);
			albasellect.add(label_2k);
			
			JLabel label_3k = new JLabel("\uD798, \uBBFC\uCCA9 \uBE44\uB840 \uC218\uC785");
			label_3k.setBounds(100, 274, 135, 15);
			albasellect.add(label_3k);
			
			JLabel label_4k = new JLabel("\uCCB4\uB825 10\uC18C\uBAA8");
			label_4k.setBounds(406, 239, 142, 15);
			albasellect.add(label_4k);
			
			JLabel label_5k = new JLabel("\uD655\uB960 30%   -  \uD55C\uBC88\uC5D0 \uB9CE\uC740 \uB3C8\uC744 \uBC94");
			label_5k.setBounds(406, 255, 223, 15);
			albasellect.add(label_5k);
			
			JLabel label_6k = new JLabel("\uD798, \uBBFC\uCCA9 \uBE44\uB840 \uC218\uC785");
			label_6k.setBounds(406, 274, 142, 15);
			albasellect.add(label_6k);
			
			JPanel panel = new JPanel(){
				public void paintComponent(Graphics g){//배경 화면을 출력하기 위한 것
				super.paintComponent(g);	
				g.drawImage(img2,0, 0, 165, 150, 0, 0, 508, 407, null);
				}
			};
			panel.setBounds(383, 33, 165, 150);
			albasellect.add(panel);
			
			buttonk.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {
					cow.strength -= 10;
					int i = random.nextInt(10);
					if(i < 7) // 짐
						JOptionPane.showMessageDialog(null, "싸움에 져 돈을 벌지 못했습니다.");
					else{
						main.me.MakeMoney((cow.power*50+cow.quick*50)*4);
						JOptionPane.showMessageDialog(null, "싸움에 이겨 \n"+(cow.power*50+cow.quick*50)*4+"원을 벌었습니다.");}
					dispose();
				}
			});
			albasellect.setBackground(Color.WHITE);
			albasellect.setVisible(false);
			
			
			
			
			

			
			
			
			
			
			
			
			JPanel cowsellect = new JPanel();
			cowsellect.setBounds(0, 0, 641, 377);
			contentPane.add(cowsellect);
			
			JPanel cowim1 = new JPanel(){
				public void paintComponent(Graphics g){
					if(main.farm.cowpanel[0].cow.DoB() == true)
						g.drawImage(main.farm.cowpanel[0].cow.CowImg[1], 0,0, null);
					else
						g.drawImage(main.farm.cowpanel[0].cow.DeadImage(), 0,0, null);
				}
			};
			cowim1.setBounds(54, 38, 94, 94);
			cowim1.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent arg0) {
					if(main.farm.cowpanel[0].cow.DoB() != false)
						new CowState(main.farm.cowpanel[0].cow);
				}
			});
			cowsellect.setLayout(null);
			cowsellect.add(cowim1);
			
			JPanel cowim2 = new JPanel(){
				public void paintComponent(Graphics g){
					if(main.farm.cowpanel[1].cow.DoB() == true)
						g.drawImage(main.farm.cowpanel[1].cow.CowImg[1], 0,0, null);
					else
						g.drawImage(main.farm.cowpanel[1].cow.DeadImage(), 0,0, null);
				}
			};
			cowim2.setBounds(282, 38, 94, 94);
			cowim2.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent arg0) {
					if(main.farm.cowpanel[1].cow.DoB() != false)
						new CowState(main.farm.cowpanel[1].cow);
				}
			});
			cowsellect.add(cowim2);
			
			JPanel cowim3 = new JPanel(){
				public void paintComponent(Graphics g){
					if(main.farm.cowpanel[2].cow.DoB() == true)
						g.drawImage(main.farm.cowpanel[2].cow.CowImg[1], 0,0, null);
					else
						g.drawImage(main.farm.cowpanel[2].cow.DeadImage(), 0,0, null);
				}
			};
			cowim3.setBounds(496, 38, 94, 94);
			cowim3.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent arg0) {
					if(main.farm.cowpanel[2].cow.DoB() != false)
						new CowState(main.farm.cowpanel[2].cow);
				}
			});
			cowsellect.add(cowim3);
			
			JPanel cowim4 = new JPanel(){
				public void paintComponent(Graphics g){
					if(main.farm.cowpanel[3].cow.DoB() == true)
						g.drawImage(main.farm.cowpanel[3].cow.CowImg[1], 0,0, null);
					else
						g.drawImage(main.farm.cowpanel[3].cow.DeadImage(), 0,0, null);
				}
			};
			cowim4.setBounds(54, 201, 94, 94);
			cowim4.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent arg0) {
					if(main.farm.cowpanel[3].cow.DoB() != false)
						new CowState(main.farm.cowpanel[3].cow);
				}
			});
			cowsellect.add(cowim4);
			
			JPanel cowim5 = new JPanel(){
				public void paintComponent(Graphics g){
					if(main.farm.cowpanel[4].cow.DoB() == true)
						g.drawImage(main.farm.cowpanel[4].cow.CowImg[1], 0,0, null);
					else
						g.drawImage(main.farm.cowpanel[4].cow.DeadImage(), 0,0, null);
				}
			};
			cowim5.setBounds(282, 201, 94, 94);
			cowim5.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent arg0) {
					if(main.farm.cowpanel[4].cow.DoB() != false)
						new CowState(main.farm.cowpanel[4].cow);
				}
			});
			cowsellect.add(cowim5);
			
			JPanel cowim6 = new JPanel(){
				public void paintComponent(Graphics g){
					if(main.farm.cowpanel[5].cow.DoB() == true)
						g.drawImage(main.farm.cowpanel[5].cow.CowImg[1], 0,0, null);
					else
						g.drawImage(main.farm.cowpanel[5].cow.DeadImage(), 0,0, null);
				}
			};
			cowim6.setBounds(496, 201, 94, 94);
			cowim6.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent arg0) {
					if(main.farm.cowpanel[5].cow.DoB() != false)
						new CowState(main.farm.cowpanel[5].cow);
				}
			});
			cowsellect.add(cowim6);
			
			JLabel lblNewLabel = new JLabel("/ 100");
			lblNewLabel.setBounds(103, 145, 57, 15);
			cowsellect.add(lblNewLabel);
			
			JLabel label = new JLabel("/ 100");
			label.setBounds(334, 142, 57, 15);
			cowsellect.add(label);
			
			JLabel label_1 = new JLabel("/ 100");
			label_1.setBounds(547, 142, 57, 15);
			cowsellect.add(label_1);
			
			JLabel label_2 = new JLabel("/ 100");
			label_2.setBounds(103, 305, 57, 15);
			cowsellect.add(label_2);
			
			JLabel label_3 = new JLabel("/ 100");
			label_3.setBounds(334, 305, 57, 15);
			cowsellect.add(label_3);
			
			JLabel label_4 = new JLabel("/ 100");
			label_4.setBounds(547, 305, 57, 15);
			cowsellect.add(label_4);
			
			JLabel cow1 = new JLabel("");
			if(main.farm.cowpanel[0].cow.DoB() != false)
				cow1.setText(main.farm.cowpanel[0].cow.strength+"");
			else
				cow1.setText("0");
			
			cow1.setBounds(63, 145, 57, 15);
			cowsellect.add(cow1);
			
			JLabel cow2 = new JLabel("");
			if(main.farm.cowpanel[1].cow.DoB() != false)
				cow2.setText(main.farm.cowpanel[1].cow.strength+"");
			else
				cow2.setText("0");
			cow2.setBounds(294, 142, 57, 15);
			cowsellect.add(cow2);
			
			JLabel cow3 = new JLabel("");
			if(main.farm.cowpanel[2].cow.DoB() != false)
				cow3.setText(main.farm.cowpanel[2].cow.strength+"");
			else
				cow3.setText("0");
			cow3.setBounds(509, 142, 57, 15);
			cowsellect.add(cow3);
			
			JLabel cow4 = new JLabel("");
			if(main.farm.cowpanel[3].cow.DoB() != false)
				cow4.setText(main.farm.cowpanel[3].cow.strength+"");
			else
				cow4.setText("0");
			cow4.setBounds(63, 305, 57, 15);
			cowsellect.add(cow4);
			
			JLabel cow5 = new JLabel("");
			if(main.farm.cowpanel[4].cow.DoB() != false)
				cow5.setText(main.farm.cowpanel[4].cow.strength+"");
			else
				cow5.setText("0");
			cow5.setBounds(294, 305, 57, 15);
			cowsellect.add(cow5);
			
			JLabel cow6 = new JLabel("");
			if(main.farm.cowpanel[5].cow.DoB() != false)
				cow6.setText(main.farm.cowpanel[5].cow.strength+"");
			else
				cow6.setText("0");
			cow6.setBounds(509, 305, 57, 15);
			cowsellect.add(cow6);
			
			JButton btnNewButton = new JButton("\uC120\uD0DD");
			btnNewButton.setBounds(51, 168, 97, 23);
			btnNewButton.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {
					if(main.farm.cowpanel[0].cow.DoB()!=false){
					if(main.farm.cowpanel[0].cow.strength<10)
						JOptionPane.showMessageDialog(null, "체력이 모자랍니다."); 
					else{
						cow = main.farm.cowpanel[0].cow;
						cowsellect.setVisible(false);
						albasellect.setVisible(true);
						}
					}
				}
			});
			if(main.farm.cowpanel[0].cow.DoB()==false){btnNewButton.enable(false);}
			cowsellect.add(btnNewButton);

			
			JButton button = new JButton("\uC120\uD0DD");
			button.setBounds(282, 167, 97, 23);
			button.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {
					if(main.farm.cowpanel[1].cow.DoB()!=false){
					if(main.farm.cowpanel[1].cow.strength<10)
						JOptionPane.showMessageDialog(null, "체력이 모자랍니다."); 
					else{
						cow = main.farm.cowpanel[1].cow;
						cowsellect.setVisible(false);
						albasellect.setVisible(true);
					}
				}
				}
			});
			if(main.farm.cowpanel[1].cow.DoB()==false){button.enable(false);}
			cowsellect.add(button);
			
			JButton button_1 = new JButton("\uC120\uD0DD");
			button_1.setBounds(493, 167, 97, 23);
			button_1.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {
					if(main.farm.cowpanel[2].cow.DoB()!=false){
					if(main.farm.cowpanel[2].cow.strength<10)
						JOptionPane.showMessageDialog(null, "체력이 모자랍니다."); 
					else{
						cow = main.farm.cowpanel[2].cow;
						cowsellect.setVisible(false);
						albasellect.setVisible(true);
					}
				}
				}
			});
			if(main.farm.cowpanel[2].cow.DoB()==false){button_1.enable(false);}
			cowsellect.add(button_1);
			
			JButton button_2 = new JButton("\uC120\uD0DD");
			button_2.setBounds(54, 322, 97, 23);
			button_2.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {
					if(main.farm.cowpanel[3].cow.DoB()!=false){
					if(main.farm.cowpanel[3].cow.strength<10)
						JOptionPane.showMessageDialog(null, "체력이 모자랍니다."); 
					else{
						cow = main.farm.cowpanel[3].cow;
						cowsellect.setVisible(false);
						albasellect.setVisible(true);
					}
				}
				}
			});
			if(main.farm.cowpanel[3].cow.DoB()==false){button_2.enable(false);}
			cowsellect.add(button_2);
			
			JButton button_3 = new JButton("\uC120\uD0DD");
			button_3.setBounds(279, 322, 97, 23);
			button_3.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {
					if(main.farm.cowpanel[4].cow.DoB()!=false){
					if(main.farm.cowpanel[4].cow.strength<10)
						JOptionPane.showMessageDialog(null, "체력이 모자랍니다."); 
					else{
						cow = main.farm.cowpanel[4].cow;
						cowsellect.setVisible(false);
						albasellect.setVisible(true);
					}
				}
				}
			});
			if(main.farm.cowpanel[4].cow.DoB()==false){button_3.enable(false);}
			cowsellect.add(button_3);
			
			JButton button_4 = new JButton("\uC120\uD0DD");
			button_4.setBounds(493, 322, 97, 23);
			button_4.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {
					if(main.farm.cowpanel[5].cow.DoB()!=false){
					if(main.farm.cowpanel[5].cow.strength<10)
						JOptionPane.showMessageDialog(null, "체력이 모자랍니다."); 
					else{
						cow = main.farm.cowpanel[5].cow;
						cowsellect.setVisible(false);
						albasellect.setVisible(true);
					}
				}
				}
			});
			if(main.farm.cowpanel[5].cow.DoB()==false){button_4.enable(false);}
			cowsellect.add(button_4);
			cowsellect.setBackground(Color.WHITE);
			
			
			

		
		
		
		
		setVisible(true);

	}
}
