import java.util.ArrayList;
import java.util.List;

public class Encoder extends ChangerText{

    public List<Character> modification(List<Integer> listInteger, int key){
        List<Character> changedList = new ArrayList<>();
        for (Integer integer : listInteger) {
            if (alphabet.alphaList.contains(integer)){
                changedList.add((char)(((int) integer) + key));
            } else {
                changedList.add((char)((int) integer));
            }
        }
        return changedList;
    }
}
