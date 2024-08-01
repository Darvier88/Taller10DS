public class EmpleadoFijo extends Empleado {

  private double bonoAnual;
 
    public EmpleadoFijo(String nombre, double salarioBase, Departamento departamento, double bonoAnual, String genero) {
        super(nombre, salarioBase, 0, departamento);
        this.bonoAnual = bonoAnual;
        
    }

    @Override
    public void imprimirDetalles() {
        super.imprimirDetalles();
        System.out.println("Bono Anual: " + bonoAnual);

    }
    // Más metodos
}
