package enumerated;

import static enumerated.Outcome.*;

public class Rock implements Item {
    public Outcome compete(Item it){
        return it.eval(this);
    }

    @Override
    public Outcome eval(Paper p) { return WIN; }

    @Override
    public Outcome eval(Scissors s) {
        return LOSE;
    }

    @Override
    public Outcome eval(Rock r) {
        return DRAW;
    }

    @Override
    public String toString() {
        return "enumerated.Rock";
    }
}