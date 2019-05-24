import javax.swing.*;
import java.awt.*;
import java.awt.event.*; //For ActionListener


public class CalculatorApp {

	private JFrame frame;
	private JTextField textField;

	private JButton MC, Decimal, Plusminus, Multiply, Divide, Equals, Seven , Four, One,Plus, Eight, five, Two, Zero, Nine, Six, Three, Minus ;

	double input1;
	double input2;
	double result;
	
	String operation;
	String output;
	
	public void setNumberBoolean(boolean b) { //Disable to get the rid of the problem of adding more numbers.
		One.setEnabled(b);
		Two.setEnabled(b);
		Three.setEnabled(b);
		Four.setEnabled(b);
		five.setEnabled(b);
		Six.setEnabled(b);
		Seven.setEnabled(b);
		Eight.setEnabled(b);
		Nine.setEnabled(b);
		Zero.setEnabled(b);
		
	}
	
	public void setButtonColor(JButton btn, Color colour) //For setting the colour of the Buttons
	{
		btn.setBackground(colour);
		btn.setOpaque(true);
		btn.setBorderPainted(false);
		btn.setForeground(Color.WHITE);
	}
	
	/**
	 * Launch the application.
	 */
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculatorApp window = new CalculatorApp();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CalculatorApp() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		
		frame.setBounds(100, 100, 355, 398);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().setBackground(Color.BLACK.darker().darker());
		
		textField = new JTextField();
		textField.setBounds(23, 15, 311, 64);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		
		
		
		/***   TOP ROW   ***/
		
		
		JButton Backspace = new JButton("BACKSPACE");
		Backspace.setVisible(true);
		Backspace.setBounds(77, 91, 116, 45);
		frame.getContentPane().add(Backspace);
		
		
		setButtonColor(Backspace, Color.GRAY.darker().darker().darker());
		
		Backspace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String backspace = null;
				
				if(textField.getText().length() > 0) {
					StringBuilder temp = new StringBuilder(textField.getText());
					temp.deleteCharAt(textField.getText().length() - 1);
					backspace = temp.toString();
					textField.setText(backspace); }
				
				setNumberBoolean(true);
				
				}		
		});
		
		
		
		MC = new JButton("MC");
		MC.setBounds(23, 88, 50, 51);
		frame.getContentPane().add(MC);
		
		MC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(null); //Clears the calculator display and shows zero.
				
				setNumberBoolean(true);
			}
		});
		
		Decimal = new JButton(".");
		Decimal.setBounds(197, 91, 50, 45);
		frame.getContentPane().add(Decimal);
		
		setButtonColor(Decimal, Color.GRAY.darker().darker().darker());
		
		Decimal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String inputnum = textField.getText() + Decimal.getText();
				textField.setText(inputnum); //Adds the number to the Display of the calculator
							
				
			}
		});
		
		
		Plusminus = new JButton("+/-");
		Plusminus.setBounds(259, 91, 75, 45);
		frame.getContentPane().add(Plusminus);
		
		setButtonColor(Plusminus, Color.GRAY.darker().darker().darker());
		
		Plusminus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				double changesign = Double.parseDouble(String.valueOf(textField.getText()));
				changesign = changesign*(-1);
				textField.setText(String.valueOf(String.format("%,.3f",changesign)));
				setNumberBoolean(true);
			}
		});
		
		
		/***   NUMBERS   ***/
		
		Seven = new JButton("7");
		Seven.setBounds(23, 148, 60, 45);
		frame.getContentPane().add(Seven);
		
		setButtonColor(Seven, Color.GRAY);

		
		Seven.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String inputnum = textField.getText() + Seven.getText();
				textField.setText(inputnum); //Adds the number to the Display of the calculator
			}
		});
		
		
		
		Eight = new JButton("8");
		Eight.setBounds(103, 148, 60, 45);
		frame.getContentPane().add(Eight);
		
		setButtonColor(Eight, Color.GRAY);
		
		Eight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String inputnum = textField.getText() + Eight.getText();
				textField.setText(inputnum); //Adds the number to the Display of the calculator
			}
		});
		
		
		Nine = new JButton("9");
		Nine.setBounds(187, 148, 60, 45);
		frame.getContentPane().add(Nine);
		
		setButtonColor(Nine, Color.GRAY);
		
		Nine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String inputnum = textField.getText() + Nine.getText();
				textField.setText(inputnum); //Adds the number to the Display of the calculator
			}
		});
		
		
		Four = new JButton("4");
		Four.setBounds(23, 203, 60, 45);
		frame.getContentPane().add(Four);
		
		setButtonColor(Four, Color.GRAY);
		
		Four.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String inputnum = textField.getText() + Four.getText();
				textField.setText(inputnum); //Adds the number to the Display of the calculator
			}
		});
		
		
		
		five = new JButton("5");
		five.setBounds(103, 203, 60, 45);
		frame.getContentPane().add(five);
		
		setButtonColor(five, Color.GRAY);
		
		five.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String inputnum = textField.getText() + five.getText();
				textField.setText(inputnum); //Adds the number to the Display of the calculator
			}
		});
		
		Six = new JButton("6");
		Six.setBounds(187, 203, 60, 45);
		frame.getContentPane().add(Six);
		
		setButtonColor(Six, Color.GRAY);
		
		Six.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String inputnum = textField.getText() + Six.getText();
				textField.setText(inputnum); //Adds the number to the Display of the calculator
			}
		});
		
		One = new JButton("1");
		One.setBounds(23, 260, 60, 45);
		frame.getContentPane().add(One);
		
		setButtonColor(One, Color.GRAY);
		
		One.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String inputnum = textField.getText() + One.getText();
				textField.setText(inputnum); //Adds the number to the Display of the calculator
			}
		});
		
		Two = new JButton("2");
		Two.setBounds(103, 260, 60, 45);
		frame.getContentPane().add(Two);
		
		setButtonColor(Two, Color.GRAY);
		
		Two.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String inputnum = textField.getText() + Two.getText();
				textField.setText(inputnum); //Adds the number to the Display of the calculator
			}
		});
		
		Three = new JButton("3");
		Three.setBounds(187, 260, 60, 45);
		frame.getContentPane().add(Three);
		
		setButtonColor(Three, Color.GRAY);

		
		Three.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String inputnum = textField.getText() + Three.getText();
				textField.setText(inputnum); //Adds the number to the Display of the calculator
			}
		});
		
		
		Zero = new JButton("0");
		Zero.setBounds(103, 315, 60, 45);
		frame.getContentPane().add(Zero);
		
		setButtonColor(Zero, Color.GRAY);

		
		Zero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String inputnum = textField.getText() + Zero.getText();
				textField.setText(inputnum); //Adds the number to the Display of the calculator
			}
		});
		
		
		
		/***   OPERATIONS   ***/
		
		Minus = new JButton("-");
		Minus.setBounds(187, 315, 60, 45);
		frame.getContentPane().add(Minus);
		
		setButtonColor(Minus, Color.GRAY);

		
		Minus.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			input1 = Double.parseDouble(textField.getText()); //Stores the string as a double
			textField.setText(""); //Clears the calculator display.
			operation ="-";
			
			setNumberBoolean(true);
		}
	});
	
	
		
		Plus = new JButton("+");
		Plus.setBounds(23, 315, 60, 45);
		frame.getContentPane().add(Plus);
		
		setButtonColor(Plus, Color.GRAY);
		
		Plus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				input1 = Double.parseDouble(textField.getText()); //Stores the string as a double
				textField.setText(""); //Clears the calculator display.
				operation ="+";
				
				setNumberBoolean(true);
			}
		});
		
		Equals = new JButton("=");
		Equals.setBounds(269, 260, 60, 100);
		frame.getContentPane().add(Equals);
		
		Equals.setBackground(new Color(241,90,43));
		Equals.setOpaque(true);
		Equals.setBorderPainted(false);
		Equals.setForeground(Color.WHITE);
		
		Equals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				input2 = Double.parseDouble(textField.getText());
				
				
				switch (operation){
				case "+":
					result = input1 + input2;
					break;
				case "-":
					result = input1 - input2;
					break;
					
				case "*":
					result = input1 * input2;
					break;
				
				case "/":
					result = (input1 / input2);
					break;
					
				}

					textField.setText(String.format("%,.3f",result));
					
					
					setNumberBoolean(false);
					
				}							
	});

		
		
		Multiply = new JButton("X");
		Multiply.setBounds(269, 148, 60, 45);
		frame.getContentPane().add(Multiply);
		
		setButtonColor(Multiply, Color.GRAY);
		
		Multiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				input1 = Double.parseDouble(textField.getText()); //Stores the string as a double
				textField.setText(""); //Clears the calculator display.
				operation ="*";
				
				setNumberBoolean(true);
			}
		});
		
		
		Divide = new JButton("%");
		Divide.setBounds(269, 203, 60, 45);
		frame.getContentPane().add(Divide);
		
		setButtonColor(Divide, Color.GRAY);
		
		Divide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				input1 = Double.parseDouble(textField.getText()); //Stores the string as a double
				textField.setText(""); //Clears the calculator display.
				operation ="/";
				
				setNumberBoolean(true);
			}
		});
		
	}
}
