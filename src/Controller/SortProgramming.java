
 
package Controller;

import Common.Algorithm;
import Common.Library;
import Model.Element;
import View.Menu;



public class SortProgramming extends Menu<String> {

    static String[] mc = {" Bubble Sort", " Quick Sort", "Exit"};

    protected Library library;
    protected Algorithm algorithm;
    protected int[] array;
    protected int size_array;

    public SortProgramming(Element element) {
        super("PROGRAMMING", mc);
        library = new Library();
        algorithm = new Algorithm();
        size_array = element.getSize_array();
        array = element.getArray();
        
    }

   
    

    @Override
            public void execute(int n) {
                
                switch (n) {
                    case 1:
                        System.out.println("Unsorted array: ");
                        library.display(array);
                        algorithm.buddleSort(array);
                        System.out.println("\nSorted array by Buddle Sort: ");
                        library.display(array);
                        System.out.println("");
                        break;
                    case 2:
                        System.out.println("Unsorted array: ");
                        library.display(array);
                        algorithm.quickSort(array, 0, size_array - 1);
                        System.out.println("\nSorted array by Quick Sort: ");
                        library.display(array);
                        System.out.println("");
                        break;
                    case 3:
                         System.out.println("BYE BYE!!! T_T ");
                        System.exit(0);
                        break;
                }
            }
        }
        
    

