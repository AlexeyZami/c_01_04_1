import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Reader_Writer {
    ChangerFactory factory = new ChangerFactory();
    UserInteraction userInteraction = new UserInteraction();
    private String incomingFile = userInteraction.getIncomingFilePath();

    private String outgoingFilePath = userInteraction.getOutgoingFilePath();
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
    public void writingChangedTextToFile(int number){
        try {
            FileWriter writer = new FileWriter(outgoingFilePath);
            StringBuilder sb = new StringBuilder();
            for (Character character : factory.getChanger(number).modification(convertToListInteger())) {
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
