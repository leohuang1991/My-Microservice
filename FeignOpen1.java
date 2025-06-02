package cus.demo;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

//@Component
@FeignClient(name = "apigateway"//"productservice"
                , url = "http://localhost:9099")
public interface FeignOpen1 {

	@GetMapping(path="/bb1")
	public String aab();
}
