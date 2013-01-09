package lackhurt.util.images;

import java.awt.Color;

public class ImageUtil {
	
	/**
	 * 获取两个rgb颜色的欧氏距离
	 * @param colorX
	 * @param colorY
	 * @return
	 */
	public static double getDistanceBetween(Color colorX, Color colorY) {
		return Math.sqrt(Math.pow(colorX.getRed() - colorY.getRed(), 2) 
				+ Math.pow(colorX.getGreen() - colorY.getGreen(), 2) 
				+ Math.pow(colorX.getBlue() - colorY.getBlue(), 2));
	}
	
	public static void main(String args[]) {
		
	}
}
