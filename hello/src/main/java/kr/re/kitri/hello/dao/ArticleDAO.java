package kr.re.kitri.hello.dao;

import org.springframework.stereotype.Repository;

import kr.re.kitri.hello.model.Article;

@Repository
public class ArticleDAO {

	// table의 CRUD 작업
	
	// 글번호로 글조회
	public Article selectArticleByArticleNo() {
		return new Article(150, "title", "content", "문재인");

	}
}
