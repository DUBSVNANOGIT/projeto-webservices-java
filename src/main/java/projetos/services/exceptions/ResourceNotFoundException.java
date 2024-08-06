package projetos.services.exceptions;

public class ResourceNotFoundException extends RuntimeException{
    private static final long serialVersionULD = 1L;

    public ResourceNotFoundException(Object id) {
        super("Resource Not Found. Id " + id);
    }
}
