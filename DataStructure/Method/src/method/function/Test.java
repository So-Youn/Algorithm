package method.function;

public class Test { //subclass of Object
	public int a = 10;
	public double x = 1.23;
	
	public String toString() { //overriding O
		return a + " "+ x;
	}
	public boolean equals(Object other) { //overriding O
		Test other2 = (Test)other;//Type Ä³½ºÆÃ
		return a==other2.a && x == other2.x;
	}
	public static void main(String[] args) {
		Test test1 = new Test();
		Test test2 = new Test(); 
		
		System.out.println(test1.toString());
		if(test2.equals(test1))
			System.out.println("yes");
		else
			System.out.println("no");
	}

}
