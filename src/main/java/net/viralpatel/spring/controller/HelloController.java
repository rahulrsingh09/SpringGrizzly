package net.viralpatel.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;


@RestController
@Path("/hello")

public class HelloController {

	@Autowired
	AccountRepository repository;


	@GET
	@Path("/")
	@Produces("application/json")
	public List<AccountEntity> hello() {
		return repository.findAll();

	}
}
