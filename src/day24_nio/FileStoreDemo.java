package day24_nio;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FileStoreDemo {
    public static void main(String[] args) {
        FileSystems.getDefault()
                .getFileStores()
                .forEach(store -> {
                    try {
                        System.out.println(store + " : " + store.getTotalSpace()/1000000000 + "G");
                    } catch (IOException ex) {
                    }
                });
    }
}
