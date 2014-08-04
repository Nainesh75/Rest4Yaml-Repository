package com.citi;

import java.io.FileReader;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

import net.sourceforge.yamlbeans.YamlReader;
import net.sourceforge.yamlbeans.YamlWriter;

/**
 * YamlTester class is created to run simple tests on Yaml file
 * 
 * <p> <B>  Execute <code>main</code> method to create a new Yaml file </B> </p>
 *  
 * @author Nainesh Jhaveri
 * @version 1.0
 * @since 0.1
 */
public class YamlTester {
	private static String today = null;
	private static int dayOfTheWeek;

	/**
	 * Execute main to create a new Yaml file at c:\\data.yml
	 * 
	 * Change the value of <code> i <= 10 </code> in the for loop to change number items in the yaml file
	 * 
	 * @param args  are not used by main
	 */
	public static void main(String[] args) {

		JavaObject data = new JavaObject();
		data.setName("Sree Bodapati");
		java.util.Calendar C1 = java.util.Calendar.getInstance();
		C1.setTimeInMillis(System.currentTimeMillis());

		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yy");
		today = sdf.format(C1.getTime());
		dayOfTheWeek = C1.get(Calendar.DAY_OF_WEEK);

		java.util.ArrayList<com.citi.Item> itemList = new ArrayList<Item>();

		for (int i = 1; i <= 10; i++) {
			Item item = new Item("TV-" + i, "LG 3D Cinema " + (i + 42)
					+ " inch", "LG 3D Cinema " + (i + 42)
					+ " inch TV w/ 4 glasses", "LG", (500 + 10 * i), 10 + i);

			itemList.add(item);
		}
		data.setItemList(itemList);

		try {
			YamlWriter writer = new YamlWriter(new FileWriter("c:\\data.yml"));
			writer.write(data);
			writer.close();
			System.out.println("Success in writing Yaml File data.yml");
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			YamlReader reader = new YamlReader(new FileReader("c:\\data.yml"));
			data = reader.read(JavaObject.class);
			data.setError("200");
			System.out.println("Success in reading Yaml File data.yml");
		} catch (Exception e) {
			e.printStackTrace();

		}
	}

}
