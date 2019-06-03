package com.youxiu326.stream;

import java.io.*;

public class LowerCaseInputStream extends FileInputStream {

    public static void main(String[] args) throws FileNotFoundException {
        InputStream in = new BufferedInputStream(
                new FileInputStream("test.txt")
        );
    }

    public LowerCaseInputStream(File file) throws FileNotFoundException {
        super(file);
    }

    @Override
    public int read() throws IOException {
        return super.read();
    }

    @Override
    public int read(byte[] b, int off, int len) throws IOException {
        return super.read(b, off, len);
    }
}