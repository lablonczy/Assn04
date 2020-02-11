package Assn04.Assn04;//lukacs ablonczy

public class GroceryStore {

	public Cereal orderCereal(String type){
		if(type.equalsIgnoreCase("Frosted Flakes")) {
			return new FrostedFlakes();
		} else if(type.equalsIgnoreCase("Lucky Charms")){
			return  new LuckyCharms();
		} else if(type.equalsIgnoreCase("Fruit Loops")){
			return new FruitLoops();
		} else {
			System.out.println("Not a cereal");
		}

		return null;
	}

	private Cereal createCereal(String type){
		return orderCereal(type);
	}

}
