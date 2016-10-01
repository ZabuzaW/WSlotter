package de.zabuza.wslotter.controller.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import de.zabuza.wslotter.controller.MainFrameController;

/**
 * Listener of the start action.
 * 
 * @author Zabuza {@literal <zabuza.dev@gmail.com>}
 *
 */
public class StartActionListener implements ActionListener {
	/**
	 * The controller of the main frame.
	 */
	private final MainFrameController mController;

	/**
	 * Creates a new listener of the start action.
	 * 
	 * @param view
	 *            View of the main frame
	 * @param controller
	 *            Controller of the main frame
	 */
	public StartActionListener(final MainFrameController controller) {
		mController = controller;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
	 */
	@Override
	public void actionPerformed(final ActionEvent e) {
		mController.startRoutine();
	}
}
