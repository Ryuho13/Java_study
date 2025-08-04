package homework;

import java.util.Arrays;

public class Homework1 {
	public static void practice01() {
        int[] heights = {152, 180, 165, 158, 171};
        
        Arrays.sort(heights);
        
        for (int height : heights) {
            System.out.print(height + " ");
        }
    }

    public static void main(String[] args) {
        practice01();
    }
	

}
