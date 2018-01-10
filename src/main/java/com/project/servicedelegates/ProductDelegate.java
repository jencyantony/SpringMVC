package com.project.servicedelegates;

import java.util.Arrays;

import org.springframework.http.MediaType;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.project.beans.ProductRegistration;

@Component
public class ProductDelegate {

	
	private String getProductServiceUrl = "http://localhost:8080/getProduct/";
	private String registerProductServiceUrl = "http://localhost:8080/registerProduct";

	public ProductRegistration registerProduct(ProductRegistration product) {
		ProductRegistration productModel = getRestTemplate().postForObject(registerProductServiceUrl, product,
				ProductRegistration.class);
		return productModel;
	}

	public ProductRegistration getProductDetails(String registrationId) {
		ProductRegistration productModel = getRestTemplate().getForObject(getProductServiceUrl + registrationId,
				ProductRegistration.class);
		return productModel;
	}
	
	private RestTemplate getRestTemplate(){
		RestTemplate restTemplate = new RestTemplate();
		MappingJackson2HttpMessageConverter mappingJackson2HttpMessageConverter = new MappingJackson2HttpMessageConverter();
		mappingJackson2HttpMessageConverter.setSupportedMediaTypes(Arrays.asList(MediaType.APPLICATION_JSON));
		restTemplate.getMessageConverters().add(mappingJackson2HttpMessageConverter);
		return restTemplate;
	}
}
