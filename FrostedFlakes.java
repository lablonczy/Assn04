package Assn04.Assn04;//lukacs ablonczy

/**
 * Defines the FrostedFlakes cereal type
 * @author Lukacs Ablonczy
 */
public class FrostedFlakes extends Cereal {
	private static final String NAME = "Frosted Flakes";
	private static final double PRICE = 2.99;

	/**
	 * construct for FrostedFlakes cereal type. Sets name, price, and calls prepare, box, and price cereal functions
	 */
	public FrostedFlakes() {
		this.name = NAME;
		this.price = PRICE;
		this.prepare();
		this.boxCereal();
		this.priceCereal();
	}

	/**
	 * Defines FrostedFlakes prepare behavior, calls the supermethod
	 */
	public void prepare() {
		super.prepare();
		System.out.println("" +
				"- Gather the grain\n" +
				"- Shape into flakes\n" +
				"- Sprinkle with frosting");
	}

}
