package com.cybage.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cybage.Customer;
import com.cybage.repository.CustomerRepository;

@Controller
public class CustomerController {

	@Autowired
	CustomerRepository cr;
	
	@RequestMapping(value = "/register",method = RequestMethod.GET)
	public String welcome(Model model) {
		model.addAttribute("customer", new Customer());
		return "register";
	}
	
	@RequestMapping(value = { "/addcustomer" }, method = { RequestMethod.POST })
	public String addUser(@Valid @ModelAttribute("customer") Customer customer, BindingResult result) {
		if (result.hasErrors())
			return "register";
		cr.save(customer);
		return "redirect:/customers";
	}
	
	@GetMapping("/customers")
	public ModelAndView getlistofuser(Model model){
		ModelAndView mv=new ModelAndView("customers");
		mv.addObject("customers",cr.findAll());
		return mv;
	}
	
	@RequestMapping(value = "/deletecustomer/{id}", method = RequestMethod.GET)
	public String deletecustomer(@PathVariable int id) {
		cr.deleteById(id);
		return "redirect:/customers";
	}
	
	@RequestMapping(value = { "/editcustomer/{id}" }, method = { RequestMethod.GET })
	public String editUser(@PathVariable int id, Model model) {
		model.addAttribute("customer", cr.findById(id));
		return "editcustomer";
	}
	
	@RequestMapping(value = { "/updatecustomer" }, method = { RequestMethod.POST })
	public String editUser(@ModelAttribute("customer") Customer customer) {
		cr.save(customer);
		return "redirect:/customers";
	}
}
