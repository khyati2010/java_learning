package pratise.test;

public class ClassVsInterface {
	public static void main(String[] args)

	{
		Instrument[] instruments = new Instrument[3];

		instruments[0] = new Stock();
		instruments[1] = new Future();
		instruments[2] = new Option();

		for (Instrument i : instruments) {
			print(i);
		}
	}

	public static void print(Instrument instrument) {

		System.out.println(instrument.getAssetClass());
	}
}

interface Instrument {

	public String getAssetClass();

}

class Stock implements Instrument

{
	public String getAssetClass() {
		return "STOCK";
	}
}

class Future implements Instrument {
	public String getAssetClass() {
		return "FUTURES";
	}
}

class Option implements Instrument {
	public String getAssetClass()

	{

		return "OPTION";
	}
}

// Read more:
// http://www.java67.com/2016/08/difference-between-class-and-interface-in-java.html#ixzz4YZAheGha