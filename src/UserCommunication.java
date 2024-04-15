import java.util.List;
import java.util.Scanner;

public class UserCommunication {

    public static FileOperator getNumberOfChangerText() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Какую операцию необходимо выполнить?");
        System.out.println("1 - зашифровать текст\n2 - расшифровать текст\n3 - взломать шифр (пока недоступно)");
        int input = scanner.nextInt();
        if (!isRightNumber(input)) {
            System.out.println("wrong number");
            getNumberOfChangerText();
        }
        return getFileOperator(input);
    }

    private static FileOperator getFileOperator(int input) {
        return switch (input) {
            case 1 -> FileOperator.ENCODE;
            case 2 -> FileOperator.DECODE;
            default -> throw new RuntimeException("Wrong number");
        };
    }

    private static boolean isRightNumber(int num) {
        List<Integer> list = List.of(1, 2);
        return list.contains(num);
    }

    public static String getPathOfFileForRead() {
        System.out.println("Введите путь к файлу с текстом:");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static String getPathOfFileForWriting() {
        System.out.println("Введите путь, где сохранить обработанный файл:");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static int getKey() {
        System.out.println("Введите числовой код для шифрования:");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
