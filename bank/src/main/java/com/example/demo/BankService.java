package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class BankService {

	

		@Autowired
		BankRepo repo;
		
		List<bank> getAllMembers() {
			return (List<bank>) repo.findAll();
		}
		
		Optional<bank> getMemberById(int id) {
			return repo.findById(id);
		}
		
		void addNewMember(bank thebank) {
			repo.save(thebank);
		}

		void updateMemberById(bank thebank, int id) {
			repo.save(thebank);
		}

		void deleteMemberById(int id) {
			repo.deleteById(id);
		}
}

