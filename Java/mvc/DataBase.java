package mvc;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import impl.DBImpl;

public class DataBase implements DBImpl {
    String path = "Java/db/db.txt";

    @Override
    public void save(Registry registry) throws IOException {
        try (FileWriter fw = new FileWriter(path)) {
            fw.write(registry.toSave());
            fw.flush();
        }
    }

    @Override
    public String load() throws IOException {
        StringBuilder sb = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = br.readLine()) != null) {
                sb.append(line).append('\n');
            }
        }
        return sb.toString();
    }

    @Override
    public boolean checkFile() {
        return Files.exists(Path.of(path));
    }
}
