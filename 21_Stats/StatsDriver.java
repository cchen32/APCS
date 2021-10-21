// TNPG Can Josiah Beautify?: Brian Wang, Josiah Moltz, Corina Chen
// APCS pd06
// HW21 -- STAtisTically Speaking... / Statistical Driving / Implementing statistics functions in Stats.java, and testing them in StatsDriver.java
// 2021-10-20

/*
DISCO
	-You can run static methods WITHOUT referencing the object, such as Math.sqrt() (intertrash told us this)
 	 and all of our Stats functions
	-Converting from a double to an int results in a loss of data, (possible lossy conversion)
	 hence java is hesitant to make such a conversion on its own
QCC
	- None?
*/

public class StatsDriver {
	public static void main(String[] args) {
		Stats cjb = new Stats();

		//SAFE testing
		System.out.print(cjb.mean(2,8));
		System.out.println(" Answer should be 5");
		System.out.print(cjb.mean(2.0,8.0));
		System.out.println(" Answer should be 5.0");
		System.out.print(cjb.max(2,8));
		System.out.println(" Answer should be 8");
		System.out.print(cjb.max(2.0,8.0));
		System.out.println(" Answer should be 8.0");
		System.out.print(cjb.geoMean(2,8));
		System.out.println(" Answer should be 4");
		System.out.print(cjb.geoMean(2.0,8.0));
		System.out.println(" Answer should be 4.0");
		System.out.print(cjb.max(2,4,8));
		System.out.println(" Answer should be 8");
		System.out.print(cjb.max(2.0,4.0,8.0));
		System.out.println(" Answer should be 8.0");
		System.out.print(cjb.geoMean(2,4,8));
		System.out.println(" Answer should be 4");
		System.out.print(cjb.geoMean(2.0,4.0,8.0));
		System.out.println(" Answer should be 4.0");

		//double vs int testing
		System.out.print(cjb.mean(3,10));
		System.out.println(" Answer should be 6");
		System.out.print(cjb.mean(3.0,10.0));
		System.out.println(" Answer should be 6.5");
		System.out.print(cjb.max(3,10));
		System.out.println(" Answer should be 10");
		System.out.print(cjb.max(2.91,2.89));
		System.out.println(" Answer should be 2.91");
		System.out.print(cjb.geoMean(2,3));
		System.out.println(" Answer should be 2");
		System.out.print(cjb.geoMean(2.0,3.0));
		System.out.println(" Answer should be about 2.449");
		System.out.print(cjb.max(50,43,99));
		System.out.println(" Answer should be 99");
		System.out.print(cjb.max(2.1,2.3,2.2));
		System.out.println(" Answer should be 2.3");
		System.out.print(cjb.geoMean(2,3,4));
		System.out.println(" Answer should be 2");
		System.out.print(cjb.geoMean(2.0,3.0,4.0));
		System.out.println(" Answer should be about 2.884499");

		//IFFY testing
		System.out.print(cjb.mean(-5,-5));
		System.out.println(" Answer should be -5");
		System.out.print(cjb.mean(-5.0,-5.0));
		System.out.println(" Answer should be -5.0");
		System.out.print(cjb.max(-5,-5));
		System.out.println(" Answer should be -5");
		System.out.print(cjb.max(-5.0,-5.0));
		System.out.println(" Answer should be -5.0");
		System.out.print(cjb.geoMean(-5,-5));
		System.out.println(" Answer should be 5");
		System.out.print(cjb.geoMean(-5.0,-5.0));
		System.out.println(" Answer should be 5.0");
		System.out.print(cjb.geoMean(0,1));
		System.out.println(" Answer should be 0");
		System.out.print(cjb.geoMean(0.0,1.0));
		System.out.println(" Answer should be 0.0");
		System.out.print(cjb.max(-4,3,21));
		System.out.println(" Answer should be 8");
		System.out.print(cjb.max(-4.0,3.0,21.0));
		System.out.println(" Answer should be 8.0");
		System.out.print(cjb.geoMean(2,0,8));
		System.out.println(" Answer should be 0");
		System.out.print(cjb.geoMean(2.0,0.0,8.0));
		System.out.println(" Answer should be 0");
		System.out.print(cjb.geoMean(-2.0,4.0,8.0));
		System.out.println(" Answer should be -4.0");

		//ERROR testing
		System.out.print(cjb.geoMean(-1,42));
		System.out.println(" Answer should be -1 (error)");
		System.out.print(cjb.geoMean(-1.0,42.0));	//returns NaN% as their error for square rooting a negative
		System.out.println(" Answer should be some sort of error");
		System.out.print(cjb.geoMean(-2,4,8));
		System.out.println(" Answer should be -1 (error)");
	}
}
