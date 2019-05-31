package dev.nelson.prices;

import io.smallrye.reactive.messaging.annotations.Broadcast;
import javax.enterprise.context.ApplicationScoped;
import org.eclipse.microprofile.reactive.messaging.Incoming;
import org.eclipse.microprofile.reactive.messaging.Outgoing;

@ApplicationScoped
public class PriceConsumer {

  private static final double CONVERSION_RATE = 0.88;

  @Incoming("prices")
  @Outgoing("my-data-stream")
  @Broadcast
  public double process(int priceInUsd) {
    return priceInUsd * CONVERSION_RATE;
  }
}
