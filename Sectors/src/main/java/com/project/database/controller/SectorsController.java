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

import com.project.database.dao.SectorsRepository;
import com.project.database.pojos.Sectors;

@RestController

@RequestMapping("/sectors")

@CrossOrigin(origins="http://localhost:4200") 

public class SectorsController {

	@Autowired

	private SectorsRepository sectorsRepository;

	@RequestMapping("/getAllSectors")

	public Iterable<Sectors> getAllSectors() {

		return sectorsRepository.findAll();

	}

	@PostMapping("/saveSectors")

	public Sectors saveSectors(@RequestBody Sectors sectors) {

		System.out.println(sectors);

		sectorsRepository.save(sectors);

		return sectors;

	}

	@PutMapping("/updateSectors/{sectorid}")

	public int updateSectors(@RequestBody Sectors sectors, @PathVariable("sectorid") int sectorid) {

		sectors.setSectorid(sectorid);

		System.out.println(sectors);

		sectorsRepository.save(sectors);

		return sectorid;

	}

	@DeleteMapping("/deleteSectors/{sectorid}")

	public Boolean deleteSectors(@PathVariable("sectorid") Integer sectorid) {

		System.out.println(sectorid);

		sectorsRepository.deleteById(sectorid);

		return true;

	}

	@GetMapping("/findOneInAll4/{sectorid}")

	public Sectors findOneInAll4(@PathVariable("sectorid") Integer sectorid) {

		Optional<Sectors> sectors = sectorsRepository.findById(sectorid);

		return sectors.get();

	}

}
