package junit;

public class TestAdd {
    public void add(){
        int val = 2+4;
        System.out.println("TestAdd.java : add : val : "+val);
    }
    
     public int add(int a, int b){
        int val = a+b;
        System.out.println("TestAdd.java : add 2 vals : val : "+val);
        return val;
    }
     
      public int multiply(int a, int b){
        int val = a*b;
        System.out.println("TestAdd.java : multiply 2 vals : val : "+val);
        return val;
    }
}
