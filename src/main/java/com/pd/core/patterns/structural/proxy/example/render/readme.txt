In proxy pattern, a class represents functionality of another class. This type of design pattern comes under structural pattern.

In proxy pattern, we create object having original object to interface its functionality to outer world.

Implementation
We are going to create an Image interface and concrete classes implementing the Image interface. ProxyImage is a a proxy class to reduce memory footprint of RealImage object loading.

ProxyPatternDemo, our demo class, will use ProxyImage to get an Image object to load and display as it needs.





Implementation
We are going to create an Image interface and concrete classes implementing the Image interface. 
ProxyImage is a a proxy class to reduce memory footprint of RealImage object loading.

ProxyPatternDemo, our demo class, will use ProxyImage to get an Image object to load and display as it needs.

Proxy Pattern UML Diagram

Step 1
		Create an interface.
		
		Image.java

Step 2
		Create concrete classes implementing the same interface.
		
		RealImage.java
		ProxyImage.java

Step 3
		Use the ProxyImage to get object of RealImage class when required.
		
		ProxyPatternDemo.java

Step 4
		Verify the output.