package mphasis.basis;
class Employee{
	
	int empno;
	String empname;
	double salar;
	
	double incrSalary(double bonus) {
	return salar+bonus;	
	}
}


public class method {
	public static void main(String[] args) {

	Employee e =new Employee();
	e.salar =50000;
	System.out.println(e.incrSalary(5000));

}
}



