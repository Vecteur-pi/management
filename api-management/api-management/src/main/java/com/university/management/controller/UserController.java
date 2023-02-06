package com.university.management.controller;

import com.university.management.entity.User;
import com.university.management.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping(path="/user")
public class UserController {
	@Autowired
	private UserRepository userRepository;
	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	// CREATE
	@PostMapping(path="/add") // Map ONLY POST Requests
	public @ResponseBody String addNewUser (@RequestBody User user) {
	    // @ResponseBody means the returned String is the response, not a view name
	    // @ResponseBody means Annotation indicating a method parameter should be bound to the body of the web request.

	    userRepository.save(user);
	    return "Saved";
	}

	// READ
	@GetMapping("get/{id}")
    public User getUser(@PathVariable int id) {
        return userRepository.findById(id).orElse(null);
    }
	
	
	// READ ALL
	  @GetMapping(path="/all")
	  public @ResponseBody Iterable<User> getAllUsers() {
	    return userRepository.findAll();
	  }
	  
	  // UPDATE
	  @PutMapping(path="/add") // Map ONLY POST Requests
		public @ResponseBody String updateUser (@RequestBody User user) {
		   User userInDB = userRepository.findByEmail(user.getEmail());
		   if(userInDB != null) {
			   user.setId(userInDB.getId());
			   userRepository.save(user);
			    return "Saved";
		   } else {
			   return "User no exist!";
		   }
		    
		}
	  
	  // TODO: delete
	  //Delete User
	  @GetMapping("/{id}")
	    public String deleteUser(@PathVariable int id) {
	        userRepository.deleteById(id);
	        return "Ok user deleted!";
	    }
}

