
public class ex04 {

	public static void main(String[] args) {
		SubEntry e = new SubEntry("OOP","Object Oriented Programming", 1991);
		e.printView();
	}

}

class Entry{
	String word;
	
	Entry(){  
		System.out.println("***약어사전***");
	}
	
	public Entry(String word) {
		this.word = word;
	}
	
	public void writeView() {
		System.out.println("약어 : "+word);
	}
}

class SubEntry extends Entry{
	String definition;
	int year;
	
	SubEntry(String word){
		super(word);
	}
	
	SubEntry(String word, String definition, int year){
		super(word);
		this.definition = definition;
		this.year = year;
	}
	
	public void printView() {
		super.writeView();
		System.out.println("원어 : "+definition+"\n"+"시기 : "+year);
	}
}