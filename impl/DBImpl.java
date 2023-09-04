package impl;

import mvc.Registry;

import java.io.IOException;

public interface DBImpl {
    void save(Registry registry) throws IOException;

    String load() throws IOException;

    boolean checkFile();
}
