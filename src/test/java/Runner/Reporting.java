package Runner;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class Reporting {

	public static void jvmReport(String jsonFile) {
		File reportdirectory = new File ("C:\\Users\\Jigsaw\\eclipse-workspace\\Cucumber\\src\\test\\resources\\Report");
		Configuration config=new Configuration (reportdirectory, "raak");
		config.addClassifications("browser", "chromebrowser");
		config.addClassifications("browserversion","95");
		List <String> jsonFiles = new ArrayList<String>();
		jsonFiles.add(jsonFile);
		ReportBuilder builder= new ReportBuilder(jsonFiles, config);
		builder.generateReports();
		
		
	}
	
	
}
