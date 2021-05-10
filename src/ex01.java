
public class ex01 {

	public static void main(String[] args) {
		Depart d = new Depart("제라드",99000000,"리버풀FC");
		d.getInfomation1();
		d.getInformation2();
		
	}

}

class Salary{
	String name;  //이름
	int salary;	  //연봉
	
	Salary(String name, int salary){
		this.name = name;
		this.salary = salary;
	}
	
	public void getInfomation1() {
		System.out.print("이름 : "+name+"\n연봉 : "+salary+"원"+"\n");
	}
}

class Depart extends Salary{
	String department; //부서
	
	Depart(String name, int salary, String department){
		super(name, salary);
		this.department = department;
	}
	
	public void getInformation2() {
		System.out.println("부서 : "+department);
	}
}
