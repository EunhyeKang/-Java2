package org.opentutorials.javatutorials.constant2;

/*
interface FRUIT{
	int APPLE = 1, PEACH = 2, BANANA = 3;
}

interface COMPANY{
	int GOOGLE = 1, APPLE = 2, ORANGE = 3;
}
*/

class Fruit{
	//int APPLE = 1, PEACH = 2, BANANA = 3;
	public static final Fruit APPLE = new Fruit();
	public static final Fruit PEACH = new Fruit();
	public static final Fruit BANANA = new Fruit();
}

class Company{
	//int GOOGLE = 1, APPLE = 2, ORANGE = 3;

	public static final Fruit GOOGLE = new Fruit();
	public static final Fruit APPLE = new Fruit();
	public static final Fruit ORANGE = new Fruit();
	
}

public class ConstantDemo {
/*
	// fruit
	private final static int APPLE = 1;
	private final static int PEACH = 2;
	private final static int BANANA = 3;
	// company
	private final static int GOOGLE = 1;
	// private final static int APPLE = 2;
	private final static int ORACLE = 3;
	*/
	
	/*
	// fruit
    private final static int FRUIT_APPLE = 1;
    private final static int FRUIT_PEACH = 2;
    private final static int FRUIT_BANANA = 3;  
    // company
    private final static int COMPANY_GOOGLE = 1;
    private final static int COMPANY_APPLE = 2;
    private final static int COMPANY_ORACLE = 3;
    */
    
	
	public static void main(String[] args) {
		/*
		if(Fruit.APPLE == Company.APPLE) {
			System.out.println("과일애플과 기업애플은 같습니다");
		}*/
		//이렇게 해주면 컴파일러가 잡아낼수 있다.
		
		Fruit type = Fruit.APPLE;
		
		switch (type) {
		case Fruit.APPLE:
			System.out.println(57 + " kcal");
			break;
		case Fruit.PEACH:
			System.out.println(34 + " kcal");
			break;
		case Fruit.BANANA:
			System.out.println(93 + " kcal");
			break;
		}
	}
}