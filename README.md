# TMPS_patterns
#LAB 1 : Creational
-Builder pattern
For this patern i've chosen to create a lunchOrder object which can be made in different ways using static inner class Builder. To see the example run LunchOrderDemo class.

-Factory pattern
For this pattern i though to create a equivalence of a website generator to get a bunch of canned pages to beggin with. So in a few word i've created two types of websites a Shop and a Blog class which extends Website abstract class. So that in WebsiteFactory class, depending on the type of website we are creating a new instance of website through createWebsite(). To demonstrate this run FactorryDemo class.

-Prototyoe pattern
To demonstrate this, I though that it would be very costly for a company like Amazon to create a new object for every itme they have in their page. Therefore i've create a Item class which has some basic fields and it implements Cloneable, it is being extended by Movie and Book. 
In the PrototypeDemo class i've created an registry , movie and a book which are basically excecuting clone method without using the keyword "new" anymore. which is a lot lighter instantiation way though getting a unique instance every time.
Run PrototypeDemo to see the example.

#Lab 2 : Structural
-Adapter pattern
For this eample I've built a list of employees that I'm gonna obtain from two different data sources(database and ldap). I have a Employee interface which is being implemented by EmployeeDb. The problems comes that EmployeeLdap doesnt implement it and it has slightly differently fields. So in order to fix this i used an adapter to store employee in the list (EmployeeAdapterLdap).
Run AdapterDemo to see the example.

-Composite pattern
To show this eample, I've created a basic menu which icludes other menues(menu with submenues). To facilitate this the abstract class MenuComponent was created. The Menu and menuItem extends it in order to iterate through the tree structure and handle child object structure the same way as its own leaf.
Run CompositeMenuDemo to see the example.
 
-Decorator pattern
To make use of this pattern, I've thought of building a sandwich. So as we are making our sanwich we are apending more ingrediends to it(DressignDecorator, MeatDecorator, DressingDecorator) through our composition.
Run DecoratorSanwichDemo to see the example.


