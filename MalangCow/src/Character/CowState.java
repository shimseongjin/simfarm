package Character;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class CowState extends JFrame{
	public CowState(Cow cow){
		setSize(200,250);
		getContentPane().setLayout(null);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		JPanel imgPanel = new JPanel(){
			public void paintComponent(Graphics g){
				g.drawImage(cow.CowImg[1], 0,0, null);
			}
		};
		imgPanel.setBounds(50, 10, 180, 70);
		getContentPane().add(imgPanel);
		
		JLabel lblNewLabel = new JLabel("Ç°Á¾");
		lblNewLabel.setBounds(12, 89, 57, 15);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Ã¼·Â");
		lblNewLabel_1.setBounds(12, 114, 57, 15);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Èû");
		lblNewLabel_2.setBounds(12, 139, 57, 15);
		getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("¹ÎÃ¸");
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
		
		setVisible(true);
	}
}