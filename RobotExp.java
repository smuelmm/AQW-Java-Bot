import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.util.Timer;


public class RobotExp {

    public static boolean stop = false;

    public static void keyPressed(KeyEvent arg0) {
        if(arg0.getKeyCode() == KeyEvent.VK_S) {
            stop = true;
        }
    }

    public static void main(String[] args) {
        int modo = 8;
        // 0: Merge Shop
        // 1: Lycan & StoneCrusher
        // 2: Cryomancer
        // 3: Frostval Barbarian
        // 4: ArchPaladin & ShadowScythe General
        // 5: Dark Lord (With auto turn-in)
        // 6: Glacial Berserker
        // 7: Blaze Binder (With auto turn-in for 2 quests)
        // 8: Chaos Avenger
        // 9: Dragon of Time
        // 10: SwordMaster
        try {
            Robot robot = new Robot();
            Timer cronometro = new Timer();

            switch (modo) {
                case 0:
                    //Merge Shop
                    while (stop != true) {
                        //change the coordinates X and Y in mouseMove according to the positioning of your "merge" button.
                        //I recommend using MPos to discovering the coordenates: 
                        //https://www.google.com/url?sa=t&rct=j&q=&esrc=s&source=web&cd=&cad=rja&uact=8&ved=2ahUKEwj2iZP75cn8AhXvrZUCHSPTATQQFnoECA4QAQ&url=https%3A%2F%2Fsourceforge.net%2Fprojects%2Fmpos%2F&usg=AOvVaw3iJDqdw8ARv1D02scy1iti
                        robot.delay(1750);
                        robot.mouseMove(685, 630);
                        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                    }
                    break;
                case 1:
                    //Lycan & StoneCrusher
                    while (stop != true) {
                        robot.delay(250);
                        robot.keyPress(KeyEvent.VK_NUMPAD1);
                        robot.keyRelease(KeyEvent.VK_NUMPAD1);
                        robot.keyPress(KeyEvent.VK_NUMPAD2);
                        robot.keyRelease(KeyEvent.VK_NUMPAD2);
                        robot.keyPress(KeyEvent.VK_NUMPAD3);
                        robot.keyRelease(KeyEvent.VK_NUMPAD3);
                        robot.keyPress(KeyEvent.VK_NUMPAD4);
                        robot.keyRelease(KeyEvent.VK_NUMPAD4);
                        robot.keyPress(KeyEvent.VK_NUMPAD5);
                        robot.keyRelease(KeyEvent.VK_NUMPAD5);
                    }
                    break;
                case 2:
                    //Cryomancer
                    while (stop != true) {
                        robot.delay(250);
                        robot.keyPress(KeyEvent.VK_NUMPAD1);
                        robot.keyRelease(KeyEvent.VK_NUMPAD1);
                        robot.keyPress(KeyEvent.VK_NUMPAD4);
                        robot.keyRelease(KeyEvent.VK_NUMPAD4);
                        robot.keyPress(KeyEvent.VK_NUMPAD5);
                        robot.keyRelease(KeyEvent.VK_NUMPAD5);
                        robot.keyPress(KeyEvent.VK_NUMPAD2);
                        robot.keyRelease(KeyEvent.VK_NUMPAD2);
                        robot.keyPress(KeyEvent.VK_NUMPAD3);
                        robot.keyRelease(KeyEvent.VK_NUMPAD3);
                    }
                    break;
                case 3:
                    //Frostval Barbarian
                    while (stop != true) {
                        robot.delay(250);
                        robot.keyPress(KeyEvent.VK_NUMPAD1);
                        robot.keyRelease(KeyEvent.VK_NUMPAD1);
                        robot.keyPress(KeyEvent.VK_NUMPAD2);
                        robot.keyRelease(KeyEvent.VK_NUMPAD2);
                        robot.keyPress(KeyEvent.VK_NUMPAD4);
                        robot.keyRelease(KeyEvent.VK_NUMPAD4);
                        robot.keyPress(KeyEvent.VK_NUMPAD3);
                        robot.keyRelease(KeyEvent.VK_NUMPAD3);
                    }
                    break;
                case 4:
                    //ArchPaladin e ShadowScythe General
                    while (stop != true) {
                        robot.delay(250);
                        robot.keyPress(KeyEvent.VK_NUMPAD1);
                        robot.keyRelease(KeyEvent.VK_NUMPAD1);
                        robot.keyPress(KeyEvent.VK_NUMPAD2);
                        robot.keyRelease(KeyEvent.VK_NUMPAD2);
                        robot.keyPress(KeyEvent.VK_NUMPAD3);
                        robot.keyRelease(KeyEvent.VK_NUMPAD3);
                        robot.keyPress(KeyEvent.VK_NUMPAD4);
                        robot.keyRelease(KeyEvent.VK_NUMPAD4);
                    }
                    break;
                case 5:
                    //Dark Lord
                    while (stop != true) {
                        robot.mouseMove(40, 624);
                        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                        robot.delay(2000);
                        robot.mouseMove(47, 697);
                        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                        robot.mouseMove(154, 706);
                        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                        robot.delay(150);
                        robot.keyPress(KeyEvent.VK_NUMPAD2);
                        robot.keyRelease(KeyEvent.VK_NUMPAD2);
                        robot.keyPress(KeyEvent.VK_NUMPAD3);
                        robot.keyRelease(KeyEvent.VK_NUMPAD3);
                        robot.keyPress(KeyEvent.VK_NUMPAD4);
                        robot.keyRelease(KeyEvent.VK_NUMPAD4);
                        robot.keyPress(KeyEvent.VK_NUMPAD3);
                        robot.keyRelease(KeyEvent.VK_NUMPAD3);
                        robot.keyPress(KeyEvent.VK_NUMPAD5);
                        robot.keyRelease(KeyEvent.VK_NUMPAD5);
                    }
                    break;
                case 6:
                    //GB
                    while (stop != true) {
                        robot.delay(100);
                        robot.keyPress(KeyEvent.VK_NUMPAD1);
                        robot.keyRelease(KeyEvent.VK_NUMPAD1);
                        robot.keyPress(KeyEvent.VK_NUMPAD2);
                        robot.keyRelease(KeyEvent.VK_NUMPAD2);
                        robot.keyPress(KeyEvent.VK_NUMPAD4);
                        robot.keyRelease(KeyEvent.VK_NUMPAD4);
                        robot.keyPress(KeyEvent.VK_NUMPAD5);
                        robot.keyRelease(KeyEvent.VK_NUMPAD5);
                        robot.keyPress(KeyEvent.VK_NUMPAD3);
                        robot.keyRelease(KeyEvent.VK_NUMPAD3);
                    }
                    break;
                case 7:
                    //Blaze Binder
                    while (stop != true) {
                            //Auto Turn-in, change the coordinates X and Y in mouseMove according to the positioning of your "back" and "turn-in" buttons.
                            //Use a coordinate that presses the same space as "back" when the quest is not done and "turn-in" when it is.
                            //I recommend using MPos to discovering the coordenates: 
                            //https://www.google.com/url?sa=t&rct=j&q=&esrc=s&source=web&cd=&cad=rja&uact=8&ved=2ahUKEwj2iZP75cn8AhXvrZUCHSPTATQQFnoECA4QAQ&url=https%3A%2F%2Fsourceforge.net%2Fprojects%2Fmpos%2F&usg=AOvVaw3iJDqdw8ARv1D02scy1iti
                            robot.mouseMove(900, 565);
                            robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                            robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                            robot.delay(2000);
                            robot.mouseMove(901, 781);
                            robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                            robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                            robot.delay(500);
                        robot.keyPress(KeyEvent.VK_NUMPAD1);
                        robot.keyRelease(KeyEvent.VK_NUMPAD1);
                        robot.keyPress(KeyEvent.VK_NUMPAD4);
                        robot.keyRelease(KeyEvent.VK_NUMPAD4);
                        robot.keyPress(KeyEvent.VK_NUMPAD5);
                        robot.keyRelease(KeyEvent.VK_NUMPAD5);
                        robot.keyPress(KeyEvent.VK_NUMPAD3);
                        robot.keyRelease(KeyEvent.VK_NUMPAD3);
                        robot.keyPress(KeyEvent.VK_NUMPAD2);
                        robot.keyRelease(KeyEvent.VK_NUMPAD2);
                            /*robot.delay(1000);
                            robot.mouseMove(100, 510);
                            robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                            robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                            robot.delay(2000);
                            robot.mouseMove(109, 692);
                            robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                            robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                            robot.mouseMove(385, 712);
                            robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                            robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                            robot.delay(2000);
                            robot.keyPress(KeyEvent.VK_NUMPAD1);
                            robot.keyRelease(KeyEvent.VK_NUMPAD1);
                            robot.keyPress(KeyEvent.VK_NUMPAD4);
                            robot.keyRelease(KeyEvent.VK_NUMPAD4);
                            robot.keyPress(KeyEvent.VK_NUMPAD5);
                            robot.keyRelease(KeyEvent.VK_NUMPAD5);
                            robot.keyPress(KeyEvent.VK_NUMPAD3);
                            robot.keyRelease(KeyEvent.VK_NUMPAD3);
                            robot.keyPress(KeyEvent.VK_NUMPAD2);
                            robot.keyRelease(KeyEvent.VK_NUMPAD2);*/
                    }
                    break;
                case 8:
                    //CA
                    while (stop != true) {
                        robot.delay(100);
                        robot.keyPress(KeyEvent.VK_NUMPAD1);
                        robot.keyRelease(KeyEvent.VK_NUMPAD1);
                        robot.keyPress(KeyEvent.VK_NUMPAD2);
                        robot.keyRelease(KeyEvent.VK_NUMPAD2);
                        robot.keyPress(KeyEvent.VK_NUMPAD3);
                        robot.keyRelease(KeyEvent.VK_NUMPAD3);
                        robot.keyPress(KeyEvent.VK_NUMPAD4);
                        robot.keyRelease(KeyEvent.VK_NUMPAD4);
                        robot.keyPress(KeyEvent.VK_NUMPAD5);
                        robot.keyRelease(KeyEvent.VK_NUMPAD5);
                            /*robot.mouseMove(50, 565);
                            robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                            robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                            robot.delay(1000);
                            robot.mouseMove(60, 685);
                            robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                            robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                            robot.mouseMove(227, 697);
                            robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                            robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);*/
                    }
                    break;
                case 9:
                    //Dragon of time
                    while (stop != true) {
                        robot.delay(100);
                        //robot.keyPress(KeyEvent.VK_NUMPAD4);
                        //robot.keyRelease(KeyEvent.VK_NUMPAD4);
                        robot.delay(1000);
                        robot.keyPress(KeyEvent.VK_NUMPAD2);
                        robot.keyRelease(KeyEvent.VK_NUMPAD2);
                        robot.delay(1000);
                        robot.keyPress(KeyEvent.VK_NUMPAD3);
                        robot.keyRelease(KeyEvent.VK_NUMPAD3);
                        while (stop != true){
                            robot.delay(100);
                            robot.keyPress(KeyEvent.VK_NUMPAD4);
                            robot.keyRelease(KeyEvent.VK_NUMPAD4);
                            robot.delay(1000);
                            robot.keyPress(KeyEvent.VK_NUMPAD5);
                            robot.keyRelease(KeyEvent.VK_NUMPAD5);
                            robot.delay(1000);
                            robot.keyPress(KeyEvent.VK_NUMPAD3);
                            robot.keyRelease(KeyEvent.VK_NUMPAD3);
                            robot.delay(1000);
                            robot.keyPress(KeyEvent.VK_NUMPAD2);
                            robot.keyRelease(KeyEvent.VK_NUMPAD2);
                            robot.delay(1000);
                            robot.keyPress(KeyEvent.VK_NUMPAD3);
                            robot.keyRelease(KeyEvent.VK_NUMPAD3);
                            robot.delay(1000);
                            robot.mouseMove(50, 565);
                            robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                            robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                            robot.delay(3000);
                            robot.mouseMove(60, 685);
                            robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                            robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                            robot.delay(100);
                            robot.keyPress(KeyEvent.VK_NUMPAD4);
                            robot.keyRelease(KeyEvent.VK_NUMPAD4);
                            robot.delay(1000);
                            robot.keyPress(KeyEvent.VK_NUMPAD5);
                            robot.keyRelease(KeyEvent.VK_NUMPAD5);
                            robot.delay(1000);
                            robot.keyPress(KeyEvent.VK_NUMPAD3);
                            robot.keyRelease(KeyEvent.VK_NUMPAD3);
                            robot.delay(1000);
                            robot.keyPress(KeyEvent.VK_NUMPAD2);
                            robot.keyRelease(KeyEvent.VK_NUMPAD2);
                            robot.delay(1000);
                            robot.mouseMove(50, 575);
                            robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                            robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                            robot.delay(3000);
                            robot.mouseMove(60, 685);
                            robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                            robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                        }
                    }
                    break;
                case 10:
                    //BladeMaster
                    while (stop != true) {
                    robot.delay(100);
                    robot.keyPress(KeyEvent.VK_NUMPAD3);
                    robot.keyRelease(KeyEvent.VK_NUMPAD3);
                    robot.keyPress(KeyEvent.VK_NUMPAD4);
                    robot.keyRelease(KeyEvent.VK_NUMPAD4);
                    robot.keyPress(KeyEvent.VK_NUMPAD5);
                    robot.keyRelease(KeyEvent.VK_NUMPAD5);
                    robot.keyPress(KeyEvent.VK_NUMPAD2);
                    robot.keyRelease(KeyEvent.VK_NUMPAD2);
                    robot.keyPress(KeyEvent.VK_NUMPAD4);
                    robot.keyRelease(KeyEvent.VK_NUMPAD4);
                }
                break;
            }
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }
}
