public class ProtectionProxy implements ImageUploader {
    private RealImageUploader realUploader;
    private boolean isLoggedIn;

    public ProtectionProxy(boolean isLoggedIn) {
        this.realUploader = new RealImageUploader();
        this.isLoggedIn = isLoggedIn;
    }

    @Override
    public void uploadImage(String imageName) {
        if (isLoggedIn) {
            realUploader.uploadImage(imageName);
        } else {
            System.out.println("Permission denied. Please login to upload.");
        }
    }

    @Override
    public void replaceImage(String oldImage, String newImage) {
        if (isLoggedIn) {
            realUploader.replaceImage(oldImage, newImage);
        } else {
            System.out.println("Permission denied. Please login to replace.");
        }
    }
}