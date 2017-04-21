package de.zabuza.wslotter.controller.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import de.zabuza.wslotter.controller.MainFrameController;

/**
 * Listener of the stop action.
 * 
 * @author Zabuza {@literal <zabuza.dev@gmail.com>}
 *
 */
public class StopActionListener implements ActionListener {
	/**
	 * The controller of the main frame.
	 */
	private final MainFrameController mController;

	/**
	 * Creates a new listener of the stop action.
	 * 
	 * @param controller
	 *            Controller of the main frame
	 */
	public StopActionListener(final MainFrameController controller) {
		this.mController = controller;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
	 */
	@Override
	public void actionPerformed(final ActionEvent e) {
		this.mController.stopRoutine();
	}
}
