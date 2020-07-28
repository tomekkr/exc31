package pl.javastart.restoffers.form;

import pl.javastart.restoffers.model.Category;


public class OfferForm {
    private String title;
    private String description;
    private String imgUrl;
    private double price;
    private Category category;

    public OfferForm(String title, String description, String imgUrl, double price, Category category) {
        this.title = title;
        this.description = description;
        this.imgUrl = imgUrl;
        this.price = price;
        this.category = category;
    }

    public OfferForm() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
