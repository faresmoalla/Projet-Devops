//package com.esprit.examen.services;
//
//import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.assertNotNull;
//import static org.junit.Assert.assertNull;
//import static org.junit.Assert.assertTrue;
//
//import java.text.ParseException;
//import java.text.SimpleDateFormat;
//import java.util.Date;
//import java.util.HashSet;
//import java.util.List;
//import java.util.Set;
//
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import com.esprit.examen.entities.CategorieFournisseur;
//import com.esprit.examen.entities.DetailFournisseur;
//import com.esprit.examen.entities.Facture;
//import com.esprit.examen.entities.Fournisseur;
//import com.esprit.examen.entities.Produit;
//import com.esprit.examen.entities.SecteurActivite;
//
//import lombok.extern.slf4j.Slf4j;
//
//@RunWith(SpringRunner.class)
//@SpringBootTest
//@Slf4j
//public class FournisseurServiceImpTest {
//	@Autowired
//	IFournisseurService fourinsseurService;
//	
//	
//	
//	@Test
//	public void testAddFournisseur() throws ParseException {
//
//		Set<Facture> facture = new HashSet<>();
//		Set<SecteurActivite> SecteurActivite = new HashSet<>();
//		DetailFournisseur d = new DetailFournisseur() ;
//		Fournisseur f = new Fournisseur( 1000L , "aa", "aa",CategorieFournisseur.ORDINAIRE, facture, SecteurActivite, d);
//		Fournisseur fournisseur = fourinsseurService.addFournisseur(f) ;
//		System.out.print("Fournisseur: "+fournisseur);
//		assertNotNull(fournisseur.getIdFournisseur());
//		
//		fourinsseurService.deleteFournisseur(fournisseur.getIdFournisseur()) ;
//	}
//	@Test
//	public void testDeleteFournisseur() throws ParseException {
//		
//		Set<Facture> facture = new HashSet<>();
//		Set<SecteurActivite> SecteurActivite = new HashSet<>();
//		DetailFournisseur d = new DetailFournisseur() ;
//		Fournisseur f = new Fournisseur( 1000L , "aa", "aa",CategorieFournisseur.ORDINAIRE, facture, SecteurActivite, d);
//		Fournisseur fournisseur = fourinsseurService.addFournisseur(f) ;
//		assertNull(fourinsseurService.retrieveAllFournisseurs());
//	}
//	
//	@Test
//	public void testRetrieveAllFournisseur() throws ParseException {
//		
//		List<Fournisseur> Fournisseurs = fourinsseurService.retrieveAllFournisseurs();
//		int expected = Fournisseurs.size();
//		Set<Facture> facture = new HashSet<>();
//		Set<SecteurActivite> SecteurActivite = new HashSet<>();
//		DetailFournisseur d = new DetailFournisseur() ;
//		Fournisseur f = new Fournisseur( 1000L , "aa", "aa",CategorieFournisseur.ORDINAIRE, facture, SecteurActivite, d);
//		Fournisseur fournisseur = fourinsseurService.addFournisseur(f) ;
//		assertEquals(expected + 1, fourinsseurService.retrieveAllFournisseurs().size());
//		fourinsseurService.deleteFournisseur(fournisseur.getIdFournisseur());
//
//	}
//}
