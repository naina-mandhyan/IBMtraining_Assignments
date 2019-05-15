import java.util.ArrayList;
import java.util.Scanner;

class CaughtException extends Exception{
	CaughtException(String str){
		super(str);
	}
}

class Laptop{
	private Integer ramSize, hddSize;
	private String uniqueId, brand;

	Laptop(String uniqueId, int ramSize, int hddSize, String brand){
		this.uniqueId = uniqueId;
		this.ramSize = ramSize;
		this.hddSize = hddSize;
		this.brand = brand;
	}

	public void setUniqueId(String uniqueId){
		this.uniqueId = uniqueId;
	}

	public void setBrand(String brand){
		this.brand = brand;
	}

	public void setRamSize(Integer ramSize){
		this.ramSize = ramSize;
	}

	public void setHddSize(Integer hddSize){
		this.hddSize = hddSize;
	}

	public String getUniqueId(){
		return this.uniqueId;
	}

	public String getBrand(){
		return this.brand;
	}

	public Integer getRamSize(){
		return this.ramSize;
	}

	public Integer getHddSize(){
		return this.hddSize;
	}

	public String toString(){
		return ("\nLaptop Details: \nId: " + this.uniqueId + "\nBrand: " + this.brand + "\nRAM Size: " + this.ramSize + "\nHard Disk Size: " + this.hddSize +"\n");
	}
}

class LaptopDetailsAPI{
	public static void main(String[] args) {
		
		LaptopDetailsAPI apiObj = new LaptopDetailsAPI();

		ArrayList list = new ArrayList();

		list.add(new Laptop("L01" , 4 , 250 , "Sony"));
		list.add(new Laptop("L02" , 6 , 500 , "Dell"));
		list.add(new Laptop("L03" , 8 , 800 , "HP"));
		list.add(new Laptop("L04" , 16 , 1500 , "Lenovo"));
		list.add(new Laptop("L05" , 8 , 2500 , "Apple"));

		char ch;

		Scanner scan = new Scanner(System.in);

		do{
		System.out.println("Enter Your Choice :\n1.To add details of a new laptop\n2.To view details of all the laptops\n3.To search for laptops\n4.To delete the details of any laptop\n5.To update details of laptop");
		int choice = scan.nextInt();
		
		switch(choice){
			case 1: try{ apiObj.addList(list); } 
					catch(CaughtException e){ System.out.println(e); } 
					break;
			case 2: apiObj.viewList(list); break; 
			case 3: apiObj.searchList(list); break;
			case 4: try{apiObj.deleteList(list); }
					catch(CaughtException e){
						System.out.println(e);
					}break;
			case 5: try{apiObj.updateList(list); }
					catch(CaughtException e){
						System.out.println(e);
					}break;
			default: System.out.println("Wrong choice entered..");
		}

		System.out.println("Want to continue (y/n)?");
		ch = scan.next().charAt(0);
		
		}while(ch == 'y');
	}

	void addList(ArrayList list) throws CaughtException{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the uniqueId:");
		String id = scan.nextLine();
		for(int i = 0; i < list.size(); i++){
		if(id.equals(((Laptop)list.get(i)).getUniqueId()))
			throw new CaughtException("ID already exists..Duplicate ID not allowed..Try another..");}
		System.out.println("Enter the Brand Name:");
		String br = scan.nextLine();
		System.out.println("Enter the Ram Size:");
		int rs = scan.nextInt();
		System.out.println("Enter the Hard disk size:");
		int hs = scan.nextInt();
		list.add(new Laptop(id,rs,hs,br));
		//this.viewList(list); 
	}

	void viewList(ArrayList list){
		for (int val = 0; val < list.size(); val++) {
			System.out.println("Details of Laptop - " + (val+1));
			System.out.println("Unique Id: " + ((Laptop)list.get(val)).getUniqueId());
			System.out.println("Ram Size: " + ((Laptop)list.get(val)).getRamSize());
			System.out.println("Hard disk Size: " + ((Laptop)list.get(val)).getHddSize());
			System.out.println("Brand name: " + ((Laptop)list.get(val)).getBrand());
			System.out.println("-----------------------------------------");
		}
	}

	void updateList(ArrayList list) throws CaughtException{
		Scanner scan = new Scanner(System.in);
		String ch = "";
		String id;
		do{
		int flag = 0;
		System.out.println("Enter the laptop Id to update");
		id = scan.next();
		for(int i = 0; i < list.size(); i++){
			if(id.equals(((Laptop)list.get(i)).getUniqueId())){
				flag = 1;
				System.out.println("what u want to update? \n 1.Id \n 2.Brand \n 3.Ram Size \n 4.Hard Disk size");
				int val = scan.nextInt();
				System.out.println("Enter the new value");
				String newVal = scan.next();
				switch(val){
					case 1: ((Laptop)list.get(i)).setUniqueId(newVal); break;
					case 2: ((Laptop)list.get(i)).setBrand(newVal); break;
					case 3: ((Laptop)list.get(i)).setRamSize(Integer.parseInt(newVal)); break;
					case 4: ((Laptop)list.get(i)).setHddSize(Integer.parseInt(newVal)); break;
				}
			}	
		}
		if(flag == 0)
			throw new CaughtException("Wrong id entered..");

		System.out.println("Update more ?? (yes/no)");
		ch = scan.next();
		}while(ch.equals("yes"));
	}

	void searchList(ArrayList list){
		Scanner scan = new Scanner(System.in);
		System.out.println("Search By: \n 1.Id \n 2.Brand \n 3.Ram Size \n 4.Hard Disk size");
		Integer val = scan.nextInt();
		
		switch(val){
			case 1: System.out.println("Enter the value");
					String newVal1 = scan.next();
					for(int i = 0; i < list.size(); i++){
						if(newVal1.equals(((Laptop)list.get(i)).getUniqueId())){
							System.out.println(list.get(i));
						}
					}	break;

			case 2: System.out.println("Enter the value");
					String newVal2 = scan.next();
					for(int i = 0; i < list.size(); i++){
						if(newVal2.equals(((Laptop)list.get(i)).getBrand())){
							System.out.println(list.get(i));
						}
					}break;

			case 3: System.out.println("Enter the value");
					Integer newVal3 = scan.nextInt();
					for(int i = 0; i < list.size(); i++){
						if(newVal3.equals(((Laptop)list.get(i)).getRamSize())){
							System.out.println(list.get(i));
						}
					}break;
			
			case 4: System.out.println("Enter the value");
					Integer newVal4 = scan.nextInt();
					for(int i = 0; i < list.size(); i++){
						if(newVal4.equals(((Laptop)list.get(i)).getHddSize())){
							System.out.println(list.get(i));
						}	
					}break;
		}
	}

	void deleteList(ArrayList list) throws CaughtException{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the laptop Id to delete");
		String id = scan.nextLine();
		int flag = 0;
		for(int i = 0; i < list.size(); i++){
			if(id.equals(((Laptop)list.get(i)).getUniqueId())){
				System.out.println("Press 1 to confirm..");
				int ch = scan.nextInt();
				if(ch==1){
					list.remove(i);
					System.out.println("deleted");
				}
				flag = 1;
			}
		}
		if(flag == 0)
			throw new CaughtException("Entered wrong id");

	}
}
