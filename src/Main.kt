class Employee(){

    var input:String = "";
    constructor(input: String) : this() { //Seccondary
    }
    fun employeePrint(){
        println("employee")
    }

    companion object{
        fun add(a:Int,b:Int){
            val result = a+b;
            println("result := " + result);
        }
    }
}

class EmployeeName(val name:String){ // Primary
    fun employeePrint(){
        val changeName:String = name+" has change";
        println("employee name : " + name)
        println("employee change name : " + changeName)
    }
}

data class Account(var name:String, var age:String){// Bean
    fun test1(){
        println("${name} , ${age}")
    }
}

fun main() {
    println("Hello World!")
    chapter1Print("Test print parameter");
    println(chapter2FuntionReturn("Test chapter 2 : "));
    Employee().employeePrint();
    EmployeeName("wow").employeePrint();
    chapter4Loop();
    // var can change value , val can't change value
    chapter7Nullable();
    chapter9Switch();
    Employee.add(1,2); // Companion Object, status method
    Chapter17Destructure()
}

fun chapter1Print(input:String){
    println("${input}");
}

fun chapter2FuntionReturn(input:String) : String{
    val result:String = "return";
    return input+result;
}

fun chapter4Loop() {
    val list = ArrayList<String>()
    list.add("1");
    list.add("2")
    print("For each size : " + list.size)
    for (item in list) {
        print(item + ", ")
    }
    println();
    print("For count : ")
    for (i in 0..list.size) {
        print(i)
    }
    println();
}

fun chapter7Nullable(){
    var a:Int? = 1;
    a = null;
    println("nullable : " + a);
}

fun chapter9Switch(){
    val position = 1;
    print("swith : ")
    when(position){
        0 -> {
            print("0");
        }
        1 -> {
            print("1")
        }
    }
    println()
}

fun Chapter17Destructure(){

    val employee = Account("Hello","41")

    println("employee :  ${employee}")

    val(name, age) = employee
    println("emplyoee name : ${name} and age ${age}")
}