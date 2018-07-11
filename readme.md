This project demonstrates a more correct way to go about using
Cucumber the correct way with Selenium to accomplish user interface
testing.

In particular, the following is demonstrated:

- Declarative and Expressive Gherkin.  When you’re writing Cucumber features, 
you have to be very careful to make readability your main goal. Otherwise, a 
reader can easily feel more like they’re reading a computer program than a 
specification document, which is something we want you to try to avoid at all 
costs. After all, if your features aren’t easy for non-programmers to read, you 
might as well just be writing your tests in plain old code. Some of this has to
do with being expressive with the use of domain language.  And some of this has to
with saying why and what, and hiding the hows of testing for developers exclusively.
- Page Objects: The use of object oriented concepts will make your test code less 
fragile.  And, your code will be more maintainable.  This code, while not perfect by
any means, demonstrates the use of Open/Closed principles, Factory Method patterns, 
and some Single Responsibility principles.  Along with good old fashion object 
hierarchies.  Thinking less imperatively and more declaratively in your code has huge
benefits in terms of readability!
- Selenium fluentWaits.  Way too much testing code includes hard Thread.Sleep(xxx) 
waits coded directly inline.  This is done to allow non-deterministic client test to 
out of band broswer code to synchronize.  Unhappily, no matter how big of a wait you 
code, one day, you will find that it wasn't enough.  Furthermore, your test code will 
now always run as slowly as the sum of all the waits!  fluentWaits are the solution.  
- Informative Builds.  We need to transition away from project plans, estimation, and 
tracking actuals against estimates to plan projects better.  And, we need better ways 
of knowing exactly what fails in regression suites, so we can zero in on improving our 
code where it's needed.  Better automated reporting is what's called for!