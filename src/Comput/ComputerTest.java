package Comput;

public class ComputerTest {

	public static void main(String[] args) {
		Computer c1 = new DeskTop();
		Computer c2 = new NoteBook();
		Computer c3 = new WorkStation();
		
		c1.display();
		c1.typing();
		
		System.out.println();
		
		c2.display();
		c2.typing();
		
		System.out.println();	
		
		c3.display();
		c3.typing();
		
	}

}
