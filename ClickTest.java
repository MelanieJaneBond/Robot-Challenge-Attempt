import java.awt.Robot;
import java.awt.*;
// import java.awt.AWTException;
// import java.awt.event.InputEvent;
import java.awt.event.*;

public class ClickTest {
    public static void main(String args[]) throws AWTException {
        
        Robot robot = new Robot();
        int mask = InputEvent.MOUSE_BUTTON1_DOWN;
        robot.mouseMove(x, y);           
        robot.mousePress(mask);     
        robot.mouseRelease(mask);
    }
}    