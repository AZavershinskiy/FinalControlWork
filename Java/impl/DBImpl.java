package impl;

import java.io.IOException;

import mvc.Registry;

public interface DBImpl {
    void save(Registry registry) throws IOException;

    String load() throws IOException;

    boolean checkFile();
}
