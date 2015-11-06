import becker.robots.*;

public class IsBomb implements IPredicate {
    public boolean isOK(Sim s) {
        return s instanceof Bomb;
    }
}
