package kkssry.calendar;

public class Calendar {

	private static final int[] MAX_DAYS = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	private static final int[] LEAP_MAX_DAYS = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	
	public boolean isLeapYear(int year) {
		if(year % 4 ==0 && (year%100 != 0 || year % 400 ==0))
			return true;
		else
			return false;
	}

	public int getMaxDaysOfMonth(int year,int month) {
		if(isLeapYear(year)) {
			return LEAP_MAX_DAYS[month-1];
		}else {
			return MAX_DAYS[month - 1];
		}
	}

	public void printCalendar(int year, int month) {
		System.out.printf("  <<%4d%3d>>\n", 2017, month);
		System.out.println("SU MO TU WE TH FR SA");
		System.out.println("--------------");
		
//		if(isLeapYear(year)) {
//		
//		}
		
		int[] days = new int[7];
		int num = 1;
		
		for (int i = 0; i < 4; ++i) {
			for (int j = 0; j <= 6; ++j) {
				days[j] = num++;
				System.out.printf("%3d",days[j]);
			}
			System.out.println();
		}

		if (getMaxDaysOfMonth(year,month) % 7 > 0) {
			for (int i = 0; i < getMaxDaysOfMonth(year,month) % 28; ++i) {
				days[i] = num++;
				System.out.printf("%3d",days[i]);
			}
		}
		System.out.println();
	}

	public static void main(String[] args) {

		// 셀 실행
		Prompt p = new Prompt();
		p.runPrompt();

	}

}
