package template2;

public class CarTest {

	public static void main(String[] args) {

		System.out.println("====자율주행 하는 자동차====");
		Car car = new AICar();
		car.run();

		System.out.println("====사람이 운전하는 자동차====");
		Car car2 = new ManualCar();
		car2.run();
	}

}
