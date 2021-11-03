package CSVfiles;

import java.io.FileReader;

public class ReadMultipleDataFromCSVFile {

	public static void main(String[] args) {
		String filePath = "./resources/cvsData.csv";
		FileReader fileReader = new FileReader(filePath);
		String[] arr = csvReader.readNext();
		while(arr!=null) {
			for(String data:arr) {
				System.out.println(data);
				
			}
			arr=csvReader.readNext();
			
		}
		csvReader.close();

	}

}
