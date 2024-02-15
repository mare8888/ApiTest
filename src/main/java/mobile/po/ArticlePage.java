package mobile.po;

import mobile.config.base.BaseMethods;
import org.openqa.selenium.By;

public class ArticlePage extends BaseMethods {

    private final By firstArticle =
            By.xpath("//*[@resource-id='org.wikipedia:id/search_results_list']/android.view.ViewGroup[1]");

    private final By articleName = By.xpath("(//android.widget.TextView[@text='Appium'])[1]");

    private final By buttonLang = By.xpath("//android.widget.TextView[@content-desc=\"Language\"]");
    private final By buttonSpain =
            By.xpath("//androidx.recyclerview.widget.RecyclerView[@resource-id=\"org.wikipedia:id/langlinks_recycler\"]/android.widget.LinearLayout[2]");

    private final By articleNameSpainEquals = By.xpath("//android.widget.TextView[@resource-id=\"Historia\"]");


    public ArticlePage clickFirstArticle() {
        click(firstArticle);
        return new ArticlePage();
    }

    public String getArticleName() {
        return getText(articleName);
    }

    public ArticlePage clickButtonLang() {
        click(buttonLang);
        return new ArticlePage();
    }
    public ArticlePage clickButtonSpain() {
        click(buttonSpain);
        return new ArticlePage();
    }

    public String getArticleNameSpainEquals() {
         return getText(articleNameSpainEquals);
    }
}
