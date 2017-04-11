package ch.eaternity.converters.xls2json;



/**
 * MAKE SURE THE JSON FOLDER IS EMPTY - PROBABLY THE FILES DONT GET OVEWRITTEN!
 * @author aurelian_jaggi
 *
 */
public class Main {
	
	private static final String INPUT_FOLDER = "excel/";
	private static final String OUTPUT_FOLDER = "nutrition-json/";
	
	
	public static void main(String[] args) {

		try {
			ExcelConverter excelConverter = new ExcelConverter();
			excelConverter.convertAllFilesInFolder(INPUT_FOLDER, OUTPUT_FOLDER);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
