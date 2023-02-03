/**
 * @Class: MaleStudent
 * @Author: Miguel Ramirez
 * @Version: 1.0
 * @Date: January 26, 2023
 * Description: This program will write a code that
 * will compute on how many male students there are out
 * of 389 that are in the middles school by subtracting
 * the total of students there are in the school
 * by the total of females that are know to be in the school.
 */

public class MaleStudent {
    public static void main(String[] args){
        int totalStudents = 389;
        int femaleStudents = 175;
        int totalMaleStudents = totalStudents - femaleStudents;
        System.out.println("There is a total of " + totalMaleStudents + " male students in the middle school.");

    }
}
