package mobile.services;

import mobile.po.ArticlePage;

public class ArticleService {

    private final ArticlePage articlePage = new ArticlePage();

    public String getArticleName() {
        return articlePage
                .clickFirstArticle()
                .getArticleName();
    }

    public void clickArticle() {
        articlePage
                .clickFirstArticle();
    }

    public void clickMore() {
        articlePage
                .clickMore();
    }

    public void clickList(){
        articlePage.clickList();
    }
}
