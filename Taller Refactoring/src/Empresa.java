import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private List<Empleado> empleados;

    public Empresa() {
        incializarEmpleados();
    }
    //Estoy manejando la refacotizacion en cuando hay empleados existentes
    public Empresa(List<Empleado> empleadosExistentes){
        this.empleados = empleadosExistentes; 
    }

    public void contratarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    public void despedirEmpleado(Empleado empleado) {
        empleados.remove(empleado);
    }
    public void incializarEmpleados(){
        empleados = new ArrayList<>();
    }

    public List<Empleado> obtenerEmpleadosPorHorasTrabajadasaPartirDe(int horas) {
        List<Empleado> empleadosPorTipo = new ArrayList<>();
        for (Empleado empleado : empleados) {
            if (empleado.getHorasTrabajadas()>horas) {
                empleadosPorTipo.add(empleado);
            }
        }
        return empleadosPorTipo;
    }

    // Más metodos
}

