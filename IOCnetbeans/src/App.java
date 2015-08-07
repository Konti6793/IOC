import java.util.ArrayList;
import java.util.List;


public class App {
	
	
	PrinterIfc myPrinter;
	CalcIfc myCalc;
	
	
	App()
	{
		/*String config = "";
		
		config += "printer Printer" + "\n";
		config += "calc Calc" + "\n";*/
		
		String filename = "Beans.xml";
		
		
		IOCIfc ioc = new AlexIOC(filename);
		
		myPrinter = (PrinterIfc) ioc.get( "printer" );
		myCalc = (CalcIfc) ioc.get( "calc" );
		CalcIfc myCalc2 = (CalcIfc) ioc.get( "calc" );
		
		System.out.println( "======= " +( myCalc == myCalc2));
		
		double x = myCalc.calc(100);
		myPrinter.print(" x = " + x);
	}
	
	
	
	public static void main( String ... args )
	{
		new App();
	}

}
