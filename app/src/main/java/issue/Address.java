package issue;

import org.eclipse.serializer.entity.Entity;

public interface Address extends Entity{
     String street();
     String city();
     String zipCode();
}
