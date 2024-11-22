public class Video extends MediaElement {
    private int duration;
    private int volume;
    private int brightness;

    public Video(String title, int duration, int volume, int brightness) {
        super(title);
        this.duration = duration;
        this.volume = volume;
        this.brightness = brightness;
    }

    @Override
    public void execute() {
        play();
    }

    public void play() {
        for (int i = 0; i < duration; i++) {
            System.out.println(title + " " + "!".repeat(volume) + "*".repeat(brightness));
        }
    }

    public void increaseVolume() {
        volume++;
    }

    public void decreaseVolume() {
        if (volume > 0) volume--;
    }

    public void increaseBrightness() {
        brightness++;
    }

    public void decreaseBrightness() {
        if (brightness > 0) brightness--;
    }
}

