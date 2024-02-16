package mobile.po;

import mobile.config.base.BaseMethods;
import org.openqa.selenium.By;

public class ArticlePage extends BaseMethods {

    private final By firstArticle =
            By.xpath("//*[@resource-id='org.wikipedia:id/search_results_list']/android.view.ViewGroup[1]");

    private final By articleName = By.xpath("(//android.widget.TextView[@text='Appium'])[1]");

    private final By clickMoreButton = By.xpath("//android.view.ViewGroup[@resource-id=\"org.wikipedia:id/view_list_card_footer\"]");

    private final By clickList = By.xpath("//android.widget.TextView[@resource-id=\"org.wikipedia:id/view_list_card_item_title\" and @text=\"Madame Web (film)\"]");
    public ArticlePage clickFirstArticle() {
        click(firstArticle);
        return new ArticlePage();
    }

    public String getArticleName() {
        return getText(articleName);
    }

    public ArticlePage clickMore() {
        click(clickMoreButton);
        return new ArticlePage();
    }

    public ArticlePage clickList() {
        click(clickList);
        return new ArticlePage();
    }
}
