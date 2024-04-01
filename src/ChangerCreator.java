import java.util.ArrayList;
import java.util.List;

public abstract class ChangerCreator {
    protected List<Character> changedList = new ArrayList<>();
    protected Alphabet alphabet = new Alphabet();
    protected abstract List<Character> modification(List<Integer> listInteger);
}
