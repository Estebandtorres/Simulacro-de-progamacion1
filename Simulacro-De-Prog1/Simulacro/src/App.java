public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Empleado em1 = new Empleado("Esteban", 10000);
        Empleado em2 = new Empleado("Javier", 2000);
        Empleado em3 = new Empleado("Nahuel", 100000);
        em1.mostrarDatos();

        Desarrollador d1 = new Desarrollador("Jose", 100000.0, "Java");
        d1.mostrarDatos();

        Gerente g1 = new Gerente("Martin", 10000000.50, "Ingenieria");
        g1.mostrarDatos();
        System.out.println("----------------------------------------------------------");
        Empresa miEmpresa = new Empresa();
        miEmpresa.mostrarInformacion(em1);
        miEmpresa.mostrarInformacion(d1);
        miEmpresa.mostrarInformacion(g1);

        
        Empleado[] miArregloDeEmpleados = {em1, em2, em3};
        Empresa miEmpresa2 = new Empresa();

        //Llamo al método para ordenar
        miEmpresa2.ordenarPorSueldo(miArregloDeEmpleados);

        System.out.println("\n--- ORDENADO POR SUELDO (Mayor a Menor) ---");

        
        for (int i = 0; i < miArregloDeEmpleados.length; i++) {
            Empleado emp = miArregloDeEmpleados[i];
            emp.mostrarDatos();
        }
        System.out.println("-----------------------------------------");
    
        String nombreBuscado = "esteban";

        Empleado empleadoEncontrado = miEmpresa2.buscarPorNombre(miArregloDeEmpleados, nombreBuscado);

        if (empleadoEncontrado != null) {
            System.out.println("Resultado para '" + nombreBuscado + "': ¡ENCONTRADO!");
            
            empleadoEncontrado.mostrarDatos();

        } else {
            System.out.println("Resultado para '" + nombreBuscado + "': NO ENCONTRADO.");
        }



    }
}
