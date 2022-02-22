package TestMTTR;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class SolicitudTest {
	
	private WebDriver driver;
	
	@Before
	public void setUp(){
		this.driver	= SetDriver.setUpChorme();		
	}
	
	@Test
	public void Tramite01() throws InterruptedException {
		SolicitudTramite1 solicitud = new SolicitudTramite1();
		solicitud.Tr1_Cancela_Servicio_RNSTP(this.driver);
	}	
	/*
	@Test
	public void Tramite02() throws InterruptedException {
		SolicitudTramite2 solicitud = new SolicitudTramite2();
		solicitud.Tr2_Cancela_Servicio_RENASTRE(this.driver);
	}
	
	@Test
	public void Tramite03() throws InterruptedException {
		SolicitudTramite3 solicitud = new SolicitudTramite3();
		solicitud.Tr3_Cancela_Servicio_TTEPRIV(this.driver);	
	}
	
	@Test
	public void Tramite04() throws InterruptedException {
		SolicitudTramite4 solicitud = new SolicitudTramite4();
		solicitud.Tr4_Cancela_Vehículo_Temporal_por_cambio_de_Servicio_RNSTP(this.driver);	
	}
	
	@Test
	public void Tramite05() throws InterruptedException {
		SolicitudTramite5 solicitud = new SolicitudTramite5();
		solicitud.Tr5_Cancela_Vehículo_Temporal_por_cambio_de_Servicio_RENASTRE(this.driver);	
	}
	
	@Test
	public void Tramite06() throws InterruptedException {
		SolicitudTramite6 solicitud = new SolicitudTramite6();
		solicitud.Tr6_Cancela_Vehículo_Temporal_por_traslado_de_Región_RNSTP(this.driver);	
	}
	
	@Test
	public void Tramite07() throws InterruptedException {
		SolicitudTramite7 solicitud = new SolicitudTramite7();
		solicitud.Tr7_Cancela_Vehículo_Temporal_por_traslado_de_Región_TTEPRIV(this.driver);	
		
	}
	
	@Test
	public void Tramite08() throws InterruptedException {
		SolicitudTramite8 solicitud = new SolicitudTramite8();
		solicitud.Tr8_Cancela_Vehículo_Temporal_por_traslado_de_Región_RENASTRE(this.driver);	
	}
	
	@Test
	public void Tramite09() throws InterruptedException {
		SolicitudTramite9 solicitud = new SolicitudTramite9();
		solicitud.Tr9_Cancela_Vehículo_Temporal_por_traslado_de_Región_TTEPRIV(this.driver);		
	}
	
	@Test
	public void Tramite10() throws InterruptedException {
		SolicitudTramite10 solicitud = new SolicitudTramite10();
		solicitud.Tr10_Cancela_Taxi_Temporal_por_cambio_de_Modadlidad_RNSTP(this.driver);	
	} 
	
	@Test
	public void Tramite11() throws InterruptedException {
		SolicitudTramite11 solicitud = new SolicitudTramite11();
		solicitud.Tr11_Cancela_Vehículo_Temporal_otras_razones_RNSTP(this.driver);
	}	
	
	@Test
	public void Tramite12() throws InterruptedException {
		SolicitudTramite12 solicitud = new SolicitudTramite12();
		solicitud.Tr12_Cancela_Vehículo_Temporal_otras_razones_RENASTRE(this.driver);
	}
	
	/*@Test
	public void Tramite13() throws InterruptedException {
		SolicitudTramite13 solicitud = new SolicitudTramite13();
		solicitud.Tr3_Cancela_Servicio_TTEPRIV(this.driver);	
	}
	
	@Test
	public void Tramite14() throws InterruptedException {
		SolicitudTramite14 solicitud = new SolicitudTramite14();
		solicitud.Tr14_Cancela_Vehículo_Definitiva_RNSTP(this.driver);	
	}
	
	@Test
	public void Tramite15() throws InterruptedException {
		SolicitudTramite15 solicitud = new SolicitudTramite15();
		solicitud.Tr15_Cancela_Vehículo_Definitiva_RENASTRE(this.driver);	
	}
	
	@Test
	public void Tramite16() throws InterruptedException {
		SolicitudTramite16 solicitud = new SolicitudTramite16();
		solicitud.Tr16_Cancela_Vehículo_Definitiva_TTEPRIV(this.driver);	
	}
	
	@Test
	public void Tramite17() throws InterruptedException {
		SolicitudTramite17 solicitud = new SolicitudTramite17();
		solicitud.Tr17_Modifica_Dominio_Vehículo_RNSTP(this.driver);	
		
	}
	
	@Test
	public void Tramite18() throws InterruptedException {
		SolicitudTramite18 solicitud = new SolicitudTramite18();
		solicitud.Tr18_Modifica_Dominio_Vehículo_RENASTRE(this.driver);	
	}
	
	@Test
	public void Tramite19() throws InterruptedException {
		SolicitudTramite19 solicitud = new SolicitudTramite19();
		solicitud.Tr19_Modifica_Dominio_Vehículo_TTEPRIV(this.driver);		
	}
	
	@Test
	public void Tramite20() throws InterruptedException {
		SolicitudTramite20 solicitud = new SolicitudTramite20();
		solicitud.Tr20_Inscribe_o_Cancela_Conductor_RNSTP(this.driver);	
	} 
	
	@Test
	public void Tramite21() throws InterruptedException {
		SolicitudTramite21 solicitud = new SolicitudTramite21();
		solicitud.Tr21_Inscribe_o_Cancela_Conductor_RENASTRE(this.driver);
	}	
	
	@Test
	public void Tramite22() throws InterruptedException {
		SolicitudTramite22 solicitud = new SolicitudTramite22();
		solicitud.Tr22_Inscribe_o_Cancela_Conductor_TTEPRIV(this.driver);
	}
	
	@Test
	public void Tramite23() throws InterruptedException {
		SolicitudTramite23 solicitud = new SolicitudTramite23();
		solicitud.Tr23_Inscribe_Modifica_o_Cancela_Adulto_Acompañante_RENASTRE(this.driver);	
	}
	
	@Test
	public void Tramite24() throws InterruptedException {
		SolicitudTramite24 solicitud = new SolicitudTramite24();
		solicitud.Tr24_Modifica_Capacidad_Asientos_Vehículo_RENASTRE(this.driver);	
	}
	
	@Test
	public void Tramite25() throws InterruptedException {
		SolicitudTramite25 solicitud = new SolicitudTramite25();
		solicitud.Tr25_Modifica_Capacidad_Asientos_Vehículo_TTEPRIV(this.driver);	
	}
	
	@Test
	public void Tramite26() throws InterruptedException {
		SolicitudTramite26 solicitud = new SolicitudTramite26();
		solicitud.Tr26_Certificado_de_Rev_Técnica_Vehículo_RNSTP(this.driver);	
	}
	
	@Test
	public void Tramite27() throws InterruptedException {
		SolicitudTramite27 solicitud = new SolicitudTramite27();
		solicitud.Tr27_Certificado_de_Rev_Técnica_Vehículo_RENASTRE(this.driver);	
		
	}
	
	@Test
	public void Tramite28() throws InterruptedException {
		SolicitudTramite28 solicitud = new SolicitudTramite28();
		solicitud.Tr28_Certificado_de_Rev_Técnica_Vehículo_TTEPRIV(this.driver);	
	}
	
	@Test
	public void Tramite29() throws InterruptedException {
		SolicitudTramite29 solicitud = new SolicitudTramite29();
		solicitud.Tr29_Modifica_Domicilio_Legal_Servicio_RNSTP(this.driver);		
	}
	
	@Test
	public void Tramite30() throws InterruptedException {
		SolicitudTramite10 solicitud = new SolicitudTramite10();
		solicitud.Tr10_Cancela_Taxi_Temporal_por_cambio_de_Modadlidad_RNSTP(this.driver);	
	} 
	
	@Test
	public void Tramite31() throws InterruptedException {
		SolicitudTramite31 solicitud = new SolicitudTramite31();
		solicitud.Tr31_Modifica_Domicilio_Legal_Servicio_TTEPRIV(this.driver);
	}	
	
	@Test
	public void Tramite32_Eliminar() throws InterruptedException {
		SolicitudTramite32_Eliminar solicitud = new SolicitudTramite32_Eliminar();
		solicitud.TrElimi32_Modifica_Rep_Legal_Servicio_RNSTP(this.driver);
	}
	
	public void Tramite32_Inscripción() throws InterruptedException {
		SolicitudTramite32_Inscripción solicitud = new SolicitudTramite32_Inscripción();
		solicitud.TrIns32_Modifica_Rep_Legal_Servicio_RNSTP(this.driver);
	}
	
	public void SolicitudTramite32_Modificación() throws InterruptedException {
		SolicitudTramite32_Modificación solicitud = new SolicitudTramite32_Modificación();
		solicitud.TrModif32_Modifica_Rep_Legal_Servicio_RNSTP(this.driver);
	}
	
	@Test
	public void Tramite33() throws InterruptedException {
		SolicitudTramite33 solicitud = new SolicitudTramite33();
		solicitud.Tr33_Modifica_Rep_Legal_Servicio_RENASTRE(this.driver);	
	}
	
	@Test
	public void Tramite34() throws InterruptedException {
		SolicitudTramite34 solicitud = new SolicitudTramite34();
		solicitud.Tr34_Modifica_Rep_Legal_Servicio_TTEPRIV(this.driver);	
	}*/
}
