package method.Class;

public class Code01 {
	public static void main(String[] args) {
		
		Person1 first = new Person1(); //Person1타입의  first변수 생성 [object]
		
		first.name = "John";
		first.number = "01023452349";
		
		System.out.println("Name:"+ first.name + ", Number: "+first.number);
		
		Person1[] members = new Person1 [10];
		members[0] = first;
		members[1] = new Person1();
		members[1].name = "David";
		members[1].number = "234345241";
		
		System.out.println("Name:"+members[1].name+ ", Number: "+members[1].number);
		
		members[2] = new Person1();
		members[2].name ="Tom";
		members[2].number = "23478389";
		System.out.println("Name:"+members[2].name+ ", Number: "+members[2].number);
	}

}
