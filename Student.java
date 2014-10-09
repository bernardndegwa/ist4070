package gitau634969;

public class Student {
	
	String name, idnumber;
	double fees;
	
public Student(){
		
		
	}
public Student(String name, String idnumber, double fees){
		this.fees=fees;
		this.idnumber=idnumber;
		this.name=name;
		
	}

public void setName(String name) {
	this.name = name;
}
public void setFees(double fees) {
	this.fees = fees;
}
public void setIdnumber(String idnumber) {
	this.idnumber = idnumber;
}
public String getName() {
	return name;
}
public double getFees() {
	return fees;
}
public String getIdnumber() {
return idnumber;
}
@Override
public String toString() {
	return getName() + "\t" + getFees()+ "\t" + getIdnumber() + "\n";
}
}
