package it.jpm.superSimpleStock.view.menu;

import it.jpm.superSimpleStock.controller.Controller;
import it.jpm.superSimpleStock.view.activity.DividendYield;
import it.jpm.superSimpleStock.view.activity.Exit;
import it.jpm.superSimpleStock.view.activity.PERatio;
import it.jpm.superSimpleStock.view.activity.StockPrice;

public class StockStatMenu extends Menu {

	
	public StockStatMenu(Menu parent, Controller controller) {
		super("StockStatMenu", parent, controller);

		this.put(1, new MenuItem("Calculate the dividend yield", true, new DividendYield(controller)));
		this.put(2, new MenuItem("Calculate the P/E Ratio", true, new PERatio(controller)));
		this.put(3, new MenuItem("Calculate Stock Price", true, new StockPrice(controller)));
		this.put(4, new MenuItem("exit", true, new Exit(parent, controller)));

	}
}
