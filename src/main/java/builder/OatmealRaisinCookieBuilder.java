package builder;

public class OatmealRaisinCookieBuilder extends CookieBuilder {

    @Override
    public void buildDough() {
        cookie.setDough("oatmeal");
    }

    @Override
    public void buildMixIn() {
        cookie.setMixin("raisin");

    }

    @Override
    public void buildSize() {
        cookie.setSize("medium");

    }
}
