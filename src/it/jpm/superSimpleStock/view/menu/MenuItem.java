package it.jpm.superSimpleStock.view.menu;

import it.jpm.superSimpleStock.view.Activity;

public class MenuItem {

	
	private String label;
	private boolean active;
	private Activity activity;
	
	public MenuItem() {
		
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return label;
	}


	/**
	 * @param label
	 * @param active
	 */
	public MenuItem(String label, boolean active, Activity activity) {
		super();
		this.label = label;
		this.active = active;
		this.activity = activity;
	}


	/**
	 * @return the label
	 */
	public String getLabel() {
		return label;
	}


	/**
	 * @param label the label to set
	 */
	public void setLabel(String label) {
		this.label = label;
	}


	/**
	 * @return the active
	 */
	public boolean isActive() {
		return active;
	}


	/**
	 * @param active the active to set
	 */
	public void setActive(boolean active) {
		this.active = active;
	}

	/**
	 * @return the activity
	 */
	public Activity getActivity() {
		return activity;
	}


	/**
	 * @param activity the activity to set
	 */
	public void setActivity(Activity activity) {
		this.activity = activity;
	}
	
}
