package Ejercicio2;
import javax.swing.JOptionPane;
import java.util.Date;

public class Calculadora {
    // Atributos para el menu
    // El static para hacer uso en toda la clase
    static int opcion;
    static String menu;

    public static void main(String[] args) {

        // Creacion del objeto de operaciones
        OperacionesBasicas operando = new OperacionesBasicas();

        Date fechaHora = new Date();
        // Menu para elegir la operacion

        do {
            menu = JOptionPane.showInputDialog("Menu principal:\n" + "1.Suma\n" + "2.Resta\n" + "3.Multiplicacion\n" + "4.Division\n" + "5.Salir\n" + "Fecha y hora: " + fechaHora);
            opcion = Integer.parseInt(menu);
            // El menu seria
            switch (opcion) {
                case 1:
                    operando.suma();
                    break;
                case 2:
                    operando.resta();
                    break;
                case 3:
                    operando.multiplicacion();
                    break;
                case 4:
                    operando.division();
                    break;
                case 5:
                    break;

            }
        } while (opcion != 5);
    }
}
