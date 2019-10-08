import java.awt.Robot;
import java.awt.*;
// import java.awt.AWTException;
// import java.awt.event.InputEvent;
import java.awt.event.*;

public class AutoEvents {
    public static void AutoClicks(Robot robot) {
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
    }

    public static void AutoPresses(Robot robot) {
        robot.keyPress(InputEvent.VK_TAB);
        robot.keyPress(InputEvent.VK_TAB);
    }

} 