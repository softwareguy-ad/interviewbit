package designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class NewsAgency {
    String news;
    List<Channel> channels = new ArrayList<>();

    public void setNews(String news) {
        this.news = news;
        for (Channel channel : channels) {
            channel.update(news);
        }
    }

    public void addObserver(Channel channel) {
        this.channels.add(channel);
    }

}
