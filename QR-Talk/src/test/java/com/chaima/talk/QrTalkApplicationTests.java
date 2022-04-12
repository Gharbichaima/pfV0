package com.chaima.talk;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.chaima.talk.entities.Espace;
import com.chaima.talk.entities.Publication;
import com.chaima.talk.entities.User;
import com.chaima.talk.repos.PublicationRepository;
import com.chaima.talk.repos.UserRepository;

@SpringBootTest
class QrTalkApplicationTests {

	@Autowired
	private PublicationRepository reposi;
	@Autowired
	private UserRepository usreposi;
	@Test
	void testCreatePub() {
		//Publication p1= new Publication(3L,"test de pub key",new Date(),"privee");
		Publication p1=new Publication();
		reposi.save(p1);
	}
	@Test
	void testCreateUser() {
		User e1= new User("gharbishaima@gmail.com","0000","chaima","gharbi");
		usreposi.save(e1);
	}
	@Test
	public void testFinduser()
	{
	User a = usreposi.findById("624f0634376d8d53c86c2008").get(); 
	System.out.println(a);
	}
	@Test
	public void testFindPub()
	{
	Publication a = reposi.findById(1L).get(); 
	System.out.println(a);
	}
	@Test
	public void testUpdatePub()
	{
		Publication a = reposi.findById(4L).get();
		a.setContenu("update la publication");
		reposi.save(a);
	}
	@Test
	public void testDeletePub()
	{
		reposi.deleteById(0L);;
	}
	 
	@Test
	public void testListerTousPub()
	{
	List<Publication> pub = reposi.findAll();
	for (Publication p : pub)
	{
	System.out.println(p);
	}
	}

}
