package org.mercycorps.translationcards.exception;

public class AudioFileException extends Exception {

    public AudioFileException() {
    }

    public AudioFileException(String detailMessage) {
        super(detailMessage);
    }

    public AudioFileException(String detailMessage, Throwable throwable) {
        super(detailMessage, throwable);
    }

    public AudioFileException(Throwable throwable) {
        super(throwable);
    }
}
