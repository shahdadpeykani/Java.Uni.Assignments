public class Complex {
    double numb1;
    double numb2;
    public void ini(double x,double y){
        this.numb1=x;
        this.numb2=y;
    }
    public void print(){
        if(numb2>0){
            System.out.println(numb1+"+"+numb2+"i");
        }else{
            numb2=Math.abs(numb2);
            System.out.println(numb1+"-"+numb2+"i");
        }
    }
}
