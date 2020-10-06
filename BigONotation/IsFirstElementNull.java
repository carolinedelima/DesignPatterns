import java.util.List;

public class IsFirstElementNull {

    // O(1)
    boolean IsFirstElementNull(List<String> elements)
    {
        return elements.get(0) == null;
    }
}
