import java.util.ArrayList;
import java.util.List;

public class Encoder extends ChangerCreator{

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
