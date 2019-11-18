package day24_nio;

import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class CopyImage {
    public static void main(String[] args) throws Exception {
        URI uri = URI.create("https://i.ytimg.com/vi/GyD4LF64tBM/maxresdefault.jpg");
        Path dest = Paths.get("src/day24_nio/animal.jpg");
        Files.copy(uri.toURL().openStream(), dest, StandardCopyOption.REPLACE_EXISTING);
    }
}
