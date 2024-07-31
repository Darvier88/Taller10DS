public class EmpleadoPorHoras extends Empleado {
    private String genero;
    private double tarifaHora;

    public EmpleadoPorHoras(String nombre, int horasTrabajadas, double tarifaHora, Departamento departamento, String genero) {
        super(nombre, 0, horasTrabajadas, departamento);
        super.setSalarioBase(calcularSalario());
        this.genero = genero;
        this.tarifaHora=tarifaHora;
    }


    @Override
    public double calcularSalario() {
        return super.getHorasTrabajadas() * this.tarifaHora;
    }

    // Más metodos

    // Más metodos
}
