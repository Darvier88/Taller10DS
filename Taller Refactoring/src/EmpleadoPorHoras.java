public class EmpleadoPorHoras extends Empleado {
<<<<<<< HEAD

    public EmpleadoPorHoras(String nombre, int horasTrabajadas, double tarifaHora, String departamento, String genero) {
        super(nombre, 0, horasTrabajadas, tarifaHora, departamento,genero);
        super.setSalarioBase(calcularSalario());
       
=======
    private String genero;
    private double tarifaHora;

    public EmpleadoPorHoras(String nombre, int horasTrabajadas, double tarifaHora, Departamento departamento, String genero) {
        super(nombre, 0, horasTrabajadas, departamento);
        super.setSalarioBase(calcularSalario());
        this.genero = genero;
        this.tarifaHora=tarifaHora;
>>>>>>> f2a9498f5358471f872a815ece29c16047afa6cd
    }


    @Override
    public double calcularSalario() {
        return super.getHorasTrabajadas() * this.tarifaHora;
    }

    // Más metodos

    // Más metodos
}
