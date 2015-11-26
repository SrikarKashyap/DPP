package puzzles;

import org.junit.Test;
import utils.Node;

import java.util.Arrays;

import static puzzles.EvenOddMergeLinkedList.evenOddMerge;

public class EvenOddMergeLinkedListTest {

    @Test
    public void testEvenOddMerge() throws Exception {
        assert evenOddMerge(new Node(new int[]{1})).toList().equals(Arrays.asList(1));
        assert evenOddMerge(new Node(new int[]{1, 2})).toList().equals(Arrays.asList(1, 2));
        assert evenOddMerge(new Node(new int[]{1, 2, 3})).toList().equals(Arrays.asList(1, 3, 2));
        assert evenOddMerge(new Node(new int[]{1, 2, 3, 4})).toList().equals(Arrays.asList(1, 3, 2, 4));
        assert evenOddMerge(new Node(new int[]{1, 2, 3, 4, 5})).toList().equals(Arrays.asList(1, 3, 5, 2, 4));
    }
}