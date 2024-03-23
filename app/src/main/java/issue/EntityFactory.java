package issue;

import org.eclipse.serializer.entity.EntityVersionCleaner;

public final class EntityFactory
{
    final static JulLogger                     logger  = new JulLogger();
    final static EntityVersionCleaner<Integer> cleaner = EntityVersionCleaner.AmountPreserving(10);

//    public static AddressCreator AddressCreator()
//    {
//        return addLayers(AddressCreator.New());
//    }
//
//    public static AnimalCreator AnimalCreator()
//    {
//        return addLayers(AnimalCreator.New());
//    }
//
//    public static HumanCreator HumanCreator()
//    {
//        return addLayers(HumanCreator.New());
//    }
//
//    public static PetCreator PetCreator()
//    {
//        return addLayers(PetCreator.New());
//    }
//
//    private static <E extends Entity, C extends Entity.Creator<E, C>> C addLayers(final C creator)
//    {
//        return creator
//                .addLayer(logger)
//                .addLayer(EntityVersionContext.AutoIncrementingInt(cleaner))
//                ;
//    }

    private EntityFactory()
    {
    }
}
