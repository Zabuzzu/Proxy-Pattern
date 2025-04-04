public interface ImageUploader {
    void uploadImage(String imageName);
    void replaceImage(String oldImage, String newImage);
}