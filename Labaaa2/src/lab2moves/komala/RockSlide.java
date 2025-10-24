package lab2moves.komala;

import java.util.Random;
import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;


	 public class RockSlide extends SpecialMove {
	     public RockSlide(double power, double acc) {
	         super(Type.ROCK, power, acc);
	     }

	     @Override
	     protected void applyOppEffects(Pokemon p) {
	         super.applyOppEffects(p);

	         Random random = new Random();
	         if (random.nextDouble() < 0.3) {
	             Effect.flinch(p);
	         }
	         
	     }
	     @Override
	     protected String describe() {
	         return "использует RockSlide!";
	     }
	 }
