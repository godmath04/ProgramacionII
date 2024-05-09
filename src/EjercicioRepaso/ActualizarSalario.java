package EjercicioRepaso;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ActualizarSalario {
    double initSalary;
    double deposits;
    double finalSalary;
    int option;
    int option2;

    //Constructor con lo que iniciaria cada empleado
    public ActualizarSalario() {
        initSalary = 400.0;
        deposits = 0.0;
        //Puede estar bien pero se iniciaria en 400 cada vez que se lo llame
        finalSalary = initSalary;
    }

    public double calSalary() throws IOException {
        BufferedReader bf1 = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Desea actualizar su salario inicial?\n1.Si\n2.No ");
        option = Integer.parseInt(bf1.readLine());
        if (option == 1) {
            System.out.println("Ingrese su salario: ");
            initSalary = Double.parseDouble(bf1.readLine());
            //Recalculo el salario final
            finalSalary = initSalary;
        } else {
            System.out.println("Ok");
        }
        do {
            System.out.println("Desea ingresar un deposito?:\n1.Si\n2.No\n ");
            option2 = Integer.parseInt(bf1.readLine());
            if (option2 == 1) {
                System.out.println("Ingrese su deposito: ");
                deposits = Double.parseDouble(bf1.readLine());
                finalSalary += deposits;
            }
        } while (option2 != 2);
        return finalSalary;
    }
}
