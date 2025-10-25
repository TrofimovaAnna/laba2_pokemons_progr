package Labaaa2;

import lab2pokemons.*;
//import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Battle;


public class Lab2 {
	public static void main(String[] args) {

		Battle b = new Battle();
		
		Komala p1 = new Komala("Камала", 1);
		Sunkern p2 = new Sunkern("Сункерн", 1);
		Sunflora p3 = new Sunflora("Санфлора", 1);
		Bellsprout p4 = new Bellsprout("Беллспрут", 1);
		Weepinbell p5 = new Weepinbell("Випинбелл", 1);
		Victreebel p6 = new Victreebel("Виктрибел", 1);
				
		b.addAlly(p1);
		b.addAlly(p2);
		b.addAlly(p3);
		
		b.addFoe(p4);
		b.addFoe(p5);
		b.addFoe(p6);
		
		b.go();
		
	}

}
