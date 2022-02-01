class Testn1{
int color =10;
static int count =5;

void method1(){
    System.out.println("Instance method"+color);
}

static void method2(){
    System.out.println("Static method");
}

static void main(String[] args){
    System.out.println(count);
    //Test.//
    method2();

}



}