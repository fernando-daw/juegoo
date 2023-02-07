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
    @Override
    public int turno(int accion) {
        if (accion==1){
            accion=getAtaque()*nivel*2;
        }
        if (accion==2){
            accion=getAtaque()*nivel*2;
        }
        return accion;

    }


}
