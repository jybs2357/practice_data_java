package chap01;

import java.util.Scanner;

public class Max3 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in); //stdIn은 변수라 변경 가능, System.in의 의미는? 문자나 숫자를 꺼내는 장치
		
		System.out.println("세 정수의 최대값을 구합니다.");
		System.out.println("a의 값: "); int a = stdIn.nextInt(); //nextInt()의 의미는?
		System.out.println("b의 값: "); int b = stdIn.nextInt();		
		System.out.println("c의 값: "); int c = stdIn.nextInt();
		
		int max = a;
		if (b > max) max = b;
		if (c > max) max = c;	
		
		System.out.println("최대값은 " + max + "입니다.");
	}
}
