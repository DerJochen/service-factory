package de.jochor.lib.servicefactory;

/**
 * Exception thrown by the service factories when loading of a static binder failed.
 *
 * <p>
 * <b>Started:</b> 2015-11-20
 * </p>
 *
 * @author Jochen Hormes
 *
 */
public class ServiceFactoryException extends RuntimeException {

	private static final long serialVersionUID = -2701677977848556872L;

	/**
	 * Creates a {@link ServiceFactoryException} containing a message and a parent exception.
	 * 
	 * @param message
	 *            Context for the exception
	 * @param e
	 *            Parent exception
	 */
	public ServiceFactoryException(String message, Exception e) {
		super(message, e);
	}

}
