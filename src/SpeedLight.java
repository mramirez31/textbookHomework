/**
 * @Class: SpeedLight
 * @Author: Miguel Ramirez
 * @Version: 1.0
 * @Date: January 26,2023
 * Description: This program will write a code that
 * will calculate the speed of light from
 * the distance of a lightning strike based
 * on the speed of sound and the time it took for
 * the sound of thunder to reach your ears.
*/
public class SpeedLight {
    public static void main(String[] args){
        int speedOfSound = 340;
        int timeElapsed = 5;
        int distance = speedOfSound * timeElapsed;
        System.out.println("Speed of sound: " + speedOfSound);
        System.out.println("Time Elapsed: " + timeElapsed);
        System.out.println("Distance: " + distance);

    }

}
