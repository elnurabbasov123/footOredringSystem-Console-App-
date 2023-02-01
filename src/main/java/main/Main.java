package main;

import util.MainUtil;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("What do you want to order?" +
                "\n1.Lunch"+
                "\n2.Drink");
        Scanner sc=new Scanner(System.in);
        int order=sc.nextInt();
        if(order==1){
            String dessert=null;
            System.out.println("Please select Main Course");
            String mainCOurse=MainUtil.selectMainCourse();
            dessert=MainUtil.selectDesert();
            String drink=null;
            int choice=MainUtil.requiredNumber("Do you want to order a drink?"+
                    "\n1.Yes please"+
                    "\n2.No thanks");
            if(choice==1){
                 drink=MainUtil.selectDrink();
            }else if(choice==2){
                System.out.println("You order is being prepapred");
            }
            if(drink!=null&&dessert!=null){
                System.out.println("\nYour order is{" +"course="+mainCOurse+", "+"dessert="+dessert+" and "+"drink="+drink+" }");
                double coursePrice=MainUtil.price(mainCOurse);
                double dessertPrice=MainUtil.price(dessert);
                double drinkPrice=MainUtil.price(drink);

                double total=coursePrice+dessertPrice+drinkPrice;

                System.out.println("\nYour total invoice "+total+"$"+
                        "\n"
                +"\nThank you for your purchase :) ");

            }else if(dessert!=null){
                System.out.println("\nYour order is{" +"course="+mainCOurse+", "+"dessert="+dessert+ " }");
                double coursePrice=MainUtil.price(mainCOurse);
                double dessertPrice=MainUtil.price(dessert);

                double total=coursePrice+dessertPrice;
                System.out.println("\nYour total invoice "+total+"$"+
                        "\n"
                        +"\nThank you for your purchase :) ");
            }else if(drink!=null){
                System.out.println("\nYour order is{" +"course="+mainCOurse+", "+"drink="+drink+ " }");
                double drinkPrice=MainUtil.price(drink);
                double coursePrice=MainUtil.price(mainCOurse);
                double total=drinkPrice+coursePrice;

                System.out.println("\nYour total invoice "+total+"$"+
                        "\n"
                        +"\nThank you for your purchase :) ");
            }else{
                System.out.println("\nYour order is{"+"course="+mainCOurse+"}");
                double coursePrice=MainUtil.price(mainCOurse);

                System.out.println("\nYour total invoice "+coursePrice+"$"+
                        "\n"
                        +"\nThank you for your purchase :) ");
            }
        }else if(order==2){
            String drink=util.MainUtil.selectDrink();
            System.out.println("\nYour order is {"+drink+" }");
            double drinkPrice=MainUtil.price(drink);
            System.out.println("\nYour total invoice "+drinkPrice+"$"+
                    "\n"
                    +"\nThank you for your purchase :) ");
        }else{
            System.out.println("Please select correct menyu");
        }
    }
}
