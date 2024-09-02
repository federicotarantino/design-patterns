package builder;

public class DoubleChocolateCookieBuilder extends CookieBuilder {
    @Override
    public void buildDough() {
        cookie.setDough("chocolate");
    }

    @Override
    public void buildMixIn() {
        cookie.setMixin("chocolate chips");

    }

    @Override
    public void buildSize() {
        cookie.setSize("medium");

    }
}
