package Metodos;

import java.io.File;
import java.io.IOException;
import java.util.NoSuchElementException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Metodos {
	WebDriver driver;

	// Metodo para fechar PopupPushcrew
	public void fecharPopupPushcrew(By elemento) {
		try {
			WebElement closeButton = driver.findElement(elemento);
			if (closeButton.isDisplayed()) {
				closeButton.click();
			}
		} catch (NoSuchElementException e) {
			System.out.println("Popup Pushcrew não encontrado ou já fechado.");
		}
	}

	// Metodo para fechar outros Popups
	public void fecharOutrosPopups() {
		try {
			WebElement closeButton1 = driver.findElement(By.cssSelector("#fechar > span"));
			if (closeButton1.isDisplayed()) {
				closeButton1.click();
			}
		} catch (NoSuchElementException e) {
			System.out.println("Primeiro popup/modal não encontrado ou já fechado.");
		}
		try {

			WebElement closeButton2 = driver.findElement(By.cssSelector(".cc_b_ok"));
			closeButton2.click();
		} catch (NoSuchElementException e) {
			System.out.println("Segundo popup/modal não encontrado ou já fechado.");
		}
	}

	// Método para abrir e maximizar navegador
	public void AbrirNavegador(String url) {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
	}

	// Método para clicar
	public void clicar(By elemento) {
		driver.findElement(elemento).click();
	}

	// Método para pausar
	public void pausa(int tempo) throws InterruptedException {
		Thread.sleep(tempo);
	}

	// Método para fechar navegador
	public void fecharNavegador() {
		driver.quit();
	}

	// Método para tirar print
	public void tirarPrint(String nome) throws IOException {
		TakesScreenshot print = ((TakesScreenshot) driver);
		File SrcFile = print.getScreenshotAs(OutputType.FILE);
		File Desfile = new File("./src/evidencias/" + nome + ".png");
		FileUtils.copyFile(SrcFile, Desfile);
	}
}
