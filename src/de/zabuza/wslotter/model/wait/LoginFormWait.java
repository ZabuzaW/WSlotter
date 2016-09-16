package de.zabuza.wslotter.model.wait;

import org.openqa.selenium.WebDriver;

import de.zabuza.wslotter.model.selector.CSSSelectors;

/**
 * Class for waiting until the login form is present. Start waiting using the
 * {@link #waitUntilCondition()} method.
 * 
 * @author Zabuza
 *
 */
public class LoginFormWait extends CSSSelectorPresenceWait {
	/**
	 * Creates a new instance of this object using a given driver.
	 * 
	 * @param driver
	 *            Driver to use for waiting
	 */
	public LoginFormWait(final WebDriver driver) {
		super(driver, CSSSelectors.LOGIN_FORM_SUBMIT);
	}
}
