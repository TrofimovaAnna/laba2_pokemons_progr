package Labaaa2;

import lab2pokemons.*;
//import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Battle;



public class Lab2 {
		// https://veekun.com/dex/pokemon/komala
		// https://veekun.com/dex/pokemon/sunkern
		// https://veekun.com/dex/pokemon/sunflora
		// https://veekun.com/dex/pokemon/bellsprout
		// https://veekun.com/dex/pokemon/weepinbell
		// https://veekun.com/dex/pokemon/victreebel
	public static void main(String[] args) {
		game();
	}
	
	private static void game() {

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
