package strings_and_dialogs;
import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyJavaProgram {
	
	public static void main(String[] args) throws InterruptedException {
		
		// START HERE
	Robot jama = new Robot();
	jama.penDown();
	 for(int i= 0; i<4; i++) {
		 jama.move(100);
		 jama.turn(90);

	 }
	}
}
