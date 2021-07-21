package AddressBookForCSVAndJson;

import com.opencsv.exceptions.CsvDataTypeMismatchException;
import com.opencsv.exceptions.CsvException;
import com.opencsv.exceptions.CsvRequiredFieldEmptyException;

public class AddressBookMain {

	public static void main(String[] args) throws CsvException {
		System.out.println("Address book for CSV and Json");
		
		AddressBookCSV addressBookCSV = new AddressBookCSV();
		addressBookCSV.writeContacatDetailsToFile();
		addressBookCSV.readFromCSVFile();
		
	}
}
