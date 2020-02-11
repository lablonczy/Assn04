package Assn04.Assn04;//lukacs ablonczy

public abstract class Cereal {
	protected String name;
	protected Double price;

	public void prepare(){
		System.out.println("Preparing the " + name);
	}

	public void boxCereal(){
		System.out.println("Putting fun pictures of " + name + " on the box\n" +
				"Pouring the " + name  + " into the box");
	}

	public void priceCereal(){
		System.out.println("Putting price tags of $" + price + " on the" + name + " box");
	}


}
