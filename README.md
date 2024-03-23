
# Issue #28553

This project uses 2 annotation processor:

- [Entity codegen](https://docs.eclipsestore.io/manual/misc/layered-entities/configuration.html) with [source code here](https://github.com/eclipse-serializer/serializer/tree/main/codegen/entity/src/main/java/org/eclipse/serializer/codegen/entity).

- [Wrapper](https://docs.eclipsestore.io/manual/misc/wrapping/configuration.html) with [source code here](https://github.com/eclipse-serializer/serializer/tree/main/codegen/wrapping/src/main/java/org/eclipse/serializer/codegen/wrapping).

Run this, for example:

> ./gradlew assemble

What you will see is the Wrapper processor works, but the Entity Codegen does not get picked up by Gradle 8.7 - you can see the partially 
generated code in ```build/generated/sources/annotationProcessor```

This seems like an issue with the anotation processor configurations! The annotation processor are known to work with Maven and well documented.
