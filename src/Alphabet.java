import java.util.ArrayList;
import java.util.List;

public class Alphabet {
    public  String alphaString = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя" +
            "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ.,\":-!? ";
    public final List<Integer> alphaList = createList(alphaString);
    public List<Integer> createList(String alphaString){
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < alphaString.length(); i++) {
            list.add((int) alphaString.charAt(i));
        }
        return list;
    }
}
