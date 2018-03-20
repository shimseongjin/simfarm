package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import Character.*;
import Draw.DrawBackGround;
import Draw.Map;

import javax.swing.JLayeredPane;

public class Main extends JFrame {
	static public Main main;
	protected JLayeredPane layerepane;
	protected State state;
	protected Start start;
	public Farm farm;
	public Me me;
	protected UserInfo info;

	public static void main(String[] args) throws IOException {
		main = new Main();
		main.setVisible(true);

	}
	
	public Main() throws IOException {
		me = new Me(this);
		farm = new Farm(this);
		info = new UserInfo(this);
		state = new State(this);
		start = new Start(this);

		BufferedReader br;
		File f = new File("Malang.txt");

		if(f.isFile()){
		br =new BufferedReader(new InputStreamReader(new FileInputStream("Malang.txt"),"EUC-KR"));
		String inputLine;
		inputLine = br.readLine();
		String[] input;
		input = inputLine.split("&");
		me.Money = Integer.parseInt(input[0]);
		me.Jobcho[0] = Boolean.parseBoolean(input[1]);
		me.Jobcho[1] = Boolean.parseBoolean(input[2]);
		me.Jobcho[2] = Boolean.parseBoolean(input[3]);
		me.Jobcho[3] = Boolean.parseBoolean(input[4]);
		me.Badge[0] = Boolean.parseBoolean(input[5]);
		me.Badge[1] = Boolean.parseBoolean(input[6]);
		me.Badge[2] = Boolean.parseBoolean(input[7]);
		me.Badge[3] = Boolean.parseBoolean(input[8]);
		me.Badge[4] = Boolean.parseBoolean(input[9]);
		me.Badge[5] = Boolean.parseBoolean(input[10]);
		me.Badge[6] = Boolean.parseBoolean(input[11]);
		me.Badge[7] = Boolean.parseBoolean(input[12]);

		for(int i = 0 ; i < 6 ; i++){
		inputLine = br.readLine();
		input = inputLine.split("&");
		if( Boolean.parseBoolean(input[0]) == true)
		farm.cowpanel[i].cow.born(Integer.parseInt(input[1]));
		farm.cowpanel[i].cow.live = Boolean.parseBoolean(input[0]);
		farm.cowpanel[i].cow.power = Integer.parseInt(input[2]);
		farm.cowpanel[i].cow.quick = Integer.parseInt(input[3]);
		farm.cowpanel[i].cow.strength = Integer.parseInt(input[4]);
		}
		br.close();
		}
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 816, 600);
		layerepane = new JLayeredPane();

		
		layerepane.setBounds(0, 0, 800, 560);
		getContentPane().add(layerepane);
		layerepane.setLayout(null);

		info.setBounds(155, 150, 500, 350);
		layerepane.add(info);
		
		farm.setBounds(0, 80, 800, 480);
		layerepane.add(farm);
		
		state.setBounds(0, 0, 800, 80);
		layerepane.add(state);

		start.setBounds(0, 80, 800, 480);
		layerepane.add(start);
		
		start.setVisible(true);
		info.setVisible(false);
		farm.setVisible(false);
	
		setVisible(true);
		
		Thread thread = new Thread(new Runnable(){

			@Override
			public void run() {
				while(true){
					try {
						Thread.currentThread().sleep(150);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					repaint();
				}
			}					
		});
		thread.start();
		setVisible(true);
	}
	
	void home(){
		start.setVisible(true);
		farm.setVisible(false);
	}
}
