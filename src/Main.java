import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String myCarColor;
        final int NUM = 1;
        String word = "Black";
        myCarColor =" Цвет моей машины";
        System.out.println(myCarColor + word + "" + NUM);
        if (NUM>0){
            System.out.println("Вы сохранили положительное число");
            if (NUM<0){
                System.out.println("Вы сохранили отрицательное число");
            }else {
                System.out.println("Вы сохранили ноль");
            }
        }
        System.out.println("========");
        Scanner s = new
                Scanner(System.in);
        System.out.println("Ввыедите вашы имя");
        String string = s.nextLine();
        System.out.println("Здраствуйте" + string);
    }
}