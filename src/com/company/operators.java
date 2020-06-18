//Bridget Hill
// 6/18/20
//Print a statement asking the user to input the given meal price, the tip %, and the tax % (precise values)
//Input a scanner to get meal, tip, and tax% in whole numbers
//*create a method to solve the problem* ex. [ static void solve (double meal_cost, int tip_percent, int tax_percent) {
//}
//Double mealCost = x
//Int tipPercent = % of mealCost being added as tip
//Int taxPercent = % of mealCost being added as tax
//Round the total cost to a whole number (no decimal points)
//Print the final integer

package com.company;
import java.util.*;

public class operators {

    public static void main(String [] args) {
        double mealPrice = 0;
        int tipPercent = 0;
        int taxRate = 0;
   solve(mealPrice, tipPercent, taxRate);
    }
    public static void solve ( double mealPrice, int tipPercent, int taxRate){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter the cost of your meal:");
        mealPrice = keyboard.nextDouble();
        System.out.println("Please enter the tip percentage:");
        tipPercent = keyboard.nextInt();
        System.out.println("Please enter the tax percentage:");
        taxRate = keyboard.nextInt();
        double tiptotal = (double) tipPercent/100*mealPrice;
        double taxtotal = (double) taxRate/100 * mealPrice;
        double total = tiptotal + taxtotal + mealPrice;
        System.out.print("Total cost of meal: ");
        System.out.printf("\n%1.0f $", total);



    }
}
