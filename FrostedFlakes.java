package Assn04.Assn04;//lukacs ablonczy

public class FrostedFlakes extends Cereal{

	public FrostedFlakes(){
		this.name = "Frosted Flakes";
		this.price = 2.99;
	}

	public void prepare(){
		super.prepare();
		System.out.println("" +
				"- Gather the grain\n" +
				"- Shape into flakes\n" +
				"- Sprinkle with frosting");
	}

}
