import java.util.List;

public class ContainsValue {

    // O(N)
    public boolean ContainsValue(List<String> elements, String value)
    {
        for(var element : elements)
        {
            if (element == value) return true;
        }

        return false;
    }

}
