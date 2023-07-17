public class Box {
    private int width;
    private int length;
    private int height;
    public void ini(int w,int l,int h){
        this.width=w;
        this.length=l;
        this.height=h;
    }
    public void print(){
        System.out.println("The volume of box is: "+width*height*length);
        if(width==length&&length==height){
            System.out.println("It's a Cube");
        }else{
            System.out.println("It's a Cuboid");
        }
    }
}
