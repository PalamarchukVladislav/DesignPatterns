package Creational.Builder;

public abstract class WebsiteBuilder {

    Website website;

    void creteWebsite(){
        website =  new Website();
    }

    abstract void buildName();
    abstract void buildCms();
    abstract void buildPrice();

    Website getWebsite(){
        return website;
    }
}
