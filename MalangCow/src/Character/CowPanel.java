package Character;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import View.Main;



public class CowPanel extends JPanel {
	public Cow cow = new Cow();
	Thread thread;
	
	public CowPanel(Main main){

		
		JPopupMenu LiveMenu = new JPopupMenu();   // 소가 있을때

		
		JMenuItem menuItem = new JMenuItem("Cow 정보");
		menuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new CowState(cow);
			}
		});
		LiveMenu.add(menuItem);
		
		JMenuItem cowsell = new JMenuItem("판매");
		cowsell.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new sellframe(main,cow);
			}
		});
		LiveMenu.add(cowsell);

		
		
		JPopupMenu DeadMenu = new JPopupMenu();
		JMenuItem cowbuy = new JMenuItem("구매");
		cowbuy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new BuyFrame(main, cow);
			}
		});
		DeadMenu.add(cowbuy);
		
		addPopup(this, LiveMenu,DeadMenu);
		
		
		thread = new Thread(new Runnable(){
			@Override
			public void run() {
				while(true){
					// TODO Auto-generated method stub
					try {
						Thread.currentThread().sleep(150);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					if(cow.DoB() != false){ // 패널에 말이 없다면 안움직임
		        		cow.move(); // 있으면 움직인다.
						}	          
				}	
				
			}
		});
		thread.start();
		
		setVisible(true);
		
	}
	
	
	private void addPopup(Component component, final JPopupMenu popup, JPopupMenu popdown) {
		component.addMouseListener(new MouseAdapter() { 
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {			
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				if(cow.DoB() != false)
					popup.show(e.getComponent(), e.getX(), e.getY());
				if(cow.DoB() == false)
					popdown.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
	
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		cow.paint(g);
	}
	
	
	
	class sellframe extends JFrame{
		public sellframe(Main main,Cow cow){
			setSize(206,318);
			getContentPane().setLayout(null);
			setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			
			JPanel imgPanel = new JPanel(){
				public void paintComponent(Graphics g){
					g.drawImage(cow.CowImg[1], 0,0, null);
				}
			};
			imgPanel.setBounds(52, 0, 80, 79);
			getContentPane().add(imgPanel);
			
			JLabel lblNewLabel = new JLabel("품종");
			lblNewLabel.setBounds(12, 89, 57, 15);
			getContentPane().add(lblNewLabel);
			
			JLabel lblNewLabel_1 = new JLabel("체력");
			lblNewLabel_1.setBounds(12, 114, 57, 15);
			getContentPane().add(lblNewLabel_1);
			
			JLabel lblNewLabel_2 = new JLabel("힘");
			lblNewLabel_2.setBounds(12, 139, 57, 15);
			getContentPane().add(lblNewLabel_2);
			
			JLabel lblNewLabel_3 = new JLabel("민첩");
			lblNewLabel_3.setBounds(12, 164, 57, 15);
			getContentPane().add(lblNewLabel_3);
			
			JLabel nameLabel = new JLabel(cow.name(cow.kind));
			nameLabel.setHorizontalAlignment(SwingConstants.TRAILING);
			nameLabel.setBounds(50, 89, 93, 15);
			getContentPane().add(nameLabel);
			
			JLabel strengthLabel = new JLabel(Integer.toString(cow.strength));
			strengthLabel.setHorizontalAlignment(SwingConstants.TRAILING);
			strengthLabel.setBounds(86, 114, 57, 15);
			getContentPane().add(strengthLabel);
			
			JLabel powerLabel = new JLabel(Integer.toString(cow.power));
			powerLabel.setHorizontalAlignment(SwingConstants.TRAILING);
			powerLabel.setBounds(86, 139, 57, 15);
			getContentPane().add(powerLabel);
			
			JLabel quickLabel = new JLabel(Integer.toString(cow.quick));
			quickLabel.setHorizontalAlignment(SwingConstants.TRAILING);
			quickLabel.setBounds(86, 164, 57, 15);
			getContentPane().add(quickLabel);
			
			JLabel label = new JLabel("\uAC00\uACA9");
			label.setBounds(75, 181, 57, 15);
			getContentPane().add(label);
			
			int i = cow.power*500 + cow.quick*500;
			JLabel lblNewLabel_4 = new JLabel(i + " 원");
			lblNewLabel_4.setBounds(62, 206, 90, 15);
			getContentPane().add(lblNewLabel_4);
			
			JButton button = new JButton("\uD310\uB9E4");
			button.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {
					main.me.MakeMoney(i);
					cow.Dead();
					dispose();
				}
			});
			button.setBounds(46, 231, 97, 23);
			getContentPane().add(button);
			
			setVisible(true);
		}
	}
	
	
	
	class BuyFrame extends JFrame {

		private JPanel contentPane;

		public BuyFrame(Main main,Cow cow) {
			ImageIcon icon1 = new ImageIcon("cow/젖소.png");
			Image img1 = icon1.getImage();
			
			ImageIcon icon2 = new ImageIcon("cow/황소.png");
			Image img2 = icon2.getImage();
			
			ImageIcon icon3 = new ImageIcon("cow/물소.png");
			Image img3 = icon3.getImage();
			
			ImageIcon icon4 = new ImageIcon("cow/버팔로.png");
			Image img4 = icon4.getImage();
			


			
			setBounds(100, 100, 547, 292);
			contentPane = new JPanel();
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(contentPane);
			contentPane.setLayout(null);
			
			JPanel panel = new JPanel(){
				public void paintComponent(Graphics g){//배경 화면을 출력하기 위한 것
					super.paintComponent(g);	
						g.drawImage(img1,0, 0, 92, 93, 0, 64, 64, 128, null);
				}
			};
			panel.setBounds(33, 35, 92, 93);
			contentPane.add(panel);
			
			JPanel panel_1 = new JPanel(){
				public void paintComponent(Graphics g){//배경 화면을 출력하기 위한 것
					super.paintComponent(g);	
						g.drawImage(img2,0, 0, 92, 93, 0, 64, 64, 128, null);
				}
			};
			panel_1.setBounds(158, 35, 92, 93);
			contentPane.add(panel_1);
			
			JPanel panel_2 = new JPanel(){
				public void paintComponent(Graphics g){//배경 화면을 출력하기 위한 것
					super.paintComponent(g);	
						g.drawImage(img3,0, 0, 92, 93, 0, 64, 64, 128, null);
				}
			};
			panel_2.setBounds(282, 35, 92, 93);
			contentPane.add(panel_2);
			
			JPanel panel_3 = new JPanel(){
				public void paintComponent(Graphics g){//배경 화면을 출력하기 위한 것
					super.paintComponent(g);	
						g.drawImage(img4,0, 0, 92, 93, 0, 64, 64, 128, null);
				}
			};
			panel_3.setBounds(407, 35, 92, 93);
			contentPane.add(panel_3);
			
			JLabel lblNewLabel = new JLabel("\uC816\uC18C");
			lblNewLabel.setBounds(61, 138, 57, 15);
			contentPane.add(lblNewLabel);
			
			JLabel label = new JLabel("\uD669\uC18C");
			label.setBounds(193, 138, 57, 15);
			contentPane.add(label);
			
			JLabel label_1 = new JLabel("\uBB3C\uC18C");
			label_1.setBounds(317, 138, 57, 15);
			contentPane.add(label_1);
			
			JLabel label_2 = new JLabel("\uBC84\uD314\uB85C");
			label_2.setBounds(442, 138, 57, 15);
			contentPane.add(label_2);
			
			JLabel label_3 = new JLabel("300000 \uC6D0");
			label_3.setBounds(181, 153, 338, 15);
			contentPane.add(label_3);
			
			JLabel label_4 = new JLabel("500000 \uC6D0");
			label_4.setBounds(306, 153, 213, 15);
			contentPane.add(label_4);
			
			JLabel label_5 = new JLabel("1000000 \uC6D0");
			label_5.setBounds(433, 153, 86, 15);
			contentPane.add(label_5);
			
			JButton btnNewButton = new JButton("\uAD6C\uB9E4");
			btnNewButton.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent arg0) {
					if(main.me.Money < 100000)
						JOptionPane.showMessageDialog(null, "돈이 모자랍니다."); 
					else{
						cow.born(1);
						main.me.UseMoney(100000);
						dispose();
					}
				}
			});
			btnNewButton.setBounds(33, 202, 97, 23);
			contentPane.add(btnNewButton);
			
			JButton button = new JButton("\uAD6C\uB9E4");
			button.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {
					if(main.me.Money < 300000)
						JOptionPane.showMessageDialog(null, "돈이 모자랍니다."); 
					else{
						cow.born(2);
						main.me.UseMoney(300000);
						dispose();
					}
				}
			});
			button.setBounds(158, 202, 97, 23);
			contentPane.add(button);
			
			JButton button_1 = new JButton("\uAD6C\uB9E4");
			button_1.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {
					if(main.me.Money < 500000)
						JOptionPane.showMessageDialog(null, "돈이 모자랍니다."); 
					else{
						cow.born(3);
						main.me.UseMoney(500000);
						dispose();
					}
				}
			});
			button_1.setBounds(282, 202, 97, 23);
			contentPane.add(button_1);
			
			JButton button_2 = new JButton("\uAD6C\uB9E4");
			button_2.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {
					if(main.me.Money < 1000000)
						JOptionPane.showMessageDialog(null, "돈이 모자랍니다."); 
					else{
						cow.born(4);
						main.me.UseMoney(1000000);
						dispose();
					}
				}
			});
			
			JLabel label_6 = new JLabel("100000 \uC6D0");
			label_6.setBounds(43, 151, 92, 15);
			contentPane.add(label_6);
			
			JLabel lblNewLabel_1 = new JLabel("\uD798 100   \uBBFC\uCCA9 100");
			lblNewLabel_1.setBounds(33, 177, 97, 15);
			contentPane.add(lblNewLabel_1);
			
			JLabel label_7 = new JLabel("\uD798 150   \uBBFC\uCCA9 150");
			label_7.setBounds(153, 175, 97, 15);
			contentPane.add(label_7);
			
			JLabel label_8 = new JLabel("\uD798 200   \uBBFC\uCCA9 200");
			label_8.setBounds(282, 175, 97, 15);
			contentPane.add(label_8);
			
			JLabel label_9 = new JLabel("\uD798 300   \uBBFC\uCCA9 300");
			label_9.setBounds(402, 175, 97, 15);
			contentPane.add(label_9);
			
			button_2.setBounds(402, 202, 97, 23);
			contentPane.add(button_2);
			
			setVisible(true);
		}
	}
	
	
	
	
	String name(int i){
	if(i == 1)
		return "젖소";
	else if(i == 2)
		return "황소";
	else if(i == 3)
		return "물소";
	else
		return "버팔로";

	}
}

