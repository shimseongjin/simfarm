package View;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;

public class Fail extends JFrame {

	private JPanel contentPane;


	public Fail() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 658, 423);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setBackground(Color.BLACK);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\uB9D0\uB791\uCE74\uC6B0\uC758 \uC2B9\uBD80\uC5D0\uC11C \uC838");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("ÈÞ¸Õ¸ðÀ½T", Font.PLAIN, 37));
		lblNewLabel.setBounds(133, 111, 452, 66);
		contentPane.add(lblNewLabel);
		
		JLabel label = new JLabel("\uC8FD\uC74C\uC744 \uB9DE\uC774\uD558\uC600\uC2B5\uB2C8\uB2E4.");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("ÈÞ¸Õ¸ðÀ½T", Font.PLAIN, 37));
		label.setBounds(92, 208, 504, 66);
		contentPane.add(label);
		setVisible(true);
	}

}
