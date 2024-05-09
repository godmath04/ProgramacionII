package EjercicioRepaso;

public class LugarNacimiento {
    boolean ecuatoriano;

    public boolean isEcuatoriano(String lugarNacimiento) {
        if (lugarNacimiento.equalsIgnoreCase("Ecuador")){
            ecuatoriano = true;
        }else{
            ecuatoriano = false;
        }
        return ecuatoriano;
    }
}

