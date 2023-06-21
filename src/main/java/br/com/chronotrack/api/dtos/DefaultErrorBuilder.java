package br.com.chronotrack.api.dtos;

public class DefaultErrorBuilder {

    private final DefaultError defaultError;

    private DefaultErrorBuilder() {
        this.defaultError = new DefaultError();
    }

    protected static DefaultErrorBuilder getInstance() {
        return new DefaultErrorBuilder();
    }

    public DefaultErrorBuilder message(String message) {
        defaultError.setMessage(message);
        return this;
    }

    public DefaultErrorBuilder status(String status) {
        defaultError.setStatus(status);
        return this;
    }

    public DefaultErrorBuilder path(String path) {
        defaultError.setPath(path);
        return this;
    }

    public DefaultError build() {
        return defaultError;
    }
}
