package Section1;

public class MyDate {
	public int year;
	public int month;
	public int day;
	
	public MyDate(int y, int m, int d) {
		this.year = y;
		this.month = m;
		this.day = d;
	}

	@Override
	public String toString() {
		return "MyDate [year=" + year + ", month=" + month + ", day=" + day + "]";
	}
	
	
	
}
