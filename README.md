GeDA Spring Integration Auto Discovery
================================================

Allows your annotated dto's and entities to be auto discovered and registered within DTOFactory.

Example
------
1. Add DTOFactory bean. It takes variable of base packages on its constructor.
2. Annotate your dtos and entities
3. ???
4 PROFIT

````xml
	<bean id="dtoFactory" class="io.github.mklew.geda.autodiscovery.AutoDiscoveryDTOFactoryImpl">
        <constructor-arg>
            <value>io.github.mklew.geda.autodiscovery</value>
        </constructor-arg>
    </bean>
````

````java
	@Dto
	@RegisterAs("dtoKey")
	class Dto {

    }
````

````java
	@RegisterAs("entityKey")
	class Entity {

    }
````

Now you can use entity and dto keys to assemble dtos and entites.

Optional @RepresentAs annotation
------------------------
If you use interfaces for your entities you can use @RepresentAs annotation to specify that interface. It will be used as 'best representation of entity' according to DTOFactory javadocs.

````java
	@RegisterAs("entityKey")
	@RepresentAs(Entity.class)
	class EntityImpl {

    }
````

Developers
------------
Marek Lewandowski


License MIT
---------

Copyright (C) 2013 Marek Lewandowski

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.