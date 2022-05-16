package ende;

/**
 *
 */
class Jugador {

    int exitos;

    public String opcionAlAzar() {


        String opcion = "";
        int c = (int) (Math.random() * 3);

        switch (c) {
            case 0:
                opcion = ("piedra");
                break;
            case 1:
                opcion = ("papel");
                break;
            case 2:
                opcion = ("tijeras");
        }
        return opcion;
    }

    public void incrementarExitos() {
        exitos++;
    }

    public int getExitos() {
        return (exitos);
    }


}
