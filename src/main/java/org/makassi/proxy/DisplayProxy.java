package org.makassi.proxy;

import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class DisplayProxy implements Displayable{
    private static final Set<String> loadedFiles = ConcurrentHashMap.newKeySet();

    private final String fileName;
    private HighResolutionDisplay highResolutionDisplay;
    private boolean isLoaded = false;

    public DisplayProxy(String fileName) {
        this.fileName = fileName;
    }

    // The proxy pattern can be helpful for optimizing the system
    @Override
    public void loadFromDisk() {
        if(fileName != null) {
            if(highResolutionDisplay == null) {
                highResolutionDisplay = new HighResolutionDisplay(fileName);
            }
            if(loadedFiles.contains(fileName)) {
                System.out.println("Proxy skips disk load, " + fileName + " is already cached");
            } else {
                System.out.println("Proxy asks System service  to Load " + fileName + " from disk");
                highResolutionDisplay.loadFromDisk();
                loadedFiles.add(fileName);
            }
            isLoaded = true;
        }
    }

    @Override
    public void display() {
      if(!isLoaded) {
          loadFromDisk();
      }
      if(isLoaded) {
          highResolutionDisplay.display();
      }
    }
}
