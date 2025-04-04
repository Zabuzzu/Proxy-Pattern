public class ProxyDemo {
    public static void main(String[] args) {
        Image image1 = new ProxyImage("house123.jpg", "house123_thumbnail.jpg");
        image1.displayFullImage();

        System.out.println("-----");

        ImageUploader uploader = new ProtectionProxy(false);
        uploader.uploadImage("new_image.jpg");

        uploader = new ProtectionProxy(true);
        uploader.replaceImage("old.jpg", "new.jpg");
    }
}