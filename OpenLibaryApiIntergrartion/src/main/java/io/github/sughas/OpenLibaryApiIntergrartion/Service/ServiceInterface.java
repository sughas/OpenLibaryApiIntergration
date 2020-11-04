package io.github.sughas.OpenLibaryApiIntergrartion.Service;

import java.util.Map;

import org.springframework.http.ResponseEntity;

public interface ServiceInterface {
	
	public Map<String, Object> getfromOpenlibray(Map<String, Object> title);
	//public ResponseEntity<?> getbyAuthor(String book);
	//public ResponseEntity<?> getbytitleOrAuthor(String titleAuthor);

}
