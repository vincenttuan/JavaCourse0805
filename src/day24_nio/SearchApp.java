package day24_nio;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

public class SearchApp extends SimpleFileVisitor<Path>{
    private static PathMatcher matcher;
    {
        matcher = FileSystems.getDefault().getPathMatcher("glob:*.{html,txt.xml}");
    }
    
    private void search(Path file) {
        Path fname = file.getFileName();
        if(fname != null && matcher.matches(fname)) {
            System.out.printf("比對成功: %s, 完整路徑: %s\n", fname, file);
        }
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        search(file);
        return FileVisitResult.CONTINUE;
    }
    
    
    public static void main(String[] args) throws Exception {
        Files.walkFileTree(Paths.get("C:\\Program Files"), new SearchApp());
    }
}
