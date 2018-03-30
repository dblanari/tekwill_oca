package api;

public interface Authorization {
    boolean hasAccess(Resource resource);
}
