package com.chaima.talk.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chaima.talk.entities.Publication;
import com.chaima.talk.repos.PublicationRepository;
@Service
public class PublicationServiceImpl implements PublicationService{

		@Autowired
		PublicationRepository  publicationRepository;
		@Override
		public Publication savePub(Publication p) {
			return publicationRepository.save(p);
		}

		@Override
		public Publication updatePub(Publication p) {
			return publicationRepository.save(p);
		}

		@Override
		public void deletePub(Publication p) {
			publicationRepository.delete(p);		
		}

	@Override
	public void deletePubById(Long id) {
		publicationRepository.deleteById(id);		
	}

	@Override
	public Publication getPublication(Long id) {
		return publicationRepository.findById(id).get();
		
	}

	@Override
	public List<Publication> getAllPublications() {
		return publicationRepository.findAll();
	}

	/*@Override
	public List<Publication> trierPubDate() {
		return publicationRepository.tri;
	}*/


}
