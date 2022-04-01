package edu.parinya.softarchdesign.behavioral;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Flow.Publisher;
import java.util.concurrent.Flow.Subscriber;

public class NewsPublisher implements Publisher<News> {
    // You need to implement this class
    List<Subscriber<? super News>> subscribers = new ArrayList<>();

    @Override
    public void subscribe(Subscriber<? super News> subscriber) {
        subscribers.add(subscriber);
    }

    public void publish(News news) {
        for (Subscriber<? super News> subscriber : subscribers) {
            subscriber.onNext(news);
            subscriber.onComplete();
        }
    }
}
