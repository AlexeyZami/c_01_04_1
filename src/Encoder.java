import java.util.ArrayList;
import java.util.List;

public class Encoder {
    public List<Character> changedList = new ArrayList<>();
    Alphabet alphabet = new Alphabet();
    public List<Character> encryption(List<Integer> listInteger){
        for (Integer integer : listInteger) {
            if (alphabet.alphaList.contains(integer)){
                changedList.add((char)(((int) integer) + 10));
            } else {
                changedList.add((char)((int) integer));
            }
        }
        return changedList;
    }
}
