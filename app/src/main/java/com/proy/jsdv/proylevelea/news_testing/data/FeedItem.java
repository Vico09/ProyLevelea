package com.proy.jsdv.proylevelea.news_testing.data;


public class FeedItem {
    private int id;
    private String title, company, description, publicationTime, endTime, url;

    public FeedItem() {
    }

    public FeedItem(int id, String nameOpport, String companyName, String description,
                    String publicationTime, String endTime, String url) {
        super();
        this.id = id;
        this.title = nameOpport;
        this.company = companyName;
        this.description = description;
        this.publicationTime = publicationTime;
        this.endTime = endTime;
        this.url = url;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPublicationTime() {
        return publicationTime;
    }

    public void setPublicationTime(String publicationTime) {
        this.publicationTime = publicationTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}