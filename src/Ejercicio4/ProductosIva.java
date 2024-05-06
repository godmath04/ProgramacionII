package Ejercicio4;

import javax.swing.*;

public class ProductosIva {
    static String product;
    static double valor;
    static double precio;
    static int opcionMenu;
    static String menuPrincipal;


    public static void main(String[] args) {
        ProductosIva producto = new ProductosIva();

        do {
            menuPrincipal = JOptionPane.showInputDialog("A que categoria pertenece su producto:\n 1. Producto primera necesidad (No tiene IVA).\n2. Producto normal\n3. Salir");
            opcionMenu = Integer.parseInt(menuPrincipal);
            switch (opcionMenu) {
                case 1:
                    producto.sinIva();
                    JOptionPane.showMessageDialog(null,producto.detalles());
                    break;
                case 2:
                    producto.conIva();
                    JOptionPane.showMessageDialog(null,producto.detalles());
                    break;
                case 3:
                    break;
            }
        } while (opcionMenu != 3);


    }
    // Metodo para mostrar al final los detalle
    public String detalles(){
        StringBuilder sb = new StringBuilder();
        sb.append("Nombre del producto: " + ProductosIva.product);
        sb.append("\nSu producto es categoria: " + ProductosIva.opcionMenu);
        sb.append("\n Valor:" + ProductosIva.valor);
        sb.append("\n Precio total:" + ProductosIva.precio);
        return sb.toString();

    }

    // Metodo para cobrar con IVA
    public void conIva() {
        String message;
        product = JOptionPane.showInputDialog("Ingrese el nombre del producto");
        valor = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor del producto"));
        message = "Su producto tendra el siguiente IVA:\n 1. Menor igual a 500 (12%).\n2. Mayor a 500 y menor igual a 1500 (14%)\n3. Mayor a 1500 (15%)";
        JOptionPane.showMessageDialog(null, message);
        if (0.00 < valor && valor <= 500.00) {
            precio = valor * 1.12;

        } else if (valor > 500.00 && valor <= 1500.00) {
            precio = valor * 1.14;
        } else if (valor > 1500.00) {
            precio = valor * 1.15;
        }

        JOptionPane.showMessageDialog(null, "El valor del producto es: " + precio);
    }

    // Metodo para cobrar sin Iva
    public void sinIva() {
        product = JOptionPane.showInputDialog("Ingrese el nombre del producto");
        valor = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor del producto"));
        JOptionPane.showMessageDialog(null, "Al no pagar IVA el costo del producto es el mismo");
        precio = valor;
        JOptionPane.showMessageDialog(null, "El valor del producto es: " + precio);
    }


}
