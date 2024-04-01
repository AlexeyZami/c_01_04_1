import java.util.List;

public class Decoder extends ChangerCreator{

    public List<Character> modification(List<Integer> listInteger){
        for (Integer integer : listInteger) {
            if (alphabet.alphaList.contains((int)integer - 10)){
                changedList.add((char)(((int) integer) - 10));
            } else {
                changedList.add((char)((int) integer));
            }
        }
        return changedList;
    }
}
