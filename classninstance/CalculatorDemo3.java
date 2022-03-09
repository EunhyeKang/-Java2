package org.opentutorials.javatutorials.classninstance;
/*
 * Calculator은 인스턴스 변수 left와 right를 이용해서 합계(sum)과 평균(avg)을 계산한다. 
 * 생각해보면 굳이 인스턴스가 left와 right의 값을 항상 유지하고 있어야 할 이유는 없다. 
 * 합계나 평균을 구할 때마다 좌항과 우항의 값을 주는 방식으로 계산을 할 수도 있다.
 */

class Calculator3{
	
	public static void sum(int left,int right) {
		System.out.println(left+right);
	}
	
	public static void avg(int left, int right) {
		System.out.println((left+right)/2);
	}
}


public class CalculatorDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator3.sum(10, 20);
		Calculator3.avg(10, 20);
		
		Calculator3.sum(20, 40);
		Calculator3.avg(20, 40);
	}

}
