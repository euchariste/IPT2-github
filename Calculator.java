public class Calculator {
public static int add(int a, int b) {
return a+b; }
public static int subtract(int a, int b) {
return a-b; }
public static int multiply(int a, int b) {
return a*b; }
public static int divide(int a, int b){
return a/b; }
public static int modulus(int a, int b){
return a%b; }
public static void main(String[]args){
System.out.println(Simple Calculator: );
System.out.println(Addition:  +add(5,3));
System.out.println(Subtraction: +subtract(5,3));
System.out.println(Multiplication: +multiply(5,3));
System.out.println(Division: +divide(5,3));
System.out.println(Modulus: +modulus(5,3)); }}

