import java.util.List;

public class MainService {
    ChangerText changerText;
    FileRepository fileRepository = new FileRepository();

    public void execute(){
        FileOperator operationText = UserCommunication.getNumberOfChangerText();
        String pathOfFileForRead = UserCommunication.getPathOfFileForRead();
        int key = UserCommunication.getKey();
        List<Integer> listForChanging = fileRepository.readFileForChanging(pathOfFileForRead);
        changerText = ChangerFactory.getChanger(operationText);
        List<Character> listChanged = changerText.modification(listForChanging, key);
        String pathOfFileForWriting = UserCommunication.getPathOfFileForWriting();
        fileRepository.writingChangedTextToFile(listChanged, pathOfFileForWriting);
    }

}
