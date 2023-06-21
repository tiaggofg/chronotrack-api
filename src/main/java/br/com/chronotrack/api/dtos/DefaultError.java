package br.com.chronotrack.api.dtos;

public class DefaultError {

    private String message;
    private String status;
    private String path;
    private long timestamp;

    protected DefaultError() {
        timestamp = System.currentTimeMillis();
    }

    public static DefaultErrorBuilder builder() {
        return DefaultErrorBuilder.getInstance();
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }
}
