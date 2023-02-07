public class Enemigo extends Entidad {
    private int dificultad;

    public Enemigo(){

    }

    public Enemigo(int vida, int ataque, int defensa, String nombre, int dificultad) {
        super(vida, ataque, defensa, nombre);
        this.dificultad = dificultad;
    }

}
