/**
 * 
 */
package io.github.sughas.OpenLibaryApiIntergrartion.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import io.github.sughas.OpenLibaryApiIntergrartion.Service.ServiceInterface;

/**
 * @author sughas
 *
 */
@RestController
public class Controller {
	
	@Autowired
	ServiceInterface serviceInterface;
	@GetMapping("/search")
	public ResponseEntity<?> getbyTitle(@RequestBody Map<String, Object> prop){
	
		return ResponseEntity.ok(serviceInterface.getfromOpenlibray(prop));
	}
	/*
	 * @GetMapping("/search/author") public ResponseEntity<?>
	 * getbyauthor(@RequestBody String author){
	 * 
	 * return ResponseEntity.ok(serviceInterface.getbyAuthor(author)); }
	 * 
	 * @GetMapping("/search/both") public ResponseEntity<?> getbyboth(@RequestBody
	 * String both){
	 * 
	 * return ResponseEntity.ok(serviceInterface.getbytitleOrAuthor(both)); }
	 */
}
