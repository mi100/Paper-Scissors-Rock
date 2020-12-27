package enumerated;
import java.util.;
import static enumerated.Outcome.;

public interface Item {
    Outcome compete(Item it);
    Outcome eval(Paper p);
    Outcome eval(Scissors s);
    Outcome eval(Rock r);
}

