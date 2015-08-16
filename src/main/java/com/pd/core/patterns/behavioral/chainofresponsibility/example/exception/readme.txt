As the name suggests, the chain of responsibility pattern creates a chain of receiver objects for a request. 
This pattern decouples sender and receiver of a request based on type of request. This pattern comes under behavioral patterns.

In this pattern, normally each receiver contains reference to another receiver. If one object cannot handle the request then 
it passes the same to the next receiver and so on.

Implementation
We have created an abstract class AbstractLogger with a level of logging. Then we have created three types of loggers extending 
the AbstractLogger. Each logger checks the level of message to its level and print accordingly otherwise does not print and pass 
the message to its next logger.


Step 1
		Create an abstract logger class.
		AbstractLogger.java


Step 2
		Create concrete classes extending the logger.
			ConsoleLogger.java
			ErrorLogger.java
			FileLogger.java


Step 3
		Create different types of loggers. Assign them error levels and set next logger in each logger. Next logger in each logger represents the part of the chain.
		ChainPatternDemo.java


Step 4
		Verify the output.