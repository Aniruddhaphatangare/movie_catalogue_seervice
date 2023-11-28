package com.microservices.movie_Catalogue.Controller;

import java.util.Collections;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.movie_Catalogue.Model.CatalogueItem;

@RestController
@RequestMapping("/catalogue")
public class MovieCatalogueResource {
	
	@RequestMapping("/id")
	public List<CatalogueItem> getCatalogue(String userId)
	{
		return Collections.singletonList(new CatalogueItem("Avengers","Good Movie",5));
	}
}
