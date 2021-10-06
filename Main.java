import java.io.*;
import java.util.Set;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;
import java.awt.SystemColor;
public class Main {
	static String operation;
	private static JTextField textField;
static Calculator o = new Calculator();
	public static void main(String[] args) {
		 JFrame frame= new JFrame("Calculator");
			JPanel panel = new JPanel();
			panel.setBackground(Color.LIGHT_GRAY);
		 frame.setSize(450,650);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("1");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String number=textField.getText()+btnNewButton.getText();
				textField.setText(number);
				
			}
		});
		btnNewButton.setBorderPainted(false);
		btnNewButton.setBackground(new Color(0, 191, 255));
		btnNewButton.setBounds(80, 299, 56, 28);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("2");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String number=textField.getText()+btnNewButton_1.getText();
				textField.setText(number);
			}
		});
		btnNewButton_1.setBackground(new Color(0, 191, 255));
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(154, 299, 56, 28);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("3");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String number=textField.getText()+btnNewButton_1_1.getText();
				textField.setText(number);
			}
		});
		btnNewButton_1_1.setBackground(new Color(0, 191, 255));
		btnNewButton_1_1.setBorderPainted(false);
		btnNewButton_1_1.setBounds(233, 299, 56, 28);
		panel.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_2 = new JButton("4");
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String number=textField.getText()+btnNewButton_1_2.getText();
				textField.setText(number);
			}
		});
		btnNewButton_1_2.setBackground(new Color(0, 191, 255));
		btnNewButton_1_2.setBorderPainted(false);
		btnNewButton_1_2.setBounds(322, 299, 56, 28);
		panel.add(btnNewButton_1_2);
		
		JButton btnNewButton_1_3 = new JButton("5");
		btnNewButton_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String number=textField.getText()+btnNewButton_1_3.getText();
				textField.setText(number);
			}
		});
		btnNewButton_1_3.setBackground(new Color(0, 191, 255));
		btnNewButton_1_3.setBorderPainted(false);
		btnNewButton_1_3.setBounds(10, 351, 56, 28);
		panel.add(btnNewButton_1_3);
		
		JButton btnNewButton_1_4 = new JButton("6");
		btnNewButton_1_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String number=textField.getText()+btnNewButton_1_4.getText();
				textField.setText(number);
			}
		});
		btnNewButton_1_4.setBackground(new Color(0, 191, 255));
		btnNewButton_1_4.setBorderPainted(false);
		btnNewButton_1_4.setBounds(80, 351, 56, 28);
		panel.add(btnNewButton_1_4);
		
		JButton btnNewButton_1_5 = new JButton("7");
		btnNewButton_1_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String number=textField.getText()+btnNewButton_1_5.getText();
				textField.setText(number);
			}
		});
		btnNewButton_1_5.setBorderPainted(false);
		btnNewButton_1_5.setBackground(new Color(0, 191, 255));
		btnNewButton_1_5.setBounds(154, 351, 56, 28);
		panel.add(btnNewButton_1_5);
		
		JButton btnNewButton_1_6 = new JButton("8");
		btnNewButton_1_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String number=textField.getText()+btnNewButton_1_6.getText();
				textField.setText(number);
			}
		});
		btnNewButton_1_6.setBackground(new Color(0, 191, 255));
		btnNewButton_1_6.setBorderPainted(false);
		btnNewButton_1_6.setBounds(233, 351, 56, 28);
		panel.add(btnNewButton_1_6);
		
		JButton btnNewButton_1_7 = new JButton("9");
		btnNewButton_1_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String number=textField.getText()+btnNewButton_1_7.getText();
				textField.setText(number);
			}
		});
		btnNewButton_1_7.setBackground(new Color(0, 191, 255));
		btnNewButton_1_7.setBorderPainted(false);
		btnNewButton_1_7.setBounds(322, 351, 56, 28);
		panel.add(btnNewButton_1_7);
		
		
		
		JButton btnNewButton_2 = new JButton("+");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				o.x=Double.parseDouble(textField.getText());
				String number=textField.getText()+btnNewButton_2.getText();
				textField.setText("");
				operation="+";
			}
		});
		btnNewButton_2.setBackground(new Color(0, 255, 0));
		btnNewButton_2.setBorderPainted(false);
		btnNewButton_2.setBounds(35, 428, 134, 40);
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_2_1 = new JButton("-");
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				o.x=Double.parseDouble(textField.getText());
				String number=textField.getText()+btnNewButton_2_1.getText();
				textField.setText("");
				operation="-";
			}
		});
		btnNewButton_2_1.setBackground(new Color(0, 255, 0));
		btnNewButton_2_1.setBorderPainted(false);
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2_1.setBounds(220, 426, 134, 42);
		panel.add(btnNewButton_2_1);
		
		JButton btnNewButton_2_2 = new JButton("/");
		btnNewButton_2_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				o.x=Double.parseDouble(textField.getText());
				String number=textField.getText()+btnNewButton_2_2.getText();
				textField.setText("");
				operation="/";
			}
		});
		btnNewButton_2_2.setBackground(new Color(0, 255, 0));
		btnNewButton_2_2.setBorderPainted(false);
		btnNewButton_2_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2_2.setBounds(35, 490, 134, 41);
		panel.add(btnNewButton_2_2);
		
		JButton btnNewButton_2_3 = new JButton("*");
		btnNewButton_2_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				o.x=Double.parseDouble(textField.getText());
				textField.setText("");	
				operation="*";
			}
		});
		btnNewButton_2_3.setBackground(new Color(0, 255, 0));
		btnNewButton_2_3.setBorderPainted(false);
		btnNewButton_2_3.setBounds(220, 490, 137, 41);
		panel.add(btnNewButton_2_3);
		
		textField = new JTextField();
		textField.setBounds(10, 116, 368, 119);
		panel.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton_2_2_1 = new JButton("=");
		btnNewButton_2_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String answer;
				o.y=Double.parseDouble(textField.getText());
				
				Object result;
				if(operation=="+")
				{
					result=o.addition();
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation=="-")
				{
					result=o.subtraction();
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation=="*")
				{
					result=o.multipilication();
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation=="/")
				{
					result=o.division();
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}	
			}
		});
		
	
		
		btnNewButton_2_2_1.setBackground(new Color(0, 0, 255));
		btnNewButton_2_2_1.setBorderPainted(false);
		btnNewButton_2_2_1.setBounds(35, 541, 134, 41);
		panel.add(btnNewButton_2_2_1);
		
		JButton btnNewButton_2_2_1_1 = new JButton("C");
		btnNewButton_2_2_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(null);
			}
		});
		btnNewButton_2_2_1_1.setForeground(Color.BLACK);
		btnNewButton_2_2_1_1.setBorderPainted(false);
		btnNewButton_2_2_1_1.setBackground(Color.BLUE);
		btnNewButton_2_2_1_1.setBounds(220, 541, 134, 41);
		panel.add(btnNewButton_2_2_1_1);
		
		JButton btnNewButton_1_5_1 = new JButton("0");
		btnNewButton_1_5_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String number=textField.getText()+btnNewButton_1_5_1.getText();
				textField.setText(number);
			}
		});
		btnNewButton_1_5_1.setBorderPainted(false);
		btnNewButton_1_5_1.setBackground(new Color(0, 191, 255));
		btnNewButton_1_5_1.setBounds(10, 299, 56, 28);
		panel.add(btnNewButton_1_5_1);

	}
}