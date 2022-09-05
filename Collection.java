//Fernando Jimenez
import java.util.ArrayList;
import java.util.Collections; 
import java.util.*;

public class Collection{
	public static void main (String[] args) {
		Person[] personNew = new Person[7];
    	
        personNew[0] = new Person("John", "Smith", "610-555-7384");
        personNew[1] = new Person("Sarah", "Barnes", "215-555-3827");
        personNew[2] = new Person("Mark", "Riley", "733-555-2969");
        personNew[3] = new Person("Laura", "Getz", "663-555-3984");
        personNew[4] = new Person("Larry", "Smith", "464-555-3489");
        personNew[5] = new Person("Frank", "Phelps", "322-555-2284");
        personNew[6] = new Person("Marsha", "Grant", "243-555-2837");
		SelectionSort sorter = new SelectionSort();
		sorter.sort(personNew);
		
	}		
}

interface Sorter{
		public void sort(Comparable [] array);

}
class SelectionSort implements Sorter{

		public void sort(Comparable [] array){
			int n = array.length;

			for(int i=0; i<n-1; i++){
				for(int k=i+1; k<n; k++){
					if(array[i].compareTo(array[k]) > 0){
						Comparable temp = array[i];
						array[i] = array[k];
						array[k] = temp;
					}
				}
			}
		}
}
//The equals method and a compareTo method are needed by Java to be able to compare the objects in the collection in order to determine which one is larger or smaller, simplifying the process 
//to sort through the user's instructions.
	
