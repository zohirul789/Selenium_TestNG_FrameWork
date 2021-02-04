package google;

public class TestApplication {

	public static void main(String[] args) throws InterruptedException {
		LunchBrowser tp = new LunchBrowser();
		tp.firefoxdriver();
		tp.enterURL();
		tp.getTittle();
		tp.exitBrowser();
		

	}

}
