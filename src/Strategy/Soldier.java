package Strategy;


// Strategy를 사용하는 클래스
public class Soldier {
	void runContext(Strategy strategy) {
		System.out.println("전투 시작");
		strategy.runStrategy();
		System.out.println("전투 종료");
	}
	
	
}
