package com.citi;

/**
 * An Item is a container object to hold information about a given item
 * 
 * @author Nainesh Jhaveri
 * @version 1.0
 * @since 0.1
 */

public class Item {

	/**
	 * Create an empty item.
	 */
	public Item() {
	}

	/**
	 * Constructs an Item object that can then be printed on the screen.
	 * 
	 * 
	 * @param itemCode
	 *            Code used to identify an item
	 * @param itemName
	 *            Name of the Item
	 * @param itemDescription
	 *            Description of the Item
	 * @param itemManufacturer
	 *            Name of the Manufacturer of Item
	 * @param itemPrice
	 *            Price of the Item
	 * @param quantityAvailable
	 *            Number of items available in the store
	 */

	public Item(String itemCode, String itemName, String itemDescription,
			String itemManufacturer, double itemPrice, int quantityAvailable) {
		this.itemCode = itemCode;
		this.itemName = itemName;
		this.itemDescription = itemDescription;
		this.itemManufacturer = itemManufacturer;
		this.itemPrice = itemPrice;
		this.quantityAvailable = quantityAvailable;
	}

	private String itemCode;
	private String itemName;
	private String itemDescription;
	private String itemManufacturer;
	private double itemPrice;
	private int quantityAvailable;

	/**
	 * Returns the code of this item.
	 * 
	 * @return the item code
	 */
	public String getItemCode() {
		return itemCode;
	}

	/**
	 * Sets the itemCode.
	 * 
	 * @param itemCode	 must be a String, it cannot be null
	 */
	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	/**
	 * Returns the name of this item.
	 * 
	 * @return the item name
	 */
	public String getItemName() {
		return itemName;
	}

	/**
	 * Sets the itemName.
	 * 
	 * @param itemName	 must be a String, it cannot be null
	 */
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	/**
	 * Returns description of this item.
	 * 
	 * @return the item description
	 */
	public String getItemDescription() {
		return itemDescription;
	}

	/**
	 * Sets the itemDescription.
	 * 
	 * @param itemDescription must be a String, it is optional
	 */
	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}

	/**
	 * Returns manufacturer of this item.
	 * 
	 * @return the item manufacturer
	 */
	public String getItemManufacturer() {
		return itemManufacturer;
	}

	/**
	 * Sets the itemManufacturer.
	 * 
	 * @param itemManufacturer	 must be a String, it is optional
	 */
	public void setItemManufacturer(String itemManufacturer) {
		this.itemManufacturer = itemManufacturer;
	}

	/**
	 * Returns price of this item.
	 * 
	 * @return the item price
	 */
	public double getItemPrice() {
		return itemPrice;
	}
	
	/**
	 * Sets the itemPrice.
	 * 
	 * @param itemPrice	 must be a number greater than 0
	 */
	public void setItemPrice(double itemPrice) {
		this.itemPrice = itemPrice;
	}

	/**
	 * Returns available quantity of this item.
	 * 
	 * @return the quantity available
	 */
	public int getQuantityAvailable() {
		return quantityAvailable;
	}

	/**
	 * Sets the quantityAvailable.
	 * 
	 * @param quantityAvailable	 must be a number greater than or equal to 0
	 */
	public void setQuantityAvailable(int quantityAvailable) {
		this.quantityAvailable = quantityAvailable;
	}
}
