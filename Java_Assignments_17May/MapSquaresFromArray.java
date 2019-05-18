import java.util.*;

class MapSquaresFromArray{
	public static void main(String[] args) {
		 
		 int[] arr = {32 , 5 , 30 , 8 , 17};

		 MapSquaresFromArray mp = new MapSquaresFromArray();

		 HashMap<Integer , Integer> map = mp.getSquaresMap(arr);

		 System.out.println("Number -- Square of number");

		 for (Map.Entry val : map.entrySet()) {

			System.out.println(val.getKey() + " -- " + val.getValue());

		}
	}

	HashMap<Integer , Integer> getSquaresMap(int[] arr){

		HashMap<Integer , Integer> map = new HashMap<Integer , Integer>();

		for(int n : arr){

			map.put(n, n*n);

		}

		return(map);		
	}
}