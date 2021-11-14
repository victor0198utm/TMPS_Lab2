package Decorator.decorators;

import Decorator.abstractions.IOptions;

public abstract class Decorator implements IOptions
{
    protected IOptions component;
}
