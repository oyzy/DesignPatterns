package designPatterns.behavioralPattern.iterator;

/**
 * Created by Administrator on 2017/7/11.
 */
public class Test {
    public static void main(String[] args) {
        Collection collection = new MyCollection();
        Iterator iterator = new MyIterator(collection);
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
