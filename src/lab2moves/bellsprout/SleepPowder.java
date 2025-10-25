package lab2moves.bellsprout;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class SleepPowder extends StatusMove{
	public SleepPowder(double pow, double acc) {
		super(Type.GRASS, pow, acc);
	}
	
	@Override
    protected void applyOppEffects(Pokemon p) {
        super.applyOppEffects(p);
        Effect.sleep(p);
        
    }
	
	@Override
	 protected String describe() {
	     return "использует SleepPowder!";
	 }
}
