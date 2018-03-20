package View;

import javax.swing.JPanel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
import Buliding.*;
import Character.CowPanel;
import Draw.*;


public class Farm extends JPanel {
	public CowPanel []cowpanel = new CowPanel[6];
	public Farm(Main main) {
		setLayout(null);
		
		cowpanel[0] = new CowPanel(main);
		cowpanel[0].cow.born(1);
		cowpanel[0].setBounds(32, 32, 224, 192);
		cowpanel[0].setOpaque(false);	
		add(cowpanel[0]);
		
		cowpanel[1] = new CowPanel(main);
		cowpanel[1].setBounds(288, 32, 224, 192);
		cowpanel[1].setOpaque(false);
		add(cowpanel[1]);
		
		cowpanel[2] = new CowPanel(main);
		cowpanel[2].setBounds(544, 32, 224, 192);
		cowpanel[2].setOpaque(false);
		add(cowpanel[2]);
		
		cowpanel[3] = new CowPanel(main);
		cowpanel[3].setBounds(32, 256, 224, 192);
		cowpanel[3].setOpaque(false);
		add(cowpanel[3]);
		
		cowpanel[4] = new CowPanel(main);
		cowpanel[4].setBounds(288, 256, 224, 192);
		cowpanel[4].setOpaque(false);
		add(cowpanel[4]);
		
		cowpanel[5] = new CowPanel(main);
		cowpanel[5].setBounds(544, 256, 224, 192);
		cowpanel[5].setOpaque(false);
		add(cowpanel[5]);
		
		
		

		
		JPanel addFe = new DrawBackGround(Map.Fence,"base/fence.png");//맵 정보와 배경이미지 받아서 출력
		addFe.setBounds(0, 0, 800, 640);
		addFe.setOpaque(false);	
		this.add(addFe);
		
		
		
		
		
		
		
		
		JPanel addbg = new DrawBackGround(Map.FarmBg,"base/terrain.png");//맵 정보와 배경이미지 받아서 출력
		addbg.setBounds(0, 0, 800, 640);
		addbg.setOpaque(false);	
		this.add(addbg);
		
		
		setVisible(true);
	}
}