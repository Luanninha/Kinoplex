package Elementos;

import org.openqa.selenium.By;

public class ElementosCompra {

	private By btnCookie = By.cssSelector("body > div.cc_css_reboot.cc_dialog.dark.headline > div > div:nth-child(3) > button.cc_b_ok");
	private By fecharpopup = By.cssSelector(
			"body > div.pushcrew-chrome-style-notification.pushcrew-chrome-style-notification-safari > div > div:nth-child(3) > div.pushcrew-button-wrapper > button.pushcrew-chrome-style-notification-btn.pushcrew-btn-close");
	private By fecharspan = By.cssSelector("#fechar > span");
	private By btnCinema = By
			.cssSelector("#bs-example-navbar-collapse-1 > ul.nav.navbar-nav.menu-principal > li:nth-child(1) > a");
	private By EscolherCinema = By.id("cinemaCombo");
	private By btnProgramacao = By.cssSelector(
			"#listaCinemas > div > div.panel-body > div > div:nth-child(3) > div > div > div:nth-child(1) > a");
	private By CampoDataSessao = By.cssSelector("#datepicker");
	private By btnHorasessao = By.cssSelector(
			"#cinema_programacao_detalhes > div:nth-child(4) > div > div.panel-body.bg-color-sala > span > ul > li:nth-child(2) > span");
	private By btnAssento = By.cssSelector("#seat-row > div.sc-hGMjit.kfpvEz > svg > text");
	private By btnEscolherIngresso = By.cssSelector(
			"#__next > div > div > div.sc-fqkvVR.cehMMH > footer > div.sc-bddgXz.iBiewt > div:nth-child(3) > button");
	private By btnIngressoInteira = By.cssSelector(
			"#__next > div > div > div.sc-fqkvVR.cehMMH > div.sc-dcJsrY.fhYEGV > div.sc-hqpNSm.eHBobC > div:nth-child(4) > div > div > div:nth-child(3) > div > button.sc-feoqov.kTwCsp > span > div > div > svg");
	private By btnIrPipoca = By.cssSelector(
			"#__next > div > div > div.sc-fqkvVR.cehMMH > div.sc-dcJsrY.fhYEGV > div.sc-hqpNSm.eHBobC > div:nth-child(4) > div > div > div:nth-child(3) > div > button.sc-feoqov.kTwCsp > span > div > div > svg");
	private By btnPular = By.cssSelector(
			"#__next > div > div > div.sc-fqkvVR.cehMMH > footer > div.sc-bddgXz.iBiewt > div:nth-child(3) > button");
	private By CampoEmailouCpf = By.cssSelector(
			"#__next > div > div > div.sc-fqkvVR.cehMMH > footer > div.sc-eBHhsj.iAYRti > div > div.sc-lnPyaJ.fMoJVm > div > div > form > fieldset > div > div > input");
	private By btnContinuar = By.cssSelector(
			"#__next > div > div > div.sc-fqkvVR.cehMMH > footer > div.sc-eBHhsj.iAYRti > div > div.sc-lnPyaJ.fMoJVm > div > div > form > div > button");

	public By getFecharpopup() {
		return fecharpopup;
	}

	public By getFecharspan() {
		return fecharspan;
	}

	public By getBtnCinema() {
		return btnCinema;
	}

	public By getBtnProgramacao() {
		return btnProgramacao;
	}

	public By getCampoDataSessao() {
		return CampoDataSessao;
	}

	public By getBtnHorasessao() {
		return btnHorasessao;
	}

	public By getBtnAssento() {
		return btnAssento;
	}

	public By getBtnEscolherIngresso() {
		return btnEscolherIngresso;
	}

	public By getBtnIngressoInteira() {
		return btnIngressoInteira;
	}

	public By getBtnIrPipoca() {
		return btnIrPipoca;
	}

	public By getBtnPular() {
		return btnPular;
	}

	public By getCampoEmailouCpf() {
		return CampoEmailouCpf;
	}

	public By getBtnContinuar() {
		return btnContinuar;
	}

	public By getEscolherCinema() {
		return EscolherCinema;
	}

	public By getBtnCookie() {
		return btnCookie;
	}

}