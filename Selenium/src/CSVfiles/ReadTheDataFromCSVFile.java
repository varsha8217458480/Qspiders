package CSVfiles;

import java.io.FileReader;
import java.io.PrintStream;

public class ReadTheDataFromCSVFile {

	public static void main(String[] args) {
		
		String filePath = "./resources/cvsData.csv";
		FileReader filereader = new FileReader(filePath);
		PrintStream csvReader;
		String[] arr = csvReader.readNext();
		for(String data:arr) {
			System.out.println(data);
		}
		csvReader.close();
		
		}
		
	}


