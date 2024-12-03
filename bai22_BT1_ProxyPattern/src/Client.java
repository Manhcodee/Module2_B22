import java.net.URL;

public class Client {
    public static void main(String[] args) {
        try {
            // URL của file cần tải về
            URL fileUrl = new URL("https://example.com/somefile.zip");

            // Đường dẫn đến nơi lưu file
            String destinationPath = "C:/Users/Username/Downloads/somefile.zip";

            // Sử dụng FileDownloaderProxy để tải file
            Downloader downloader = new FileDownloaderProxy();
            downloader.download(fileUrl, destinationPath);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
