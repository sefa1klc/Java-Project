class Bike{
    public String hız(int speedlimit){
       return "hızınız 50";
    }

}
class Honda extends Bike{

    @Override
    public String hız(int speedlimit) {
        return super.hız(speedlimit); 
    }
    
    
int speedlimit=150;
public static void main(String args[]){
Bike obj=new Honda();
System.out.println(obj.hız(50));//90
}
}

