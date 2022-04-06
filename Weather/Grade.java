public class Grade{
   public void main(double grade)
   
   {
       if( grade<0.0 || grade>100.0){
           System.out.println("Invalid");
    }
    else if( grade>=90.0){
        System.out.println("A");
    }
    else if(grade>=80.0){
        System.out.println("B");
    }
    else if(grade>=70.0){
        System.out.println("C");
    }
    else if( grade>=60.0){
        System.out.println("D");
    }
    else if(grade<60.0){
        System.out.println("F");
    }
}
}