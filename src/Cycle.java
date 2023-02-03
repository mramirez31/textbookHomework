/**
 * @Class: Cycle
 * @Author: Miguel Ramirez
 * @Version: 1.0
 * @Date: January 26, 2023
 * Description: This program will compute the number of
 * tricycles there are in the shop by subtraction.
 * The code will use the number of wheels that was counted
 * for in the shop and use the number of bicycles that
 * were counted for in the shop to find the amount
 * of tricycles are int the shop.
 */


public class Cycle {
    public static void main(String[] args){
        int bicycles = 10;
        int wheelsB = 2;
        int wheelsT = 3;
        int totalWheels = 47;
        int biTotal = bicycles * wheelsB;
        int triTotal = totalWheels - biTotal;
        int tricycles = triTotal/wheelsT;
        System.out.println("There are a total of " + tricycles + " tricycles at the shop.");
    }
}
