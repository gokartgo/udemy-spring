package com.luv2code.springboot.cruddemo.entity

import javax.persistence.*

@Entity
@Table(name="employee")
class Employee {
    // define fields
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private var id:Int ?= null

    @Column(name="first_name")
    private var firstName:String ?= null

    @Column(name="last_name")
    private var lastName:String ?= null

    @Column(name="email")
    private var email:String ?= null

    // define constructors

    public constructor() {
    }

    public constructor(firstName: String, lastName: String, email: String) {
        this.firstName = firstName
        this.lastName = lastName
        this.email = email
    }

    // define getter/setter

    // define tostring
    override fun toString(): String {
        return "Employee(id=$id, firstName=$firstName, lastName=$lastName, email=$email)"
    }
}