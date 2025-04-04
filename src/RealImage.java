public class RealImage implements Image {
    private String filename;

    public RealImage(String filename) {
        this.filename = filename;
        loadHighResImage();
    }

    private void loadHighResImage() {
        System.out.println("Loading high-res image from disk: " + filename);
    }

    @Override
    public void displayFullImage() {
        System.out.println("Displaying high-res image: " + filename);
    }
}