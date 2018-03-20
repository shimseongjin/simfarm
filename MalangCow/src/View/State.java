package View;

import javax.swing.JPanel;
import Draw.DrawBackGround;
import Draw.Map;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.Font;
import java.awt.Color;

public class State extends JPanel {
	Thread thread;
	int i = 120;
	boolean check=false;
	
	public State(Main main) {

		setLayout(null);
		
		JPanel home = new JPanel(){
			ImageIcon icon = new ImageIcon("base/home.png");
			Image img = icon.getImage();			
			public void paintComponent(Graphics g){
				g.drawImage(img, 0, 0, 80, 80, this);
			}

		};
		home.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				main.home();
			}
		});
		home.setBounds(0, 0, 80, 80);
		home.setOpaque(false);	
		add(home);
		

		JPanel exit = new JPanel(){
			ImageIcon icon = new ImageIcon("base/exit.png");
			Image img = icon.getImage();			
			public void paintComponent(Graphics g){
				g.drawImage(img, 0, 0, 80, 80, this);
			}
		};
		exit.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		exit.setBounds(720, 0, 80, 80);
		exit.setOpaque(false);	
		add(exit);
		
		JPanel save = new JPanel(){
			ImageIcon icon = new ImageIcon("base/save-icon.png");
			Image img = icon.getImage();			
			public void paintComponent(Graphics g){
				g.drawImage(img, 5, 5, 70, 70, this);
			}
		};
		save.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				FileWriter fw =null;
				try {
					fw = new FileWriter("Malang.txt");
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
		          String line=new String();
		          line+=main.me.Money;
		          line+="&";
		          line+=main.me.Jobcho[0];
		          line+="&";
		          line+=main.me.Jobcho[1];
		          line+="&";
		          line+=main.me.Jobcho[2];
		          line+="&";
		          line+=main.me.Jobcho[3];
		          line+="&";
		          line+=main.me.Badge[0];
		          line+="&";
		          line+=main.me.Badge[1];
		          line+="&";
		          line+=main.me.Badge[2];
		          line+="&";
		          line+=main.me.Badge[3];
		          line+="&";
		          line+=main.me.Badge[4];
		          line+="&";
		          line+=main.me.Badge[5];
		          line+="&";
		          line+=main.me.Badge[6];
		          line+="&";
		          line+=main.me.Badge[7];
		          line+="\n";
		          try {
					fw.write(line);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
		          line ="";
		          for(int i = 0 ; i < 6; i++)
		          {
		        	  line += main.farm.cowpanel[i].cow.DoB();
			          line+="&";
		        	  line += main.farm.cowpanel[i].cow.kind;
			          line+="&";
		        	  line += main.farm.cowpanel[i].cow.power;
			          line+="&";
		        	  line += main.farm.cowpanel[i].cow.quick;
			          line+="&";
		        	  line += main.farm.cowpanel[i].cow.strength;
			          line+="\n";
			          try {
						fw.write(line);
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
			          line ="";
		          }
		          try {
					fw.close();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
	               JOptionPane.showMessageDialog(null, "저장 되었습니다.");
				
				
			}
		});
		save.setBounds(638, 0, 80, 80);
		save.setOpaque(false);	
		add(save);
		
		JPanel remaintime = new JPanel();
		remaintime.setBounds(252, 0, 300, 80);
		remaintime.setOpaque(false);	
		add(remaintime);
		remaintime.setLayout(null);
		
		JLabel label = new JLabel("\uBCF4\uC720 \uD604\uAE08 :");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("휴먼모음T", Font.BOLD, 20));
		label.setBounds(12, 10, 109, 31);
		remaintime.add(label);
		
		JLabel label_1 = new JLabel("");
		label_1.setForeground(Color.WHITE);
		label_1.setFont(new Font("돋움", Font.BOLD, 20));
		label_1.setBounds(122, 10, 166, 31);
		remaintime.add(label_1);
		
		JLabel label_2 = new JLabel("\uACBD\uAE30\uC7A5 \uC785\uC7A5\uAE4C\uC9C0 120\uCD08 \uB0A8\uC74C");
		label_2.setForeground(Color.WHITE);
		label_2.setFont(new Font("휴먼모음T", Font.BOLD, 20));
		label_2.setBounds(12, 39, 276, 31);
		remaintime.add(label_2);
		
		JPanel bat = new JPanel(){
			ImageIcon icon = new ImageIcon("base/user.png");
			Image img = icon.getImage();			
			public void paintComponent(Graphics g){
				g.drawImage(img, 0, 0, 80, 80, this);
			}
		};
		bat.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				int i = 0;
				for(int j = 0 ; j < 6 ; j++){
					if(main.farm.cowpanel[j].cow.DoB() == true)
						i++;
				}
				main.info.sett(i,main.me.GetMoney());
				main.info.setVisible(true);
			}
		});
		bat.setBounds(81, 0, 80, 80);
		bat.setOpaque(false);	
		add(bat);
		

		
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
					label_1.setText(main.me.GetMoney()+"원");
					if(i > 0)
					{
						i--;
						label_2.setText("경기장 입장까지" +i+"초 남음");
						
					}
					if(i == 0)
					{
						check = true;
						label_2.setText("입장가능");
					}
					repaint();		          
				}	
				
			}
		});
		thread.start();
		JPanel addbg = new DrawBackGround(Map.StateBg,"base/terrain.png");//맵 정보와 배경이미지 받아서 출력
		addbg.setBounds(0, 0, 800, 80);
		addbg.setOpaque(false);	
		this.add(addbg);
		setVisible(true);


	}
	
	
	void in(){
		i = 120;
		check = false;
	}// 입장했을 경우 초기화
	
	
	
	
}
