package com.globallogic.controller;

public class MainController {
	@RequestMapping(value="/")
	public ModelAndView listContact(ModelAndView model) throws IOException{
	    List<Employee> listEmployee = EmployeeDAO.list();
	    model.addObject("listEmployee", listEmployee);
	    model.setViewName("home");
	 
	    return model;
	}
	@RequestMapping(value = "/newEmployee", method = RequestMethod.GET)
	public ModelAndView newEmployee(ModelAndView model) {
	    Employee newEmployee = new Employee();
	    model.addObject("employee", newEmployee);
	    model.setViewName("EmployeeForm");
	    return model;
	}
	@RequestMapping(value = "/saveEmployee", method = RequestMethod.POST)
	public ModelAndView saveContact(@ModelAttribute Employee employee) {
	    employeeDAO.saveOrUpdate(employee);
	    return new ModelAndView("redirect:/");
	}
	@RequestMapping(value = "/deleteEmployee", method = RequestMethod.GET)
	public ModelAndView deleteEmployee(HttpServletRequest request) {
	    int id = Integer.parseInt(request.getParameter("id"));
	    employeeDAO.delete(employeeId);
	    return new ModelAndView("redirect:/");
	}
}
