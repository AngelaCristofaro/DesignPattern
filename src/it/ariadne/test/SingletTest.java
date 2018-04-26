package it.ariadne.test;

import org.junit.Assert;
import org.junit.Test;

import it.ariadne.designPat.creational.singleton.SingletonMulti;
import it.ariadne.designPat.creational.singleton.SingletonProva;

/**
 * Classe di test per il design pattern Singleton
 * @author cristofaro
 *
 */

public class SingletTest {
	
	//vengono istanziati due Singleton
	private static SingletonProva s1 = SingletonProva.getInstance();
	private static SingletonProva s2 = SingletonProva.getInstance();
	private static SingletonMulti s11 = SingletonMulti.instance();
	private static SingletonMulti s22 = SingletonMulti.instance();
	
	@Test
	public void istanceUniqueAndNull() {
		Assert.assertTrue("Instanza nulla", s1 != null);
		Assert.assertSame("Unica Instanza non unica", s1, s2);
	}
	/*  nel test si verifica che l'istanza non sia nulla (1)*/ 
	/* s1 e s2 siano la stessa instanza per dimostrare l'unicit� della classe (2) */
	@Test
	public void istance() {
		Assert.assertTrue("Instanza nulla", s11 != null);
		Assert.assertSame("Unica Instanza non unica", s11, s22);
	}
}
