package de.zabuza.wslotter.model.selector;

import org.openqa.selenium.WebElement;

/**
 * Utility class that provides class selectors.
 * 
 * @author Zabuza {@literal <zabuza.dev@gmail.com>}
 *
 */
public final class Classes {

	/**
	 * Returns if a given element has a given class.
	 * 
	 * @param element
	 *            The element in question
	 * @param className
	 *            The class name in question
	 * @return <tt>True</tt> if the given element has the given class,
	 *         <tt>false</tt> if not.
	 */
	public static boolean hasClass(final WebElement element, final String className) {
		if (element == null || className == null || className.isEmpty()) {
			return false;
		}
		String attributeContent = element.getAttribute("class");
		if (attributeContent == null || attributeContent.isEmpty()) {
			return false;
		}
		String[] classes = attributeContent.split(" ");
		for (String thatClassName : classes) {
			if (className.equals(thatClassName)) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Utility class. No implementation.
	 */
	private Classes() {

	}
}
