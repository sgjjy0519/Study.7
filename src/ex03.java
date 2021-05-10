
public class ex03 {

	public static void main(String[] args) {
		Parent p = new Parent("스폰지밥",8,120.5);
		p.infomation();
	}

}

class Parent{
	String name;
	int age;
	double height;
	
	public Parent(String name, int age, double height) {
		this.name = name;
		this.age = age;
		this.height = height;
	}
	
	public void infomation(){
		System.out.println("###인적 사항###");
		System.out.print("이름 : "+name+"\n"+"나이 : "+age+"\n"+"신장 : "+height);
	}
}
