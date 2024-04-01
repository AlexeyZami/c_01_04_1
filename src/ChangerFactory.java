public class ChangerFactory {
    public ChangerCreator getChanger(int number){
        return switch (number){
            case 1 -> new Encoder();
            case 2 -> new Decoder();
            default -> throw new IllegalArgumentException("Wrong number");
        };
    }
}
