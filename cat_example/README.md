# (15 pts). Draw the class diagram for the following problem.

Assume that you have access to a class Cat. This class is Observable, i.e. it has every element described in the Observer pattern. The class Cat has a variable name and a getter method getName(). The class cat notifies observers when information is available (i.e., the Cat needs something). The class has a method needSomething().

a) Create a class, Person. Make Person an Observer. When a person is notified of an event happening in the Cat that the Person is observing, print a message on the screen with the name of the Cat (remember you have access to a getter method getName().

b) In another class (any name is OK), create a main method. In the main method, create an object Cat, create an object Person, and connect them as an observer and observable (Person is observing Cat).