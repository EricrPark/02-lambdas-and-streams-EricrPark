package _00_JButtons_with_Lambdas;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class LambdaButtons {
	private JFrame window = new JFrame();
	private JButton addNumbers = new JButton("ADD 2 Numbers");
	private JButton randNumber = new JButton("RANDOM NUMBER");
	private JButton tellAJoke = new JButton("TELL A JOKE");
	
	public LambdaButtons() {
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setLayout(new FlowLayout());
		window.add(addNumbers);
		window.add(randNumber);
		window.add(tellAJoke);
		
		//1. Call the addActionListener methods for each button. Use lambdas
		//   to define to functionality of the buttons.
		
		window.setVisible(true);
		window.pack();
		//method that is easier
		addNumbers.addActionListener((e)->{
			String num1 = JOptionPane.showInputDialog("Add first number");
			String num2 = JOptionPane.showInputDialog("Add second number");
			int numb1 = Integer.parseInt(num1);
			int numb2 = Integer.parseInt(num2);
			int numb3 = numb1+numb2;
			JOptionPane.showMessageDialog(null, numb3);
		});
		randNumber.addActionListener((e)->{
			String num1 = JOptionPane.showInputDialog("Add first number");
			String num2 = JOptionPane.showInputDialog("Add second number");
			int numb1 = Integer.parseInt(num1);
			int numb2 = Integer.parseInt(num2);
			int numb3 = numb1+numb2;
			JOptionPane.showMessageDialog(null, numb3);
		});
		tellAJoke.addActionListener((e)->{
			String num1 = JOptionPane.showInputDialog("Add first number");
			String num2 = JOptionPane.showInputDialog("Add second number");
			int numb1 = Integer.parseInt(num1);
			int numb2 = Integer.parseInt(num2);
			int numb3 = numb1+numb2;
			JOptionPane.showMessageDialog(null, numb3);
		});
	}
	
	public static void main(String[] args) {
		new LambdaButtons();
	}
	
	
}
