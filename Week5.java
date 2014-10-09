package gitau634969;
import javax.swing.*;

public class Week5 {

	
	 public static void main(String[] args) {
		 
		 int a,b,c;
		 String s;
		 
		 s = JOptionPane.showInputDialog("Enter first number");
		 a=Integer.parseInt(s);
		 s = JOptionPane.showInputDialog("Enter second number");
		 b=Integer.parseInt(s);
		 c=a+b;
		 JOptionPane.showMessageDialog(null, c+" ");
		 
		 
		 Double aD,bD,cD;
		 s = JOptionPane.showInputDialog("Enter first number");
		 aD=Double.parseDouble(s);
		 s = JOptionPane.showInputDialog("Enter second number");
		 bD=Double.parseDouble(s);
		 cD=aD+bD;
		 JOptionPane.showMessageDialog(null, cD+" ");
	}

}
