package com;



class Student
{
  int age;
  String name;
  Student(int age ,String name)
  {
    
   
   
     System.out.println(this.age +" "+ this.name);
     this.age=age;
     this.name =name;
    System.out.println(this.age +" "+ this.name);
   
   // System.out.println(s.age +" "+s.name);
   
    
  }
  public static void main (String[] args) {
   // System.out.println(age +" "+ name);
   Student s=new Student(20,"Dip");
    //System.out.println(s.age +" "+s.name);
    
  }
}