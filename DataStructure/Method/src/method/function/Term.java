package method.function;

public class Term{
    public int coef; //계수
    public int exp;  //차수\
    
	public int calcTerm(int x) {
		
		return (int) (coef * Math.pow(x, exp));
		//Math.pow의 return 타입이 double이기때문에 형변환
	}
	

	public void printTerm() {
		System.out.print(coef+"x^"+exp); // -x^2 ? ==> +-1x^2로 출력됨
	}

}
