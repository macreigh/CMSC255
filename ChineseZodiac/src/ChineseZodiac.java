import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

public class ChineseZodiac extends JFrame {

	/*****************************************************
	 * Here we declare a few variables we expect to use throughout the program. We
	 * also check to see if we are allowed to build a new frame for our project.
	 ****************************************************/
	private JPanel inputPanel;
	private JTextField userYear;
	private GridLayout grid;

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

	/***************************************************
	 * This is the class that builds the GUI for our specific task.
	 ***************************************************/
	public ChineseZodiac() {
		grid = new GridLayout(2, 0);

		/*****************************************************
		 * Here we set the properties of our Frame(GUI).
		 ****************************************************/
		setTitle("Chinese Zodiac Calculator");
		setBounds(100, 100, 900, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		/*****************************************************
		 * Here we add and set the properties of a JLabel, it is used for our output,
		 * showing errors or showing your zodiac sign along with a short text describing
		 * it.
		 ****************************************************/
		JLabel zodiacText = new JLabel();
		zodiacText.setBounds(20, 10, 900, 600);
		zodiacText.setFont(new Font("Tahoma", Font.PLAIN, 18));

		/*****************************************************
		 * Here we declare and set the properties of a JPanel, we use this to prompt the
		 * user with our project's objective and to accept input from the user using
		 * attachments. This JPanel is the basic face to our GUI.
		 ****************************************************/
		inputPanel = new JPanel();
		inputPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		inputPanel.setLayout(null);
		grid.addLayoutComponent("inputpanel", inputPanel);
		JLabel userPrompt = new JLabel();
		userPrompt.setBounds(150, 20, 578, 35);
		userPrompt.setFont(new Font("Tahoma", Font.PLAIN, 20));
		userPrompt.setForeground(Color.BLACK);
		userPrompt.setBackground(Color.WHITE);
		userPrompt.setText("Please enter your birth year below to receive your Zodiac result.");

		/*****************************************************
		 * Here we declare a JTextField which allows the user to insert input for our
		 * project.
		 ****************************************************/
		userYear = new JTextField();
		userYear.setBounds(145, 70, 431, 32);
		userYear.setFont(new Font("Tahoma", Font.PLAIN, 20));
		userYear.setColumns(5);

		/*****************************************************
		 * Here we declare and set the properties of a JButton named "submitButton" and
		 * this allows the user to submit their input.
		 ****************************************************/
		JButton submitButton = new JButton("Submit");
		submitButton.setBounds(588, 69, 141, 35);
		submitButton.setFont(new Font("Tahoma", Font.PLAIN, 20));

		/*****************************************************
		 * Here is where the magic happens, this is where the program makes the button
		 * have a reaction. Once the button is pushed this part of the program runs.
		 * First we set all values of the JLabel, zodiacText, to null so if the program
		 * is run more than once or the program runs into an error, the fields are
		 * cleared. We then do some error checking making sure that the user's input is
		 * a valid number and is in bounds to be a valid year. If the input passes, the
		 * method zodiacImage is called and stored into the JLabel's icon box.
		 ****************************************************/
		submitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				zodiacText.setIcon(null);
				zodiacText.setText(null);
				int year = 0;
				try {
					year = Integer.parseInt(userYear.getText());
					if (year < 10000 && year > 0) {
						int sign = year % 12;
						zodiacText.setIcon(zodiacImage(sign));
						userYear.setText("");
					} else {
						year /= 0;
					}
				} catch (NumberFormatException oof) {
					userYear.setText("");
					zodiacText.setText("Input invalid, must be an int. Please try again.");
				} catch (ArithmeticException oof) {
					userYear.setText("");
					zodiacText.setText("Input invalid, must be a valid year. Please try again.");
				}
			}
		});

		userYear.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					zodiacText.setIcon(null);
					zodiacText.setText(null);
					int year = 0;
					try {
						year = Integer.parseInt(userYear.getText());
						if (year < 10000 && year > 0) {
							int sign = year % 12;
							zodiacText.setIcon(zodiacImage(sign));
							userYear.setText("");
						} else {
							year /= 0;
						}
					} catch (NumberFormatException oof) {
						userYear.setText("");
						zodiacText.setText("Input invalid, must be an int. Please try again.");
					} catch (ArithmeticException oof) {
						userYear.setText("");
						zodiacText.setText("Input invalid, must be a valid year. Please try again.");
					}
				}
			}
		});

		/***************************************************
		 * Adds values to the JPanel, inputPanel.
		 ***************************************************/
		inputPanel.add(userPrompt);
		inputPanel.add(userYear);
		inputPanel.add(submitButton);
		/****************************************************
		 * Adds values to the main frame, ChineseZodiac.
		 ****************************************************/
		getContentPane().add(zodiacText);
		getContentPane().add(inputPanel);
		setVisible(true);
	}

	/***************************************
	 * This method is called with an integer parameter and returns the user's zodiac
	 * sign as an image taken from a String array holding the image directory. The
	 * image is specific to the user's input year.
	 ***************************************/
	public static ImageIcon zodiacImage(int sign) {
		String[] path = { "monkey.png", "rooster.png", "dog.png", "boar.png", "rat.png", "ox.png", "tiger.png",
				"rabbit.png", "dragon.png", "snake.png", "horse.png", "ram.png" };

		ImageIcon zodiacImage = new ImageIcon(
				new ImageIcon(path[sign]).getImage().getScaledInstance(830, 300, Image.SCALE_DEFAULT));

		return zodiacImage;
	}
}
