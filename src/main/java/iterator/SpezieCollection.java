package iterator;

public class SpezieCollection implements Container {
    private String spezie[] = {"cardamomo", "paprika", "cannella", "aglio"};
    @Override
    public Iterator createIterator() {
        SpezieIterator spiceIter= new SpezieIterator();
        return spiceIter;

    }

    private class SpezieIterator implements Iterator {
        private int position;
        @Override
        public boolean hasNext() {
            if (position < spezie.length) {
                return true;
            }
            else {
                return false;
            }
        }

        @Override
        public Object next() {
            if (this.hasNext()) {
                return spezie[position++];
            }
            else {
                return null;
            }
        }
    }
}

