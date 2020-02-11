package Assn04.Assn04;//lukacs ablonczy

/**
 * Defines the FruitLoops cereal type
 * @author Lukacs Ablonczy
 */
public class FruitLoops extends Cereal{
	private static final String NAME = "Fruit Loops";
	private static final double PRICE = 1.89;

	/**
	 * construct for FruitLoops cereal type. Sets name, price, and calls prepare, box, and price cereal functions
	 */
	public FruitLoops(){
		this.name = NAME;
		this.price = PRICE;
		this.prepare();
		this.boxCereal();
		this.priceCereal();
	}

	/**
	 * Defines FruitLoops prepare behavior, calls the supermethod
	 */
	public void prepare(){
		super.prepare();
		System.out.println("" +
				"- Gather the grain\n" +
				"- Shape into circles\n" +
				"- Randomly color circles\n" +
				"- Let circles dry");
	}
}
