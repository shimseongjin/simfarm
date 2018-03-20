package View;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;

public class Last extends JFrame {

	private JPanel contentPane;


	public Last() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 658, 423);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setBackground(Color.BLACK);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\uB2F9\uC2E0\uC740 \uB9D0\uB791\uCE74\uC6B0\uB97C \uC7A1\uC544");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("ÈÞ¸Õ¸ðÀ½T", Font.PLAIN, 37));
		lblNewLabel.setBounds(133, 111, 452, 66);
		contentPane.add(lblNewLabel);
		
		JLabel label = new JLabel("\uCD5C\uACE0\uC758 \uC18C\uD0A4\uC6B0\uBBF8\uAC00 \uB418\uC5C8\uC2B5\uB2C8\uB2E4.");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("ÈÞ¸Õ¸ðÀ½T", Font.PLAIN, 37));
		label.setBounds(92, 208, 504, 66);
		contentPane.add(label);
		setVisible(true);
	}

}
