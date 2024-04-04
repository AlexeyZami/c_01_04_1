
import java.util.ArrayList;
import java.util.List;

public abstract class ChangerText {
    public Alphabet alphabet = new Alphabet();
    public abstract List<Character> modification(List<Integer> listInteger, int key);
}
