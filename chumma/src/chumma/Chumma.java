package chumma;

public class Chumma {

	public static void main(String[] args) {
				
				String [][] argCopy = new String[1][1];
				int x;
				System.out.println(argCopy[0].length);
				argCopy[0]= args;
				//argCopy[1]= args;
				System.out.println(argCopy[0].length);
				//System.out.println(argCopy[1].length);
				x=argCopy[0].length;
				/*
				 * for(int y=0;y<x;y++) { System.out.println(" " + argCopy[0][y]); }
				 */

			}

		}



