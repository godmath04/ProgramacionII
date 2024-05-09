package EjercicioRepaso;

import javax.swing.*;
import java.io.IOException;

public class Banca {
    public static void main(String[] args) throws IOException {
    UsuariosBanca user1 = new UsuariosBanca();

    user1.ingresoInfo();
    JOptionPane.showMessageDialog(null, user1.detalles());

    }
}
