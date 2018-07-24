package kkssry.calendar;

import java.util.Scanner;

public class Calendar {
	
	public static void main(String[] args) {
//		System.out.println("Hello, Calendar");
		System.out.println("일  월  화  수  목  금  토  일");
		System.out.println("--------------");
		int[] calendar = new int[28];
		int num = 1;
		for(int i=0;i<4;++i) {
			for(int j=0;j<=6;++j) {
				calendar[j] = num++;
				// System.out.print();
				System.out.print(" "+calendar[j] + " ");
			}
			System.out.println();
		}
		
		//숫자를 입력받아 해당하는 달의 최대 일수를 출력하는 프로그램
		Scanner scan = new Scanner(System.in);
		 System.out.println("달을 입력하세요");
		int month = scan.nextInt();
		int[] maxDays = {31,28,31,30,31,30,31,31,30,31,30,31};
		System.out.println("입력하는 달의 일수는 " + maxDays[month-1] + "일 입니다.");
		scan.close();
	}
}
