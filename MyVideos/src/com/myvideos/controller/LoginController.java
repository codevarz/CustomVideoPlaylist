package com.myvideos.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

//import com.myvideos.Dao.UserDao;
import com.myvideos.Dao.UserDaoImpl;
import com.myvideos.Dao.UserVideoDaoImpl;
import com.myvideos.model.User;

@Controller
public class LoginController {

	private UserDaoImpl dao;
	private UserVideoDaoImpl vid_dao;

	@Autowired(required=true)
	@Qualifier(value="dao")
	public void setUserDaoImpl(UserDaoImpl dao){
		this.dao=dao;
	}

	@Autowired(required=true)
	@Qualifier(value="vid_dao")
	public void setUserVideoDaoImpl(UserVideoDaoImpl vid_dao){
		this.vid_dao=vid_dao;
	}
	
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String login(@RequestParam String username, @RequestParam String password, ModelMap model){

		List<User> user = dao.getUserByUsername(username);

		if(!user.isEmpty()){

			System.out.println(user.toString());
			if(user.get(0).getPassword().equals(password)){	
				List<String> vids = vid_dao.getVideosByUserId(user.get(0).getUserid());
				System.out.println(vids);
				model.addAttribute("videos", vids);
				return "hello";
			}
		}
		return "login";
	}
	@RequestMapping(value="/register")
	public String registerUser(@RequestParam String name, @RequestParam String username, 
			@RequestParam String email, @RequestParam String password, @RequestParam String dob){
		User user = new User(name, email, dob,username, password);
		dao.saveUser(user);
		return "login";
	}
}
