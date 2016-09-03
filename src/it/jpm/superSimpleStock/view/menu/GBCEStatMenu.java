package it.jpm.superSimpleStock.view.menu;

import it.jpm.superSimpleStock.controller.Controller;
import it.jpm.superSimpleStock.view.activity.Exit;
import it.jpm.superSimpleStock.view.activity.GBCEIndex;

public class GBCEStatMenu extends Menu{

	public GBCEStatMenu(Menu parent, Controller controller) {
		super("GBCEStatMenu", parent, controller);

		this.put(1, new MenuItem("Calculate the GBCE All Share Index", true, new GBCEIndex(controller)));
		this.put(2, new MenuItem("exit", true, new Exit()));

	}

}
