
public class ex02 {

	public static void main(String[] args) {
		SuperClass sc = new SuperClass();
		SuperClass sc1 = new SuperClass(10);
		SuperClass sc2 = new SuperClass(10,20);
		SuperClass sc3 = new SuperClass(10,20,30);
		
	}

}

class SuperClass{
	int x,y,z;
	
	public SuperClass(){
		System.out.println("****x,y,z에 값 채우기****");
	}
	
	public SuperClass(int x) {
		System.out.println(x+" 을 넘겨받은 생성자");
	}
	
	public SuperClass(int x, int y) {
		System.out.println(x+" "+y+" 을 넘겨받은 생성자");
	}
	
	public SuperClass(int x, int y, int z) {
		System.out.println(x+" "+y+" "+z+" 을 넘겨받은 생성자");
		System.out.println("합 : "+(x+y+z));
	}
	
	
}


