public abstract class Entidad {
    private int vida;
    private int ataque;
    private int defensa;
    private String nombre="";

    public Entidad(){

    }

    public Entidad(int vida, int ataque, int defensa, String nombre) {
        this.vida = vida;
        this.ataque = ataque;
        this.defensa = defensa;
        this.nombre = nombre;
    }

    public int getVida() {
        return vida;
    }

    public int getAtaque() {
        return ataque;
    }

    public int getDefensa() {
        return defensa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

   public int accion(int accion){
       return accion;
   }

    public void info(){

    }


    public abstract int turno(int accion);
}
