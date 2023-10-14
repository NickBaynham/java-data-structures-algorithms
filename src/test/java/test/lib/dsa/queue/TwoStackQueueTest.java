package test.lib.dsa.queue;

import lib.dsa.queue.QueueOverflowException;
import lib.dsa.queue.QueueUnderflowException;
import lib.dsa.queue.TwoStackQueue;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

/***
 *  Not as performant as the circular queue implementation
 */
public class TwoStackQueueTest {

    @Test
    void testTwoStackQueue() throws QueueOverflowException, QueueUnderflowException {
        String[] testData = { "One", "Two", "Three", "Four", "Five"};
        TwoStackQueue<String> twoStackQueue = new TwoStackQueue<>();
        for (String next : testData) {
            twoStackQueue.enqueue(next);
        }
        assertThat(twoStackQueue.getSize()).isEqualTo(testData.length);
        String[] resultData = new String[testData.length];
        for (int i = 0; i < testData.length; i++) {
            resultData[i] = twoStackQueue.dequeue();
        }
        assertThat(resultData).isEqualTo(testData);
    }
}
