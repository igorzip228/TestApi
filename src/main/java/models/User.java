package models;

public class User {
    private String login;
    private Integer id;
    private String avatar_url;
    private String url;
    private String html_url;
    private String followers_url;
    private String foloving_url;
    private String gists_url;
    private String starred_url;
    private String subscription_url;
    private String irganizations_url;
    private String repos_url;
    private String events_url;
    private String received_events_url;
    private String type;
    private Boolean site_admin;
    private String name;
    private String company;
    private String blog;
    private String location;
    private String email;
    private String hireable;
    private String bio;
    private Integer public_repos;
    private Integer public_gists;
    private Integer followers;
    private Integer followinng;
    private String created_at;
    private String updated_at;


    public User(){ //нужен дефолтный конструктор
    }

    // Alt + Insert - вызываем Generate / Constructor, выбираем все поля - ОК
    public User(String login, Integer id, String avatar_url, String url, String html_url, String followers_url, String foloving_url, String gists_url, String starred_url, String subscription_url, String irganizations_url, String repos_url, String events_url, String received_events_url, String type, Boolean site_admin, String name, String company, String blog, String location, String email, String hireable, String bio, Integer public_repos, Integer public_gists, Integer followers, Integer followinng, String created_at, String updated_at) {
        this.login = login;
        this.id = id;
        this.avatar_url = avatar_url;
        this.url = url;
        this.html_url = html_url;
        this.followers_url = followers_url;
        this.foloving_url = foloving_url;
        this.gists_url = gists_url;
        this.starred_url = starred_url;
        this.subscription_url = subscription_url;
        this.irganizations_url = irganizations_url;
        this.repos_url = repos_url;
        this.events_url = events_url;
        this.received_events_url = received_events_url;
        this.type = type;
        this.site_admin = site_admin;
        this.name = name;
        this.company = company;
        this.blog = blog;
        this.location = location;
        this.email = email;
        this.hireable = hireable;
        this.bio = bio;
        this.public_repos = public_repos;
        this.public_gists = public_gists;
        this.followers = followers;
        this.followinng = followinng;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }

    //Alt + Insert - вызываем Generate / toString, выбираем все поля - ОК
    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", id=" + id +
                ", avatar_url='" + avatar_url + '\'' +
                ", url='" + url + '\'' +
                ", html_url='" + html_url + '\'' +
                ", followers_url='" + followers_url + '\'' +
                ", foloving_url='" + foloving_url + '\'' +
                ", gists_url='" + gists_url + '\'' +
                ", starred_url='" + starred_url + '\'' +
                ", subscription_url='" + subscription_url + '\'' +
                ", irganizations_url='" + irganizations_url + '\'' +
                ", repos_url='" + repos_url + '\'' +
                ", events_url='" + events_url + '\'' +
                ", received_events_url='" + received_events_url + '\'' +
                ", type='" + type + '\'' +
                ", site_admin=" + site_admin +
                ", name='" + name + '\'' +
                ", company='" + company + '\'' +
                ", blog='" + blog + '\'' +
                ", location='" + location + '\'' +
                ", email='" + email + '\'' +
                ", hireable='" + hireable + '\'' +
                ", bio='" + bio + '\'' +
                ", public_repos=" + public_repos +
                ", public_gists=" + public_gists +
                ", followers=" + followers +
                ", followinng=" + followinng +
                ", created_at='" + created_at + '\'' +
                ", updated_at='" + updated_at + '\'' +
                '}';
    }

    //Alt + Insert - вызываем Generate / Geters and Seters, выбираем все поля - ОК
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAvatar_url() {
        return avatar_url;
    }

    public void setAvatar_url(String avatar_url) {
        this.avatar_url = avatar_url;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getHtml_url() {
        return html_url;
    }

    public void setHtml_url(String html_url) {
        this.html_url = html_url;
    }

    public String getFollowers_url() {
        return followers_url;
    }

    public void setFollowers_url(String followers_url) {
        this.followers_url = followers_url;
    }

    public String getFoloving_url() {
        return foloving_url;
    }

    public void setFoloving_url(String foloving_url) {
        this.foloving_url = foloving_url;
    }

    public String getGists_url() {
        return gists_url;
    }

    public void setGists_url(String gists_url) {
        this.gists_url = gists_url;
    }

    public String getStarred_url() {
        return starred_url;
    }

    public void setStarred_url(String starred_url) {
        this.starred_url = starred_url;
    }

    public String getSubscription_url() {
        return subscription_url;
    }

    public void setSubscription_url(String subscription_url) {
        this.subscription_url = subscription_url;
    }

    public String getIrganizations_url() {
        return irganizations_url;
    }

    public void setIrganizations_url(String irganizations_url) {
        this.irganizations_url = irganizations_url;
    }

    public String getRepos_url() {
        return repos_url;
    }

    public void setRepos_url(String repos_url) {
        this.repos_url = repos_url;
    }

    public String getEvents_url() {
        return events_url;
    }

    public void setEvents_url(String events_url) {
        this.events_url = events_url;
    }

    public String getReceived_events_url() {
        return received_events_url;
    }

    public void setReceived_events_url(String received_events_url) {
        this.received_events_url = received_events_url;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Boolean getSite_admin() {
        return site_admin;
    }

    public void setSite_admin(Boolean site_admin) {
        this.site_admin = site_admin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getBlog() {
        return blog;
    }

    public void setBlog(String blog) {
        this.blog = blog;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHireable() {
        return hireable;
    }

    public void setHireable(String hireable) {
        this.hireable = hireable;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public Integer getPublic_repos() {
        return public_repos;
    }

    public void setPublic_repos(Integer public_repos) {
        this.public_repos = public_repos;
    }

    public Integer getPublic_gists() {
        return public_gists;
    }

    public void setPublic_gists(Integer public_gists) {
        this.public_gists = public_gists;
    }

    public Integer getFollowers() {
        return followers;
    }

    public void setFollowers(Integer followers) {
        this.followers = followers;
    }

    public Integer getFollowinng() {
        return followinng;
    }

    public void setFollowinng(Integer followinng) {
        this.followinng = followinng;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }
}
