package org.opentutorials.javatutorials.overriding.example1;

class Calculator {
	int left, right;

	public void setOprands(int left, int right) {
		this.left = left;
		this.right = right;
	}

	public void sum() {
		System.out.println(this.left + this.right);
	}

	public int avg() {
        return (this.left + this.right)/2;
    }
}


class SubstractionableCalculator extends Calculator {

	public void sum() {
		System.out.println("실행 결과는 " + (this.left + this.right) + "입니다.");
	}

	public int avg() {
        return super.avg();
    }
	
	public void substract() {
		System.out.println(this.left - this.right);
	}
}


public class CalculatorDemo {
	public static void main(String[] args) {
		SubstractionableCalculator c1 = new SubstractionableCalculator();
		c1.setOprands(10, 20);
		c1.sum();//상위클래스의 메소드가 아니라 하위클래스의 메소드 sum을 실행하고 있다는 것을 알 수 있다.
		c1.avg();
		c1.substract();

	}
}