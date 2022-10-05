abstract class ColdDrink implements Item {
        @Override
        public Bottle packing() {
            return new Bottle();
        }
        @Override
        public abstract float price ();
    }
