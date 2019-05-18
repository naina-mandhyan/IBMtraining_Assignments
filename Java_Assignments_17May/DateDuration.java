import java.text.SimpleDateFormat;

import java.util.*;

import java.time.*;

class DateDuration{

	public static void main(String[] args) {

			try{

				System.out.println("Enter Date [dd-mm-yyyy] ");

				Scanner scan = new Scanner(System.in);

				String userDate=scan.nextLine();

				SimpleDateFormat formatter = new SimpleDateFormat("dd-mm-yyyy");

				DateDuration dd = new DateDuration();

				dd.Difference(formatter.parse(userDate));

			}

			catch (Exception e) {
				System.out.println("Some error occured");
			}

	}

	void Difference(Date userDate){

		try{

			String timeStamp = new SimpleDateFormat("dd-mm-yyyy").format(new Date());

			SimpleDateFormat formatter = new SimpleDateFormat("dd-mm-yyyy");

			Date curr = formatter.parse(timeStamp);

			long diff = curr.getTime()-userDate.getTime();

			long days = (diff / (60 * 60 *24*1000));

			int months = (int)(diff / (24*60*60*1000*12));

			int years = (int)(diff / (24*60*60*1000*12*30.41));

			System.out.println(days+ " Days:");

			System.out.println(months+ " Months:");

			System.out.println(years+ " Years:");

		}

		catch (Exception e) {
			System.out.println("Some error occured");
		}
	}
}