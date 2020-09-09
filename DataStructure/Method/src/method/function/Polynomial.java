package method.function;
//하나의 다항식을 표현하기 위한 클래스
public class Polynomial {
	public char name; 
	public Term[] terms;
	public int nTerms =0; //실제로 저장되어 있는 항의 갯수
	

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
			terms[index].coef += c; //원래 -5x^3 + 5x^3
		}
		else {
			int i = nTerms -1; //마지막 항
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
	public int findTerm(int e) { //차수가 e인 항이 있는 지 확인
		for (int i = 0; i < nTerms && terms[i].exp >= e; i++)
			if (terms[i].exp == e)
				return i;
		return -1;
	}
}
