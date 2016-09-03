package it.jpm.superSimpleStock.view.activity;

import it.jpm.superSimpleStock.controller.Controller;
import it.jpm.superSimpleStock.utils.Utils;
import it.jpm.superSimpleStock.view.Activity;
import it.jpm.superSimpleStocks.model.Stock;
import it.jpm.superSimpleStocks.model.TradeType;

import java.util.Date;

public class RecordTrade implements Activity {

	private Activity parent;
	private Controller controller;
	public RecordTrade(Activity parent, Controller controller) {
		this.parent = parent;
		this.controller = controller;	}

	@Override
	public int showActivity() {
		execute();
		return 0;
	}

	public void execute() {
		System.out.println("Record a trade");

		
		Stock stock = Utils.selectStock("Select stock", controller.getStocks());

		Date date = new Date();
		
		Integer quantity = Utils.readInteger("Type the quantity of the trade (integer)");
		
		TradeType tt = Utils.readTradeType("Select the tipe of trade");
		
		double price = Utils.readDouble("Type the price of the trade (double value, value of the single stock)");
		controller.recordTrade(stock, date, quantity, tt, price, parent);
		stock.setTickerPrice(price);
		System.out.println("trade recored!\n--------------------------------------------------------------------------------");
		
	}
	
}
