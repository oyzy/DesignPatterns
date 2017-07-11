package designPatterns.behavioralPattern.iterator;

/**
 * Created by Administrator on 2017/7/11.
 */
public class MyCollection implements  Collection {

    public String strings[] = {"A","B","C","D","E"};

    @Override
    public Iterator iterator() {
        return new MyIterator(this);
    }

    @Override
    public Object get(int i) {
        return strings[i];
    }

    @Override
    public int size() {
        return strings.length;
    }
}
