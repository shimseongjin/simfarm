package View;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Character.Cow;
import Character.CowState;

public class Tranning extends JFrame {

	Cow cow;
	private JPanel contentPane;
	JPanel albasellect;
	public Tranning(Main main) {

		ImageIcon icon1 = new ImageIcon("base/근력.png");
		Image img1 = icon1.getImage();
		
		ImageIcon icon2 = new ImageIcon("base/민첩.png");
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
				g.drawImage(img1,0, 0, 165, 150, 0, 0, 225, 225, null);
				}
			};
			panel_1.setBounds(90, 33, 165, 150);
			albasellect.add(panel_1);
			
			JLabel lblNewLabelk = new JLabel("\uADFC\uB825 \uC6B4\uB3D9");
			lblNewLabelk.setFont(new Font("휴먼모음T", Font.PLAIN, 20));
			lblNewLabelk.setBounds(132, 205, 91, 24);
			albasellect.add(lblNewLabelk);
			
			JLabel labelk = new JLabel("\uBBFC\uCCA9 \uC6B4\uB3D9");
			labelk.setFont(new Font("휴먼모음T", Font.PLAIN, 20));
			labelk.setBounds(431, 205, 91, 24);
			albasellect.add(labelk);
			
			JButton btnNewButtonk = new JButton("\uC120\uD0DD");
			btnNewButtonk.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {
					if(cow.power < 100)	{
						if(main.me.Money<10000){
							JOptionPane.showMessageDialog(null, "돈이 모자랍니다.");
						}
						else{
							main.me.UseMoney(10000);
							cow.power += cow.kind;
							cow.strength -= 5;
							JOptionPane.showMessageDialog(null, "근력이 증가 했습니다.");
						}
					}
					else if(cow.power < 200){
						if(main.me.Money<30000){
							JOptionPane.showMessageDialog(null, "돈이 모자랍니다.");
						}
						else{
							main.me.UseMoney(30000);
							cow.power += cow.kind;
							cow.strength -= 5;
							JOptionPane.showMessageDialog(null, "근력이 증가 했습니다.");
						}
					}
					else if(cow.power < 300) {
						if(main.me.Money<50000){
							JOptionPane.showMessageDialog(null, "돈이 모자랍니다.");
						}
						else{
							main.me.UseMoney(50000);
							cow.power += cow.kind;
							cow.strength -= 5;
							JOptionPane.showMessageDialog(null, "근력이 증가 했습니다.");
						}
					}
					else if(cow.power < 400){
						if(main.me.Money<70000){
							JOptionPane.showMessageDialog(null, "돈이 모자랍니다.");
						}
						else{
							main.me.UseMoney(70000);
							cow.power += cow.kind;
							cow.strength -= 5;
							JOptionPane.showMessageDialog(null, "근력이 증가 했습니다.");
						}
					}
					else if(cow.power < 500) {
						if(main.me.Money<80000){
							JOptionPane.showMessageDialog(null, "돈이 모자랍니다.");
						}
						else{
							main.me.UseMoney(80000);
							cow.power += cow.kind;
							cow.strength -= 5;
							JOptionPane.showMessageDialog(null, "근력이 증가 했습니다.");
						}
					}
					else {
						if(main.me.Money<100000){
							JOptionPane.showMessageDialog(null, "돈이 모자랍니다.");
						}
						else{
							main.me.UseMoney(100000);
							cow.power += cow.kind;
							cow.strength -= 5;
							JOptionPane.showMessageDialog(null, "근력이 증가 했습니다.");
						}
					}
					dispose();
				}
			});
			btnNewButtonk.setBounds(132, 299, 73, 23);
			albasellect.add(btnNewButtonk);
			
			JButton buttonk = new JButton("\uC120\uD0DD");
			buttonk.setBounds(431, 299, 76, 23);
			albasellect.add(buttonk);
			
			JLabel label_1k = new JLabel("");
			label_1k.setBounds(100, 239, 155, 15);
			albasellect.add(label_1k);
			
			JLabel label_2k = new JLabel("");
			label_2k.setBounds(100, 255, 135, 15);
			albasellect.add(label_2k);
			
			JLabel label_3k = new JLabel("");
			label_3k.setBounds(100, 274, 135, 15);
			albasellect.add(label_3k);
			
			JLabel label_4k = new JLabel("");
			label_4k.setBounds(406, 239, 142, 15);
			albasellect.add(label_4k);
			
			JLabel label_5k = new JLabel("");
			label_5k.setBounds(406, 255, 223, 15);
			albasellect.add(label_5k);
			
			JLabel label_6k = new JLabel("");
			label_6k.setBounds(406, 274, 142, 15);
			albasellect.add(label_6k);
			
			JPanel panel = new JPanel(){
				public void paintComponent(Graphics g){//배경 화면을 출력하기 위한 것
				super.paintComponent(g);	
				g.drawImage(img2,0, 0, 165, 150, 0, 0, 225, 225, null);
				}
			};
			panel.setBounds(383, 33, 165, 150);
			albasellect.add(panel);
			
			buttonk.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {
					if(cow.quick < 100)	{
						if(main.me.Money<10000){
							JOptionPane.showMessageDialog(null, "돈이 모자랍니다.");
						}
						else{
							main.me.UseMoney(10000);
							cow.quick += cow.kind;
							cow.strength -= 5;
							JOptionPane.showMessageDialog(null, "민첩이 증가 했습니다.");
						}
					}
					else if(cow.quick < 200){
						if(main.me.Money<30000){
							JOptionPane.showMessageDialog(null, "돈이 모자랍니다.");
						}
						else{
							main.me.UseMoney(30000);
							cow.quick += cow.kind;
							cow.strength -= 5;
							JOptionPane.showMessageDialog(null, "민첩이 증가 했습니다.");
						}
					}
					else if(cow.quick < 300) {
						if(main.me.Money<50000){
							JOptionPane.showMessageDialog(null, "돈이 모자랍니다.");
						}
						else{
							main.me.UseMoney(50000);
							cow.quick += cow.kind;
							cow.strength -= 5;
							JOptionPane.showMessageDialog(null, "민첩이 증가 했습니다.");
						}
					}
					else if(cow.quick < 400){
						if(main.me.Money<70000){
							JOptionPane.showMessageDialog(null, "돈이 모자랍니다.");
						}
						else{
							main.me.UseMoney(70000);
							cow.quick += cow.kind;
							cow.strength -= 5;
							JOptionPane.showMessageDialog(null, "민첩이 증가 했습니다.");
						}
					}
					else if(cow.quick < 500) {
						if(main.me.Money<80000){
							JOptionPane.showMessageDialog(null, "돈이 모자랍니다.");
						}
						else{
							main.me.UseMoney(80000);
							cow.quick += cow.kind;
							cow.strength -= 5;
							JOptionPane.showMessageDialog(null, "민첩이 증가 했습니다.");
						}
					}
					else {
						if(main.me.Money<100000){
							JOptionPane.showMessageDialog(null, "돈이 모자랍니다.");
						}
						else{
							main.me.UseMoney(100000);
							cow.quick += cow.kind;
							cow.strength -= 5;
							JOptionPane.showMessageDialog(null, "민첩이 증가 했습니다.");
						}
					}
					dispose();
				}
			});
			albasellect.setVisible(false);
			albasellect.setBackground(Color.WHITE);
			
			
			
			
			

			
			
			
			
			
			
			
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
					if(main.farm.cowpanel[0].cow.strength<5)
						JOptionPane.showMessageDialog(null, "체력이 모자랍니다."); 
					else{
						cow = main.farm.cowpanel[0].cow;
						cowsellect.setVisible(false);
						albasellect.setVisible(true);
						label_1k.setText("힘 "+cow.kind+"증가");
						if(cow.power < 100)	label_2k.setText("10000원 소비");
						else if(cow.power < 200) label_2k.setText("30000원 소비");
						else if(cow.power < 300) label_2k.setText("50000원 소비");
						else if(cow.power < 400) label_2k.setText("70000원 소비");
						else if(cow.power < 500) label_2k.setText("80000원 소비");
						else label_2k.setText("100000원 소비");
						
						label_4k.setText("민첩 "+cow.kind+"증가");
						if(cow.power < 100)	label_5k.setText("10000원 소비");
						else if(cow.power < 200) label_5k.setText("30000원 소비");
						else if(cow.power < 300) label_5k.setText("50000원 소비");
						else if(cow.power < 400) label_5k.setText("70000원 소비");
						else if(cow.power < 500) label_5k.setText("80000원 소비");
						else label_2k.setText("100000원 소비");
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
					if(main.farm.cowpanel[1].cow.strength<5)
						JOptionPane.showMessageDialog(null, "체력이 모자랍니다."); 
					else{
						cow = main.farm.cowpanel[1].cow;
						cowsellect.setVisible(false);
						albasellect.setVisible(true);
						label_1k.setText("힘 "+cow.kind+"증가");
						if(cow.power < 100)	label_2k.setText("10000원 소비");
						else if(cow.power < 200) label_2k.setText("30000원 소비");
						else if(cow.power < 300) label_2k.setText("50000원 소비");
						else if(cow.power < 400) label_2k.setText("70000원 소비");
						else if(cow.power < 500) label_2k.setText("80000원 소비");
						else label_2k.setText("100000원 소비");
						
						label_4k.setText("민첩 "+cow.kind+"증가");
						if(cow.power < 100)	label_5k.setText("10000원 소비");
						else if(cow.power < 200) label_5k.setText("30000원 소비");
						else if(cow.power < 300) label_5k.setText("50000원 소비");
						else if(cow.power < 400) label_5k.setText("70000원 소비");
						else if(cow.power < 500) label_5k.setText("80000원 소비");
						else label_2k.setText("100000원 소비");
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
					if(main.farm.cowpanel[2].cow.strength<5)
						JOptionPane.showMessageDialog(null, "체력이 모자랍니다."); 
					else{
						cow = main.farm.cowpanel[2].cow;
						cowsellect.setVisible(false);
						albasellect.setVisible(true);
						label_1k.setText("힘 "+cow.kind+"증가");
						if(cow.power < 100)	label_2k.setText("10000원 소비");
						else if(cow.power < 200) label_2k.setText("30000원 소비");
						else if(cow.power < 300) label_2k.setText("50000원 소비");
						else if(cow.power < 400) label_2k.setText("70000원 소비");
						else if(cow.power < 500) label_2k.setText("80000원 소비");
						else label_2k.setText("100000원 소비");
						
						label_4k.setText("민첩 "+cow.kind+"증가");
						if(cow.power < 100)	label_5k.setText("10000원 소비");
						else if(cow.power < 200) label_5k.setText("30000원 소비");
						else if(cow.power < 300) label_5k.setText("50000원 소비");
						else if(cow.power < 400) label_5k.setText("70000원 소비");
						else if(cow.power < 500) label_5k.setText("80000원 소비");
						else label_2k.setText("100000원 소비");
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
					if(main.farm.cowpanel[3].cow.strength<5)
						JOptionPane.showMessageDialog(null, "체력이 모자랍니다."); 
					else{
						cow = main.farm.cowpanel[3].cow;
						cowsellect.setVisible(false);
						albasellect.setVisible(true);
						label_1k.setText("힘 "+cow.kind+"증가");
						if(cow.power < 100)	label_2k.setText("10000원 소비");
						else if(cow.power < 200) label_2k.setText("30000원 소비");
						else if(cow.power < 300) label_2k.setText("50000원 소비");
						else if(cow.power < 400) label_2k.setText("70000원 소비");
						else if(cow.power < 500) label_2k.setText("80000원 소비");
						else label_2k.setText("100000원 소비");
						
						label_4k.setText("민첩 "+cow.kind+"증가");
						if(cow.power < 100)	label_5k.setText("10000원 소비");
						else if(cow.power < 200) label_5k.setText("30000원 소비");
						else if(cow.power < 300) label_5k.setText("50000원 소비");
						else if(cow.power < 400) label_5k.setText("70000원 소비");
						else if(cow.power < 500) label_5k.setText("80000원 소비");
						else label_2k.setText("100000원 소비");
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
					if(main.farm.cowpanel[4].cow.strength<5)
						JOptionPane.showMessageDialog(null, "체력이 모자랍니다."); 
					else{
						cow = main.farm.cowpanel[4].cow;
						cowsellect.setVisible(false);
						albasellect.setVisible(true);
						label_1k.setText("힘 "+cow.kind+"증가");
						if(cow.power < 100)	label_2k.setText("10000원 소비");
						else if(cow.power < 200) label_2k.setText("30000원 소비");
						else if(cow.power < 300) label_2k.setText("50000원 소비");
						else if(cow.power < 400) label_2k.setText("70000원 소비");
						else if(cow.power < 500) label_2k.setText("80000원 소비");
						else label_2k.setText("100000원 소비");
						
						label_4k.setText("민첩 "+cow.kind+"증가");
						if(cow.power < 100)	label_5k.setText("10000원 소비");
						else if(cow.power < 200) label_5k.setText("30000원 소비");
						else if(cow.power < 300) label_5k.setText("50000원 소비");
						else if(cow.power < 400) label_5k.setText("70000원 소비");
						else if(cow.power < 500) label_5k.setText("80000원 소비");
						else label_2k.setText("100000원 소비");
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
					if(main.farm.cowpanel[5].cow.strength<5)
						JOptionPane.showMessageDialog(null, "체력이 모자랍니다."); 
					else{
						cow = main.farm.cowpanel[5].cow;
						cowsellect.setVisible(false);
						albasellect.setVisible(true);
						label_1k.setText("힘 "+cow.kind+"증가");
						if(cow.power < 100)	label_2k.setText("10000원 소비");
						else if(cow.power < 200) label_2k.setText("30000원 소비");
						else if(cow.power < 300) label_2k.setText("50000원 소비");
						else if(cow.power < 400) label_2k.setText("70000원 소비");
						else if(cow.power < 500) label_2k.setText("80000원 소비");
						else label_2k.setText("100000원 소비");
						
						label_4k.setText("민첩 "+cow.kind+"증가");
						if(cow.power < 100)	label_5k.setText("10000원 소비");
						else if(cow.power < 200) label_5k.setText("30000원 소비");
						else if(cow.power < 300) label_5k.setText("50000원 소비");
						else if(cow.power < 400) label_5k.setText("70000원 소비");
						else if(cow.power < 500) label_5k.setText("80000원 소비");
						else label_5k.setText("100000원 소비");
					}
				}
				}
			});
			if(main.farm.cowpanel[5].cow.DoB()==false){button_4.enable(false);}
			cowsellect.setBackground(Color.WHITE);
			cowsellect.add(button_4);
			
			
			

		
		
		
		
		setVisible(true);

	}
}
