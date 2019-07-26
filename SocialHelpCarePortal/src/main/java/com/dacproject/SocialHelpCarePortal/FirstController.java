package com.dacproject.SocialHelpCarePortal;



import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.dacproject.SocialHelpCarePortal.dao.EventDao;
import com.dacproject.SocialHelpCarePortal.dao.UserDao;
import com.dacproject.SocialHelpCarePortal.model.Event;
import com.dacproject.SocialHelpCarePortal.model.User;







@Controller
@SessionAttributes("user")
public class FirstController{

	private User globalUser=null;
	  @Autowired
	  private UserDao userDao;
	  @Autowired
	  private EventDao eventDao;
	
    @RequestMapping({"/", "/home"})
    public String hello(Model model,HttpServletRequest request, @RequestParam(value="name", required=false, defaultValue="World") String name) {
    	request.setAttribute("mode","MODE_HOME");
    	model.addAttribute("name", name);
        return "home";
    }
    
    @RequestMapping("/signup")
    public String signup(HttpServletRequest request)
    {
    	request.setAttribute("mode","MODE_REGISTER");
    	return "home";
    }
    
    @RequestMapping("/signin")
    public String signin()
    {
    	return "signin";
    }
    
	/*
	 * @GetMapping("/form") public String formGet() { return "register"; }
	 */
    
    @PostMapping("/form")
    public String formPost(User user, Model model) {
        userDao.save(user);
        return "signin";
    }
    
    @PostMapping("/login")
    public String login(User user, ModelMap model) {
    	globalUser=user;
        model.put("user", globalUser);
        User loginUser=userDao.retrieve(user);
        if(loginUser!=null)
        {
        	String role=loginUser.getType();
        	if(role.equals("Admin"))
        	{
        		return "admindashboard";
        	}
        	else if(role.equals("NEEDY"))
        	{
        		return "needyuserdashboard";
        	}
           	else if(role.equals("NGO"))
        	{
        		return "ngodashboard";
        	}
           	else if(role.equals("Volunteer"))
        	{
        		return "socialworker";
        	}
        	return "welcome";
        }
        return "signin";
    }
    
    @RequestMapping("/gotohome")
    public String gotoHome(HttpServletRequest request)
    {
    	request.setAttribute("mode","MODE_HOME");
    	return "home";
    }
    
    @RequestMapping("/chart")
    public String gotoChart(ModelMap model)
    {
    	model.put("user", globalUser);
    	return "chart";
    }
    
    @RequestMapping("/admindashboard")
    public String adminDashboard(ModelMap model)
    {
    	model.put("user", globalUser);
    	return "admindashboard";
    }
    
    @RequestMapping("/ngodashboard")
    public String ngoDashboard(ModelMap model)
    {
    	model.put("user", globalUser);
    	return "ngodashboard";
    }
    
    @RequestMapping("/ngochart")
    public String ngoChart(ModelMap model)
    {
    	model.put("user", globalUser);
    	return "ngochart";
    }
    
    @RequestMapping("/eventdetails")
    public String eventDetails(ModelMap model)
    {
    	model.put("user", globalUser);
    	return "eventdetails";
    }
    
    @RequestMapping("/volunteerregister")
    public String volunteerregister()
    {
    	return "volunteerregister";
    }
    
    @RequestMapping("/aboutus")
    public String aboutus()
    {
    	return "aboutus";
    }
    
    @RequestMapping("/contact")
    public String contact()
    {
    	return "contact";
    }
    
    @RequestMapping("/Instruction")
    public String Instruction()
    {
    	return "Instruction";
    }
    
    @RequestMapping("/faq")
    public String faq()
    {
    	return "faq";
    }
    
    @PostMapping("/event")
    public String event(Event event)
    {
    	eventDao.save(event);
    	return "eventdetails";
    }
    
    @RequestMapping("/help")
    public String help()
    {
    	return "help";
    }
    
    @RequestMapping("/eventlist")
    public String login(Event event,Model model) {
        List<Event> events=eventDao.retrieve(event);
        System.out.println(events.size());
        model.addAttribute("events", events);
        return "eventlist";
    }
}
