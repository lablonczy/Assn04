package Assn04.Assn04;//lukacs ablonczy

public class FruitLoops extends Cereal{

	public FruitLoops(){
		this.name = "Fruit Loops";
		this.price = 1.89;
	}

	public void prepare(){
		super.prepare();
		System.out.println("" +
				"- Gather the grain\n" +
				"- Shape into circles\n" +
				"- Randomly color circles\n" +
				"- Let circles dry");
	}
}
