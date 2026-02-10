class Area {
    int length;
    int breadth;

    void setdim(int l,int b){
        length=l;
        breadth=b;
    }
    void getArea(){
        int Area1=length*breadth;
        System.out.println("Area of rectangle is"+Area1);
    }
    
}
public class rect{
    public static void main(String args[]){
        Area a=new Area();
        a.setdim(10, 12);
        a.getArea();
    }
}
