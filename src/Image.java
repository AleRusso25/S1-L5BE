public class Image extends MediaElement {
    private int brightness;

    public Image(String title, int brightness) {
        super(title);
        this.brightness = brightness;
    }

    @Override
    public void execute() {
        show();
    }

    public void show() {
        System.out.println(title + " " + "*".repeat(brightness));
    }

    public void increaseBrightness() {
        brightness++;
    }

    public void decreaseBrightness() {
        if (brightness > 0) brightness--;
    }
}

