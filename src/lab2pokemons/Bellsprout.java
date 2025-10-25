package lab2pokemons;

import lab2moves.sunkern.SwordsDance;
import lab2moves.bellsprout.SleepPowder;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Bellsprout extends Pokemon {
	public Bellsprout(String name, int level) {
	super(name, level);
	super.setType(Type.GRASS, Type.POISON);
	super.setStats(50, 75, 35, 70, 30, 40);
	
	SwordsDance swordsDance = new SwordsDance(0, 100);
	SleepPowder sleepPowder = new SleepPowder(0, 75);
	super.setMove(swordsDance, sleepPowder);
	}
}


