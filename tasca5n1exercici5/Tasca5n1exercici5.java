package tasca5n1exercici5;

import java.io.*;

public class Tasca5n1exercici5 {
	public static void main(String[] args) throws IOException {

		SpareParts part1 = new SpareParts("engine", 2000);

		serialize(part1);

		deserialize();

	}

	public static void serialize(SpareParts partsList) {
		try {
			FileOutputStream file = new FileOutputStream(
					"/Users/promusic/eclipse-workspace/Sprint1/src/tasca5n1exercici5/file.ser");
			ObjectOutputStream out = new ObjectOutputStream(file);
			out.writeObject(partsList);
			out.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void deserialize() {

		try {
			FileInputStream file = new FileInputStream(
					"/Users/promusic/eclipse-workspace/Sprint1/src/tasca5n1exercici5/file.ser");
			ObjectInputStream input = new ObjectInputStream(file);
			SpareParts partsListDeserialized = (SpareParts) input.readObject();
			file.close();
			input.close();

			System.out.println(partsListDeserialized);

		} catch (IOException | ClassNotFoundException e) {

			e.printStackTrace();
		}

	}
}

class SpareParts implements Serializable {

	private static final long serialVersionUID = 1L;
	private String name;
	private int price;

	public SpareParts(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "SpareParts [name=" + name + ", price=" + price + "]";
	}

}
