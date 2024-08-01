public class EmpleadoTemporario extends Empleado {
<<<<<<< HEAD
    
    private int mesesContrato;

    public EmpleadoTemporario(String nombre, double salarioBase, int horasTrabajadas, String departamento, int mesesContrato, String genero) {
    	
    	super(nombre, salarioBase, horasTrabajadas,0, departamento,genero);
=======
   private String nombre;
    private String genero;
    private double salarioBase;
    private String departamento;
    private int mesesContrato;

    public EmpleadoTemporario(String nombre, double salarioBase, String departamento, int mesesContrato, String genero) {
        this.nombre = nombre;
        this.salarioBase = salarioBase;
        this.departamento = departamento;
>>>>>>> f2a9498f5358471f872a815ece29c16047afa6cd
        this.mesesContrato = mesesContrato;
    
    }

    @Override
    public void imprimirDetalles() {
<<<<<<< HEAD
        System.out.println("Nombre: " + super.getNombre());
        System.out.println("Genero: " + super.getGenero());
        System.out.println("Salario: " + super.getSalarioBase());
        System.out.println("Horas trabajadas: " + super.getHorasTrabajadas());
        System.out.println("Departamento: " + super.getDepartamento());
=======
        super.imprimirDetalles();
>>>>>>> f2a9498f5358471f872a815ece29c16047afa6cd
        System.out.println("Meses de contrato: " + mesesContrato);
    }

    // Más metodos
}
