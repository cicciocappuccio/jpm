package it.jpm.superSimpleStock.view.menu;

import it.jpm.superSimpleStock.controller.Controller;
import it.jpm.superSimpleStock.model.TradeType;
import it.jpm.superSimpleStock.utils.Utils;
import it.jpm.superSimpleStock.view.Activity;

import java.util.HashMap;

public class Menu extends HashMap<Integer, MenuItem> implements Activity {

	private String name;
	private Menu parent;
	private Controller controller;

	/**
	 * @param name
	 * @param parent
	 */
	public Menu(String name, Menu parent, Controller controller) {
		super();
		this.name = name;
		this.parent = parent;
		this.controller = controller;
	}

	/**
	 * @return the controller
	 */
	public Controller getController() {
		return controller;
	}

	/**
	 * @param controller
	 *            the controller to set
	 */
	public void setController(Controller controller) {
		this.controller = controller;
	}

	/**
	 * @return the parent
	 */
	public Menu getParent() {
		return parent;
	}

	/**
	 * @param parent
	 *            the parent to set
	 */
	public void setParent(Menu parent) {
		this.parent = parent;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @param name
	 */
	public Menu(String name) {
		super();
		this.name = name;
	}

	public Menu() {
		super();
	}

	public void showMenu() {
		for (int i = 1; i <= this.size(); i++) {
			if (get(i).isActive())
				System.out.println(i + " - " + get(i).toString());
		}

	}

	@Override
	public int showActivity() {
		showMenu();
		int rep = execute();
		return this.get(rep).getActivity().showActivity();

	}

	public int execute() {
		Integer input = null;

		boolean isValid = true;

		do {

			input = Utils.readInteger("type the number of your choice");

			if (this.containsKey(input) && get(input).isActive())
				return input;
			else {
				isValid = false;
				System.out.println("Answer not valid!");
			}
		} while (!isValid);

		return 0;
	}

}
