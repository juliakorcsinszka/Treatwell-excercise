/*
 * Julia Korcsinszka Treatwell test
 * 
 * This class draws a box from an input of width and length
 */

import java.util.Scanner;

public class DrawBox {

	public static void main(String[] args) {
		//instance of Scanner to get input
    	Scanner input = new Scanner (System.in);
    	int width;
    	int height;

    	System.out.print("Please input width: ");
    	width = input.nextInt();
    	//verify input
    	while (width < 2){
    		System.out.print("Value entered is not sufficient to build a box.\n"
    				+ "Please enter a new value: ");
    	width = input.nextInt();	
    	}
    	System.out.print("Please input height: ");
    	height = input.nextInt();
    	//verify input
    	while (height < 2){
    		System.out.print("Value entered is not sufficient to build a box.\n"
    				+ "Please enter a new value: ");
    	height = input.nextInt();	
    	}
    	
    	createBox(height, width);
    } //main method
	
	public static void createBox(int height, int width){
		//outer loop to change rows
		for (int heightIndex = 0; heightIndex < height; heightIndex ++){
			//inner loop to chagne columns
			for (int widthIndex = 0; widthIndex < width; widthIndex++){
				//top left corner
				if (widthIndex == 0 && heightIndex == 0){
					System.out.print("┌");
				}
				//top right corner
				else if (widthIndex == width-1 && heightIndex == 0){
					System.out.println("┐");
				}
				//bottom left corner
				else if (widthIndex == 0 && heightIndex == height-1){
					System.out.print("└");
				}
				//bottom right corner
				else if (widthIndex == width-1 && heightIndex == height-1){
					System.out.println("┘");
				}
				//right handside edge that has to start a new line afterwards
				else if (widthIndex == width-1){
					System.out.println("|");
				}
				//left handside edge that must not start a new line
				else if (widthIndex == 0){
					System.out.print("|");
				}
				//top and bottom edges
				else if (heightIndex == 0 || heightIndex == height-1){
					System.out.print(" - ");
				}
				//inner blank spaces
				else if (heightIndex<height-1 && heightIndex >0){
					System.out.print("   ");
				}
			}
			
		}
	} //method to draw the box

}
