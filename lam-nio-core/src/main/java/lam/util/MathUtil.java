package lam.util;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

/**
* <p>
* util class for math usage.
* </p>
* @author linanmiao
* @date 2017年1月23日
* @version 1.0
*/
public class MathUtil {
	
	/**
	 * function: d1 - d2
	 */
	public static double subtraction(double d1, double d2){
		return sum(d1, 0 - d2);
	}
	
	public static double sum(double d1, double d2){
		BigDecimal big1 = new BigDecimal(Double.toString(d1));
		BigDecimal big2 = new BigDecimal(Double.toString(d2));
		BigDecimal bigSum = big1.add(big2);
		return bigSum.doubleValue();
	}
	
	public static double sum(float f1, float f2){
		Double d1 = new Double(Float.toString(f1));
		Double d2 = new Double(Float.toString(f2));
		return sum(d1.doubleValue(), d2.doubleValue());
	}
	
	public static double sum(float f1, double d2){
		Double d1 = new Double(Float.toString(f1));
		return sum(d1.doubleValue(), d2);
	}
	
	public static double sum(double d1, float f2){
		Double d2 = new Double(Float.toString(f2));
		return sum(d1, d2.doubleValue());
	}
	
	public static double decimal(double d, String format){
		DecimalFormat decimalFormat = new DecimalFormat(format);
		decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
		String ds = decimalFormat.format(d);
		return new Double(ds).doubleValue();
	}

}
