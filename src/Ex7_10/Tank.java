package Ex7_10;

public class Tank extends Unit {

	@Override
	void move(int x, int y) {
		System.out.println("Tank[ x = " + x + " , y = " + y + "]");
		
	}
	void changeMode() {
		System.out.println("공격모드 전환");
	}
}
