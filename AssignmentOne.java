package gitau634969;

public class AssignmentOne {
	
	String employeeName;
	Double payBeforeTaxesAndWithoutOvertime;
	Double overtimePayBeforeTaxes;
	Double totalPayBeforeTaxes;
	Double totalHoursWorked;
	Double payRate;
	Double straightHours = 40.0;
	
	public AssignmentOne(){
		
	}
	
	public AssignmentOne(String employeeName, Double hoursWorked, Double payRate){
		this.employeeName = employeeName;
		this.totalHoursWorked = hoursWorked;
		this.payRate = payRate;		
	}

	public double overtimePayBeforeTaxes(double payRate, double totalHoursWorked ) {
		double overTimeHours = totalHoursWorked - straightHours;
		double overTimeRate = payRate * 1.5;
		return overTimeHours * overTimeRate;
		}

	public double totalPayBeforeTaxesAndWithoutOvertime(double straightHours, double payRate) {
		
		return straightHours * payRate;
	}
	

}
