
public class TestTime {

	public static void main(String[] args) {
		Time t1 = new Time(1,2,3);
		//Constructor with parameter
		System.out.println(t1);
		//Default Constructor
		Time t2 = new Time();
		System.out.println(t2);
		//Test Setters and Getters
		t1.setHour(4);
		t1.setMinute(5);
		t1.setSecond(6);
		System.out.println("\n"+t1);
		System.out.println("Hour is: "+t1.getHour());
		System.out.println("Minute is: "+t1.getMinute());
		System.out.println("Second is: "+t1.getSecond());
		
		//Test setTime()
		t1.setTime(58, 59, 23);
		System.out.println("\n"+t1);
		// 23:59:58
		
		//Test nextSecond()
		System.out.println(t1.nextSecond());
		// 23:59:59
		System.out.println(t1.nextSecond().nextSecond().nextSecond());
		// 00:00:02
	}

}
