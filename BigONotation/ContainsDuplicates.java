import java.util.List;

public class ContainsDuplicates {

    // O(N^2)
    public boolean ContainsDuplicates(List<String> elements)
    {
        for (var outer = 0; outer < elements.size(); outer++)
        {
            for (var inner = 0; inner < elements.size(); inner++)
            {
                // Don't compare with self
                if (outer == inner) continue;

                if (elements.get(outer) == elements.get(inner)) return true;
            }
        }

        return false;
    }
}
