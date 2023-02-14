package steps;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Sleeper;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import pages.paginaDesafioPage;
import util.CustomUtils;

public class FormularioStep extends CustomUtils {
	
	WebDriver driver = new ChromeDriver();
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
	paginaDesafioPage paginaDesafio = new paginaDesafioPage();
	
	
	@Dado("^que acessei o site do desafio$")
	public void deveraVerificarORotuloTotalHoje() throws Exception {
		driver.get("https://www.grocerycrud.com/v1.x/demo/bootstrap_theme");
		  driver.manage().window().maximize();
		  paginaDesafio.capturarTela();
	}

	@SuppressWarnings("deprecation")
	@E("^seleciono a versao do Bootstraper$")
	public void selecionoAVersãoDoBootstraper() throws Exception {
		 driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);//button[contains(@data-target,'/v1.x/demo/bootstrap_theme_v4/delete_multiple')]
		  WebElement checkbox = driver.findElement(By.id("switch-version-select"));
          checkbox.click();
		  WebElement checkbox2 = driver.findElement(By.xpath("//select[@id='switch-version-select']/option[2]"));
		  paginaDesafio.capturarTela();
          checkbox2.click();

	}

	@E("^clico no botao \"([^\"]*)\"$")
	public void clicoNoBotão(String arg1) {
	      // Encontrar o botão de adicionar
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        WebElement btnAddCliente = driver.findElement(By.xpath("//a[contains(.,'"+ arg1 +"')]"));
        // Clicar no botão de adicionar
        paginaDesafio.capturarTela();
        btnAddCliente.click();
		
		
	}

	@E("^preencho Nome \"([^\"]*)\"$")
	public void preenchoNome(String arg1){

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("field-customerName")));
		driver.findElement(By.id("field-customerName")).sendKeys(arg1);
		paginaDesafio.capturarTela();
	}

	@E("^preencho SobreNome \"([^\"]*)\"$")
	public void preenchoSobreNome(String arg1) {
		driver.findElement(By.id("field-contactLastName")).sendKeys(arg1);

	}

	@E("^preencho Contato do Primeiro nome \"([^\"]*)\"$")
	public void preenchoContatoDoPrimeiroNome(String arg1) {
		driver.findElement(By.id("field-contactFirstName")).sendKeys(arg1);
	}

	@E("^preencho Telefone \"([^\"]*)\"$")
	public void preenchoTelefone(String arg1) {
		driver.findElement(By.id("field-phone")).sendKeys(arg1);
	}

	@E("^preencho primeiro endereco \"([^\"]*)\"$")
	public void preenchoPrimeiroEndereco(String arg1) {
		driver.findElement(By.id("field-addressLine1")).sendKeys(arg1);
	}

	@E("^preencho Segundo endereco \"([^\"]*)\"$")
	public void preenchoSegundoEndereco(String arg1) {
		driver.findElement(By.id("field-addressLine2")).sendKeys(arg1);
	}

	@E("^preencho Cidade \"([^\"]*)\"$")
	public void preenchoCidade(String arg1) {
		driver.findElement(By.id("field-city")).sendKeys(arg1);
	}

	@E("^preencho Estado \"([^\"]*)\"$")
	public void preenchoEstado(String arg1) {
		driver.findElement(By.id("field-state")).sendKeys(arg1);
	}
	
	@E("^preencho Codigo Postal \"([^\"]*)\"$")
	public void preenchoCodigoPostal(String arg1) {
		driver.findElement(By.id("field-postalCode")).sendKeys(arg1);
	}

	@E("^preencho Pais \"([^\"]*)\"$")
	public void preenchoPais(String arg1) {
		driver.findElement(By.id("field-country")).sendKeys(arg1);
	}

	@E("^preencho Empregador \"([^\"]*)\"$")
	public void preenchoEmpregador(String arg1) {
		driver.findElement(By.id("field-customerName")).sendKeys(arg1);
	}


	@E("^preencho Limite de Credito \"([^\"]*)\"$")
	public void preenchoLimiteDeCredito(String arg1) {
		driver.findElement(By.id("field-creditLimit")).sendKeys(arg1);
		paginaDesafio.capturarTela();
	}
	@Entao("^verifico se vai apresentar a mensagem \"([^\"]*)\"$")
	public void verificoSeVaiApresentarAMensagem(String arg1) throws Exception {
		Thread.sleep(8000);
		WebDriverWait waitAssert = new WebDriverWait(driver, Duration.ofSeconds(20));
	    String expectedMessage = driver.findElement(By.xpath("//p[contains(.,'Your data has been successfully stored into the database. Edit Customer or Go back to list')]")).getText();
	    waitAssert.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(.,'Your data has been successfully stored into the database. Edit Customer or Go back to list')]")));
	    paginaDesafio.capturarTela();
	    Assert.assertEquals(expectedMessage, arg1);
	}

	@E("^Seleciono o empregador \"([^\"]*)\"$")
	public void selecionoOEmpregador(String arg1) throws Throwable {
		  WebElement cxEmpregador = driver.findElement(By.xpath("//span[contains(text(),'Select from Employeer')]"));
		  cxEmpregador.click();
		  driver.findElement(By.xpath("//div[@id='field_salesRepEmployeeNumber_chosen']/div[1]/div[1]/input[1]")).sendKeys(arg1);
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		  WebElement cxEmpregador2 = driver.findElement(By.xpath("//em[1]"));
		  paginaDesafio.capturarTela();
		  cxEmpregador2.click();
		  
	}

	@E("^clico no botao de Salvar$")
	public void clicoNoBotaoDeSalvar() throws Throwable {
	      WebElement btnSalvar = driver.findElement(By.xpath("//button[contains(@type,'submit')]"));
	        // Clicar no botão de adicionar
	      paginaDesafio.capturarTela();
	      btnSalvar.click();
	}

	@E("^Clico no link \"([^\"]*)\"$")
	public void clicoNoLink(String arg1) throws Throwable {
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        WebElement linkRetornarList = driver.findElement(By.xpath("//a[contains(.,'"+ arg1 +"')]"));
        paginaDesafio.capturarTela();
        linkRetornarList.click();
	}

	@E("^faco a pesquisa com o texto \"([^\"]*)\"$")
	public void facoAPesquisaComOTexto(String arg1) throws Throwable {
		driver.findElement(By.xpath("//input[contains(@name,'customerName')]")).sendKeys(arg1);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[contains(@name,'customerName')]")));
		paginaDesafio.capturarTela();
		
	}

	@E("^Clicar no checkbox abaixo da palavra Actions$")
	public void clicarNoCheckboxAbaixoDaPalavraActions() throws Throwable {
		Thread.sleep(10000);
		WebElement cbAction = driver.findElement(By.xpath("//input[@class='select-all-none']"));
		//WebElement cbAction = driver.findElement(By.xpath("//input[contains(@data-id,'103')]"));
		paginaDesafio.capturarTela();
        cbAction.click();
	}



	@E("^Valido a pergunta de exclusao$")
	public void validoAPerguntaDeExclusao()  throws Throwable {
	    String expectedMessage = "Are you sure that you want to delete this 1 item?";
	    String actualMessage = driver.findElement(By.xpath("//p[@class='alert-delete-multiple-one'][contains(.,'Are you sure that you want to delete this 1 item?')]")).getText();
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@class='alert-delete-multiple-one'][contains(.,'Are you sure that you want to delete this 1 item?')]")));
	    paginaDesafio.capturarTela();
	    Assert.assertEquals(expectedMessage,actualMessage );
  }


	@Entao("^verifico a mensagem \"([^\"]*)\"$")
	public void verificoAMensagem(String arg1) throws Throwable {
		Thread.sleep(6000);
	    String expectedMessage = driver.findElement(By.xpath("//p[contains(.,'Your data has been successfully deleted from the database.')]")).getText();
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(.,'Your data has been successfully deleted from the database.')]")));
	    paginaDesafio.capturarTela();
	    Assert.assertEquals(expectedMessage, arg1);
	}

	@E("^clico no botao Delete do popup$")
	public void clicoNoBotaoDeleteDoPopup() throws Throwable {
		Thread.sleep(3000);
		WebElement btnDelete = driver.findElement(By.xpath("//button[contains(@data-target,'/v1.x/demo/bootstrap_theme/delete_multiple')]"));
		paginaDesafio.capturarTela();
		btnDelete.click();
		
	}

	@E("^clico no link Go back to list$")
	public void clicoNoLinkGoBackToList() throws Throwable {
		Thread.sleep(7000);
		WebElement linkRetornar = driver.findElement(By.xpath("//a[contains(.,'Go back to list')]"));
		paginaDesafio.capturarTela();
		linkRetornar.click();
		
	}

}

