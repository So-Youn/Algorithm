package Section1;

import java.util.Scanner;

public class Scheduler {

	private int capacity = 10; // �迭�� ũ��
	Event[] events = new Event[capacity];
	public int n = 0;
	private Scanner sc;

	public void processCommand() {
		sc = new Scanner(System.in);
		while (true) {
			System.out.print("$ ");
			String command = sc.next();
			if (command.equals("addevent")) {
				String type = sc.next();
				if (type.equalsIgnoreCase("oneday")) {
					handleAddOneDayEvent();
				} else if (type.equalsIgnoreCase("duration")) {
					handleAddDurationEvent();
				} else if (type.equalsIgnoreCase("deadline")) {
					handleAddDeadlineEvent();
				}
			} else if (command.equals("list")) {
				handleList();
			} else if (command.equals("show")) {
				
			} else if (command.equals("exit")) {
				break;
			}
		}
		sc.close();

	}

	private void handleList() {
		for (int i = 0; i < n; i++)
			System.out.println("=>" + events[i].toString());
	}

	private void handleAddOneDayEvent() {
		System.out.print(" when:");
		String dateString = sc.next(); // dateString : "2017/01/20";
		System.out.print(" title:");
		String title = sc.next();

		MyDate date = parseDateString(dateString);
		OneDayEvent ev = new OneDayEvent(title, date);
		// System.out.println(ev.toString());
		addEvent(ev);
	}

	private void addEvent(OneDayEvent ev) {
		if (n >= capacity)
			reallocate();
		events[n++] = ev; // superŬ���� Ÿ���� ��ü ���� ����
	}
	//�迭 ���Ҵ�
	private void reallocate() {
		Event[] tmp = new Event[capacity *2];
		for(int i=0;i<n;i++)
            tmp[i] = events[i];
		events = tmp;
		capacity *=2;
		//������ �迭�� garbage (������ ��ü) ->Java�� garbage collection�� �ڵ����� ó�����ش�.
	}

	private MyDate parseDateString(String dateString) {
		String[] tokens = dateString.split("/");
		int year = Integer.parseInt(tokens[0]);
		int month = Integer.parseInt(tokens[1]);
		int day = Integer.parseInt(tokens[2]);
		// ����ڰ� �Է��� ����,��,���� �̿��� �ϳ��� MyDate��ü ����
		MyDate d = new MyDate(year, month, day);
		return d;
	}

	private void handleAddDurationEvent() {

	}

	private void handleAddDeadlineEvent() {

	}

	public static void main(String[] args) {
		Scheduler app = new Scheduler();
		app.processCommand();
	}

}
