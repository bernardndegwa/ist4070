package gitau634969;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AdditionGUI extends JFrame {

	private JPanel contentPane;
	private JTextField txtFirst;
	private JTextField txtSecond;
	private JTextField txtThird;
	private JTextField txtMax;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdditionGUI frame = new AdditionGUI();
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
	public AdditionGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 400, 650, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblFirstNumber = new JLabel("First Number");
		lblFirstNumber.setBounds(24, 40, 46, 14);
		contentPane.add(lblFirstNumber);
		
		txtFirst = new JTextField();
		txtFirst.setBounds(178, 37, 86, 20);
		contentPane.add(txtFirst);
		txtFirst.setColumns(10);
		
		JLabel lblSecondNumber = new JLabel("Second Number");
		lblSecondNumber.setBounds(24, 96, 46, 14);
		contentPane.add(lblSecondNumber);
		
		txtSecond = new JTextField();
		txtSecond.setBounds(178, 93, 86, 20);
		contentPane.add(txtSecond);
		txtSecond.setColumns(10);
		
		JLabel lblThird = new JLabel("Third Number");
		lblThird.setBounds(24, 152, 93, 20);
		contentPane.add(lblThird);
		
		txtThird = new JTextField("");
		txtThird.setBounds(178, 152, 86, 20);
		contentPane.add(txtThird);
		txtThird.setColumns(10);
		
		

		JLabel lblMax = new JLabel("Max of three numbers");
		lblMax.setBounds(24, 252, 93, 20);
		contentPane.add(lblMax);
		
		txtMax = new JTextField(" ");
		txtMax.setBounds(178, 252, 86, 20);
		contentPane.add(txtMax);
		txtMax.setColumns(10);
		
		/*
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				int a,b,c;
				 a = Integer.parseInt(txtFirst.getText());
				 b = Integer.parseInt(txtSecond.getText());
				 c= a+b;
				 txtSum.setText(c+" ");		
				
				 
			}
		});
		btnAdd.setBounds(79, 216, 74, 35);
		contentPane.add(btnAdd);
		 */		 
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				 txtFirst.setText(null);
				 txtSecond.setText(null);
				 txtThird.setText(null); 
				 
			}
		});
		btnClear.setBounds(150, 316, 74, 35);
		contentPane.add(btnClear);
		
		

		JButton btnLargestOfThree = new JButton("LargestOfThreeNumbers");
		btnLargestOfThree.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				 int a,b,c;
				 a = Integer.parseInt(txtFirst.getText());
				 b = Integer.parseInt(txtSecond.getText());
				 c= Integer.parseInt(txtThird.getText());
				int d = Math.max(a, Math.max(b, c));
				txtMax.setText(d+" ");		
				 
			}
		});
		btnLargestOfThree.setBounds(250, 316, 74, 35);
		contentPane.add(btnLargestOfThree);
	}
}
