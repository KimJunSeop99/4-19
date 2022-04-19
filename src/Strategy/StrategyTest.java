package Strategy;

public class StrategyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Strategy strategy = null;
		Soldier rambo = new Soldier();

//		다형성 형태 : spring DI(의존성 주입) 형태
//		총을 람보에게 전달해서 전투를 수행하게 만드는 부분
		strategy = new StrategyGun();
		rambo.runContext(strategy);
		System.out.println();
//		검을 람보에게 전달해서 전투를 수행하게 만듬
		strategy = new StrategySword();
		rambo.runContext(strategy);
		System.out.println();
//		활을 람보에게 전달해서 전투를 수행하게 만듬
		strategy = new StrategyBow();
		rambo.runContext(strategy);
	}
}
