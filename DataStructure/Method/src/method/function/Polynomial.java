package method.function;
//�ϳ��� ���׽��� ǥ���ϱ� ���� Ŭ����
public class Polynomial {
	public char name; 
	public Term[] terms;
	public int nTerms =0; //������ ����Ǿ� �ִ� ���� ����
	

	public int calcPolynomial(int x) {
		int result = 0;
		for ( int i =0; i< nTerms; i++)
			result += terms[i].calcTerm(x);
		return result;
	}



	public void printPolynomial() {
		for (int i = 0; i < nTerms; i++) { 
			terms[i].printTerm();
			System.out.print("+");
		}
		System.out.println();
	}
	public void addTerm(int c, int e) {
		int index = findTerm(e);
		if (index != -1) {
			terms[index].coef += c; //���� -5x^3 + 5x^3
		}
		else {
			int i = nTerms -1; //������ ��
			while ( i >=0 && terms[i].exp < e) {
				terms[i+1] = terms[i];
				i--;
			}
			terms[i+1] = new Term();
			terms[i+1].coef = c;
			terms[i+1].exp = e;
			nTerms++;
		}
	}
	public int findTerm(int e) { //������ e�� ���� �ִ� �� Ȯ��
		for (int i = 0; i < nTerms && terms[i].exp >= e; i++)
			if (terms[i].exp == e)
				return i;
		return -1;
	}
}
