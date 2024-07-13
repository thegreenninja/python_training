function start(){
    //Write your code here
    var holiday = readBoolean("Is today a holiday? ");
holiday = !holiday;
var weekday = readBoolean("Is today a weekday? ");
var school = holiday || weekday;
println("Holiday: " + school);
}