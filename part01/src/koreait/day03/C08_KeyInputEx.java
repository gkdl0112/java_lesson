package koreait.day03;

import java.util.Scanner;

public class C08_KeyInputEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int width ;			//사용자가 입력할 값
		int height;		//사용자가 입력할 값
		int box_area;
		double half,round,circle_area;
		final double PI = 3.14;
		
		System.out.println("[[사각형 도형의 넓이 구하기]]");
		System.out.print("사각형 너비 입력 -> ");
		width = sc.nextInt();
		System.out.print("사각형 높이 입력 -> ");
		height = sc.nextInt();
		
		box_area = width*height;
		
		System.out.println("처리결과 입니다.......");
		System.out.println("가로 : " + width + "㎝");
		System.out.println("세로 : " + height + "㎝");
		System.out.println("넓이를 구했습니다 : " + box_area + "㎠ ");
		
		System.out.println("\n[[원 도형의 넓이와 둘레 구하기]]");
		System.out.print("원의 반지름 입력 -> ");
		half = sc.nextDouble();
		
		round = 2 * PI * half;	//둘레
		circle_area = PI * half * half;	//넓이
		
		System.out.println("처리결과 입니다.......");
		System.out.printf("반지름 : %.3f ㎝ \n", half);
		System.out.printf("둘레를 구했습니다 : %.3f ㎝ \n", round);
		System.out.printf("넓이를 구했습니다 : %.3f	㎠ \n",circle_area);

		sc.close();		//키보드(표준입력장치) 자원 사용 해제.
	}
}
