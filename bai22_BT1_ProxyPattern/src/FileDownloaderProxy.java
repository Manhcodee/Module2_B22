import java.net.URL;

public class FileDownloaderProxy implements Downloader{
    private static final String DEFAULT_USER_AGENT = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/91.0.4472.124 Safari/537.36";
    private FileDownloader fileDownloader;

    public FileDownloaderProxy() {
        // Khởi tạo FileDownloader với User-Agent của Firefox
        fileDownloader = new FileDownloader(DEFAULT_USER_AGENT);
    }

    @Override
    public void download(URL fileUrl, String destinationPath) {
        // Gọi phương thức download của FileDownloader
        fileDownloader.download(fileUrl, destinationPath);
    }
}
