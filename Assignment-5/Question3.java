public class overload{
    static void print(){
        System.out.println("accepting null arguments");
    }
    static void print(int x){
        System.out.println("accepting integer value "+x);
    }
    static void print(float x){
        System.out.println("accepting float value "+x);
    }
    public static void main(String args[]){
        print();
        print(4);
        print(2.5f);
    }
}
