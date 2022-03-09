package ejercicio2;

import ejercicio1.Trabajador;

import java.util.ArrayList;
import java.util.Comparator;

public class Empresa {
    private ArrayList<Trabajador> trabajadores;
    private String nomEmpresa;
    private String cif;

    public Empresa(String nomEmpresa, String cif) {
        this.nomEmpresa = nomEmpresa;
        this.cif = cif;
        this.trabajadores = new ArrayList<>();
    }

    public void imprimir(){
        System.out.println("Empresa: " + nomEmpresa);
        System.out.println("CIF: " + cif + "\n");

        for (Trabajador trabajador : trabajadores) {
            System.out.println(trabajador.toString(trabajador));
            System.out.println("-----------------------------");
        }
    }

    public void contratar(Trabajador t){
        this.trabajadores.add(t);
    }

    public boolean despedir(Trabajador t){
        int n = 0;
        for (Trabajador trabajador : trabajadores) {
            if (trabajador.equals(t)){
                trabajadores.remove(t);
                n++;
            }
        }
        return n != 0;
    }

    public int[] buscarTodosNombre(String nombre){

        ArrayList<Integer> indices = new ArrayList<>();

        for (int i = 0; i<trabajadores.size(); i++){
            if (trabajadores.get(i).getNombre().equals(nombre)){
                indices.add(i);
            }
        }

        int[] index = new int[indices.size()];

        for (int i = 0; i<indices.size(); i++){
            index[i] = indices.get(i);
        }

        return index;
    }

    public void ordenarNombre(){
        trabajadores.sort(Comparator.comparing(Trabajador::getNombre));
    }

    public int buscarNombre(Trabajador t){
        for (Trabajador trabajador : trabajadores) {
            if (trabajador.getNombre().equals(t.getNombre())) return trabajadores.indexOf(trabajador);
        }
        return -1;
    }

    public ArrayList<Trabajador> getTrabajadores() {
        return trabajadores;
    }

    public void setTrabajadores(ArrayList<Trabajador> trabajadores) {
        this.trabajadores = trabajadores;
    }

    public String getNomEmpresa() {
        return nomEmpresa;
    }

    public void setNomEmpresa(String nomEmpresa) {
        this.nomEmpresa = nomEmpresa;
    }

    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }
}
