package generics.builder;

import java.util.Objects;

/**
 * @author Pavel S Varchenko
 * @since 27.04.2018
 */
public class DodoPizza extends Pizza {
    public enum Size {SMALL, MEDIUM, LARGE}

    private final Size size;

    public static class Builder extends Pizza.Builder<Builder> {
        private final Size size;

        public Builder(Size size) {
            this.size = Objects.requireNonNull(size);
        }

        @Override
        public DodoPizza build() {
            return new DodoPizza(this);
        }

        @Override
        protected Builder self() {
            return this;
        }
    }

    private DodoPizza(Builder builder) {
        super(builder);
        size = builder.size;
    }
}
