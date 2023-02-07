public class jugador extends Entidad{
    private int experiencia;
    private int nivel;

    public jugador(){
    }

    public jugador(int vida, int ataque, int defensa, String nombre, int experiencia, int nivel) {
        super(vida, ataque, defensa, nombre);
        this.experiencia=experiencia;
        this.nivel=nivel;
    }
    

}
