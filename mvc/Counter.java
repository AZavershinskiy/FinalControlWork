package mvc;

import impl.CountImpl;

import java.io.*;

public class Counter implements CountImpl, AutoCloseable {
    String path = "db/counter.txt";
    Integer count;
    BufferedReader br;
    FileWriter fw;

    public Counter() throws IOException {
        this.br = new BufferedReader(new FileReader(path));
        this.count = Integer.parseInt(br.readLine());
        this.fw = new FileWriter(path);
    }

    @Override
    public void add() throws IOException {
        count++;
        fw.write(count.toString());
        fw.flush();
    }

    @Override
    public void clear() throws IOException {
        fw.write("0");
        fw.flush();
    }

    @Override
    public void close() throws Exception {
        br.close();
        fw.close();
    }
}
