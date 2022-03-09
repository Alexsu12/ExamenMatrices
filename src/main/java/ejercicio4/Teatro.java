package ejercicio4;

import java.util.ArrayList;

public class Teatro {
    private ArrayList<String[]> crearMatriz(int filas, int columnas) {

        ArrayList<String[]>  matriz = new ArrayList<>();

        for (int i = 0; i < filas; i++) {
            String[] fila = new String[columnas];
            String[] filaCerrada = new String[columnas];
            for (int j = 0; j < columnas; j++) {
                filaCerrada[j] = "X";
            }
            for (int j = 0; j < columnas; j++) {
                if (j%2==0){
                    fila[j] = ("L");
                }else {
                    fila[j] = ("X");
                }
            }
            if (i%2==0){
                matriz.add(fila);
            }else {
                matriz.add(filaCerrada);
            }
        }
        return matriz;
    }

    private int filas;
    private int columnas;
    private ArrayList<String[]> matriz;

    public Teatro(int filas, int columnas) {
        this.filas = filas;
        this.columnas = columnas;
        this.matriz = crearMatriz(filas, columnas);
    }

    public void setFilas(int filas) {
        this.filas = filas;
    }
    public void setColumnas(int columnas) {
        this.columnas = columnas;
    }

    public int getFilas() {
        return filas;
    }
    public int getColumnas() {
        return columnas;
    }
    public ArrayList<String[]> getMatriz() {
        return matriz;
    }

    public void reservar(int fila, int columna){
        try{
            String estadoAsiento = matriz.get(fila - 1)[columna - 1];

            if (estadoAsiento.equals("L")){
                matriz.get(fila - 1)[columna - 1] = "V";
            }
        }catch (IndexOutOfBoundsException ignored){}
    }

    public void cancelar(int fila, int columna){
        try {
            String estadoAsiento = matriz.get(fila - 1)[columna - 1];

            if (estadoAsiento.equals("V")){
                matriz.get(fila - 1)[columna - 1] = "L";
            }
        }catch (IndexOutOfBoundsException ignored){}

    }

    public String impresorMatriz(){
        StringBuilder sb = new StringBuilder();

        for (String[] i : this.matriz){
            for (String j : i){
                sb.append(j);
                sb.append(" ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
