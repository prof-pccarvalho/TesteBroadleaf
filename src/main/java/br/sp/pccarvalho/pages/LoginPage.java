package br.sp.pccarvalho.pages;

import static br.sp.pccarvalho.core.DriverFactory.getDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import br.sp.pccarvalho.core.BasePage;
import br.sp.pccarvalho.core.DriverFactory;

public class LoginPage extends BasePage {
	
	public void acessarTelaInicial() {
		DriverFactory.getDriver().get("https://demo93jd4v.broadleafcommerce.org/");
	}
	
	public void setEmail(String id_campo, String email) {
		escrever("Username", email);
	}
	
	public void setSenha(String id_campo, String senha) {
		escrever("password", senha);
	}
	
	public void entrar() {
		clicarBotaoporTexto("View Your Cart");
	}
	
	public void logar(String email, String senha) {
		setEmail("username",email);
		setSenha("password",senha);
		entrar();
	}
	
	public void escreverTexto(By by, String texto) {
		DriverFactory.getDriver().findElement(by).sendKeys(texto);
	
	//public void escreverTexto(By by) {
	//	DriverFactory.getDriver().findElement(by);
	}
	
	public void clicarLogin() {
		clicarBotao(By.xpath("//*[@id=\"login\"]/form/button"));
	}
	
	public void escolherProdutoMerchandise() {
		clicarBotao(By.xpath("//*[@id=\"left-nav\"]/ul/li[3]/a/span"));
	}
	
	public void escolherCamiseta() {
		clicarBotao(By.xpath("//*[@id=\"products\"]/div[4]/div/a/div"));
	}
	
	public void selecionarCor() {
		clicarRadio(By.xpath("//*[@id=\"product_content\"]//div[@class=\"color-inner Black\"]"));
	}
	
	public void adicionarCarrinho() {
		clicarBotao(By.xpath("//*[@id=\"product-main-button-panel\"]/div[1]/button/span"));
	}
	
	public void selecionarTamanho(String by, String valor) {
		
		WebElement element = getDriver().findElement(By.xpath(by));
		Select combo = new Select(element);
		combo.selectByVisibleText(valor);
		}
		////*[@id="product_content"]/div[2]/div[3]/div[3]/div/select
	
	public void verCarrinho() {
		clicarBotao(By.xpath("//*[@id=\"sectionsNav\"]/div/div[1]/ul[2]/li[4]/a/i"));
		clicarBotao(By.xpath("//*[@id=\"sectionsNav\"]/div/div[1]/ul[2]/li[4]/a/i"));
		clicarBotao(By.xpath("//*[@id=\"sectionsNav\"]/div/div[1]/ul[2]/li[4]/ul/li[4]/a"));
		//*[@id="sectionsNav"]/div/div[1]/ul[2]/li[4]/a/i
		//*[@id="sectionsNav"]/div/div[1]/ul[2]/li[4]/ul/li[4]/a
	}
	
	
	
	
	
	}


