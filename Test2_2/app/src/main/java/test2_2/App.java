/*
 * This source file was generated by the Gradle 'init' task
 */
package test2_2;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner scanIn = new Scanner(System.in);
        System.out.println("enter N: ");
        int Number = scanIn.nextInt();

        for (int i = 0; i < Number;i++){
            for(int j = 0; j < Number;j++){
                if(i == 0 || i == Number - 1 || j == 0 || j == Number - 1){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
                
            }
            System.out.println();
        }
    }
}