package gitau634969;
import java.awt.TextArea;
import javax.swing.JOptionPane;

public class Lesson5DialogBox {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		TextArea output = new TextArea(10,10);
		int n =1;
		output.append("Number\t Square\t Cube\n");
		
		
		while(n<=7){		
		output.append(n + "\t"+n*n+"\t"+n*n*n+"\n");
		//JOptionPane.showMessageDialog(null, "Welcome, the value of:!    "+n);
		++n;
		}
		output.append("Number\t Square\t Cube\n");
		output.insert("Okwonkwo\tJames\t", 20); //inserts at row 1 column 20
		JOptionPane.showMessageDialog(null, output);
	}

}
