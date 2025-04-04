public class RealImageUploader implements ImageUploader {
    @Override
    public void uploadImage(String imageName) {
        System.out.println("Uploading image: " + imageName);
    }

    @Override
    public void replaceImage(String oldImage, String newImage) {
        System.out.println("Replacing " + oldImage + " with " + newImage);
    }
}