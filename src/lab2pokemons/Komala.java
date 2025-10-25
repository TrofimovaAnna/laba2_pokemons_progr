package lab2pokemons;

import lab2moves.komala.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Komala extends Pokemon {
	
	public Komala(String name, int level) {
		super(name, level);
		super.setStats(65, 115, 65, 75, 95, 65);
		super.setType(Type.NORMAL);
		
		DoubleEdge doubleEdge = new DoubleEdge(120, 100);
		RockSlide rockSlide = new RockSlide(75, 90);
		TakeDown takeDown = new TakeDown(90, 85);
		Rest rest = new Rest(0, 100);
		super.setMove(doubleEdge, rockSlide, takeDown, rest);
	}
}