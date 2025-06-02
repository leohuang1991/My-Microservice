package cus.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import cus.demo.Data1;
import cus.demo.Data1Repository;
import cus.demo.FeignOpen1;

@Controller
@RequestMapping("/api/v1")
public class Conn1 {

	
	@Autowired
	Data1Repository ddr;
	
	@Autowired
	FeignOpen1 fo1;
	
	@GetMapping(value="/aa2/aa3")
	@ResponseBody
	public String aa() {
		Data1 d1=new Data1();
		d1.setName("monster");
		d1.setPhone("34567");
		Data1 d2 =ddr.save(d1);
		String aa9="";
		if(d2!=null) {
			aa9="Success";
		}else {
			aa9="Fail";
		}
		return "MaxRoll"+":"+aa9;
	}
	
	
	@GetMapping(value="/aa23")
	public String aa2() {
		return "coo";
	}
	
	@GetMapping(value="/gg6")
	@ResponseBody
	public String gg6() {
		String a=fo1.aab();
		
		return a;
	}
}
