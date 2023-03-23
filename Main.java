import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try {
            Scanner sc1 = new Scanner(System.in);
            int numero1 = sc1.nextInt();

            Scanner sc2 = new Scanner(System.in);
            int numero2 = sc1.nextInt();

            if(numero1 > numero2){
                System.out.println("el numero mayor es:" + numero1);
            }else {
                System.out.println("el numero mayor es:" + numero2);
            }

        } catch (Exception e){
            System.out.println("Hay un error" + e);
        }

    }
}