import java.net.URL;

public interface Downloader {
    void download(URL fileUrl, String destinationPath);
}
