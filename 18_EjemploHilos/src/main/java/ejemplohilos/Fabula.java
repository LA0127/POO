package ejemplohilos;

public class Fabula {

    public static void main(String[] args) {
        Tortuga Carlo = new Tortuga();
        Liebre Toni = new Liebre();
        //Inicializar el Hilo
        Carlo.start();
        Toni.start();
    }
}
//Toooooooni
//Caaaaaaarlooo, hermano.
