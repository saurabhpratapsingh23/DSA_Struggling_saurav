class Tri{

    public int ang(int n){

        // if(n==0)return 0;

for(int i = 1; i <=n ; i++){
    for(int j = 1; j<=i ; j++){
        System.out.print("*");
    }
    System.out.println();
}
return n;
    } 
}

class pattern1{
    public static void main(String[] args){
        Tri pat = new Tri();
        int res = pat.ang(5);
        System.out.println(res);


    }
}