import java.util.Scanner;
class watermelon{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int weight=sc.nextInt();
if(weight%2==0){
int mid=weight/2;
int num1=0;
int num2=weight;
for(int i=1;i<=mid;i++){
if(i==mid) {
System.out.println("combo " +": "+mid +","+mid);
	}
else {
 num1=num1+1;
num2=num2-1;
System.out.println("combo " +": "+num1 +","+num2);
System.out.println("comb0 " +": "+num2 +","+num1);
}}
}
else{
System.out.println("no watermellon ");
}}}