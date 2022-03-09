package ejercicio4;

public class Prueba {
    public static void main(String[] args) {
        Teatro teatro = new Teatro(10, 10);

        System.out.println(teatro.impresorMatriz());
        System.out.println("---------------------");

        teatro.reservar(1, 1);

        System.out.println(teatro.impresorMatriz());
        System.out.println("---------------------");

        teatro.cancelar(1, 1);

        System.out.println(teatro.impresorMatriz());
        System.out.println("---------------------");

        teatro.reservar(2, 1);
        teatro.cancelar(2, 2);

        System.out.println(teatro.impresorMatriz());
        System.out.println("---------------------");

        teatro.cancelar(15, 15);

        System.out.println(teatro.impresorMatriz());
        System.out.println("---------------------");
    }
}
