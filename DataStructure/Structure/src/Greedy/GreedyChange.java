package Greedy;

public class GreedyChange {
	public static void main(String[] args) throws Exception{
		int amount = 1244;
		int coin[] = {20,5,1}; //2*20+5*3+1*1
		
		int num;
		
		for(int i=0; i<coin.length;i++) {
			
			if(coin[i]<=amount) {
				num = amount/coin[i];
				System.out.println(num+" $"+coin[i]);
				amount-=num*coin[i];
			}
		}
	}

}
