package lab2moves.weepinbell;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

public class Slam extends PhysicalMove{
	public Slam(double pow, double acc) {
			super(Type.NORMAL, pow, acc);
		}
	
		@Override
	    protected String describe() {
	        return "использует Slam!";
	    }
}
