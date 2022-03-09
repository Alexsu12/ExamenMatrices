package ejercicio1;

import java.time.LocalDate;

public class Trabajador {
    private String nombre;
    private String apellidos;
    private LocalDate fechaNacimiento;
    CategoriaEmpleado categoria;

    public Trabajador(String nombre, String apellidos, LocalDate fechaNacimiento, CategoriaEmpleado categoria) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        if (fechaNacimiento.plusYears(16).isBefore(LocalDate.now())){
            this.fechaNacimiento = fechaNacimiento;
        }else {
            throw new IllegalArgumentException("Trabajador menor de 16");
        }

        this.categoria = categoria;
    }

    public Trabajador copia(){
        return new Trabajador(nombre, apellidos, fechaNacimiento, categoria);
    }

    public double calcularSueldo(){
        final double SUELDOBASE = 1707;
        double complemento = categoria.getComplementoEuros();

        return SUELDOBASE + complemento;
    }

    public LocalDate fechaJubilacion(Trabajador trabajador){
        return trabajador.fechaNacimiento.plusYears(66);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public CategoriaEmpleado getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaEmpleado categoria) {
        this.categoria = categoria;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Trabajador)) return false;

        Trabajador that = (Trabajador) o;

        if (!getNombre().equals(that.getNombre())) return false;
        if (!getApellidos().equals(that.getApellidos())) return false;
        if (!getFechaNacimiento().equals(that.getFechaNacimiento())) return false;
        return getCategoria() == that.getCategoria();
    }

    @Override
    public int hashCode() {
        int result = getNombre().hashCode();
        result = 31 * result + getApellidos().hashCode();
        result = 31 * result + getFechaNacimiento().hashCode();
        result = 31 * result + getCategoria().hashCode();
        return result;
    }

    public String toString(Trabajador trabajador) {
        return apellidos + ", " + nombre + "\tF.Nac: " + fechaNacimiento + "\n" +
                "Categoría: " + categoria.getCategoria() + "\n" +
                "Fecha Jubilación: " + fechaJubilacion(trabajador) + "\n" +
                "Sueldo actual: " + calcularSueldo();
    }
}

