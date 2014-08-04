package com.citi;

import java.util.ArrayList;

/**
 * A JavaObject is a container object to hold data read from YAML file
 * 
 * @author Nainesh Jhaveri
 * @version 1.0
 * @since 0.1
 */
public class JavaObject {
	private String name = "";
	private java.util.ArrayList<com.citi.Item> itemList = new ArrayList<com.citi.Item>();
	private String error = "";

	/**
	 * Create an empty JavaObject.
	 */
	public JavaObject() {
	}

	/**
	 * Constructs a Java object with an error code.
	 * 
	 * 
	 * @param error
	 *            Error Code to be set inside this object
	 */
	public JavaObject(String error) {
		this.error = error;
	}

	/**
	 * Returns the error code of this JavaObject.
	 * 
	 * @return the error
	 */
	public String getError() {
		return error;
	}
	
	/**
	 * Sets the error code of this JavaObject.
	 * 
	 * @param error	 must be a String, it cannot be null
	 */
	public void setError(String error) {
		this.error = error;
	}


	/**
	 * Returns the name of the customer of this JavaObject.
	 * 
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Sets the name of the customer of this JavaObject.
	 * 
	 * @param name	 must be a String, it cannot be null
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Returns all items of itemList of this JavaObject
	 * 
	 * @return the list of items
	 */
	public java.util.ArrayList<com.citi.Item> getItemList() {
		return itemList;
	}

	/**
	 * Sets the the list of items of this JavaObject.
	 * 
	 * @param itemList     must contain at least one item, it cannot be null
	 */
	public void setItemList(java.util.ArrayList<com.citi.Item> itemList) {
		this.itemList = itemList;
	}

}
