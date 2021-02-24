package LanzaMoneda;

public class LanzaMoneda {
    //variables de la clase
    private int numCaras = 0;
    private int numCruces = 0;
    private int numDeLanzamientos;

    //metodo constructor
    public LanzaMoneda(int lanzamientos) {
        this.numDeLanzamientos = lanzamientos;
    }

    //metodo lanzamiento
    private void lanzamiento() {
        for (int i = 0; i < numDeLanzamientos; i++) {
            int random = (int) (Math.random() * 100);
            if (random <= 50) {
                numCaras++;
            } else if (random >= 51) {
                numCruces++;
            }
        }
    }

    @Override
    public String toString() {
        lanzamiento();
        return "El numero de lanzamientos es: " + numDeLanzamientos + "\nNumero de Caras: " + numCaras + "\nnumero de cruces: " + numCruces;
    }
}
