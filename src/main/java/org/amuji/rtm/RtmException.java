package org.amuji.rtm;

/**
 * @author Roy Yang
 *         4/21/2015.
 */
public class RtmException extends RuntimeException {
    public RtmException() {
        super();
    }

    public RtmException(String message) {
        super(message);
    }

    public RtmException(String message, Throwable cause) {
        super(message, cause);
    }

    public RtmException(Throwable cause) {
        super(cause);
    }

    protected RtmException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
