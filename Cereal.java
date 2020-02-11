package Assn04.Assn04;//lukacs ablonczy

/**
 * Defines the cereal abstract type
 * @author Lukacs Ablonczy
 */
public abstract class Cereal {
	protected String name;
	protected Double price;

	/**
	 * Base behavior for the prepare method for subclasses
	 */
	public void prepare() {
		System.out.println("Preparing the " + name);
	}

	/**
	 * Base behavior for the boxCereal method for children
	 */
	public void boxCereal() {
		System.out.println("Putting fun pictures of " + name + " on the box\n" +
				"Pouring the " + name + " into the box");
	}

	/**
	 * Base behavior for the priceCereal method for children
	 */
	public void priceCereal() {
		System.out.println("Putting price tags of $" + price + " on the" + name + " box");
	}


}
