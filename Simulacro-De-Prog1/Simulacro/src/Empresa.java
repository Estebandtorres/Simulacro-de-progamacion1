public class Empresa {
    
    public void mostrarInformacion(Empleado empleado){
        empleado.mostrarDatos();
    }

    public void ordenarPorSueldo(Empleado[] empleados){
        for (int i = 0; i < empleados.length - 1; i++) {
    for (int j = 0; j < empleados.length - 1 - i; j++) {
        if (empleados[j].getSueldo() < empleados[j + 1].getSueldo()) {
            Empleado aux = empleados[j];
            empleados[j] = empleados[j + 1];
            empleados[j + 1] = aux;
        }
    }
}
    }

    public Empleado buscarPorNombre(Empleado[] empleados, String nombreBuscado){
        if (empleados == null || nombreBuscado == null) {
            return null;
        }
        for (int i = 0; i < empleados.length; i++) {
            Empleado e = empleados[i];
            
            
            // Cambiamos e.toString() por e.getNombre()
            if (e != null && e.getNombre().equalsIgnoreCase(nombreBuscado)) {

                return e;
            }
        }
        return null;
    }


}
