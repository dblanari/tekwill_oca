package api;

import java.util.List;
import java.util.Optional;

public interface Resource {
    static Resource valueOf(List<Resource> list, String resourceName) {
        Optional<Resource> op = list.stream()
                .filter(it -> it.resourceName().equals(resourceName))
                .findAny();
        return op.isPresent() ? op.get() : null;
    }

    String resourceName();
}
