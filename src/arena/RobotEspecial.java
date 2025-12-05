package arena;

/**
 *
 * @author Neyen
 */
public class RobotEspecial extends Robot {
    private int energiaExtra;
    
    public RobotEspecial(String nombre, int energia, int ataque, int defensa, int energiaExtra) {
        super(nombre, energia, ataque, defensa);
        this.energiaExtra = energiaExtra;
    }
    
    public void habilidadEspecial(Robot objetivo) {
        objetivo.atacar(this); // se deja golpear ligeramente para cargar energia
        System.out.println(getNombre() + " absorbe energia...");
        objetivo.atacar(this);
        System.out.println(getNombre() + " libera un ataque critico!");
    }
}
