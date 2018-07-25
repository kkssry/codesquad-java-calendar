package kkssry.calendar;

import java.util.Scanner;

public class Calendar {

	private static final int[] MAX_DAYS = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public int getMaxDaysOfMonth(int month) {

		return MAX_DAYS[month - 1];
	}

	public void printSampleCalendar() {
		System.out.println("일  월  화  수  목  금  토  일");
		System.out.println("--------------");
		int[] calendar = new int[28];
		int num = 1;
		for (int i = 0; i < 4; ++i) {
			for (int j = 0; j <= 6; ++j) {
				calendar[j] = num++;
				System.out.print(" " + calendar[j] + " ");
			}
			System.out.println();
		}
	}
	
	

	public static void main(String[] args) {

		// 숫자를 입력받아 해당하는 달의 최대 일수를 출력하는 프로그램
		Scanner scan = new Scanner(System.in);
		Calendar cal = new Calendar();
		
		System.out.println("반복횟수를 입력하세요.");
		int repeat = scan.nextInt();
		for(int i=0;i<repeat;++i) {
			System.out.println("달을 입력하세요");
			int month = scan.nextInt();
			System.out.printf("%d월은 %d일까지 있습니다.",month,cal.getMaxDaysOfMonth(month));
			System.out.println();
		}
		System.out.println("bye~~");
		
		System.out.println("달을 입력하세요");
		int month = scan.nextInt();
		System.out.println("입력하는 달의 일수는 " + cal.getMaxDaysOfMonth(month) + "일 입니다.");
		cal.printSampleCalendar();
		System.out.println("------------");
		
		
		
		scan.close();
	}

	
}
