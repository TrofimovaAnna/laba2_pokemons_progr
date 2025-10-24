package lab2pokemons;

import lab2moves.sunkern.*;
import lab2moves.komala.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Sunkern extends Pokemon {
	public Sunkern(String name, int level) {
		super(name, level);
		super.setStats(30, 30, 30, 30, 30, 30);
		super.setType(Type.GRASS);
		
		SwordsDance swordsDance = new SwordsDance(0, 100);
		DoubleEdge doubleEdge = new DoubleEdge(120, 100);
		Rest rest = new Rest(0, 100);
		super.setMove(swordsDance, doubleEdge, rest);
	}
} 

