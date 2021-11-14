package Decorator;

import Decorator.abstractions.IOptions;

/*
 * Plain object class.
 */
public class ConcreteComponent implements IOptions
{
    @Override
    public void optionsList()
    {
        System.out.println("Body color: gray, red, blue");
    }
}
