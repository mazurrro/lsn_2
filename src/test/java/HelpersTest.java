import org.example.Helpers;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;
import java.util.List;

public class HelpersTest {
    List<Integer> list = new ArrayList<>();

    @Before
    public void add(){
        list.addAll(List.of(1, 2, 10, 7, 5, 3, 6, 6, 13, 0));
    }

    @Test
    public void testGetPairs() {
        List<int[]> pairs = Helpers.getPairs(list);
        List<Integer> firstIndexes = getFirstIndexes(pairs);
        Assertions.assertEquals(4, pairs.size());
        Assertions.assertEquals(List.of(0, 3, 6, 6), firstIndexes);
    }

    private List<Integer> getFirstIndexes(List<int[]> pairs) {
        return List.of(pairs.get(0)[0],pairs.get(1)[0], pairs.get(2)[0], pairs.get(3)[0]);
    }

}
