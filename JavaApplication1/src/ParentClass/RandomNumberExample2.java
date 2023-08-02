package ParentClass;

class ParentClass{

    public ParentClass() {
        System.out.println("ParentsClass constructor");
    }
    void disp(){
        System.out.println("Parent method");
    }
    
}

class example extends ParentClass{
    
    public example(){
        System.out.println("example constructor");
    }
    
    @Override
    public void disp(){
        
        System.out.println("alt sınıftaki fonksiyon");
        
        super.disp();
    }
    
    public static void main(String[] args) {
        example obj = new example();
        obj.disp();
    }
}


