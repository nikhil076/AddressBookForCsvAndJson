package AddressBookForCSVAndJson;

import com.opencsv.exceptions.CsvDataTypeMismatchException;
import com.opencsv.exceptions.CsvException;
import com.opencsv.exceptions.CsvRequiredFieldEmptyException;

public class AddressBookMain {

	public static void main(String[] args) throws CsvException {
		System.out.println("Address book for CSV and Json");
		
		AddressBookCSV addressBookCSV = new AddressBookCSV("./users.csv");
		addressBookCSV.writeContacatDetailsToFile();
		addressBookCSV.readFromCSVFile();
		
		AddressBookJSON addressBookJSON = new AddressBookJSON();
		addressBookJSON.writeContactDetailsInAFile("./users.json");
		addressBookJSON.readaddressBookFromAJSONFile("./users.json");
	}
}
