package br.sp.pccarvalho.tests;

import org.junit.Test;
import org.openqa.selenium.By;

import br.sp.pccarvalho.core.BaseTest;
import br.sp.pccarvalho.core.DriverFactory;
import br.sp.pccarvalho.pages.LoginPage;
import br.sp.pccarvalho.pages.MenuPage;
import junit.framework.Assert;

public class RealizarPedido extends BaseTest {
	
	MenuPage menuPage = new MenuPage();
	LoginPage menuLogin = new LoginPage();
		
	@Test
	public void testFazerPedido() {
		
		//abrirTelaLogin
		menuPage.acessarTelaLogin();
				
		//realizarLogin
		menuLogin.escreverTexto(By.xpath("//*[@id=\"username\"]"), "leba.lebacon@gmail.com");
		menuLogin.escreverTexto(By.xpath("//*[@id=\"password\"]"), "12345678");
		menuLogin.clicarLogin();
		
		//escolherProduto
		//sauces //*[@id="left-nav"]/ul/li[2]/a/span
		//merchandise //*[@id="left-nav"]/ul/li[3]/a/span
		//clearance //*[@id="left-nav"]/ul/li[4]/a/span
		//gift cards //*[@id="left-nav"]/ul/li[5]/a/span
		menuLogin.escolherProdutoMerchandise();
		DriverFactory.scrolldown();
		//camiseta 2 linha primeira unidade //*[@id="products"]/div[4]/div/a/div
		menuLogin.escolherCamiseta();
		menuLogin.selecionarCor();
		menuLogin.selecionarTamanho("//*[@id=\"product_content\"]/div[2]/div[3]/div[3]/div/select","L");
		menuLogin.adicionarCarrinho();
		
		menuLogin.verCarrinho();
		
		
		
		
		//DriverFactory.aguardarPagina();
		//menuLogin.clicarPainelHosts();
		//menuLogin.clicarHosts();
		}

	}



