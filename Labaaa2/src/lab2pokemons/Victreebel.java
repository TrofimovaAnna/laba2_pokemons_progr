package lab2pokemons;

import lab2moves.bellsprout.SleepPowder;
import lab2moves.victreebel.PoisonJab;
import lab2moves.sunkern.SwordsDance;
import lab2moves.weepinbell.Slam;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Victreebel extends Pokemon{
	public Victreebel(String name, int level){
		super(name, level);
		super.setType(Type.GRASS, Type.POISON);
		super.setStats(80, 105, 65, 100, 70, 70);
		
		SwordsDance swordsDance = new SwordsDance(0, 100);
		SleepPowder sleepPowder = new SleepPowder(0, 75);
		Slam slam = new Slam(80, 75);
		PoisonJab poisonJab = new PoisonJab(80, 100);
		super.setMove(swordsDance, sleepPowder, slam, poisonJab);
	}
}
