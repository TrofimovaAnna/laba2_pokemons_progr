package lab2moves.komala;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Status;
import ru.ifmo.se.pokemon.Type;

public class Rest extends SpecialMove {
    public Rest(double power, double acc) {
        super(Type.ROCK, power, acc);
    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        super.applySelfEffects(p);
        
        
        Effect sleepEffect = new Effect();
        sleepEffect.condition(Status.SLEEP); 
        sleepEffect.turns(2);
        p.addEffect(sleepEffect);
        
        p.setMod(Stat.HP, -((int) p.getStat(Stat.HP) - (int) p.getHP()));;
    }
    

    @Override
    protected String describe() {
        return "использует Rock Slide и засыпает на 2 хода!";
    }
}
