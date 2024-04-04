import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileRepository {
    List<Integer> listInteger = new ArrayList<>();

    public List<Integer> readFileForChanging(String incomingFile) {
        try (InputStream inputStream = new FileInputStream(incomingFile);
             BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream))) {
            while (bufferedReader.ready()) {
                listInteger.add(bufferedReader.read());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return listInteger;
    }

    public void writingChangedTextToFile(List<Character> listChanged, String outgoingFilePath) {
        try {
            FileWriter writer = new FileWriter(outgoingFilePath);
            StringBuilder sb = new StringBuilder();
            for (Character character : listChanged) {
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
