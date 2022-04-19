package template2;


public abstract class Car {
//	순서 1 시동켜기
	public void startCar() {
		System.out.println("시동을 켭니다.");
	}
//	순서 2 차몰기 메소드
	public abstract void drive();
//	순서 3 차정지 메소드
	public abstract void stop();
//	순서 4 차 정지 메소드
	public void endCar() {
		System.out.println("시동을 끕니다.");
	}
	
//	템플릿 메소드
//	변수에 final : 상수
//	메소드 final : 오버라이드 못하게 막음
	final public void run() {
		startCar(); // 고정
		drive(); // 오버라이딩 메소드
		stop(); // 오버라이딩 메소드
		endCar(); // 고정
	}
}
