package constructor;

class EmpInfo{
	int id=2499029;
	String name="Madhu";

void display() {
	System.out.println(id+""+name);
}
}
public class constructorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmpInfo emp1=new EmpInfo();
		EmpInfo emp2=new EmpInfo();
		emp1.display();
		emp2.display();

	}

}
