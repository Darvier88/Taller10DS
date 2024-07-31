public class EmpleadoFijo extends Empleado {
  private double bonoAnual;
  private String genero;

    public EmpleadoFijo(String nombre, double salarioBase, Departamento departamento, double bonoAnual, String genero) {
        super(nombre, salarioBase, 0, departamento);
        this.bonoAnual = bonoAnual;
        this.genero = genero;
    }

    public void imprimirDetalles() {
        System.out.println("Nombre: " + super.getNombre());
        System.out.println("Genero: " + super.getNombre());
        System.out.println("Salario: " + super.getSalarioBase());
        System.out.println("Departamento: " + super.getDepartamento());
        System.out.println("bonoAnual: " + bonoAnual);
    }
    // Más metodos
}
