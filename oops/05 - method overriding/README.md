# Method Overriding

## Definition

Method Overriding allows a child class to provide its own implementation of a method already present in the parent class.

## Why?

Different child classes may perform the same action differently.

## Rules

- Same method name
- Same parameters
- Same return type (or covariant)
- Cannot reduce visibility

## Key Point

The child method replaces the parent's implementation.

No polymorphism is demonstrated here because we directly create a Student object.

## Real World

Person -> work()

Student -> study()

Teacher -> teach()
