# Structural Design Patterns


## Author: Caragiu Victor

----

## Objectives:

* Get familiar with the Structural DPs;
* Choose a specific domain;
* Implement at least 3 SDPs for the specific domain;


## Used Design Patterns: 

* Adapter
* Decorator
* Facade


## Implementation

* About 2-3 sentences to explain the implementation.

For the adapter pattern, I have 2 different types of batteries. The 2019 type battery contains info about its capacity directly in Wh, but the 2020 model' capacity should be computed. For that I overridden the getWh() method. 
<image src="/examples/Adapter.png"><br/>

I used the decorator pattern to add new properties to a class and overridden the function that shows the class properties.
```
@Override
    public void optionsList()
    {
        this.component.optionsList();
        System.out.println(luxuryOptions);
    }
```
<image src="/examples/Decorator.png"><br/>

For the facade pattern, I implemented different methods to get some specific items, in this case 3 methods, for listing civil, industrial and all car models. And the facade class has members which contain the data separately.
<image src="/examples/Facade.png"><br/>
