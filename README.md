# TMPS_patterns
<br />
**#LAB 1 : Creational**

-Builder pattern

For this patern i've chosen to create a lunchOrder object which can be made in different ways using static inner class Builder. To see the example run LunchOrderDemo class.

-Factory pattern

For this pattern i though to create a equivalence of a website generator to get a bunch of canned pages to beggin with. So in a few word i've created two types of websites a Shop and a Blog class which extends Website abstract class. So that in WebsiteFactory class, depending on the type of website we are creating a new instance of website through createWebsite(). To demonstrate this run FactorryDemo class.

-Prototyoe pattern

To demonstrate this, I though that it would be very costly for a company like Amazon to create a new object for every itme they have in their page. Therefore i've create a Item class which has some basic fields and it implements Cloneable, it is being extended by Movie and Book. 
In the PrototypeDemo class i've created an registry , movie and a book which are basically excecuting clone method without using the keyword "new" anymore. which is a lot lighter instantiation way though getting a unique instance every time.
Run PrototypeDemo to see the example.

<br />
**#Lab 2 : Structural**
<br />
-Adapter pattern

For this eample I've built a list of employees that I'm gonna obtain from two different data sources(database and ldap). I have a Employee interface which is being implemented by EmployeeDb. The problems comes that EmployeeLdap doesnt implement it and it has slightly differently fields. So in order to fix this i used an adapter to store employee in the list (EmployeeAdapterLdap).
Run AdapterDemo to see the example.

-Composite pattern

To show this eample, I've created a basic menu which icludes other menues(menu with submenues). To facilitate this the abstract class MenuComponent was created. The Menu and menuItem extends it in order to iterate through the tree structure and handle child object structure the same way as its own leaf.
Run CompositeMenuDemo to see the example.
 
-Decorator pattern

To make use of this pattern, I've thought of building a sandwich. So as we are making our sanwich we are apending more ingrediends to it(DressignDecorator, MeatDecorator, DressingDecorator) through our composition.
Run DecoratorSanwichDemo to see the example.

<br />
**Lab 3 : Behavioral**
<br />
-Chain of Responsability pattern

To demonstrate this pattern I've implemented a real world example. I added a director, a VP and a CEO.
For purchase approvals, it has to go through that hierarchy. There's certain things that a director can approve.
But when it gets to a certain dollar amount or a certain type of purchase, a VP can approve. And then if it's above that,
only a CEO can approve.
So as a director, my successor is the VP, Crystal and Crystal. As a VP, the successor is the CEO and that is Jeff. All of them: director, VP and CEO 
are going to inherit from the handler. It has a successor and then it has a method for handling the request.
To see the demo, run ChainOfResponsibilityDemo class.

-Command pattern

To demonstrate this pattern, I've created a light which is the receiver, a swithcer which is the invoker, and then a command to flip the light on and off.
To see the demo, run CommandDemo class.

-Memento pattern

To demonstrate this pattern I've added Employee as a originator with the option to save and revert employee.Also there is EmployeeMemento as the actual memento
where we can set the state through the actual constructor and get from get methods.
To see the demo run MementoDemo class.
