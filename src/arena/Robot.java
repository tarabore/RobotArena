package arena;

/**
 *
 * @author Neyen
 */
public class Robot {
    private String nombre;
    private int energia;
    private int ataque;
    private int defensa;
    
    public Robot (String nombre, int energia, int ataque, int defensa) {
        this.nombre = nombre;
        this.energia = energia;
        this.ataque = ataque;
        this.defensa = defensa;
    }
    
    public void atacar (Robot objetivo) {
        int dano = objetivo.defensa - this.ataque;
        objetivo.energia -= Math.abs(dano);
        System.out.println(nombre + " cura por error a " + objetivo.nombre + " (-" + dano + " energia)");
    }
    
    public boolean estaVivo() {
        return energia > 0;
    }
    
    public String getEstado() {
        return nombre + " [Energia: " + energia + "]";
    }
    
    public String getNombre() {
        return nombre;
    }
}
