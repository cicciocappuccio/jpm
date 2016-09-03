package it.jpm.superSimpleStock.model;

import java.util.Date;

//iii. record a trade, with timestamp, quantity of shares, buy or sell indicator and price
public class Trade {

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Trade [stock=" + stock + ", timestamp=" + timestamp
				+ ", quantity=" + quantity + ", type=" + type.toString() + ", price="
				+ price + "]";
	}

	private Stock stock;
	private Date timestamp;
	private int quantity;
	private TradeType type;
	private double price;

	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * @param price
	 *            the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	/**
	 * @param stock
	 * @param timestamp
	 * @param quantity
	 * @param type
	 * @param price
	 */
	public Trade(Stock stock, Date timestamp, int quantity, TradeType type,
			double price) {
		super();
		this.stock = stock;
		this.timestamp = timestamp;
		this.quantity = quantity;
		this.type = type;
		this.price = price;
	}

	/**
	 * 
	 */
	public Trade() {
		super();
	}

	/**
	 * @return the stock
	 */
	public Stock getStock() {
		return stock;
	}

	/**
	 * @param stock
	 *            the stock to set
	 */
	public void setStock(Stock stock) {
		this.stock = stock;
	}

	/**
	 * @return the timestamp
	 */
	public Date getTimestamp() {
		return timestamp;
	}

	/**
	 * @param timestamp
	 *            the timestamp to set
	 */
	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	/**
	 * @return the quantity
	 */
	public int getQuantity() {
		return quantity;
	}

	/**
	 * @param quantity
	 *            the quantity to set
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	/**
	 * @return the type
	 */
	public TradeType getType() {
		return type;
	}

	/**
	 * @param type
	 *            the type to set
	 */
	public void setType(TradeType type) {
		this.type = type;
	}

}
