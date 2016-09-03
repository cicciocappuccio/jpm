package it.jpm.superSimpleStock.view.activity;

import it.jpm.superSimpleStock.controller.Controller;
import it.jpm.superSimpleStock.view.Activity;

public class Exit implements Activity {

	private Activity parent;
	private Controller controller;

	public Exit(Activity parent, Controller controller) {
		this.parent = parent;
		this.controller = controller;
	}

	@Override
	public int showActivity() {
		return 0;
	}

}
