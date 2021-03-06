package com.chaima.talk.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.chaima.talk.entities.Publication;
import com.chaima.talk.service.PublicationService;


@RestController
@RequestMapping("/api")
@CrossOrigin
public class PublicationController {
	@Autowired
	PublicationService publicationService;
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Publication> getAllProduits() {
	    return publicationService.getAllPublications();
	}
	
	@RequestMapping(value="/{id}",method = RequestMethod.GET)
	public Publication getProduitById(@PathVariable("id") Long id) {
	   return publicationService.getPublication(id);
	 }
	
	@RequestMapping(method = RequestMethod.POST)
	public Publication createProduit(@RequestBody Publication publication) {
	  return publicationService.savePub(publication);
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	public Publication updateAnimal(@RequestBody Publication pub) {
	  return publicationService.updatePub(pub);
	}
	
	@RequestMapping(value="/{id}",method = RequestMethod.DELETE)
	public void deleteUser(@PathVariable("id") Long id)
	{
		publicationService.deletePubById(id);
	}
	
	
	
}
