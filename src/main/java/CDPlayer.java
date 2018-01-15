public class CDPlayer {

    private String make;
    private String model;

    public CDPlayer(String make, String model){
        this.make = make;
        this.model = model;
    }

    public String getMake() {
        return this.make;
    }

    public String getModel() {
        return this.model;
    }

    public String play() {
        return "I'm playing a CD";
    }
}
