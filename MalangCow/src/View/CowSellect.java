package View;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Character.Cow;
import Character.CowState;

public class CowSellect extends JFrame {

	private JPanel contentPane;
	
	public CowSellect(Main main) {
		setBounds(100, 100, 670, 406);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		
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
		
		JButton btnNewButton = new JButton("\uC120\uD0DD");
		btnNewButton.setBounds(51, 168, 97, 23);
		btnNewButton.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if(main.farm.cowpanel[0].cow.DoB()!=false){
					fight Frame = new fight(main, main.farm.cowpanel[0].cow);
					dispose();
			}
		}});
		if(main.farm.cowpanel[0].cow.DoB()==false){btnNewButton.enable(false); btnNewButton.setText("선택불가");}
		cowsellect.add(btnNewButton);

		
		JButton button = new JButton("\uC120\uD0DD");
		button.setBounds(282, 167, 97, 23);
		button.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if(main.farm.cowpanel[1].cow.DoB()!=false){
					fight Frame = new fight(main, main.farm.cowpanel[1].cow);
					dispose();
			}
			}
		});
		if(main.farm.cowpanel[1].cow.DoB()==false){button.enable(false); button.setText("선택불가");}
		cowsellect.add(button);
		
		JButton button_1 = new JButton("\uC120\uD0DD");
		button_1.setBounds(493, 167, 97, 23);
		button_1.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if(main.farm.cowpanel[2].cow.DoB()!=false){
					fight Frame = new fight(main, main.farm.cowpanel[2].cow);
					dispose();
			}
			}
		});
		if(main.farm.cowpanel[2].cow.DoB()==false){button_1.enable(false); button_1.setText("선택불가");}
		cowsellect.add(button_1);
		
		JButton button_2 = new JButton("\uC120\uD0DD");
		button_2.setBounds(54, 322, 97, 23);
		button_2.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if(main.farm.cowpanel[3].cow.DoB()!=false){
					fight Frame = new fight(main, main.farm.cowpanel[3].cow);
					dispose();
			}
			}
		});
		if(main.farm.cowpanel[3].cow.DoB()==false){button_2.enable(false); button_2.setText("선택불가");}
		cowsellect.add(button_2);
		
		JButton button_3 = new JButton("\uC120\uD0DD");
		button_3.setBounds(279, 322, 97, 23);
		button_3.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if(main.farm.cowpanel[4].cow.DoB()!=false){
					fight Frame = new fight(main, main.farm.cowpanel[4].cow);
					dispose();
			}
			}
		});
		if(main.farm.cowpanel[4].cow.DoB()==false){button_3.enable(false); button_3.setText("선택불가");}
		cowsellect.add(button_3);
		
		JButton button_4 = new JButton("\uC120\uD0DD");
		button_4.setBounds(493, 322, 97, 23);
		button_4.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if(main.farm.cowpanel[5].cow.DoB()!=false){
					fight Frame = new fight(main, main.farm.cowpanel[5].cow);
					dispose();
			}
			}
		});
		if(main.farm.cowpanel[5].cow.DoB()==false){button_4.enable(false); button_4.setText("선택불가");}
		cowsellect.add(button_4);
		
		cowsellect.setBackground(Color.WHITE);
		setVisible(true);
	}

}
