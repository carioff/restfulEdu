package kr.re.kitri.hello.model;


//Immutable Value Object
public class Article {

	private final int articleId;
	private final String title;
	private final String content;
	private final String author;
	
	
	public Article(int articleId, String title, String content, String author) {
		super();
		this.articleId = articleId;
		this.title = title;
		this.content = content;
		this.author = author;
	}


	public int getArticleId() {
		return articleId;
	}


	public String getTitle() {
		return title;
	}


	public String getContent() {
		return content;
	}


	public String getAuthor() {
		return author;
	}


	@Override
	public String toString() {
		return "Article [articleId=" + articleId + ", title=" + title + ", content=" + content + ", author=" + author
				+ "]";
	}
	
	
}
