package it.jpm.superSimpleStock.controller;

import it.jpm.superSimpleStock.view.Activity;
import it.jpm.superSimpleStock.view.menu.Menu;
import it.jpm.superSimpleStocks.model.Stock;
import it.jpm.superSimpleStocks.model.StockType;
import it.jpm.superSimpleStocks.model.Trade;
import it.jpm.superSimpleStocks.model.TradeType;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Set;

public class Controller {

	Set<Stock> stocks;
	Set<Trade> trades;

	public Controller() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the stocks
	 */
	public Set<Stock> getStocks() {
		return stocks;
	}

	/**
	 * @param stocks
	 *            the stocks to set
	 */
	public void setStocks(Set<Stock> stocks) {
		this.stocks = stocks;
	}

	/**
	 * @return the trades
	 */
	public Set<Trade> getTrades() {
		return trades;
	}

	/**
	 * @param trades
	 *            the trades to set
	 */
	public void setTrades(Set<Trade> trades) {
		this.trades = trades;
	}

	public void addStock(String stock, StockType type, double lastDividend,
			double fixedDividend, double parValue, Activity parent) {
		stocks.add(new Stock(stock, type, lastDividend, fixedDividend, parValue));

		Menu m = (Menu) parent;
		m.get(2).setActive(true);
	}

	public void recordTrade(Stock stock, Date timestamp, int quantity,
			TradeType type, double price, Activity parent) {
		trades.add(new Trade(stock, timestamp, quantity, type, price));

		Menu m = (Menu) parent;
		m.get(3).setActive(true);
		m.get(4).setActive(true);
	}



	public int mainMenu(Menu mainMenu) {
		int rep = 0;
		do {
			mainMenu.showMenu();
			rep = mainMenu.execute();
			int repC = mainMenu.get(rep).getActivity().showActivity();
			
		} while (rep != 5);
		return rep;
	}

	public double calculateStockPrice(Stock stock) {
		Date date = new Date();

		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.MINUTE, -15);
		date = cal.getTime();

		double sum = 0;
		int quantity = 0;
		boolean founded = false;
		for (Trade t : trades) {
			if (t.getStock() == stock && t.getTimestamp().compareTo(date) > 0) {
				sum += t.getQuantity() * t.getPrice();
				quantity += t.getQuantity();
				founded = true;
			}
		}

		if (founded == false)
			return -1.0d;
		else
			return sum / quantity;
	}

	public double geometricMean() {

		double prod = 1;
		for (Stock s : stocks) {
			prod = prod * s.getTickerPrice();
		}

		return Math.pow(prod, 1.0 / stocks.size());
	}
}
