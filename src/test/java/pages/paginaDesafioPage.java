package pages;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.io.File;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import util.CustomUtils;

public class paginaDesafioPage extends CustomUtils{
	
	public static WebDriver driver;

	public void capturarTela() {
	String evidenceFolder = "evidencias";
	String screenshotName = "screenshot_" + LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd_HH-mm-ss")) + ".png";
	File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);{
	try {
	  FileHandler.copy(screenshotFile, new File(evidenceFolder + "/" + screenshotName));
	} catch (IOException e) {
	  e.printStackTrace();
	}
	
   }
  }
}
