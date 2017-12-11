package skeleton.configuration;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import net.thucydides.core.webdriver.DriverSource;

public class ChromeDriverSource implements DriverSource {

	public WebDriver newDriver() {

		setSystemVariables();
		WebDriver wd = new ChromeDriver(getChromeCapabilities());
		wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		return wd;
	}

	public boolean takesScreenshots() {

		return true;
	}

	protected void setSystemVariables() {

		System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/chrome/2.31/chromedriver.exe");
	}

	protected DesiredCapabilities getChromeCapabilities() {

		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		capabilities.setCapability(ChromeOptions.CAPABILITY, getChromeOptions());
		return capabilities;
	}

	protected ChromeOptions getChromeOptions() {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		options.addArguments("test-type");
		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("profile.default_content_settings.popups", 0);
		options.setExperimentalOption("prefs", prefs);
		return options;
	}

}