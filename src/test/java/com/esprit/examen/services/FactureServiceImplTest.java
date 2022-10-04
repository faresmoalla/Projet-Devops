package com.esprit.examen.services;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.BDDMockito.given;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.esprit.examen.entities.Facture;
import com.esprit.examen.entities.Produit;

import lombok.extern.slf4j.Slf4j;




@SpringBootTest
@AutoConfigureMockMvc
@Slf4j
public class FactureServiceImplTest {
	@Autowired
	FactureServiceImpl factureService ;
	
	@Test
	public void testAddFacture() throws ParseException {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Date dateCreationFacture = dateFormat.parse("30/09/2000");
		Facture facture = new Facture(2,2,dateCreationFacture,dateCreationFacture,true);
		
		Facture saveFacture= factureService.addFacture(facture);
		assertThat(saveFacture.getIdFacture()).isNotNull();
		assertThat(saveFacture.getArchivee()).isEqualTo(true);
		assertNotNull(saveFacture.getMontantFacture());
		log.info("////////////////////////");
		//factureService.delete(saveFacture.getIdStock());
		//given(factureService.addFacture(facture)).willReturn(facture);
	} 
	
	@Test
	public void GetAllFactures() throws ParseException {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Date dateCreationFacture = dateFormat.parse("30/09/2000");
		Facture facture = new Facture(2,2,dateCreationFacture,dateCreationFacture,true);
		List<Facture> factures = factureService.retrieveAllFactures();
		int expected = factures.size();
		Facture saveFacture= factureService.addFacture(facture);
		assertEquals(expected + 1, factureService.retrieveAllFactures().size());	
	}
	
	
}
