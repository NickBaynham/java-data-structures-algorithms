package test.lib.dsa.queue;

import lib.dsa.api.Queue;
import lib.dsa.queue.CircularQueue;
import lib.dsa.queue.QueueUnderflowException;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class QueueTest {

    @Test
    void testQueue() throws QueueUnderflowException {
        int[] data = { 5, 4, 9, 1, 31, 205 };
        Queue<String> queue = new CircularQueue<>(String.class, 10);
        assertThat(queue.isEmpty()).isTrue();
        assertThat(queue.getSize()).isEqualTo(0);
        assertThat(queue.isFull()).isFalse();
    }
}