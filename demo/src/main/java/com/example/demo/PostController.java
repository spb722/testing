package com.example.demo;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
@Transactional
public class PostController {
	@Autowired
	PostRepository postrepo;
	
	 @PersistenceContext
	    private EntityManager em;
	@PostMapping(path = "/testing")
	public void testing(@RequestBody Post post ) {
		postrepo.save(post);
		//em.persist(post);
		
	}
	

}
