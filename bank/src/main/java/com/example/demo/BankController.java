package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankController {

	
	
		@Autowired
		BankService service;
		
		@GetMapping("/members")
		List<bank> getAllMembers() {
			return service.getAllMembers();
		}
		
		@GetMapping("/members/{id}")
		Optional<bank> getMembersById(@PathVariable int id) {
			return service.getMemberById(id);
		}
		
		@PostMapping("/members")
		void addNewMember(@RequestBody bank thebank) {
			service.addNewMember(thebank);
		}
		
		@PutMapping("/members/{id}")
		void updateMemberById(@RequestBody bank thebank, @PathVariable int id) {
			service.updateMemberById(thebank, id);
		}
		
		@DeleteMapping("/members/{id}")
		void deleteMemberById(@PathVariable int id) {
			service.deleteMemberById(id);
		}
	}

