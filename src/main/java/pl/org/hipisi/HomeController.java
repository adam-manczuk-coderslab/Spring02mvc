package pl.org.hipisi;

import java.io.File;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
	
	@Autowired
	FileLoader fileLoader;
	
	@RequestMapping("/workers")
	@ResponseBody
	public String workersAction() throws IOException {
		StringBuffer result = new StringBuffer();
		File file = fileLoader.get("workers.txt");
		Scanner scan = new Scanner(file);
		while(scan.hasNextLine()) {
			result.append(scan.nextLine());
		}
		scan.close();
		return result.toString();
	}
	
	@RequestMapping("/hello")
	public String hello() {
		return "hello";
	}

	@RequestMapping({ "/hi", "/homepage" })
	@ResponseBody
	public String body() {
		return "<h1>Hello world</h1>";
	}

	@RequestMapping("/helloParam")
	@ResponseBody
	private String helloParam(@RequestParam long paramName) {
		System.out.println(paramName);
		return "My param = " + paramName;
	}

	@RequestMapping("/number/{max}")
	@ResponseBody
	private String number(@PathVariable int max, @RequestParam(defaultValue = "0") int min) {
		System.out.println(max);
		Random rand = new Random();

		return "Wylosowano: " + rand.nextInt(max - min) + min;
	}

}
