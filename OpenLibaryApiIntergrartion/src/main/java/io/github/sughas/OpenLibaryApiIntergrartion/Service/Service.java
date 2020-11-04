package io.github.sughas.OpenLibaryApiIntergrartion.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.MediaType;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;

import org.springframework.web.client.RestTemplate;

@org.springframework.stereotype.Service
public class Service implements ServiceInterface {
	
	@Autowired
	RestTemplate restTemplate;

	@SuppressWarnings("unchecked")
	@Override
	public Map<String, Object> getfromOpenlibray(Map<String, Object> title) {
		System.out.println(title);
		String url="";
		Set<String> search=title.keySet();
		for (String se : search) {
			System.out.println("key "+se+" value "+title.get(se));
		url="http://openlibrary.org/search.json?"+se+"="+title.get(se);
		//return restTemplate.getForEntity(url, ResponseEntity.class);
		System.out.println(url);
		}
		HttpHeaders headers = new HttpHeaders();
	      headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
	      HttpEntity <String> entity = new HttpEntity<String>(headers);
	      
	      return (Map<String, Object>) restTemplate.exchange(url, HttpMethod.GET, entity, Map.class).getBody();
	}

	/*
	 * @Override public ResponseEntity<?> getbyAuthor(String book) {
	 * 
	 * String url="http://openlibrary.org/search.json?author="+book; return
	 * restTemplate.getForEntity(url, ResponseEntity.class); }
	 * 
	 * @Override public ResponseEntity<?> getbytitleOrAuthor(String titleAuthor) {
	 * String url="http://openlibrary.org/search.json?q="+titleAuthor; return
	 * restTemplate.getForEntity(url, ResponseEntity.class);
	 * 
	 * }
	 */
}
