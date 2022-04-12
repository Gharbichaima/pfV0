package com.chaima.talk.service;

import java.util.List;

import com.chaima.talk.entities.Publication;

public interface PublicationService {

	Publication savePub(Publication p);
	Publication updatePub(Publication p);
	void deletePub(Publication p);
	void deletePubById(Long id);
	Publication getPublication(Long id);
	List<Publication> getAllPublications();
	//List<Publication> trierPubDate();

}
