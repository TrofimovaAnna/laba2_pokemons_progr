package lab2pokemons;

import lab2moves.komala.*;
import lab2moves.sunflora.Pound;
import lab2moves.sunkern.SwordsDance;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Sunflora extends Pokemon {
	public Sunflora(String name, int level) {
		super(name, level);
		super.setType(Type.GRASS);
		super.setStats(75, 75, 55, 105, 85, 30);
		
		SwordsDance swordsDance = new SwordsDance(0, 100);
		DoubleEdge doubleEdge = new DoubleEdge(120, 100);
		Rest rest = new Rest(0, 100);
		Pound pound = new Pound(40, 100);
		super.setMove(swordsDance, doubleEdge, rest, pound);
	}
}
