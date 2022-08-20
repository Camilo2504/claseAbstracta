import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String color;
        double lado;

        Scanner x = new Scanner(System.in);
        System.out.println("Ingrese el color cuadrado: ");
        color = x.next();
        System.out.println("Ingrese el lado del cuadrado: ");
        lado = x.nextDouble();
        Cuadrado c1 = new Cuadrado(color, lado);

        System.out.println("El área del cuadrado 1 es: " + c1.calcularArea());
        System.out.println("El color del cuadrado 1 es: " + c1.getColor());

        Cuadrado c2 = new Cuadrado("Azul", 2.3);
        System.out.println("El área del cuadrado 2 es: " + c2.calcularArea());
        System.out.println("El color del cuadrado 2 es: " + c2.getColor());

        Triangulo t1 = new Triangulo("Verde", 3,4);
        System.out.println("El área del triangulo 1 es: " + t1.calcularArea());
        System.out.println("El color del triangulo 1 es: " + t1.getColor());
    }
}
