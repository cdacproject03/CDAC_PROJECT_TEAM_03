package com.dacproject.SHCP;



import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.dacproject.SHCP.dao.AdminDao;
import com.dacproject.SHCP.dao.NgoDao;
import com.dacproject.SHCP.dao.SocialDao;
import com.dacproject.SHCP.dao.UserDao;
import com.dacproject.SHCP.model.Admin;
import com.dacproject.SHCP.model.Ngo;
import com.dacproject.SHCP.model.SocialWorker;
import com.dacproject.SHCP.model.User;



@Controller
public class FirstController{
	
	  @Autowired
	  private SocialDao socialDao;
	  @Autowired
	  private NgoDao ngoDao;
	  @Autowired
	  private AdminDao adminDao;
	  @Autowired
	  private UserDao userDao;
	
    @RequestMapping({"/", "/home"})
    public String hello(Model model,HttpServletRequest request, @RequestParam(value="name", required=false, defaultValue="World") String name) {
    	request.setAttribute("mode","MODE_HOME");
    	model.addAttribute("name", name);
        return "home";
    }
    
    @RequestMapping("/Volunteer")
    public String volunteer(Model model)
    {
    	SocialWorker sw=new SocialWorker(804251356,"Rakesh","rakesh@gmail.com","flat-201,twelve stage face");
    	model.addAttribute("sw",sw);
    	socialDao.save(sw);
    	return "sw";
    }
    @RequestMapping("/ngo")
    public String ngo(Model model)
    {
    	Ngo ngo=new Ngo(58496521,"Shirdi trust","Shirdi,nasik", "saisansthan@shirdi.co.in");
    	model.addAttribute("ngo",ngo);
    	ngoDao.save(ngo);
    	return "ngo";
    }
    
    @RequestMapping("/admin")
    public String admin(Model model)
    {
    	Admin admin= new Admin(25,"Admin","juhu", "admin@juhu.com", 'm');
    	model.addAttribute("admin",admin);
    	adminDao.save(admin);
    	return "admin";
    }
    
    @RequestMapping("/signup")
    public String signup(HttpServletRequest request)
    {
    	request.setAttribute("mode","MODE_REGISTER");
    	return "register";
    }
    
    @RequestMapping("/signin")
    public String signin()
    {
    	return "signin";
    }
    
    @GetMapping("/form")
    public String formGet() {
        return "register";
    }
    
    @PostMapping("/form")
    public String formPost(User user, Model model) {
        userDao.save(user);
        return "signin";
    }
    
    @PostMapping("/login")
    public String login(User user, Model model) {
        model.addAttribute("user", user);
        User loginUser=userDao.retrieve(user);
        if(loginUser!=null)
        {
        	String role=loginUser.getType();
        	if(role.equals("Admin"))
        	{
        		return "admin";
        	}
        	else if(role.equals("NEEDY"))
        	{
        		return "sw";
        	}
           	else if(role.equals("NGO"))
        	{
        		return "ngo";
        	}
           	else if(role.equals("Volunteer"))
        	{
        		return "sw";
        	}
        	return "welcome";
        }
        return "signin";
    }
    
    @RequestMapping("/gotohome")
    public String gotoHome()
    {
    	return "hello";
    }
    
}
