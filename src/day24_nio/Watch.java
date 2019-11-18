package day24_nio;

import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardWatchEventKinds;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;

public class Watch {
    public static void main(String[] args) throws Exception {
        Path path = Paths.get("c:/temp");
        WatchService ws = FileSystems.getDefault().newWatchService();
        path.register(ws, 
                StandardWatchEventKinds.ENTRY_CREATE,
                StandardWatchEventKinds.ENTRY_DELETE,
                StandardWatchEventKinds.ENTRY_MODIFY);
        
        while (true) {            
            System.out.println("Watch...");
            WatchKey key = ws.take();
            for(WatchEvent event : key.pollEvents()) {
                System.out.printf("事件: %s, 資源: %s\n",
                        event.kind().name(),
                        event.context().toString());
            }
            key.reset();
        }
    }
}
