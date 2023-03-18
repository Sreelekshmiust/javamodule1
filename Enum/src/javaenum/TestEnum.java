package javaenum;

public class TestEnum {

	public static void main(String[] args) {
		
		DayOfWeek today = DayOfWeek.SATURDAY;
		System.out.println("Today is "+today.getName());
		
		switch(today) {
		case MONDAY:
			System.out.println("work hard");
			break;
		case TUESDAY:
			System.out.println("work little more");
			break;
		case WEDNESDAY:
			System.out.println("work work");
			break;
		case THURSDAY:
			System.out.println("work work weekend soon");
			break;
		case FRIDAY:
			System.out.println("weekend arrived");
			break;
		case SATURDAY:
			System.out.println("enjoy morning coffee");
			break;
		case SUNDAY:
			System.out.println("do all cleaning activities");
			break;
		}

	}

}
