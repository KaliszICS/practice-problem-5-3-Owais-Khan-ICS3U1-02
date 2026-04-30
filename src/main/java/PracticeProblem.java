/**

        * File: Lesson 5.3 - Arrays adding and removing

        * Author: Owais Ali Khan

        * Date Created: April 30, 2026

        * Date Last Modified: April 30, 2026

        */

public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static String[] addString(String[] arr, String str, int idx) {
        int origIdx = 0;
        String[] arr2 = new String[arr.length+1];
        for (int i = 0; i < arr2.length; i++) {
            if (i==idx) {
                arr2[i] = str; 
            } else {
                arr2[i] = arr[origIdx];
                origIdx++;
                
            }
        }
        return arr2;
    }
    
    public static char[] removeChars(char[] arr, char letter) {
        
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == letter) {
                count++;
            }
        }
        
        char[] arr2 = new char[arr.length-count];
        int newIdx = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != letter) {
                arr2[newIdx] = arr[i];
                newIdx++;
            }
        }
        return arr2;
    }

}
