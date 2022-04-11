import java.util.LinkedList;

public class LLQueue<QUASAR> implements Queue {

  LinkedList<QUASAR> _queue;

  public LLQueue() {
    _queue = new LinkedList<QUASAR>();
  }

  public QUASAR dequeue() {
    return _queue.removeFirst();
  }

  public boolean isEmpty() {
    return _queue.isEmpty();
  }

}
