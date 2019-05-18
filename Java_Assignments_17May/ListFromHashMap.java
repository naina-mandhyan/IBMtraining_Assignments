import java.util.*;

class ListFromHashMap{

	public static void main(String args[]){

		HashMap<Integer,String> hm = new HashMap<Integer,String>();

		hm.put(1,"Bangalore");

		hm.put(2,"Lucknow");

		hm.put(3,"Goa");

		ListFromHashMap getList = new ListFromHashMap();

		ArrayList<String> list = getList.getListFromHashMap(hm);

		System.out.println("Sorted List :");

		for (String ob: list) {

            System.out.println(ob);
        
        }

	}

	ArrayList<String> getListFromHashMap(HashMap<Integer,String> hm){

		ArrayList<String> value= new ArrayList<String>();

		for(Map.Entry e : hm.entrySet()){

			value.add((String)e.getValue());

		}

		Collections.sort(value);

		return(value);
		

	}

}