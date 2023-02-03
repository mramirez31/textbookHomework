/**
 * @Class: Chocolate
 * @Author: Miguel Ramirez
 * @Version: 1.0
 * @Date: January 26, 2023
 * Description: This program will write a code that will
 * calculate the amount of bags you will need when
 * you put three chocolate bars in one bag instead of two.
 */

public class Chocolate {
    public static void main(String[] args){
        int bagOfChocolate = 9;
        int chocolateBars = 2;
        int totalBars = bagOfChocolate * chocolateBars;
        int new_Bags = 3;
        int totalBags = totalBars/new_Bags;
        System.out.println("You will need " + totalBags + " bags to fit three chocolate bars into each bag.");
    }
}
