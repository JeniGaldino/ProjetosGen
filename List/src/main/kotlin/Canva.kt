fun main(){

val x = 3
    val y = 5

for(i in 0..100 step 1){

if(i % x == 0) {
    println("Fizz")

}else if(i % y == 0){
        println("Buzz")

}else if(i % x == 0 && i % y == 0){
    println("FizzBuzz")

} else{
    println(i)
}
}}





