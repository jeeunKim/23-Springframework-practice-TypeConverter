package hello.typeconverter.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import hello.typeconverter.type.IpPort;


@RestController
public class HelloController {
	@GetMapping("/hello-v2")
	public String helloV2(@RequestParam Integer data) {
	 System.out.println("data = " + data);
	 return "ok";
	}
	
	@GetMapping("/ip-port")
	public String ipPort(@RequestParam IpPort ipPort) {
	 System.out.println("ipPort IP = " + ipPort.getIp());
	 System.out.println("ipPort PORT = " + ipPort.getPort());
	 return "ok";
	}
}
