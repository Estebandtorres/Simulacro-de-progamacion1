public class Desarrollador extends Empleado {
    private String lenguaje;

    public Desarrollador(String nombre, double sueldo, String lenguaje){
        super(nombre,sueldo);
        this.lenguaje = lenguaje;
    }

    public String getLenguaje(){
        return lenguaje;
    }

    public void setLenguaje(String lenguaje){
        this.lenguaje = lenguaje;
    }

    
    public void mostrarDatos(){
        System.out.println("Desarrollador: " + this.getNombre() + " Lenguaje: " + this.lenguaje + " Sueldo: " + this.getSueldo());
    }
    
}
