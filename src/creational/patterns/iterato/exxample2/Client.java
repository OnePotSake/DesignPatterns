package creational.patterns.iterato.exxample2;

/**
 * @author spikeCong
 * @date 2022/10/18
 **/
public class Client {

    public static void main(String[] args) {
        Topic[] topics = new Topic[4];
        topics[0] = new Topic("t1");
        topics[1] = new Topic("t2");
        topics[2] = new Topic("t3");
        topics[3] = new Topic("t4");

        TopList topicList = new  TopList(topics);
        AbIterator<Topic> iterator = topicList.iterator();

        while(iterator.hashNext()){
            Topic topic = iterator.next();
            System.out.println(topic.getName());
        }
    }
}
