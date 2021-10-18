public class JavaMethodChallange {
    
        static void myMethod(int nilai) {
      
            if(nilai< 90){
                System.out.println(" Nilai Anda: E");
            } else if ( nilai < 50){
                System.out.println("Nilai Anda: D");
            } else if ( nilai < 75){
                System.out.println("Nilai Anda: C");
            } else if ( nilai < 90){
                System.out.println("Nilai Anda: B");
            } else if (nilai < 100){
                System.out.println("Nilai Anda: A");   
            } else if (nilai> 100) {
                System.out.println("Invalid Number");
               
            } 
        }  
      
        public static void main(String[] args) {
          myMethod(80);
          return;
         
        }
    }
