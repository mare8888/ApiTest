package mobile.search;

import mobile.BaseTest;
import mobile.po.SkipPage;
import mobile.services.ArticleService;
import mobile.services.SearchService;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SearchTest extends BaseTest {

    @Test
    void shouldBeArticleNameVisible() {
        new SkipPage().clickSkip();

        new SearchService().searchTest("Appium");

        new ArticleService().getArticle();

        var article3 = new ArticleService().getArticleNameSpain();

        assertThat(article3).as("Header").isEqualTo("Historia");
    }
}
