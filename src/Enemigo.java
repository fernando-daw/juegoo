public class Enemigo extends Entidad {
    private int dificultad;

    public Enemigo(){

    }

    public Enemigo(int vida, int ataque, int defensa, String nombre, int dificultad) {
        super(vida, ataque, defensa, nombre);
        this.dificultad = dificultad;
    }
    @Override
    public int turno(int accion) {
        if (accion==1){
            accion=getAtaque()*dificultad*2;
        }
        if (accion==2){
            accion=getAtaque()*dificultad*2;
        }
        return accion;
    }

}
