public class RecordDeck {

    private int playSpeed;
    private String make;
    private String model;

    public RecordDeck(int playSpeed, String make, String model){
        this.playSpeed = playSpeed;
        this.make = make;
        this.model = model;
    }

    public int getPlaySpeed() {
        return this.playSpeed;
    }

    public String getMake() {
        return this.make;
    }

    public String getModel() {
        return model;
    }

    public String play() {
        return "I am playing";
    }
}
