package Assn04.Assn04;//lukacs ablonczy

/**
 * Defines the grocery store cereal container
 * @author Lukacs Ablonczy
 */
public class GroceryStore {

	/**
	 * Determines Cereal type given and returns that type
	 * @param type String type of cereal
	 * @return the requested type of cereal given by param
	 */
	public Cereal orderCereal(String type) {
		if (type.equalsIgnoreCase("Frosted Flakes")) {
			return new FrostedFlakes();
		} else if (type.equalsIgnoreCase("Lucky Charms")) {
			return new LuckyCharms();
		} else if (type.equalsIgnoreCase("Fruit Loops")) {
			return new FruitLoops();
		} else {
			System.out.println("Not a cereal");
		}

		return null;
	}

	/**
	 * Calls the orderCereal function
	 * @param type String Cereal type
	 * @return the requested type of cereal given by param
	 */
	private Cereal createCereal(String type) {
		return orderCereal(type);
	}

}
