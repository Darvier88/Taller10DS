public class Empleado {
    private String nombre;
    private double salarioBase;
    private int horasTrabajadas;
<<<<<<< HEAD
    private String departamento;
    private double tarifaHora;
    private String genero;
    
    public Empleado(){}
    
    public Empleado(String nombre, double salarioBase, int horasTrabajadas, double tarifaHora, String departamento, String genero) {
        this.nombre = nombre;
        this.salarioBase = salarioBase;
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaHora = tarifaHora;
        this.departamento = departamento;
        this.genero = genero;
=======
    private Departamento departamento;

    public Empleado(){}
    public Empleado(String nombre, double salarioBase, int horasTrabajadas, Departamento departamento) {
        this.nombre = nombre;
        this.salarioBase = salarioBase;
        this.horasTrabajadas = horasTrabajadas;
        this.departamento=departamento;
>>>>>>> f2a9498f5358471f872a815ece29c16047afa6cd
    }
    public void validarSalarioyHoras() {
    	if (salarioBase <= 0) {
            throw new IllegalArgumentException("El salario debe ser mayor o igual a 0");
        }
        if (horasTrabajadas < 0) {
            throw new IllegalArgumentException("Las horas trabajadas deben ser mayor o igual a 0");
        }
    }
    private double calcularPagoHorasExtra() {
        if (horasTrabajadas > 40) {
            return (horasTrabajadas - 40) * 50;
        }
        return 0;
    }
    public double calcularSalario() {
        validarSalarioyHoras();
        return salarioBase + calcularPagoHorasExtra() + departamento.calcularBono();
    }
    
    public String getNombre() {
        return nombre;
    }
    public String getGenero() {
    	return genero;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }
    
    public void imprimirDetalles() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Genero: " + getNombre());
        System.out.println("Salario: " + salarioBase);
        System.out.println("Horas trabajadas: " + horasTrabajadas);
        System.out.println("Departamento: " + departamento);
    }
    // Más metodos

}
