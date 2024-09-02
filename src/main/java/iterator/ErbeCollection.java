package iterator;

import java.util.ArrayList;

public class ErbeCollection implements Container {
    private ArrayList<String> herbs = new ArrayList<>();

    public ErbeCollection() {
        herbs.add("prezzemolo");
        herbs.add("timo");
        herbs.add("finocchietto");
    }

    @Override
    public Iterator createIterator() {
        ErbeIterator herbIter = new ErbeIterator();
        return herbIter;
    }

    private class ErbeIterator implements Iterator {
        private int position;
        @Override
        public boolean hasNext() {
            if (position < herbs.size()) {
                return true;
            }
            else {
                return false;
            }
        }

        @Override
        public Object next() {
            if (this.hasNext()) {
                return herbs.get(position++);
            }
            else {
                return null;
            }
        }
    }
}
