package gitau634969;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import javax.swing.JOptionPane;
import java.awt.TextArea;
public class QuadraticSolverMain {

		
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		System.out.println(" Enter a quadratic equation:\n The quadratic equation must be of "
				+ "second order and match this sequence: \n 2x^2 + 4x + 2  Note the spacing between the operands and the operators\n");
		Scanner input  = new Scanner(System.in);
		
		String firstElement= input.next();
		
		String thirdElement= input.next();
	
		String fifthElement= input.next();	
		
			
		int a = extractInt(firstElement);
		int b = extractInt(thirdElement);
		int c = extractInt(fifthElement);	
		
		int bSquared = b * b;
		
		int fourAC = 4 * a * c;
		
		int beforeSquareRoot = bSquared - fourAC;
		
		/*
		  *double convertbeforeSquareRootToRealNumber = beforeSquareRoot < 0 ? System.out.println("The equation" +
		  *"has no real roots!!!") : beforeSquareRoot;
		*/
		
		if (beforeSquareRoot<0){
			System.out.println("The equation has no real roots!!!");
			System.exit(0);
		}
		double discriminant = Math.sqrt(beforeSquareRoot);
		double negativeB = -1 * b;
		double twoA = 2 *a;
		if(discriminant==0){
			double rootX = negativeB / twoA ;
			System.out.println(" The roots of x are equal:"+ rootX);
		}
		else {
		double unsignedRoot = (negativeB + discriminant)/twoA;
		double signedRoot = (negativeB - discriminant)/twoA;	
		System.out.println("The real roots of x are: "+ unsignedRoot+"\n");
		System.out.println("and  real roots of x are: "+ signedRoot);
		}
		
	}
		
		private static int extractInt(String str) {
			 Matcher matcher = Pattern.compile("\\d+").matcher(str);

		        if (!matcher.find() ){
		        	return 1;}
		        else
		            

		        return Integer.parseInt(matcher.group());
		    }
		}
