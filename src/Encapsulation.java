class EncapTest{
    private String name;
    private String idNum;
    private int age;
    
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setIdNum(String idNum){
        this.idNum = idNum;
    }
    
    public void setAge(int age){
        this.age = age;
    }
    
    public String GetName(){
        return name;
    }
    
    public String GetIdNum(){
        return idNum;
    }
    
    public int GetAge(){
        return age;
    }
}





public class Encapsulation {

    public static void main(String[] args) {
        EncapTest encap = new EncapTest();
        encap.setName("Aadhil");
        encap.setAge(20);
        encap.setIdNum("120N");
        
        
        System.out.println(encap.GetName());
        System.out.println(encap.GetIdNum());
        System.out.println(encap.GetAge()) ;
        
        
    }
    
}
