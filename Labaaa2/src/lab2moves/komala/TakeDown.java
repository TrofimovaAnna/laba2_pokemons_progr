package lab2moves.komala;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class TakeDown extends PhysicalMove{
	public TakeDown(double pow, double acc) {
			super(Type.NORMAL, pow, acc);
		}
	@Override
	protected void applyOppDamage(Pokemon def, double damage) {
		super.applyOppDamage(def, damage);
		def.setMod(Stat.HP, (int) Math.round(damage));
		
	}
 
	 @Override
		protected void applySelfDamage(Pokemon att, double damage) {
			super.applySelfDamage(att, damage);
			att.setMod(Stat.HP, (int) Math.round(damage/4d));
		
 	}
	 @Override
     protected String describe() {
         return "использует TakeDown!";
     }
}
