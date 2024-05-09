package EjercicioRepaso;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class UsuariosBanca {
    String nombre;
    String apellido;
    String cedula;
    String lugarNacimiento;
    double saldoInicial;
    double depositos;
    double saldoFinal;

    ActualizarSalario salario = new ActualizarSalario();

    // Metodo para ingresar los detalles mediante consola
    public void ingresoInfo() throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        LugarNacimiento lugar = new LugarNacimiento();


        System.out.println("Ingrese su nombre: ");
        nombre = bf.readLine();
        System.out.println("\nIngrese su apellido: ");
        apellido = bf.readLine();
        System.out.println("\nIngrese su cedula: ");
        cedula = bf.readLine();
        System.out.println("\nIngrese su pais de nacimiento:");
        // Vamos a crear una clase que verifique el lugar de nacimiento
        lugarNacimiento = bf.readLine();
        System.out.println("Es ecuatoriano? " + lugar.isEcuatoriano(lugarNacimiento));
        System.out.println("Su salario actual es: " + salario.initSalary);
        salario.calSalary();
    }


    // Metodo para mostrar los detalles
    public String detalles(){
        StringBuilder sb = new StringBuilder();
        sb.append("Su nombre es: " + this.nombre);
        sb.append("\nSu apellido es: " + this.apellido);
        sb.append("\nSu cedula es: " + this.cedula);
        sb.append("\nSu lugar de nacimiento es: " + this.lugarNacimiento);
        sb.append("\nSu saldo inicial es: " + salario.initSalary);
        sb.append("\nSu saldo final es: " + salario.finalSalary);
        return sb.toString();
    }
}
