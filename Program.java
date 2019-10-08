import java.awt.AWTException;

public class Program {
    private AutoEvents autoEvents;
    private Robot robot;
    private Runtime runtime;

    public void ClickThings() {
        runtime = Runtime.getRuntime();

        try {
            robot = new Robot();
            
        } catch (AWTException e) {
            e.printStackTrace();
        }
        try {
            runtime.exec("")
            //this COULD be used to tell it to open an application
            //Maybe I could even put the LAUNCH function in here... not sure yet
        } catch (Exception e) {
            //TODO: handle exception
        }
    
        robot.delay(1000);

        autoEvents.AutoPresses(robot)
    }
}


//this is a number from box 5 in the web page"1076831"
//"VK_DOWN" is "arrow down"
// VK_LEFT
// VK_RIGHT
// VK_UP
// VK_TAB is "tab"
//VK_RETURN is "enter"
//VK_ENTER is actually "enter"

//the "Tab" key can take the robot through the items on the page.
// I'm not sure how to get on the second dot on item 3 but
// when I get to the drop-down menu, Tab can get me there, arrow keys
//can get me down to the 'do' word... it's 4th tap of arrow key down.