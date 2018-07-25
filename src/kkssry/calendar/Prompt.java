package kkssry.calendar;

import java.util.Scanner;

import kkssry.calendar.Calendar;

public class Prompt {
	
	private final static String PROMPT = "cal> ";
	
	public void runPrompt() {
		Scanner scan = new Scanner(System.in);
		Calendar cal = new Calendar();
		
		int month = 0;
		int year = 0;
		
		
		while (true) {
			System.out.println("년도를 입력하세요");
			System.out.print("YEAR> ");
			year = scan.nextInt();
			System.out.println("월을 입력하세요");
			System.out.print("MONTH> ");
			month = scan.nextInt();

			if (month ==-1) {
				System.out.println("Bye~");
				break;
			}
			
			if(month>12) {
				continue;
			}
			
			cal.printCalendar(year,month);
			System.out.println();
	}

		scan.close();

	}
}
