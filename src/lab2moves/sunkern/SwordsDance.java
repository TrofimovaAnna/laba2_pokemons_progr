package lab2moves.sunkern;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class SwordsDance extends PhysicalMove{
	public SwordsDance(double pow, double acc) {
        super(Type.NORMAL, 0, 100); 
        }

    @Override
    protected void applySelfEffects(Pokemon p) {
        super.applySelfEffects(p);
        
        
        Effect attackBoost = new Effect();
        attackBoost.stat(Stat.ATTACK, +2); 
        p.addEffect(attackBoost);
    }

    @Override
    protected String describe() {
        return "использует Swords Dance и Атаку на 2 ступени!";
    }
}
