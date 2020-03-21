package com.project.database.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.database.dao.IposRepository;
import com.project.database.pojos.Ipos;

@RestController

@RequestMapping("/ipos")

@CrossOrigin(origins="http://localhost:4200") 

public class IposController {

	@Autowired

	private IposRepository iposRepository;

	@RequestMapping("/getAllIpos")

	public Iterable<Ipos> getAllIpos() {

		return iposRepository.findAll();

	}

	@PostMapping("/saveIpos")

	public Ipos saveIpos(@RequestBody Ipos ipos) {

		System.out.println(ipos);

		iposRepository.save(ipos);

		return ipos;

	}

	@PutMapping("/updateIpos/{Ipoid}")

	public Ipos updateIpos(@RequestBody Ipos ipos, @PathVariable("Ipoid") Integer Ipoid) {

		ipos.setIpoid(Ipoid);

		System.out.println(ipos);

		iposRepository.save(ipos);

		return ipos;

	}

	@DeleteMapping("/deleteIpos/{Ipoid}")

	public Boolean deleteIpos(@PathVariable("Ipoid") Integer Ipoid) {

		System.out.println(Ipoid);

		iposRepository.deleteById(Ipoid);

		return true;

	}

	@GetMapping("/findOneInAll5/{Ipoid}")

	public Ipos findOneInAll5(@PathVariable("Ipoid") Integer Ipoid) {

		Optional<Ipos> ipos = iposRepository.findById(Ipoid);

		return ipos.get();

	}

}
