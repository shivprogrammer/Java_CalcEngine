public interface Comparable<T> { // <T> is saying that the Comparable interface implementation can be tied to a type
  int compareTo(T o); // so notice when we declare the compareTo method, it has the same T, so we can specify in our implementation what type we want to expect to receive in that compareto method
}

public class Flight implements Comparable {
  // other members elided for clarity
}
