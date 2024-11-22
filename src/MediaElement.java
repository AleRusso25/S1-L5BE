public abstract class MediaElement {
    protected String title;

    public MediaElement(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }


    public abstract void execute();
}

