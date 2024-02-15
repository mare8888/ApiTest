package mobile.services;

import mobile.po.ArticlePage;

public class ArticleService {

    private final ArticlePage articlePage = new ArticlePage();


    public String getArticleName() {
        return articlePage
                .clickFirstArticle()
                .getArticleName();
    }

    public String getArticleNameSpain() {
        return articlePage
                .clickButtonLang()
                .clickButtonSpain()
                .getArticleNameSpainEquals();
    }

    public ArticlePage getArticle() {
        return articlePage
                .clickFirstArticle();
    }
}
