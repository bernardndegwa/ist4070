package gitau634969;

import java.util.Scanner;
import java.awt.TextArea;
import java.util.regex.*;
import javax.swing.JOptionPane;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

public class StudentTest {

	public static void main(String[] args) {
		Student usiu= new Student();
		Scanner input = new Scanner(System.in);
		
		TextArea put = new TextArea();
		JScrollPane scroll = new JScrollPane(put);
		
		
		
		
		System.out.println("Enter some data, pressing ctrl z would be nice: ");
		
		while (input.hasNext()){
			 String str = input.next();
			usiu.idnumber = input.next();
			usiu.fees = input.nextDouble();
			Pattern pattern = Pattern.compile("[a-zA-Z]");
			Matcher match = pattern.matcher(str);
			if (match.find( )) {
			usiu.name = match.group();
				}
			/*
			usiu.idnumber = input.next();
			usiu.fees = input.nextDouble();
			*/
			put.append(usiu.toString());				
		}
		JOptionPane.showMessageDialog(null, scroll);
	}

}
