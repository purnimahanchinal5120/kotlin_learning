/*// my first kotlin code
fun main() {
    println("Hello!")
}*/

/*Write a program that declares:
Your name
Your age
Your city
Your profession
Print them in a meaningful sentence.*/

/*fun main() {
    var name = "purnima"
    var age = 25
    var city = "Hubli"
    var profession = "Android and IOS Developer"
    println("Hey I'am $name, my age is $age, I live in $city, I work as an $profession")
}*/

/*fun main () {
    val a = 25
    val b = 5
    println(a + b)
    println(a - b)
    println(a * b)
    println(a / b)
    println(a % b)
}*/

/*Declare length and width.
Calculate:
Area = length × width
Perimeter = 2 × (length + width)*/

/*fun main () {
    var length = 10
    var width = 20
    var Area = length * width
    var Perimeter = 2 * (length + width)
    println("Perimeter: $Perimeter and Area: $Area")
}*/

/*Convert Celsius to Fahrenheit.
Formula:

F=(C x 9/5)+32
Use a Celsius value of your choice.*/

/*fun main(){
    var C = 108
    var F = (C * 9/5) + 32
    println(F)
}*/

/*
val firstName = "Purnima"
val lastName = "Hanchinal"
Print:
Full name
Number of characters in your first name
Your name in uppercase
Your name in lowercase
*/

/*fun main(){
    val firstName = "Purnima"
    val lastName = "Hanchinal"
    println("Fullname : $firstName $lastName")
    println(firstName.length)
    println(firstName.uppercase())
    println(firstName.lowercase())
}*/

/*
Declare:
Basic salary = ₹30,000
HRA = ₹5,000
Allowance = ₹3,000
Deduction = ₹2,000
Calculate gross salary and net salary.
*/

/*fun main(){
    var Basicsalary = 30000
    var HRA = 5000
    var Allowance = 3000
    var Deduction = 2000
    var gross_salary = Basicsalary + HRA + Allowance
    var net_Salary = gross_salary - Deduction
    println("The final gross salary is $gross_salary and net salary is $net_Salary")
}*/

/*
Create variables for:
Employee name
Employee ID
Salary
Is employee active?
Use the correct Kotlin datatypes.
Print all the information.
*/

/*fun main(){
    var employee_name : String = "Purnima Hanchinal"
    var employee_id : Int = 15
    var salary : Double = 35000.0
    var emp_active : Boolean = true
    println("The employee $employee_name with employee_id $employee_id and salary $salary is active ($emp_active)."
    )
}*/

/*
Create two Boolean variables:
val isLoggedIn = true
val isVerified = false
Print the results of:
isLoggedIn && isVerified
isLoggedIn || isVerified
!isLoggedIn
!isVerified
*/

/*fun main(){
    val isLoggedIn = true
    val isVerified = false
    println(isLoggedIn && isVerified)
    println(isLoggedIn || isVerified)
    println(!isLoggedIn)
    println(!isVerified)
}*/

/*
Declare:
Product name
Product price
Quantity
Discount percentage
Calculate the total price before discount and after discount.
*/

/*
fun main(){
    var product_name = "hair dryer"
    var product_price = 1500
    var quantity = 5
    var discount_percentage = 20
    var total_beforedis = product_price * quantity
    var dis_amount = total_beforedis*discount_percentage/100
    var total_afteredis = total_beforedis - dis_amount
    println("The total price of the product $product_name before discount is $total_beforedis and after discount is $total_afteredis")
}
*/

/*
Create an integer variable:
val number = 100
Convert it into:
Double
Float
String
Print each value.
*/

/*fun main(){
    val number = 100
    println(number.toDouble())
    println(number.toFloat())
    println(number.toString())
}*/

/*fun main() {
    val a = "Kotlin"
    val b = "Kotlin"
    val c = "java"

    println(a == b)
    println(a === b)
    println(a === c)
}*/

fun main(){
    val number = 100
    val decimal = number.toDouble()
    println(decimal)
}








