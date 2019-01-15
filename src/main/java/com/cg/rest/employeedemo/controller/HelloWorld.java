/**
 * 
 */
package com.cg.rest.employeedemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ugawari
 *
 */
@RestController
@RequestMapping("/hello")
public class HelloWorld {

	@GetMapping
	public String hello() {
		return "Hello World";
	}
}
