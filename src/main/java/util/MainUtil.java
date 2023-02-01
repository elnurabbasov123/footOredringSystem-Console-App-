package util;

import kitchens.Kitchen;
import java.util.Scanner;

public class MainUtil {

    public static double price(String str){
        int courseIndex=str.indexOf(" ");
        String strCourse=str.substring(courseIndex);
        String strCourse2=strCourse.replace('$',' ');
        String strCOurse3=strCourse2.trim();
        double price=Double.valueOf(strCOurse3);
        return price;
    }
    public static int  requiredNumber(String text){
        System.out.println(text);
        Scanner sc=new Scanner(System.in);
        int number= sc.nextInt();
        return number;
    }
    public static String selectDrink(){
        showDrink();
        String drink= drink();
        iceCubesOrLemon();
        return drink;
    }
    public static void showDrink(){
        int j=1;
        for (int i =0 ; i <DrinkUtil.drinkList.size() ; i++) {
            System.out.println(j++ + "."+DrinkUtil.drinkList.get(i));
        }
    }
    public static String drink(){

        int drink=requiredNumber("Please select drink");
        if(drink==1){
            System.out.println("CocaCola will be ready");
            String cola=DrinkUtil.drinkList.get(0).getPrice();
            return "CocaCola "+cola;
        }else if(drink==2){
            System.out.println("Fanta will bi ready");
            String fanta=DrinkUtil.drinkList.get(1).getPrice();
            return "Fanta "+fanta;
        }else if(drink==3){
            System.out.println("Cofe will be ready");
            String cofe=DrinkUtil.drinkList.get(2).getPrice();
            return "Cofe "+cofe;
        }else if(drink==4){
            System.out.println("Tea will be ready");
            String tea=DrinkUtil.drinkList.get(3).getPrice();
            return "Tea "+tea;
        }else if(drink==5){
            System.out.println("Redbull will be ready");
            String redbul= DrinkUtil.drinkList.get(4).getPrice();
            return "RedBull "+redbul;
        }else{
            System.out.println("Please select correct answer");
            drink();
        }
        return null;
    }
    public static String  requiredText(String text){
        System.out.println(text);
        Scanner sc=new Scanner(System.in);
        String string= sc.nextLine();
        return string;
    }

    public static void iceCubesOrLemon(){
        int choice=requiredNumber("Do you want to add Ice cubes or Lemon to your drink?"+
                "\n1.Yes please"+
                "\n2.No Thanks");
        if(choice==1){
            int a=requiredNumber("What do you want?"+
                    "\n1.Ice cubes"+
                    "\n2.Lemon"+
                    "\n3.Ice cubes and Lemon");

            if(a==1){
                System.out.println("Ice cubes will be added to your drink");
                System.out.println("Your order is being prepared");
            }else if(a==2){
                System.out.println("Lemon will be added to your drink");
                System.out.println("Your order is being prepared");
            }else if(a==3){
                System.out.println("Ice cubes and Lemon will be added to your drink");
                System.out.println("Your order is being prepared");
            }else{
                iceCubesOrLemon();
            }
        }else{
            System.out.println("Your order is being prepared");
        }

    }

    public static int showKitchenAndSelect(){
        System.out.println("What kitchen do you want?");
        int i;
        for ( i = 1; i < Kitchen.values().length; i++) {
            System.out.println(i+"."+Kitchen.getKitchen(i));
        }
        Scanner sc2=new Scanner(System.in);
        Integer h=sc2.nextInt();
        if(h!=null&&h<Kitchen.values().length){
            return h;
        }else{
            System.out.println("Please select correct kitchen");
            return showKitchenAndSelect();
        }

    }
    public static int courses(int kitchen){
        Integer c=null;
        int k=1;
        for (int i = 0; i < MainCourseUtil.mainCourseList.size(); i++) {
            if(Kitchen.getKitchen(kitchen)==MainCourseUtil.mainCourseList.get(i).getKitchen()){
                System.out.println(k++ +"."+MainCourseUtil.mainCourseList.get(i)); //4
                c= i;
            }
        }
        return c;
    }
    public static String selectCourse(int kitchen){
        System.out.println("Please select course");
       int c=courses(kitchen);
        Scanner sc=new Scanner(System.in);
        int course=sc.nextInt();

        if( MainCourseUtil.mainCourseList.get(c).getKitchen()==Kitchen.Azerbaijani) {
            if (course == 1) {
                System.out.println("Bozbash will be ready in 15 minutes");
                String bozbash=MainCourseUtil.mainCourseList.get(0).getPrice();
                return "Bozbash "+bozbash;
            } else if (course == 2) {
                System.out.println("Levengi will be ready in 15 minutes");
                String levengi=MainCourseUtil.mainCourseList.get(4).getPrice();
                return "Levengi "+levengi;
            }else{
                System.out.println("Please select correct answer");
                selectCourse(kitchen);
            }
        }else if( MainCourseUtil.mainCourseList.get(c).getKitchen()==Kitchen.Turkish){
            if(course==1){
                System.out.println("Adana will be ready 15 minutes");
                String adana=MainCourseUtil.mainCourseList.get(2).getPrice();
                return "AdanaKebab "+adana;
            }else{
                System.out.println("Please select correct answer");
                selectCourse(kitchen);
            }
        }else if(MainCourseUtil.mainCourseList.get(c).getKitchen()==Kitchen.Russian){
            if(course==1){
                System.out.println("Borsh will be ready 15 minutes");
                String borsh=MainCourseUtil.mainCourseList.get(1).getPrice();
                return "Borsh "+borsh;
            }else{
                System.out.println("Please select correct answer");
                selectCourse(kitchen);
            }
        }else if(MainCourseUtil.mainCourseList.get(c).getKitchen()==Kitchen.Italian){
            if(course==1){
                System.out.println("Lavujs will be ready 15 minutes");
                String lavujs=MainCourseUtil.mainCourseList.get(3).getPrice();
                return "Lavujs "+lavujs;
            }else {
                System.out.println("Please select correct answer");
                selectCourse(kitchen);
            }
        }
        return null;
    }

    public static String selectMainCourse(){
      int kitchen=showKitchenAndSelect();
      return selectCourse(kitchen);
    }

    public static String selectDesert(){
        int orderDessert=MainUtil.requiredNumber("Would you like to order dessert ?"+
                "\n1.Yes Please"+
                "\n2.No Thanks");
        if(orderDessert==1){
            return dessert();
        }else if(orderDessert==2){
            System.out.println("Okey");
        }else{
            System.out.println("Please select correct answer");
            selectDesert();
        }
        return null;
    }
    public static String dessert(){
        int kitchen=showKitchenAndSelect();
        int k=1;
        for (int i = 0; i <DessertUtil.dessertList.size(); i++) {
            if (Kitchen.getKitchen(kitchen) == DessertUtil.dessertList.get(i).getKitchen()) {
                System.out.println(k++ + "." + DessertUtil.dessertList.get(i));
            }
        }
        System.out.println("Please select dessert");
        Scanner sc=new Scanner(System.in);
        int dessert=sc.nextInt();
        if(Kitchen.getKitchen(kitchen)==Kitchen.Azerbaijani){
            if(dessert==1){
                System.out.println("Shekerbura will be ready 10 minutes");
                String shekerbura=DessertUtil.dessertList.get(0).getPrice();
                return "Shekerbura " +shekerbura;
            }else if(dessert==2){
                System.out.println("Paxlava will be ready 10 minutes");
                String paxlava=DessertUtil.dessertList.get(1).getPrice();
                return "Paxlava "+paxlava;
            }else{
                System.out.println("Please select correct answer");
                dessert();
            }

        }else if(Kitchen.getKitchen(kitchen)==Kitchen.Turkish){
            if(dessert==1){
                System.out.println("Borek will be ready 10 minutes");
                String borek=DessertUtil.dessertList.get(3).getPrice();
                return "Borek "+borek;
            }else if(dessert==2){
                System.out.println("Pishmaniye will be ready 10 minutes");
                String pishmaniye=DessertUtil.dessertList.get(4).getPrice();
                return "Pishmaniye "+pishmaniye;
            }else if(dessert==3){
                System.out.println("Baklava will be ready 10 minutes");
                String baklava=DessertUtil.dessertList.get(5).getPrice();
                return "Baklava "+baklava;
            }else{
                System.out.println("Please select correct answer");
                dessert();
            }
        }else if(Kitchen.getKitchen(kitchen)==Kitchen.Russian){
            if(dessert==1){
                System.out.println("Bulocka s djemom will be ready 10 minutes");
                String bulocka=DessertUtil.dessertList.get(6).getPrice();
                return "Bulocka s djemom "+bulocka;
            }else{
                System.out.println("Please select correct variant");
                dessert();
            }
        }else if(Kitchen.getKitchen(kitchen)==Kitchen.Italian){
            if(dessert==1){
                System.out.println("Teramisu will be ready 10 minutes");
                String teramisu=DessertUtil.dessertList.get(2).getPrice();
                return "Teramisu "+teramisu;
            }else if(dessert==2){
                System.out.println("Aloshe will be ready 10 minutes");
                String aloshe=DessertUtil.dessertList.get(7).getPrice();
                return "Aloshe "+aloshe;
            }else{
                System.out.println("Please select correct variant");
                dessert();
            }
        }
        return null;
    }
}
