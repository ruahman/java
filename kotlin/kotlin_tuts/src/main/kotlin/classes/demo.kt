package classes

class Car {
    var brand = ""
    var model = ""
    var year = 0
}

class myClass {
    // Property (data member)
    private var name: String = "Tutorialspoint.com"

    // Member function
    fun printMe() {
        print("The best Learning website - " + name)
    }
}

class Car2(var brand: String, var model: String, var year: Int)

class Car3(var brand: String, var model: String, var year: Int) {
    // Class function
    fun drive() {
        println("Wrooom!")
    }

    // Class function with parameters
    fun speed(maxSpeed: Int) {
        println("Max speed is: " + maxSpeed)
    }
}

// Superclass
// Use the open keyword in front of the superclass/parent,
// to make this the class other classes should inherit properties and functions from.
open class MyParentClass {
    val x = 5
}

// Subclass
class MyChildClass: MyParentClass() {
    fun myFunction() {
        println(x) // x is now inherited from the superclass
    }
}

// Unlike a nested class, inner class can access members of the outer class.
// We cannot directly create an object of the inner class but it can be created using the outer class object.
class Outer {
    private val welcomeMessage: String = "Welcome to the TutorialsPoint.com"
    inner class Inner {
        fun foo() = welcomeMessage
    }
}

interface Human {
    fun think()
}

typealias User = Triple<String, String, Int>

fun userInfo(): User {
    return Triple("Zara","Ali",21)
}

// The primary constructor cannot contain any code.
// Initialization code can be placed in initializer blocks prefixed with the init keyword.
class Person (val _name: String, val _age: Int) {
    // Member Variables
    var name: String
    var age: Int

    // Initializer Block
    init {
        this.name = _name
        this.age = _age
        println("Name = $name")
        println("Age = $age")
    }
}

// Kotlin allows to create one or more secondary constructors for your class.
class Person2{
    // Member Variables
    var name: String
    var age: Int
    var salary:Double

    // First Secondary Constructor
    constructor ( _name: String, _age: Int) {
        this.name = _name
        this.age = _age
        this.salary = 0.00
        println("Name = $name")
        println("Age = $age")
    }

    // Second Secondary Constructor
    constructor ( _name: String, _age: Int, _salary: Double) {
        this.name = _name
        this.age = _age
        this.salary = _salary
        println("Name = $name")
        println("Age = $age")
        println("Salary = $salary")
    }
}

open class ABC {
    fun think () {
        println("Hey!! i am thiking ")
    }
}
class BCD: ABC(){ // inheritence happend using default constructor
}

open class ABC2 {
    open fun think () {
        println("Hey!! i am thinking ")
    }
}
class BCD2: ABC2() { // inheritance happens using default constructor
    override fun think() {
        println("I am from Child")
    }
}



// If you want to prohibit re-overriding it then you must make it final as follows
class BCD3: ABC2() {
    final override fun think() {
        println("I am from Child")
    }
}

open class ABC4 {
    open val count: Int = 0

    open fun think () {
        println("Hey!! i am thinking ")
    }
}
class BCD4: ABC4() {
    override val count: Int = 100

    override fun think() {
        println("I am from Child")
    }

    fun displayCount(){
        println("Count value is $count")
    }
}

class BCD5(override val count: Int = 400): ABC4() {

    override fun think() {
        println("I am from Child")
    }

    fun displayCount(){
        println("Count value is $count")
    }
}

open class Base {
    init{
        println("I am in Base class")
    }
}
open class Child: Base() {
    init{
        println("I am in Child class")
    }
}
class GrandChild: Child() {
    init{
        println("I am in Grand Child class")
    }
}

open class Base2() {
    open val name: String = "Base"
    open fun displayName(){
        println("I am in " +  this.name)
    }
}
class Child2(): Base2() {
    override fun displayName(){
        super.displayName()
        println("I am in " + super.name)

    }
}

open class Rectangle {
    open fun draw() { /* ... */ }
}

interface Polygon {
    fun draw() { /* ... */ } // interface members are 'open' by default
}

class Square() : Rectangle(), Polygon {
    // The compiler requires draw() to be overridden:
    override fun draw() {
        super<Rectangle>.draw() // call to Rectangle.draw()
        super<Polygon>.draw() // call to Polygon.draw()
    }
}

// A Kotlin abstract class is similar to Java abstract class which can not be instantiated.
// This means we cannot create objects of an abstract class.
// However, we can inherit subclasses from a Kotlin abstract class.
abstract class Person33 {
    var age: Int = 40

    abstract fun setAge()   // Abstract Method

    fun getFoobar(): Int {          // Non-Abstract Method
        return age
    }
}

interface ExampleInterface  {
    var myVar: Int            // abstract property
    fun absMethod():String    // abstract method

    fun hello() {
        println("Hello there, Welcome to TutorialsPoint.Com!")
    }
}
class InterfaceImp : ExampleInterface {
    override var myVar: Int = 25
    override fun absMethod() = "Happy Learning "
}

interface A {
    fun printMe() {
        println(" method of interface A")
    }
}
interface B  {
    fun printMeToo() {
        println("I am another Method from interface B")
    }
}

// implements two interfaces A and B
class MultipleInterfaceExample: A, B

private class PrivateExample {
    private val i = 1

    private fun doSomething() {
        println("flflf")
    }
}

open class AAA() {
    protected val i = 1

    protected fun doSomething(){
        println("Inside doSomething" )
        println("Value of i is $i" )
    }
}
class BB : AAA() {
    fun printValue(){
        doSomething()
        println("Value of i is $i" )
    }
}

// Kotlin extensions provide the ability to extend a class with new functionality
// without implementing the inheritance concept by a class or using design pattern such as Decorator.
// These extensions basically add some functionality in an existing class without extending the class.
class Alien {
    var skills : String = "null"

    fun printMySkills() {
        print(skills)
    }
}

fun Alien.addMySkills(a:Alien):String{
    var a4 = Alien()
    a4.skills = this.skills + " " +a.skills
    return a4.skills
}

fun String.countVowels(): Int{
    var vowels = 0
    for (i in 0.. this.length - 1) {
        val ch = this[i]
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            ++vowels
        }
    }
    return vowels;
}

class Temperature(var celsius: Float)

var Temperature.fahrenheit: Float
    get() = (celsius * 9 / 5) + 32
    set(value) {
        celsius = (value - 32) * 5 / 9
    }

// Kotlin provides another mechanism to implement static functionality of Java.
// This can be achieved using the companion object which is declared inside a class and marked with the companion keyword.
// Using this mechanism, we can create an object of a class inside a factory method and later we can just call
// that method using the reference of the class name.
class A6 {
    companion object {
        fun show():String {
            return("You are learning Kotlin from TutorialsPoint.com")
        }
    }
}

/// Data Class

// A Kotlin Data Class is used to hold the data only and it does not provide any other functionality apart from holding data.

data class Book(val name: String, val publisher: String, var reviewScore: Int)

//// Kotlin - Generics

class GenericsExample<T>(input:T) {
    init {
        println("I am getting called with the value " + input)
    }
}

//// Kotlin - Delegation

// Delegation means passing the responsibility to another class or method.

interface BBase {
    fun printMe() //abstract method
}
class BaseImpl(val x: Int) : BBase {
    override fun printMe() { println(x) }   //implementation of the method
}
class Derived(b: BBase) : BBase by b  // delegating the public method on the object b

//// Object
object Calculator {
    var total = 0
}

class Companion {
    companion object Counter {
        var count = 0
    }
}

class Animal {
    private val animalColor: String = "black"

    inner class Cat {
        fun catColor() = animalColor
    }
}

//// properties
class Customer {
    var name = "James"
        get(){
            println("Name getter is called")
            return field
        }
        set(value){
            println("$field, $value")
            field = value
        }
}


fun demo(){
    // Create a c1 object of the Car class
    val c1 = Car()

    // Access the properties and add some values to it
    c1.brand = "Ford"
    c1.model = "Mustang"
    c1.year = 1969

    println(c1.brand)   // Outputs Ford
    println(c1.model)   // Outputs Mustang
    println(c1.year)    // Outputs 1969

    val c2 = Car2("Ford", "Mustang", 1969)

    val c3 = Car3("Ford", "Mustang", 1969)

    // Call the functions
    c3.drive()
    c3.speed(200)

    val myObj = MyChildClass()
    myObj.myFunction()

    val obj = myClass() // Create object obj of myClass class
    obj.printMe() // Call a member function using object

    val obj2 = Outer().Inner()

    print(obj2.foo())

    //// Anonymous Inner Class
    var programmer :Human = object:Human { // Anonymous class
        override fun think() { // overriding the think method
            print("I am an example of Anonymous Inner Class ")
        }
    }
    programmer.think()

    //// Kotlin Type Aliases
    val obj3 = userInfo()

    print(obj3)

    //// init block
    val person = Person("Zara", 20)
    val nuha = Person2("Nuha", 12)
    val zara = Person2("Zara", 20, 2000.00)

    //// inheritance
    var  a = BCD()
    a.think()

    var  a2 = BCD2()
    a.think()

    var a3 = GrandChild()

    //// data class
    val original = Book("Kotlin", "Tutorials Point", 10)

    val copied = original.copy(reviewScore=5)

    val( name, publisher,reviewScore ) = copied

    println("Name = $name")
    println("Publisher = $publisher")
    println("Score = $reviewScore")

    //// generics
    var objet = GenericsExample<String>("JAVA")
    var objet1 = GenericsExample<Int>(10)

    //// delegate
    val b = BaseImpl(10)
    Derived(b).printMe() // prints 10 :: accessing the printMe() method

    // lazy
    val myVar: String by lazy {
        "Hello"
    }

    // The "class" keyword is used to declare classes.
    class ExampleClass(val x: Int) {
        fun memberFunction(y: Int): Int {
            return x + y
        }

        infix fun infixMemberFunction(y: Int): Int {
            return x * y
        }
    }

    /*
    To create a new instance we call the constructor.
    Note that Kotlin does not have a "new" keyword.
    */
    val fooExampleClass = ExampleClass(7)
    // Member functions can be called using dot notation.
    println(fooExampleClass.memberFunction(4)) // => 11

    /*
    Data classes are a concise way to create classes that just hold data.
    The "hashCode"/"equals" and "toString" methods are automatically generated.
    */
    data class DataClassExample (val x: Int, val y: Int, val z: Int)
    val fooData = DataClassExample(1, 2, 4)
    println(fooData) // => DataClassExample(x=1, y=2, z=4)

    // Data classes have a "copy" function.
    val fooCopy = fooData.copy(y = 100)
    println(fooCopy) // => DataClassExample(x=1, y=100, z=4)

    // Objects can be destructured into multiple variables.
    val (x, y, z) = fooCopy
    println("$x $y $z") // => 1 100 4

    // destructuring in "for" loop
    for ((x, y, z) in listOf(fooData)) {
        println("$x $y $z") // => 1 2 4
    }

    // The "with" function is similar to the JavaScript "with" statement.
    data class MutableDataClassExample (var xx: Int, var yy: Int, var zz: Int)
    val fooMutableData = MutableDataClassExample(7, 4, 9)
    with (fooMutableData) {
        xx -= 2
        yy += 2
        zz--
    }
    println(fooMutableData)

    /*
    Extensions are a way to add new functionality to a class.
    This is similar to C# extension methods.
    */
    fun String.remove(c: Char): String {
        return this.filter {it != c}
    }
    println("Hello, world!".remove('l')) // => Heo, word!

    //// Secondary Constructor

    class Animal(var name: String){
        var color: String = "red"

        constructor(name: String, color: String): this(name) {
            this.color = "green"
        }
    }

    //// object

    // sort of like static classes
    Calculator.total = 5
    Companion.Counter.count = 99


}