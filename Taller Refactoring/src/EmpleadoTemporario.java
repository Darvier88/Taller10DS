public class EmpleadoTemporario extends Empleado {
   private String nombre;
    private String genero;
    private double salarioBase;
    private String departamento;
    private int mesesContrato;

    public EmpleadoTemporario(String nombre, double salarioBase, String departamento, int mesesContrato, String genero) {
        this.nombre = nombre;
        this.salarioBase = salarioBase;
        this.departamento = departamento;
        this.mesesContrato = mesesContrato;
        this.genero = genero;
    }

    @Override
    public void imprimirDetalles() {
        super.imprimirDetalles();
        System.out.println("Meses de contrato: " + mesesContrato);
    }

    // Más metodos
}
