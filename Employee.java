package com.company;

public class Employee {
    public static void emlpoyee(String args[]) {}
        private int id;
        private String firstName;
        private String lastName;
        private int salary;

    public Employee( int id, String firstName, String lastName,int salary){
            this.id = id;
            this.firstName = firstName;
            this.lastName = lastName;
            this.salary = salary;
        }

        public int getID () {
            return id;
        }

        public String getFirstName () {
            return lastName;
        }

        public String getLastName () {
            return lastName;
        }

        public int getSalary () {
            return salary;
        }

        public String getName () {
            return firstName + lastName;
        }

        public int getAnnualSalary () {
            return salary * 12;
        }

        public int raiseSalary ( int percent){
            return salary + salary * percent;
        }

        public void SetSalary ( int salary){
            this.salary = salary;
        }

        public String toString () {
            return "Employee[id =" + getID() + "name =" + getName() + "salary =" + getSalary() + "]";
        }
    }
