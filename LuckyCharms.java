package Assn04.Assn04;//lukacs ablonczy

public class LuckyCharms extends Cereal{

	public LuckyCharms(){
		this.name = "Lucky Charms";
		this.price = 1.55;
	}

	public void prepare(){
		super.prepare();
		System.out.println("" +
				"- Gather the grain\n" +
				"- Shape into circles\n" +
				"- Create marshmellow shapes\n" +
				"- Mix circles and marshmallows");
	}

}
