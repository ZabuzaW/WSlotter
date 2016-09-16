package de.zabuza.wslotter.model;

/**
 * Exception which is thrown whenever a task should be aborted because it
 * encountered an exception. This can be used to catch known errors.
 * 
 * @author Zabuza
 *
 */
public class AbortTaskException extends RuntimeException {

	/**
	 * Serial version UID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Creates a new abort task exception.
	 */
	public AbortTaskException() {
		super();
	}
}