Car c = new SportsCar(); --> the reference variable is of the type Car, and the object it is referencing is of type SportsCar. Java upcasting was done internally: The object is now considered to be of the Car type.

SportsCar sc = (SportsCar) c; --> explicitly downcast the object to a SportsCar. The Car was downcasted when the Car object was wrapped as a SportsCar.

This is due to inheritance going one way. Meaning a SportsCar is a Car, but a Car is not necessarily a SportsCar. A Car can be a Volkswagen or an SUV, or a SportsCar.