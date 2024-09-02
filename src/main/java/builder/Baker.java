package builder;

public class Baker {

    private CookieBuilder cookieBuilder;
    public void setCookieBuilder(CookieBuilder cookieBuilder) {
        this.cookieBuilder = cookieBuilder;
    }
    public Cookie getCookie() {
        return cookieBuilder.getCookie();
    }
    public void bakeCookies() {
        cookieBuilder.createNewCookie();
        cookieBuilder.buildDough();
        cookieBuilder.buildMixIn();
        cookieBuilder.buildSize();
    }
}
