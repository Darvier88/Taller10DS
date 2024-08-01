public class EmpleadoFijo extends Empleado {
<<<<<<< HEAD
    private double bonoAnual;
    

    public EmpleadoFijo(String nombre, double salarioBase, int horasTrabajadas, String departamento, double bonoAnual, String genero) {
    	//String nombre, double salarioBase, int horasTrabajadas, double tarifaHora, String departamento) {
        super(nombre, salarioBase, horasTrabajadas, 0, departamento,genero);
=======
  private double bonoAnual;
  private String genero;

    public EmpleadoFijo(String nombre, double salarioBase, Departamento departamento, double bonoAnual, String genero) {
        super(nombre, salarioBase, 0, departamento);
>>>>>>> f2a9498f5358471f872a815ece29c16047afa6cd
        this.bonoAnual = bonoAnual;
        
    }

    @Override
    public void imprimirDetalles() {
        super.imprimirDetalles();
        System.out.println("Bono Anual: " + bonoAnual);

    }
    // Más metodos
}
