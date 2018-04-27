package generics.builder;

/**
 * @author Pavel S Varchenko
 * @since 27.04.2018
 */
public class CalzonePiza extends Pizza {
    private final boolean sauceInside;

    public static class Builder extends Pizza.Builder<Builder> {
        private boolean sauceInside = false;

        public Builder sauceInside() {
            sauceInside = true;
            return this;
        }

        @Override
        public CalzonePiza build() {
            return new CalzonePiza(this);
        }

        @Override
        protected Builder self() {
            return this;
        }
    }

    private CalzonePiza(Builder builder) {
        super(builder);
        sauceInside = builder.sauceInside;
    }
}
