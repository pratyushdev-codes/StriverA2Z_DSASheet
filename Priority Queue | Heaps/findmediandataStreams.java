// public class findmediandataStreams {
    
// }



import java.util.PriorityQueue;
import java.util.Collections;

class MedianFinder {
    private PriorityQueue<Integer> left;
    private PriorityQueue<Integer> right;

    public MedianFinder() {
        left = new PriorityQueue<>(Collections.reverseOrder());
        right = new PriorityQueue<>();
    }

    public void addNum(int num) {
        if (left.size() == right.size()) {
            right.add(num);
            left.add(right.poll());
        } else {
            left.add(num);
            right.add(left.poll());
        }
    }

    public double findMedian() {
        if (left.size() == right.size()) {
            return (left.peek() + right.peek()) / 2.0;
        } else {
            return left.peek() * 1.0;
        }
    }
}



// class MeadinFinder


// public MedianFinder()

// public void addNum

// public double findMedian()