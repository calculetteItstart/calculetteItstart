package fr.imie.calculetteitstart.vues;
import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.TextField;
import javax.swing.JTextField;


public class Interface {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interface window = new Interface();
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
	public Interface() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 700, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		frame.getContentPane().setLayout(gridBagLayout);
		
		JButton btnC = new JButton("C");
		GridBagConstraints gbc_btnC = new GridBagConstraints();
		gbc_btnC.insets = new Insets(0, 0, 5, 5);
		gbc_btnC.gridx = 7;
		gbc_btnC.gridy = 2;
		frame.getContentPane().add(btnC, gbc_btnC);
		
		JButton btnNewButton_2 = new JButton("←");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		GridBagConstraints gbc_btnNewButton_2 = new GridBagConstraints();
		gbc_btnNewButton_2.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_2.gridx = 9;
		gbc_btnNewButton_2.gridy = 2;
		frame.getContentPane().add(btnNewButton_2, gbc_btnNewButton_2);
		
		JButton btnSin = new JButton("sin");
		GridBagConstraints gbc_btnSin = new GridBagConstraints();
		gbc_btnSin.insets = new Insets(0, 0, 5, 5);
		gbc_btnSin.gridx = 5;
		gbc_btnSin.gridy = 3;
		frame.getContentPane().add(btnSin, gbc_btnSin);
		
		JButton button_3 = new JButton("%");
		GridBagConstraints gbc_button_3 = new GridBagConstraints();
		gbc_button_3.insets = new Insets(0, 0, 5, 5);
		gbc_button_3.gridx = 6;
		gbc_button_3.gridy = 3;
		frame.getContentPane().add(button_3, gbc_button_3);
		
		JButton button_10 = new JButton("7");
		GridBagConstraints gbc_button_10 = new GridBagConstraints();
		gbc_button_10.insets = new Insets(0, 0, 5, 5);
		gbc_button_10.gridx = 7;
		gbc_button_10.gridy = 3;
		frame.getContentPane().add(button_10, gbc_button_10);
		
		JButton button_11 = new JButton("8");
		GridBagConstraints gbc_button_11 = new GridBagConstraints();
		gbc_button_11.insets = new Insets(0, 0, 5, 5);
		gbc_button_11.gridx = 8;
		gbc_button_11.gridy = 3;
		frame.getContentPane().add(button_11, gbc_button_11);
		
		JButton button_12 = new JButton("9");
		GridBagConstraints gbc_button_12 = new GridBagConstraints();
		gbc_button_12.insets = new Insets(0, 0, 5, 5);
		gbc_button_12.gridx = 9;
		gbc_button_12.gridy = 3;
		frame.getContentPane().add(button_12, gbc_button_12);
		
		JButton button_2 = new JButton("/");
		GridBagConstraints gbc_button_2 = new GridBagConstraints();
		gbc_button_2.insets = new Insets(0, 0, 5, 5);
		gbc_button_2.gridx = 10;
		gbc_button_2.gridy = 3;
		frame.getContentPane().add(button_2, gbc_button_2);
		
		JButton btnCos = new JButton("cos");
		GridBagConstraints gbc_btnCos = new GridBagConstraints();
		gbc_btnCos.insets = new Insets(0, 0, 5, 5);
		gbc_btnCos.gridx = 5;
		gbc_btnCos.gridy = 4;
		frame.getContentPane().add(btnCos, gbc_btnCos);
		
		JButton btnX_1 = new JButton("^");
		GridBagConstraints gbc_btnX_1 = new GridBagConstraints();
		gbc_btnX_1.insets = new Insets(0, 0, 5, 5);
		gbc_btnX_1.gridx = 6;
		gbc_btnX_1.gridy = 4;
		frame.getContentPane().add(btnX_1, gbc_btnX_1);
		
		JButton button_7 = new JButton("4");
		GridBagConstraints gbc_button_7 = new GridBagConstraints();
		gbc_button_7.insets = new Insets(0, 0, 5, 5);
		gbc_button_7.gridx = 7;
		gbc_button_7.gridy = 4;
		frame.getContentPane().add(button_7, gbc_button_7);
		
		JButton button_8 = new JButton("5");
		GridBagConstraints gbc_button_8 = new GridBagConstraints();
		gbc_button_8.insets = new Insets(0, 0, 5, 5);
		gbc_button_8.gridx = 8;
		gbc_button_8.gridy = 4;
		frame.getContentPane().add(button_8, gbc_button_8);
		
		JButton button_9 = new JButton("6");
		GridBagConstraints gbc_button_9 = new GridBagConstraints();
		gbc_button_9.insets = new Insets(0, 0, 5, 5);
		gbc_button_9.gridx = 9;
		gbc_button_9.gridy = 4;
		frame.getContentPane().add(button_9, gbc_button_9);
		
		JButton btnNewButton_1 = new JButton("√");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		
		JButton btnX = new JButton("x");
		GridBagConstraints gbc_btnX = new GridBagConstraints();
		gbc_btnX.insets = new Insets(0, 0, 5, 5);
		gbc_btnX.gridx = 10;
		gbc_btnX.gridy = 4;
		frame.getContentPane().add(btnX, gbc_btnX);
		
		JButton btnLog = new JButton("log");
		GridBagConstraints gbc_btnLog = new GridBagConstraints();
		gbc_btnLog.insets = new Insets(0, 0, 5, 5);
		gbc_btnLog.gridx = 5;
		gbc_btnLog.gridy = 5;
		frame.getContentPane().add(btnLog, gbc_btnLog);
		GridBagConstraints gbc_btnNewButton_1 = new GridBagConstraints();
		gbc_btnNewButton_1.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_1.gridx = 6;
		gbc_btnNewButton_1.gridy = 5;
		frame.getContentPane().add(btnNewButton_1, gbc_btnNewButton_1);
		
		JButton button_4 = new JButton("1");
		GridBagConstraints gbc_button_4 = new GridBagConstraints();
		gbc_button_4.insets = new Insets(0, 0, 5, 5);
		gbc_button_4.gridx = 7;
		gbc_button_4.gridy = 5;
		frame.getContentPane().add(button_4, gbc_button_4);
		
		JButton button_5 = new JButton("2");
		GridBagConstraints gbc_button_5 = new GridBagConstraints();
		gbc_button_5.insets = new Insets(0, 0, 5, 5);
		gbc_button_5.gridx = 8;
		gbc_button_5.gridy = 5;
		frame.getContentPane().add(button_5, gbc_button_5);
		
		JButton button_6 = new JButton("3");
		GridBagConstraints gbc_button_6 = new GridBagConstraints();
		gbc_button_6.insets = new Insets(0, 0, 5, 5);
		gbc_button_6.gridx = 9;
		gbc_button_6.gridy = 5;
		frame.getContentPane().add(button_6, gbc_button_6);
		
		JButton button_1 = new JButton("-");
		GridBagConstraints gbc_button_1 = new GridBagConstraints();
		gbc_button_1.insets = new Insets(0, 0, 5, 5);
		gbc_button_1.gridx = 10;
		gbc_button_1.gridy = 5;
		frame.getContentPane().add(button_1, gbc_button_1);
		
		JButton btnExp = new JButton("exp");
		GridBagConstraints gbc_btnExp = new GridBagConstraints();
		gbc_btnExp.insets = new Insets(0, 0, 5, 5);
		gbc_btnExp.gridx = 5;
		gbc_btnExp.gridy = 6;
		frame.getContentPane().add(btnExp, gbc_btnExp);
		
		JButton button_15 = new JButton("(");
		GridBagConstraints gbc_button_15 = new GridBagConstraints();
		gbc_button_15.insets = new Insets(0, 0, 5, 5);
		gbc_button_15.gridx = 6;
		gbc_button_15.gridy = 6;
		frame.getContentPane().add(button_15, gbc_button_15);
		
		JButton button_16 = new JButton(")");
		GridBagConstraints gbc_button_16 = new GridBagConstraints();
		gbc_button_16.insets = new Insets(0, 0, 5, 5);
		gbc_button_16.gridx = 7;
		gbc_button_16.gridy = 6;
		frame.getContentPane().add(button_16, gbc_button_16);
		
		JButton button_13 = new JButton("0");
		GridBagConstraints gbc_button_13 = new GridBagConstraints();
		gbc_button_13.insets = new Insets(0, 0, 5, 5);
		gbc_button_13.gridx = 8;
		gbc_button_13.gridy = 6;
		frame.getContentPane().add(button_13, gbc_button_13);
		
		JButton button_14 = new JButton(",");
		GridBagConstraints gbc_button_14 = new GridBagConstraints();
		gbc_button_14.insets = new Insets(0, 0, 5, 5);
		gbc_button_14.gridx = 9;
		gbc_button_14.gridy = 6;
		frame.getContentPane().add(button_14, gbc_button_14);
		
		JButton btnNewButton = new JButton("+");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton.gridx = 10;
		gbc_btnNewButton.gridy = 6;
		frame.getContentPane().add(btnNewButton, gbc_btnNewButton);
		
		JButton button = new JButton("=");
		GridBagConstraints gbc_button = new GridBagConstraints();
		gbc_button.insets = new Insets(0, 0, 5, 5);
		gbc_button.gridx = 8;
		gbc_button.gridy = 7;
		frame.getContentPane().add(button, gbc_button);
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 0, 5);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 11;
		gbc_textField.gridy = 8;
		frame.getContentPane().add(textField, gbc_textField);
		textField.setColumns(10);
	}

}
