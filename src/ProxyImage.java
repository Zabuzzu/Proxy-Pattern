public class ProxyImage implements Image {
    private String filename;
    private RealImage realImage;
    private String thumbnailPath;

    public ProxyImage(String filename, String thumbnailPath) {
        this.filename = filename;
        this.thumbnailPath = thumbnailPath;
        loadThumbnail();
    }

    private void loadThumbnail() {
        System.out.println("Loading low-res thumbnail: " + thumbnailPath);
    }

    public void displayThumbnail() {
        System.out.println("Displaying thumbnail: " + thumbnailPath);
    }

    @Override
    public void displayFullImage() {
        if (realImage == null) {
            realImage = new RealImage(filename);
        }
        realImage.displayFullImage();
    }
}