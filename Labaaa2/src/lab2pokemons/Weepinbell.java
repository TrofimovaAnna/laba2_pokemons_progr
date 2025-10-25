package lab2pokemons;

//import lab2moves.bellsprout.SleepPowder;
import lab2moves.weepinbell.Slam;
//import lab2moves.sunkern.SwordsDance;
//import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Weepinbell extends Bellsprout{
	public Weepinbell(String name, int level){
		super(name, level);
		super.setType(Type.GRASS, Type.POISON);
		super.setStats(65, 90, 50, 85, 45, 55);
		
		Slam slam = new Slam(80, 75);
		super.setMove(slam);
	}
}
