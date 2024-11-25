package pim_Selenium4_Automation;

import java.text.SimpleDateFormat;
import java.util.Date;

public class times {

	public static void main(String[] args) {

		Date today = new Date();
		SimpleDateFormat SIMPDFORMAT = new SimpleDateFormat("ddMMYY_HHmm");
		String date =  SIMPDFORMAT.format(today);
		System.out.println(date);
		System.out.println();
	}

}
