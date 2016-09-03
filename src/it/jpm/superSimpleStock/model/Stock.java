package it.jpm.superSimpleStock.model;

public class Stock {

	private String stockSymbol;
	private StockType type;
	private double lastDividend;
	private double fixedDividend;
	private double parValue;
	private double tickerPrice;

	/**
	 * @return the tickerPrice
	 */
	public double getTickerPrice() {
		return tickerPrice;
	}

	/**
	 * @param tickerPrice
	 *            the tickerPrice to set
	 */
	public void setTickerPrice(double tickerPrice) {
		this.tickerPrice = tickerPrice;
	}

	/**
	 * @return the stockSymbol
	 */
	public String getStockSymbol() {
		return stockSymbol;
	}

	/**
	 * @param stockSymbol
	 *            the stockSymbol to set
	 */
	public void setStockSymbol(String stockSymbol) {
		this.stockSymbol = stockSymbol;
	}

	/**
	 * @return the type
	 */
	public StockType getType() {
		return type;
	}

	/**
	 * @param type
	 *            the type to set
	 */
	public void setType(StockType type) {
		this.type = type;
	}

	/**
	 * @return the lastDividend
	 */
	public double getLastDividend() {
		return lastDividend;
	}

	/**
	 * @param lastDividend
	 *            the lastDividend to set
	 */
	public void setLastDividend(double lastDividend) {
		this.lastDividend = lastDividend;
	}

	/**
	 * @return the fixedDividend
	 */
	public double getFixedDividend() {
		return fixedDividend;
	}

	/**
	 * @param fixedDividend
	 *            the fixedDividend to set
	 */
	public void setFixedDividend(double fixedDividend) {
		this.fixedDividend = fixedDividend;
	}

	/**
	 * @return the parvalue
	 */
	public double getParValue() {
		return parValue;
	}

	/**
	 * @param parvalue
	 *            the parvalue to set
	 */
	public void setParValue(double parValue) {
		this.parValue = parValue;
	}

	/**
	 * @param stockSymbol
	 * @param type
	 * @param lastDividend
	 * @param fixedDividend
	 * @param parvalue
	 */
	public Stock(String stockSymbol, StockType type, double lastDividend,
			double fixedDividend, double parValue) {
		super();
		this.stockSymbol = stockSymbol;
		this.type = type;
		this.lastDividend = lastDividend;
		this.fixedDividend = fixedDividend;
		this.parValue = parValue;
		this.tickerPrice = parValue;
	}

	/**
	 * 
	 */
	public Stock() {
		super();
	}

	public Stock createCommonStock(String stockSymbol, double lastDividend,
			double parvalue) {
		return new Stock(stockSymbol, StockType.COMMON, lastDividend, 0f,
				parvalue);
	}

	public Stock createPreferredStock(String stockSymbol, double lastDividend,
			double fixedDividend, double parvalue, double tickerPrice) {
		return new Stock(stockSymbol, StockType.PREFERRED, lastDividend,
				fixedDividend, parvalue);
	}

	/**
	 * @return -1 if the price of the stock is minor or equal to 0;
	 */
	public double calculateDividendYield() {
		if (this.tickerPrice <= 0.0d)
			return -1.0d;

		if (this.type == StockType.COMMON)
			return this.lastDividend / this.tickerPrice;
		else
			return (this.fixedDividend * this.parValue) / this.tickerPrice;
	}
	
	/**
	 * @return -1 if the price of the stock is minor or equal to 0;
	 */
	public double calculatePERatio() {
		double dy = calculateDividendYield();

		if (dy != -1.0d)
			return tickerPrice / dy;
		else
			return dy;
	}

}
