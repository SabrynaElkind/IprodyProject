public class Lesson3 {

    public static void printThreeWords (){
        System.out.println("Orange\nBanana\nApple");
    }

    public static void checkSumSign (int a, int b){

        if ((a+b) >= 0){
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor (int value){

        if (value <=0){
            System.out.println("Красный");
        } else if (value <=100 ) {
            System.out.println("Желтый");

        } else if (value > 100) {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers (int a, int b){
        if (a>=b){
            System.out.println("a>=b");
        } else {
            System.out.println("a<b");
        }
    }

    public static boolean sum (int a, int b){
        int sum = a+b;
        if (sum>=10 & sum <=20){
            return true;
        } else {
            return false;
        }
    }


    public static void checkIsPositive (int a){
        if (a >=0){
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");;
        }
    }

    public static boolean checkNum (int number){
        if (number < 0){
            return true;
        } else {
            return false;
        }
    }

    public static void printString (String str, int num){

        for (int i = 1; i <= num; i ++){
            System.out.println(str);
        }
    }





    public static void main(String[] args) {


       printThreeWords();
       checkSumSign(3,5);
       printColor(-1);
       printColor(0);
       printColor(2);
       printColor(100);
       printColor(96);
       printColor(101);
       printColor(150);
       compareNumbers(5,7);
       compareNumbers(7,5);
       System.out.println(sum(5,5));
       checkIsPositive(-1);
       System.out.println(checkNum(4));
       printString("Hello world!",3);




    }

}
