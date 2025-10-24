package lab2moves.victreebel;

import java.util.Random;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class PoisonJab extends PhysicalMove{
	public PoisonJab(double pow, double acc) {
		super(Type.POISON, pow, acc);
	}
	
	@Override
    protected void applyOppEffects(Pokemon p) {
        super.applyOppEffects(p);

        Random random = new Random();
        if (random.nextDouble() < 0.3) {
            Effect.poison(p);
        }
        
    }
	
	@Override
    protected String describe() {
        return "использует PoisonJab!";
    }
}
