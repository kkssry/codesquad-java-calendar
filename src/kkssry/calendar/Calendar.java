package kkssry.calendar;

public class Calendar {
	
	public static void main(String[] args) {
//		System.out.println("Hello, Calendar");
		System.out.println("�� �� ȭ �� �� �� ��");
		System.out.println("--------------");
		int[] calendar = new int[28];
		int num = 1;
		for(int i=0;i<4;++i) {
			for(int j=0;j<=6;++j) {
				calendar[j] = num++;
//				System.out.print();
				System.out.print(calendar[j] + " ");
			}
			System.out.println();
		}
	}
}
