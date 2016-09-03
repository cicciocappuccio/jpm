package it.jpm.superSimpleStock.view.menu;

import it.jpm.superSimpleStock.controller.Controller;
import it.jpm.superSimpleStock.view.activity.AddStock;
import it.jpm.superSimpleStock.view.activity.Exit;
import it.jpm.superSimpleStock.view.activity.RecordTrade;

public class MainMenu extends Menu {

	public MainMenu(Controller controller) {
		super("Main");

		setController(controller);

		this.put(1, new MenuItem("Add stock to GBCE", true, new AddStock(this,
				controller)));
		this.put(2, new MenuItem("Record a trade", false, new RecordTrade(this,
				controller)));
		this.put(3, new MenuItem("Stocks statistics", false, new StockStatMenu(
				this, controller)));
		this.put(4, new MenuItem("GBCE statistics", false, new GBCEStatMenu(
				this, controller)));
		this.put(5, new MenuItem("exit", true, new Exit(null, controller)));

	}

}
