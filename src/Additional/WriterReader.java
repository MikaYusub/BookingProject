package Additional;

import java.io.*;

public class WriterReader<T> {
    public T Reader(String path, T obj) {
        ObjectInputStream in = null;
        try {
            in = new ObjectInputStream(new BufferedInputStream(
                    new FileInputStream(path)));
            obj = (T) in.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (in != null) {
                    in.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return obj;
    }

    public void Writer(String path, T obj) {
        FileOutputStream file = null;
        try {
            file = new FileOutputStream(path);
            ObjectOutputStream data = new ObjectOutputStream(file);
            data.writeObject(obj);
            data.flush();
            data.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (file != null) {
                    file.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
