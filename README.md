# ManagerEmployeeOOPexercise
Java bootcamp exercise for classes, subclasses, constructors, calling methods, and overriding methods.

[Exercise instructions](https://drive.google.com/file/d/15W4H8WAdoKRSz7GTDpbWXPhoB-TSbhDv/view)

## Explanation
- Super class `Employee` constructs an Employee with methods `calculateSalary()` and `calculateTransportAllowance()`.
- Child classes `Trainee` and `Manager` extend the class `Employee`
- `Manager` overrides the `Employee` method `calculateTransportAllowance()` to provide a larger cut of the base salary, while `Trainee` still uses the parent class's method.

## Usage
run `InheritanceActivity.java`

output:
```
Peter (manager) salary: 878345.0
Peter (manager) transport allowance: 9750.0
Carlos (trainee) transport allowance (same salary as Peter): 6500.0
Jack (trainee) salary: 608085.0
Jack (trainee) transport allowance: 4500.0
```
