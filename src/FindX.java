/**
 * @Class: FindX
 * @Author: Miguel Ramirez
 * @Version: 1.0
 * @Date: January 26, 2023
 * Description: Thsi program compute to find x based of the
 * formula 5 + 19 + X + 47 = 194 given to use and use the
 * formula to make a code program to find x by assigning
 * each value an integer to find x.
 */

public class FindX {
    public static void main(String[] args){
        int a = 5;
        int b = 19;
        int c = 47;
        int d = 194;
        int e = a + b + c;
        int x = d - e;
        System.out.println("The value for x in the formula is " + x);
    }
}
