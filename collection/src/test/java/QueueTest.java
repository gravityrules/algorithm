import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class QueueTest {

    @Test
    void test_Enqueue_when_no_elem() {
        Queue queue = new Queue(5);
        queue.enqueue(10);
        assertThat(queue.size()).isEqualTo(1);
    }

    @Test
    void test_Enqueue_when_queue_full() {
        Queue queue = new Queue(5);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(25);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(60);
        assertThat(queue.size()).isEqualTo(6);
    }

    @Test
    void test_Enqueue_queue_is_circular() {
        Queue queue = new Queue(5);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(25);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.enqueue(60);
        assertThat(queue.size()).isEqualTo(1);
    }

    @Test
    void test_Dequeue_Removes_Next_Item(){
        Queue queue = new Queue(5);
        queue.enqueue(10);
        queue.enqueue(20);
        assertThat(queue.dequeue()).isEqualTo(10);
        assertThat(queue.size()).isEqualTo(1);
    }

    @Test
    void test_Dequeue_Has_No_Effect_On_Empty_Queue(){
        Queue queue = new Queue(5);
        assertThat(queue.dequeue()).isEmpty();
        assertThat(queue.size()).isEqualTo(0);
    }

    @Test
    void test_Peek_Returns_Next_Item_To_Consume() {
        Queue queue = new Queue(5);
        queue.enqueue(10);
        queue.enqueue(20);
        assertThat(queue.peek()).isEqualTo(10);
    }

    @Test
    void test_peek_returns_null_for_empty_queue() {
        Queue queue = new Queue(5);
        assertThat(queue.peek()).isEmpty();
    }

    @Test
    void test_size_returns_zero_for_empty_queue() {
        Queue queue = new Queue(5);
        assertThat(queue.size()).isEqualTo(0);
    }

    @Test
    void test_size_returns_capacity_for_full_queue() {
        Queue queue = new Queue(3);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.dequeue();
        queue.enqueue(4);
        assertThat(queue.size()).isEqualTo(3);
    }

    @Test
    void test_size_for_half_full_queue() {
        Queue queue = new Queue(4);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.dequeue();
        queue.enqueue(4);
        queue.dequeue();
        assertThat(queue.size()).isEqualTo(2);
    }
}