package DataVisitor;

import java.util.Map;

public interface DataElement {
    public Map access(DataElementsVisitor vis);
}
