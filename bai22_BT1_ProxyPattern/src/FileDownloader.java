import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class FileDownloader implements Downloader{
    private String userAgent;

    // Constructor nhận vào User-Agent của trình duyệt
    public FileDownloader(String userAgent) {
        this.userAgent = userAgent;
    }

    @Override
    public void download(URL fileUrl, String destinationPath) {
        try {
            // Thiết lập kết nối với URL
            URLConnection connection = fileUrl.openConnection();
            connection.setRequestProperty("User-Agent", userAgent);

            // Mở luồng đầu vào để tải file
            InputStream in = connection.getInputStream();
            FileOutputStream out = new FileOutputStream(destinationPath);

            byte[] buffer = new byte[4096];
            int bytesRead;
            while ((bytesRead = in.read(buffer)) != -1) {
                out.write(buffer, 0, bytesRead);
            }

            in.close();
            out.close();
            System.out.println("File downloaded successfully to " + destinationPath);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Download failed.");
        }
    }
}
