public class AudioRecording extends MediaElement {
    private int duration;
    private int volume;

    public AudioRecording(String title, int duration, int volume) {
        super(title);
        this.duration = duration;
        this.volume = volume;
    }

    @Override
    public void execute() {
        play();
    }

    public void play() {
        for (int i = 0; i < duration; i++) {
            System.out.println(title + " " + "!".repeat(volume));
        }
    }

    public void increaseVolume() {
        volume++;
    }

    public void decreaseVolume() {
        if (volume > 0) volume--;
    }
}
