package issue;

import org.eclipse.serializer.entity.Entity;

public interface Human extends Beeing<Human>, Named, Entity
{
     Address address();
}
