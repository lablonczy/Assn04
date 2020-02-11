package Assn04.Assn04;//lukacs ablonczy

/**
 * Defines the LuckyCharms cereal type
 * @author Lukacs Ablonczy
 */
public class LuckyCharms extends Cereal{
	private static final String NAME = "Lucky Charms";
	private static final double PRICE = 1.55;

	/**
	 * construct for LuckyCharms cereal type. Sets name, price, and calls prepare, box, and price cereal functions
	 */
	public LuckyCharms(){
		this.name = NAME;
		this.price = PRICE;
		this.prepare();
		this.boxCereal();
		this.priceCereal();
	}

	/**
	 * Defines LuckyCharms prepare behavior, calls the supermethod
	 */
	public void prepare(){
		super.prepare();
		System.out.println("" +
				"- Gather the grain\n" +
				"- Shape into circles\n" +
				"- Create marshmallow shapes\n" +
				"- Mix circles and marshmallows");
	}

}
