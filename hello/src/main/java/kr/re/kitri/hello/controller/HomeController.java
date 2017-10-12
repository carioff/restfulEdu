package kr.re.kitri.hello.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import kr.re.kitri.hello.model.Article;
import kr.re.kitri.hello.service.ArticleService;

@RestController// Rest방식으로 객체 반환이 가능 
//@Controller
public class HomeController {

	@Autowired
	private ArticleService articleService;
	
//	@RequestMapping("")
//	@ResponseBody
	@GetMapping("")//Get방식으로 매핑 스프링 4.3.x 부터 
	public String index() {
		return "Hello, world";
	}
	

//	@RequestMapping("/articles")
//	@ResponseBody
	@GetMapping("/articles") // http://lacalhost:8090/articles
	public String readArticle() {
		return "글전체보기입니다.";
	}
	
	@GetMapping("/articles/150") // owe to Jackson
	public Article viewArticle() {
//		return new Article(150, "title", "content", "author");
		//서비스를 호출 
		return articleService.viewArticleByArticleNo();
	}
}
