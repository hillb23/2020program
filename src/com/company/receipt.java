package com.company;

class Receipt {

    public static final double WAFFLE = 38;
    public static final double CHICKEN = 40;
    public static final double FIJI = 30;

    public static void main(String[] args) {
        final double TAX_RATE =  0.08;
        final double TIPS = 0.15;

        // Calculate total owed, assuming 8% tax / 15% tip
        double Subtotal = WAFFLE + CHICKEN + FIJI;
        double Tax = Subtotal * TAX_RATE;
        double Tip = Subtotal * TIPS;
        double Total = Subtotal + Tax + Tip;

        System.out.println("Subtotal:" + Subtotal);

        System.out.println("Tax:" + Tax);

        System.out.println("Tip:" + Tip);


        System.out.println("Total:" + Total);

    }

}
