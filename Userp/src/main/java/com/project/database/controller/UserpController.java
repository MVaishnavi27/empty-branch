package com.project.database.controller;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Optional;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.project.database.dao.UserpRepository;
import com.project.database.email.EmailService;
import com.project.database.pojos.Userp;

@RestController
@RequestMapping("/UserPortal")

@CrossOrigin(origins="*")  

public class UserpController {

	@Autowired

	private UserpRepository userpRepository;

	@RequestMapping("/getAllusers")

	public Iterable<Userp> getAllusers()

	{

		return userpRepository.findAll();

	}

	@Autowired

	   private EmailService emailService;

	 @PostMapping("/saveUser")

	 public Userp saveUser(@RequestBody Userp user) {

	 System.out.println(user);

	 userpRepository.save(user);



	 StringBuffer mailContain= new StringBuffer();

	 mailContain.append("Hi "+user.getUsername()+"\n");

	 mailContain.append("Please Click on Below Click to Confirm Your Email With Us\n");

	 mailContain.append("<a href='http://localhost:8080/Userp/UserPortal/confirmEmail/"+user.getEmail()+">Click</a>\n");

	 mailContain.append("Thanks And Regards\n CTS Participant\n");



	 emailService.sendMail(user.getEmail(),"Email Confirmation", mailContain.toString());



	    //emailService.sendPreConfiguredMail("Ho ho ho");

	 return user;

	 }

	 @GetMapping("/confirmEmail/{emailId}")

	 public Userp confirmEmail(@PathVariable("emailId") String emailId)

	 {

	 Optional<Userp> user= userpRepository.findByEmail(emailId);

	 if(user!=null && user.get()!=null)

	 {

	  Userp u=user.get();

	  u.setConfirmed("yes");

	  userpRepository.save(u);

	  return u;



	 }

	 return user.get();

	 }


	@PutMapping("/updateUser/{userid}")

	public Userp updateUser(@RequestBody Userp userp, @PathVariable("userid") int userid) {

		System.out.println(userp);

		userpRepository.save(userp);

		userp.setUserid(userid);

		return userp;

	}

	@DeleteMapping("/deleteUser/{userid}")

	public Boolean deleteUser(@PathVariable("userid") int userid) {

		System.out.println(userid);

		userpRepository.deleteById(userid);

		return true;


	}

	@GetMapping("/findOneInAll1/{userid}")

	public Userp findOneInAll1(@PathVariable("userid") int userid)

	{

		Optional<Userp> user = userpRepository.findById(userid);

		return user.get();

	}

	@GetMapping("/findByUsernameAndPassword/{username}/{password}")

	public Userp findByUsernameAndPassword(@PathVariable("username") String username,@PathVariable("password") String password)

	{
		 Userp user= userpRepository.findByUsernameAndPasswordAndConfirmed(username, password,"yes");


		return user;

	}
	@PostMapping("/uploadImage")

	  public int handleFileUpload(@RequestParam("file") MultipartFile file, HttpSession session) {

	 Path rootLocation = Paths.get(session.getServletContext().getRealPath("/resources/images"));



	  System.out.println("rootLocation == " + rootLocation);

	  String nameExtension[] = file.getContentType().split("/");

	  String profileimage = System.currentTimeMillis() + "." + nameExtension[1];

	  try

	     {

	     System.out.println("ProfileImage :: " + profileimage);

	     }

	  catch(Exception exception)

	     {



	     }



	 return 1;

	  }  

}
