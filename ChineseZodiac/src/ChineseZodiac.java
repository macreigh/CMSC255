import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.Button;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JList;

public class ChineseZodiac extends JFrame {

	private JPanel contentPane;
	private JTextField userInput;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChineseZodiac frame = new ChineseZodiac();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ChineseZodiac() {
		setTitle("Chinese Zodiac Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 648, 535);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton submitButton = new JButton("Submit");
		submitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		submitButton.setBounds(458, 69, 141, 35);
		contentPane.add(submitButton);
		
		userInput = new JTextField();
		userInput.setBounds(21, 70, 431, 32);
		contentPane.add(userInput);
		userInput.setColumns(10);
		
		JLabel userInstructions = new JLabel();
		userInstructions.setFont(new Font("Tahoma", Font.PLAIN, 20));
		userInstructions.setForeground(Color.BLACK);
		userInstructions.setBackground(Color.WHITE);
		userInstructions.setText("Please enter your birth year below to receive your Zodiac result.");
		userInstructions.setBounds(21, 21, 578, 35);
		contentPane.add(userInstructions);
		
		JPanel resultBox = new JPanel();
		resultBox.setBounds(21, 140, 578, 273);
		contentPane.add(resultBox);
	}
}
