package method.function;

public class Term{
    public int coef; //���
    public int exp;  //����\
    
	public int calcTerm(int x) {
		
		return (int) (coef * Math.pow(x, exp));
		//Math.pow�� return Ÿ���� double�̱⶧���� ����ȯ
	}
	

	public void printTerm() {
		System.out.print(coef+"x^"+exp); // -x^2 ? ==> +-1x^2�� ��µ�
	}

}
