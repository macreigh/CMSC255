import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;

public class ChineseZodiac extends JFrame{
	
	private JPanel inputPanel;
	private JTextField userYear;
	
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
	
	/***************************
	 * This class build a GUI for our task.
	 ***************************/
	public ChineseZodiac() {
		
		setTitle("Chinese Zodiac Calculator");	//Sets title at top of window.
		setBounds(100, 100, 648, 535);			//Sets size of frame.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Sets exit operation for frame.
		
		JLabel zodiacText = new JLabel();			//zodiacText is what the program outputs.
		zodiacText.setBounds(21, 140, 578, 273);	//Use for testing purposes, until we understand how to import images.
		
		inputPanel = new JPanel();			//This panel is for the face of the GUI, not including output.
		inputPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		inputPanel.setLayout(null);
		
		JLabel userPrompt = new JLabel();	//userPrompt are the instructions for the user.
		userPrompt.setBounds(21, 21, 578, 35);
		userPrompt.setFont(new Font("Tahoma", Font.PLAIN, 20));
		userPrompt.setForeground(Color.BLACK);
		userPrompt.setBackground(Color.WHITE);
		userPrompt.setText("Please enter your birth year below to receive your Zodiac result.");
		
		userYear = new JTextField();		//userYear is the year the user inputs.
		userYear.setBounds(21, 70, 431, 32);
		userYear.setColumns(10);
		
		JButton submitButton = new JButton("Submit");
		submitButton.setBounds(458, 69, 141, 35);
		submitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int year = Integer.parseInt(userYear.getText());	//Stores the string from JTextField as an int. NEEDS ERROR HANDLING.
				zodiacText.setText(zodiacSign(year));				//Stores the returned String from method zodiacYear() into zodiacText.
			}
		});
		
		inputPanel.add(userPrompt);			//Adds values to inputPanel.
		inputPanel.add(userYear);
		inputPanel.add(submitButton);
		
		add(zodiacText);		//Adds values to frame.
		add(inputPanel);
		setVisible(true);
		
	}
	
	/***************************************
	 * This method is called with an integer parameter and returns
	 * the user's zodiac sign as an index of a string array 
	 * corresponding to the user's input year.
	 ***************************************/
	public static String zodiacSign(int year) {
		String zodiac;
		int sign = year % 12;
		String[] animals = { "Monkey", "Rooster", "Dog", "Boar", "Rat", "Ox", "Tiger", "Rabbit", "Dragon", "Snake",
				"Horse", "Ram" };
		zodiac = "According to the Chinese New Year, your zodiac sign is the " + animals[sign];

		return zodiac;
	}
}
