package com.chaima.talk.entities;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

	@Data
	@NoArgsConstructor
	@AllArgsConstructor
	@Document(collection =  "user")
	public class User {

	    @Id
	    private String id_user;
	    private String login;
	    private String password;
	    private String nom;
	    private String prenom;

		//private List<Publication> pub;
		public User( String login, String password,String nom ,String prenom) {
			super();
			this.login = login;
			this.password = password;
			this.nom = nom;
			this.prenom = prenom;
		}
}
