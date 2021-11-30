package all_java_concept;

public class Basic1{

	private void employeeName() {
	System.out.println("Vimal");
}

	private void employeeId() {
	System.out.println("12354");

}

	private void employeeSalary() {
	System.out.println("23500");

	}
	
	private void employeeAddress() {
	System.out.println("Vadapalani, Chennai");
	}
	
	private void employeeDept() {
	System.out.println("Finance");

	}
	public static void main(String[] args) {
		Basic1 empdetails = new Basic1();
	    empdetails.employeeId();
	    empdetails.employeeName();
	    empdetails.employeeDept();
	    empdetails.employeeSalary();
	    empdetails.employeeAddress();
		
	}
}
