package kr.re.kitri.hello.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.re.kitri.hello.dao.ArticleDAO;
import kr.re.kitri.hello.model.Article;

@Service
public class ArticleService {

	@Autowired// Dependency Injection
	private ArticleDAO articleDAO;
	// 글쓰기
	
	// 글조회 by 글번호
	public Article viewArticleByArticleNo() {
//		return new Article(150, "title", "content", "이승엽");
		return articleDAO.selectArticleByArticleNo();
	}
	
	// 글 전체보기
	
	// 글수정
}
