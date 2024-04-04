public class ChangerFactory {
    public static ChangerText getChanger(FileOperator operator){
        return switch (operator){
            case ENCODE-> new Encoder();
            case DECODE -> new Decoder();
            default -> throw new IllegalArgumentException("Wrong number");
        };
    }
}
