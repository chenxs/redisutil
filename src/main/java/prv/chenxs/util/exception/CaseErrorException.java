package prv.chenxs.util.exception;

public class CaseErrorException extends Exception {
	private static final long serialVersionUID = 6501108250902304719L;

	public CaseErrorException() {
		super();
	}

	public CaseErrorException(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public CaseErrorException(String message, Throwable cause) {
		super(message, cause);
	}

	public CaseErrorException(String message) {
		super(message);
	}

	public CaseErrorException(Throwable cause) {
		super(cause);
	}

}
