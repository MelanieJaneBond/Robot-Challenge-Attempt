import java.awt.AWTException;

public class Program {
    private AutoClick autoClick;
    private Robot robot;
    private Runtime runtime;

    public void ClickThings() {
        int xSet = 1100;
        int ySet = 500;
        int x = 0;
        int y = 0;
        double alpha = 0;
        runtime = Runtime.getRuntime();

        try {
            robot = new Robot();
            
        } catch (AWTException e) {
            e.printStackTrace();
        }
        try {
            runtime.exec("")
            
        } catch (Exception e) {
            //TODO: handle exception
        }
    
            robot.delay(1000);
    }
}