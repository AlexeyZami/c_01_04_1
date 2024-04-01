import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Reader_Writer {
    Encoder encoder = new Encoder();
    Decoder decoder = new Decoder();
    private String incomingFile = "/Users/aleksejlalakin/IdeaProjects/caesar01_04_1/src/result.txt";
    private String outgoingFile = "/Users/aleksejlalakin/IdeaProjects/caesar01_04_1/src/result2.txt";
    List<Integer> listInteger = new ArrayList<>();
    public List<Integer> convertToListInteger(){

        try (InputStream inputStream = new FileInputStream(incomingFile);
             BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream))) {
            while (bufferedReader.ready()){
                listInteger.add(bufferedReader.read());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return listInteger;
    }
    public void writingChangedTextToFile(){
        try {
            FileWriter writer = new FileWriter(outgoingFile);
            StringBuilder sb = new StringBuilder();
            for (Character character : decoder.decryption(convertToListInteger())) {
                sb.append(character.toString());
            }
            String str = sb.toString();
            writer.write(str);
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
