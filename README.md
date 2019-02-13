### Modify your car application: Allow the user to create cars

Modify your car app so that it contains an ArrayList of cars. You will do this by adding the following line of code to your car app:

```
ArrayList<Car> cars = new ArrayList<>();
```
 

Now get input from the user to create a car. The input from the user should prompt for the characteristics of the car and create the object using those inputs.

Next add the car object to the arraylist as follows:

```
Car car = new Car();

//prompt from user and populate car class

//add car to the cars arraylist

cars.add(car);

//Finally, use an enhanced for loop to display all the cars.

for(Car car: cars){
    System.out.println(car.getDescription());
}
```
