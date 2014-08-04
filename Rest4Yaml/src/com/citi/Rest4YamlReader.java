package com.citi;

import java.io.FileReader;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import net.sourceforge.yamlbeans.YamlReader;

/**
 * Rest4YamlReader class is created as a sample to show how Yaml file can be
 * read and displayed via REST Apis
 * 
 * <p>
 * <B> Execute <code>getYamlInHtml</code> to list the contents of Yaml file in
 * HTML format </B>
 * </p>
 * <p>
 * <B> Execute <code>getYamlInPlainTest</code> to print the contents of Yaml
 * file in plain text format </B>
 * </p>
 * 
 * @author Nainesh Jhaveri
 * @version 1.0
 * @since 0.1
 */
@Path("getYaml")
public class Rest4YamlReader {

	private String today = null;
	private int dayOfTheWeek;

	/**
	 * getYamlInHtml list the contents of Yaml file in HTML format
	 * 
	 * 
	 * @return returnString HTML representation of JavaObject stored in data.yml
	 *         file
	 */
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String getYamlInHtml() {
		String returnString = "";
		com.citi.JavaObject data = null;
		try {
			YamlReader reader = new YamlReader(new FileReader("C:\\data.yml"));
			data = reader.read(JavaObject.class);
			java.util.Calendar C1 = java.util.Calendar.getInstance();
			C1.setTimeInMillis(System.currentTimeMillis());
			SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yy");
			setToday(sdf.format(C1.getTime()));
			setDayOfTheWeek(C1.get(Calendar.DAY_OF_WEEK));
		} catch (Exception e) {
			data = new JavaObject("400");
		}
		if (!(data.getError().equalsIgnoreCase("400"))) {
			// System.out.println("Success in reading Yaml File data.yml");

			returnString = "<html> " + "<title>" + "Rest 4 Yaml sample"
					+ "</title>" + "<body><h1>" + "Rest 4 Yaml sample"
					+ "</h1>" + "<P> Hello <B>" + data.getName() + "</B></P>"
					+ "<P> Today is " + getToday() + " and it's a "
					+ getDay(getDayOfTheWeek()) + "</P>" + "<BR>"
					+ "</P> Following Items are available in the store: </P>"
					+ "<Table border=\"1\">" + "<TR>" + "<TD>Item Code</TD>"
					+ "<TD>Item Name</TD>" + "<TD>Item DESC</TD>"
					+ "<TD>Manufacturer</TD>" + "<TD>Item Price</TD>"
					+ "<TD>QTY Available</TD>" + "</TR>";

			for (int i = 0; i < data.getItemList().size(); i++) {
				returnString = returnString + "<TR>";
				returnString = returnString + "<TD>"
						+ data.getItemList().get(i).getItemCode() + "</TD>";
				returnString = returnString + "<TD>"
						+ data.getItemList().get(i).getItemName() + "</TD>";
				returnString = returnString + "<TD>"
						+ data.getItemList().get(i).getItemDescription()
						+ "</TD>";
				returnString = returnString + "<TD>"
						+ data.getItemList().get(i).getItemManufacturer()
						+ "</TD>";
				returnString = returnString + "<TD>"
						+ data.getItemList().get(i).getItemPrice() + "</TD>";
				returnString = returnString + "<TD>"
						+ data.getItemList().get(i).getQuantityAvailable()
						+ "</TD>";
				returnString = returnString + "</TR>";
			}
			returnString = returnString + "</Table>" + "</body>" + "</html> ";
		} else {
			returnString = "<html> "
					+ "<title>"
					+ "Rest 4 Yaml sample"
					+ "</title>"
					+ "<body><h1>"
					+ "Rest 4 Yaml sample"
					+ "</h1>"
					+ "<p> Error Reading Yaml File make sure data.yaml is present at location c:\\data.yaml </p>"
					+ "</body>" + "</html> ";
		}
		return returnString;
	}

	private String getDay(int dayOfTheWeek) {
		String weekDay = "";
		if (dayOfTheWeek == 1)
			weekDay = "Sunday";
		if (dayOfTheWeek == 2)
			weekDay = "Monday";
		if (dayOfTheWeek == 3)
			weekDay = "Tuesday";
		if (dayOfTheWeek == 4)
			weekDay = "Wedday";
		if (dayOfTheWeek == 5)
			weekDay = "Thursday";
		if (dayOfTheWeek == 6)
			weekDay = "Friday";
		if (dayOfTheWeek == 7)
			weekDay = "Saturday";
		return weekDay;
	}

	/**
	 * getYamlInPlainText list the contents of Yaml file in plain text format
	 * 
	 * 
	 * @return returnString Plain Text representation of JavaObject stored in
	 *         data.yml file
	 */
	@Path("inplaintext")
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getYamInPlainText() {
		String returnString = "";
		com.citi.JavaObject data = null;
		try {
			YamlReader reader = new YamlReader(new FileReader("C:\\data.yml"));
			data = reader.read(JavaObject.class);
			java.util.Calendar C1 = java.util.Calendar.getInstance();
			C1.setTimeInMillis(System.currentTimeMillis());
			SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yy");
			setToday(sdf.format(C1.getTime()));
			setDayOfTheWeek(C1.get(Calendar.DAY_OF_WEEK));
		} catch (Exception e) {
			data = new JavaObject("400");
		}

		if (!(data.getError().equalsIgnoreCase("400"))) {
			// System.out.println("Success in reading Yaml File data.yml");

			returnString = "Rest 4 Yaml sample\n" + "Hello " + data.getName()
					+ "\nToday is " + getToday() + " and it's a "
					+ this.getDay(getDayOfTheWeek())
					+ "\nFollowing Items are available in the store:" + "\n"
					+ "Item Code \t" + "Item Name \t" + "Item DESC \t"
					+ "Manufacturer \t" + "Item Price \t" + "QTY Available \t";
			for (int i = 0; i < data.getItemList().size(); i++) {
				returnString = returnString + "\n";
				returnString = returnString + ""
						+ data.getItemList().get(i).getItemCode() + "\t\t";
				returnString = returnString + ""
						+ data.getItemList().get(i).getItemName() + "\t";
				returnString = returnString + ""
						+ data.getItemList().get(i).getItemDescription() + "\t";
				returnString = returnString + ""
						+ data.getItemList().get(i).getItemManufacturer()
						+ "\t";
				returnString = returnString + ""
						+ data.getItemList().get(i).getItemPrice() + "\t";
				returnString = returnString + ""
						+ data.getItemList().get(i).getQuantityAvailable();
			}
		} else {
			returnString = "Rest 4 Yaml sample"
					+ "\nError Reading Yaml File make sure data.yaml is present at location c:\\data.yaml";
		}
		return returnString;
	}

	public String getToday() {
		return today;
	}

	public void setToday(String today) {
		this.today = today;
	}

	public int getDayOfTheWeek() {
		return dayOfTheWeek;
	}

	public void setDayOfTheWeek(int dayOfTheWeek) {
		this.dayOfTheWeek = dayOfTheWeek;
	}

}
