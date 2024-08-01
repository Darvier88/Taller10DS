public class EmpleadoTemporario extends Empleado {

 
    private int mesesContrato;
    
   
    public EmpleadoTemporario(String nombre, double salarioBase, int horasTrabajadas, String departamento, int mesesContrato, String genero) {
        super(nombre, genero, salarioBase, horasTrabajadas, departamento);
        this.mesesContrato = mesesContrato;

    }

   
    // Más metodos
}
