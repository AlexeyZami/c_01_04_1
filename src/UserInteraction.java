import java.util.Scanner;

public class UserInteraction {

    private String incomingFilePath;
    private int code;
    private String outgoingFilePath;

    public void interaction(){
        Reader_Writer readerWriter = new Reader_Writer();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Какую операцию необходимо выполнить?");
        System.out.println("1 - зашифровать текст\n2 - расшифровать текст\n3 - взломать шифр (пока недоступно)");
        int input = scanner.nextInt();
        switch (input){
            case 1 -> {
                askTheUser();
                readerWriter.writingChangedTextToFile(input);
            }
        }
    }
    private void askTheUser() {
        createIncomingFilePath();
        createCode();
        createOutgoingFilePath();
    }
    public  String createIncomingFilePath(){
        System.out.println("Введите путь к файлу с текстом:");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
    public int createCode(){
        System.out.println("Введите числовой код для шифрования:");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
    public String createOutgoingFilePath(){
        System.out.println("Введите путь, где сохранить обработанный файл:");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public String getIncomingFilePath() {
        return incomingFilePath;
    }

    public int getCode() {
        return code;
    }

    public String getOutgoingFilePath() {
        return outgoingFilePath;
    }
}
