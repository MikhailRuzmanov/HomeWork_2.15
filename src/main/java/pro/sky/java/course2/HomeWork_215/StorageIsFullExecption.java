package pro.sky.java.course2.HomeWork_215;

public class StorageIsFullExecption extends RuntimeException {
    public StorageIsFullExecption() {
    }

    public StorageIsFullExecption(String message) {
        super(message);
    }

    public StorageIsFullExecption(String message, Throwable cause) {
        super(message, cause);
    }

    public StorageIsFullExecption(Throwable cause) {
        super(cause);
    }

    public StorageIsFullExecption(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
