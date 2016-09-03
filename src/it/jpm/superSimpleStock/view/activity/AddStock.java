package it.jpm.superSimpleStock.view.activity;

import it.jpm.superSimpleStock.controller.Controller;
import it.jpm.superSimpleStock.model.StockType;
import it.jpm.superSimpleStock.utils.Utils;
import it.jpm.superSimpleStock.view.Activity;

public class AddStock implements Activity {

	private Activity parent;
	private Controller controller;
	public AddStock(Activity parent, Controller controller) {
		this.parent = parent;
		this.controller = controller;
	}

	@Override
	public int showActivity() {
		execute();
		return 0;
	}

	public void execute() {
		System.out.println("Adding of a stock");

		String stock = Utils.readString("Type the symbol of the stock");

		StockType type = Utils
				.readStockType("What type of stock do you want to add?");

		Double lastDividend = Utils
				.readDouble("type the last dividend of the stock", true);
		
		Double fixedDividend = 0.0d;
		if (type == StockType.PREFERRED)
			fixedDividend = Utils.readDouble("type the fixed dividend in % (integer)",true);
		
		Double parValue = Utils.readDouble("type the Par Value of the stock",false);
		
		controller.addStock(stock, type, lastDividend, fixedDividend, parValue, parent);
		
		System.out.println("stock added!\n--------------------------------------------------------------------------------");
		
	}
}
