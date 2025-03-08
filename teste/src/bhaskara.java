import java.util.Scanner;

public class bhaskara {
    public static void main(String[] args) {
        Scanner argumentos = new Scanner(System.in);

        System.out.println("Escreva o valor de A:");
        int a = argumentos.nextInt();
        System.out.println("Escreva o valor de B:");
        int b = argumentos.nextInt();
        System.out.println("Escreva o valor de C:");
        int c = argumentos.nextInt();


        if (b > 0 && c > 0){
            System.out.println("Sua equação ficou assim: " + a + "X² +" +  b + "X +" +  c + " = 0");
        } else if (b > 0){
            System.out.println("Sua equação ficou assim: " + a + "X² +" +  b + "X "  +  c + " = 0");
        } else if (c > 0){
            System.out.println("Sua equação ficou assim: " + a + "X² " + b + "X +" + c + " = 0");
        } else {
            System.out.println("Sua equação ficou assim: " + a + "X² " + b + "X " + c + " = 0");
        }

        double delta = (Math.pow(b, 2)) - (4*a*c);
        double raiz = Math.sqrt(delta);
        System.out.println("Delta igual a: " + delta);

        if (delta > 0){
            System.out.println("A equação tem duas raízes reais e diferente");
        } else if (delta < 0) {
            System.out.println("A equação não tem raízes reais");
        } else if (delta == 0) {
            System.out.println("A equação tem duas raízes reais e iguais");
        }

        double x1 = (-b + raiz) /(2 *a);
        double x2 = (-b - raiz) /(2 *a);

        System.out.println("x1: " + x1);
        System.out.println("x2: " + x2);
    }
}
