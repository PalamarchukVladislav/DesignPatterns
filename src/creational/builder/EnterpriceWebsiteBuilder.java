package creational.builder;

public class EnterpriceWebsiteBuilder extends WebsiteBuilder {

    @Override
    void buildName() {
        website.setName("EnterPrice");
    }

    @Override
    void buildCms() {
        website.setCms(Cms.ALIFRESCO);
    }

    @Override
    void buildPrice() {
        website.setPrice(10000);
    }
}
