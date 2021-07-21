import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.DataFormatter;


public class Report {

	static String htmlvalue="<!DOCTYPE html> <html> <head> <style> table { width:100%; } table, th, td { border: 1px solid black; border-collapse: collapse; } th, td { padding: 15px; text-align: left; } #t01 tr:nth-child(even) { background-color: #eee; } #t01 tr:nth-child(odd) { background-color: #fff; } #t01 th { background-color: black; color: white; } </style> </head> <body> <h2>Report</h2> <table> <tr> <th>XML file names</th> <th>Differences</th> </tr> #RawValues </table> </body> </html>";
  static String rawValues = "";
	public static void main(String[] args) throws IOException {
		
        String fileNames = "xyz.xml, abc.xml";
        String differences = "abcdefgh";
				rawValues=rawValues.concat("<tr><td>"+fileNames+"</td><td>"+differences+"</td></tr>");

		File htmlTemplateFile = new File(dir+props.getProperty("ReportTemplete"));
		Charset.forName("UTF-8");
		htmlvalue = htmlvalue.replace("#RawValues", rawValues);
		File newHtmlFile = new File("FilePathToBeStored");
		FileUtils.writeStringToFile(newHtmlFile, htmlString);
	}

}
