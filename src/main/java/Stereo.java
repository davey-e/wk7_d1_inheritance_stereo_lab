public class Stereo {

    private String name;
    private Radio radio;
    private RecordDeck recordDeck;
    private CDPlayer cdPlayer;

    public Stereo(String name, Radio radio, RecordDeck recordDeck, CDPlayer cdPlayer){
        this.name = name;
        this.radio = radio;
        this.recordDeck = recordDeck;
        this.cdPlayer = cdPlayer;
    }

    public String getName() {
        return this.name;
    }

    public Radio getRadio() {
        return this.radio;
    }

    public RecordDeck getRecordDeck() {
        return this.recordDeck;
    }

    public CDPlayer getCDPlayer() {
        return this.cdPlayer;
    }

    public String tuneRadio(String station) {
        return radio.tune(station);
    }

    public String playRecord() {
        return recordDeck.play();
    }

    public String playCD() {
        return cdPlayer.play();
    }
}
