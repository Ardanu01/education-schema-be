import java.io.PrintStream;

class test1 {

 public static String test(int angka) {
        if ((angka == 5) && (angka == 11)){
            return " FizzBuzz";
        } else if (angka == 5){
            return " fizz";
        } else if (angka == 11){
            return " buzz";
        } else {
            return " "+angka;
        }
    }
public static void main(String[] args){
    int i;
    for (i = 1; i <= 200; i++){
        test(i++);
    }
}
}

