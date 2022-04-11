import java.util.LinkedList;

public class LLQueue implements Queue<QUASAR> {

  LinkedList<QUASAR> _queue;

  public LLQueue() {
    _queue = new LinkedList<QUASAR>();
  }

  public QUASAR dequeue() {
    return _queue.removeFirst();
  }

}
