package issue;

import org.eclipse.serializer.entity.Entity;

public interface Animal extends Beeing<Animal>, Entity
{
     String species();
}
