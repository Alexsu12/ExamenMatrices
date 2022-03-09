package ejercicio3;

import ejercicio1.CategoriaEmpleado;
import ejercicio1.Trabajador;
import ejercicio2.Empresa;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Prueba {
    public static void main(String[] args) {
        Empresa empresaA = new Empresa("Nestlé", "123456");
        Empresa empresaB = new Empresa("Cocacola", "654321");

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");
        String date = "16/08/2000";
        LocalDate localDate = LocalDate.parse(date, formatter);

        Trabajador t1 = new Trabajador("Juandi", "Gomez Gomez", localDate, CategoriaEmpleado.INICIAL);
        Trabajador t2 = new Trabajador("Alberto", "Gomez Gomez", localDate, CategoriaEmpleado.INICIAL);
        Trabajador t3 = new Trabajador("Obi-Wan", "Gomez Gomez", localDate, CategoriaEmpleado.AVANZADA);
        Trabajador t4 = new Trabajador("Jesus", "Gomez Gomez", localDate, CategoriaEmpleado.MEDIA);
        Trabajador t5 = new Trabajador("Cristina", "Gomez Gomez", localDate, CategoriaEmpleado.INICIAL);

        Trabajador t6 = t3.copia();

        empresaA.contratar(t1);
        empresaA.contratar(t2);
        empresaA.contratar(t3);

        empresaB.contratar(t4);
        empresaB.contratar(t5);
        empresaB.contratar(t6);

        empresaA.imprimir();
        empresaB.imprimir();

        empresaB.despedir(t5);
        empresaA.contratar(t5);

        empresaB.ordenarNombre();
        empresaA.ordenarNombre();
        empresaA.imprimir();
        empresaB.imprimir();

        System.out.println(empresaA.buscarNombre(t3));
        System.out.println(empresaB.buscarNombre(t6));
    }
}
