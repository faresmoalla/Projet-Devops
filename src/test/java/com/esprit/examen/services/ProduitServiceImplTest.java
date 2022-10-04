//package com.esprit.examen.services;
//
//import static org.junit.Assert.*;
//
//import java.text.ParseException;
//import java.text.SimpleDateFormat;
//import java.util.Date;
//import java.util.List;
//
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import com.esprit.examen.entities.Produit;
//import com.esprit.examen.entities.Stock;
//import lombok.extern.slf4j.Slf4j;
//
//
//@RunWith(SpringRunner.class)
//@SpringBootTest
//@Slf4j
//public class ProduitServiceImplTest {
//	@Autowired
//	IProduitService produitService;
//	@Autowired
//	IStockService stockService;
//	
//	@Test
//	public void testAddProduit() throws ParseException {
//		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
//		Date dateCreation = dateFormat.parse("30/09/2022");
//		Produit p = new Produit(null, "ChocoTom", "biscuit", 0, dateCreation, null, null, null, null);
//		Produit produit = produitService.addProduit(p);
//		System.out.print("Produit: "+produit);
//		assertNotNull(produit.getIdProduit());
//		assertTrue(produit.getCodeProduit().length() > 0);
//		produitService.deleteProduit(produit.getIdProduit());
//	}
//	
//	@Test
//	public void testDeleteProduit() throws ParseException {
//		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
//		Date dateCreation = dateFormat.parse("30/09/2022");
//		Date dateDerniereModification = dateFormat.parse("1/10/2022");
//		Produit p = new Produit(null, "ChocoTom", "biscuit", 0, dateCreation, dateDerniereModification, null, null, null);
//		Produit produit = produitService.addProduit(p);
//		produitService.deleteProduit(produit.getIdProduit());
//		assertNull(produitService.retrieveProduit(produit.getIdProduit()));
//	}
//	
//	@Test
//	public void testRetrieveAllProduits() throws ParseException {
//		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
//		Date dateCreation = dateFormat.parse("30/09/2022");
//		Date dateDerniereModification = dateFormat.parse("1/10/2022");
//		List<Produit> produits = produitService.retrieveAllProduits();
//		int expected = produits.size();
//		Produit p = new Produit(null, "ChocoTom", "biscuit", 0, dateCreation, dateDerniereModification, null, null, null);
//		Produit produit = produitService.addProduit(p);
//		assertEquals(expected + 1, produitService.retrieveAllProduits().size());
//		produitService.deleteProduit(produit.getIdProduit());
//	}
//	
//	@Test
//	public void testUpdateProduit() throws ParseException {
//
//		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
//		Date dateCreation = dateFormat.parse("30/09/2022");
//		Date dateDerniereModification = dateFormat.parse("1/10/2022");
//		Produit p = new Produit(null, "ChocoTom", "biscuit", 0, dateCreation,null, null, null, null);
//		Produit produit = produitService.addProduit(p);
//		produit.setDateDerniereModification(dateDerniereModification);
//		Produit ProduitUpdated = produitService.updateProduit(produit);
//		assertNotNull(ProduitUpdated.getIdProduit());
//		assertSame("1/10/2022", ProduitUpdated.getDateDerniereModification());
//		produitService.deleteProduit(produit.getIdProduit());
//	} 
//	
//	@Test
//	public void testAssignProduitToStock() throws ParseException {
//		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
//		Date dateCreation = dateFormat.parse("30/09/2022");
//		Stock s = new Stock("stock test",10,100);
//		Stock savedStock= stockService.addStock(s);
//		Produit p = new Produit(null, "ChocoTom", "biscuit", 0, dateCreation, null, null, null, null);
//		Produit produit = produitService.addProduit(p);
//		System.out.print("Stock: "+savedStock);
//		System.out.print("Produit: "+produit);
//		produitService.assignProduitToStock(produit.getIdProduit(), savedStock.getIdStock());
//		assertNotNull(produit.getStock());
//		stockService.deleteStock(savedStock.getIdStock());
//		produitService.deleteProduit(produit.getIdProduit());
//	}
//}
