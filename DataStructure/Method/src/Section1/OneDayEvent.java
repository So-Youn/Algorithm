package Section1;

public class OneDayEvent extends Event{
	//날짜 + 제목
	public MyDate date;
	
	public OneDayEvent(String title, MyDate date) {
		super(title);
		this.date = date;
	}

	@Override
	public String toString() {
		return "OneDayEvent [title=" + title + ", date=" + date + "]";
	}
	
	
}
