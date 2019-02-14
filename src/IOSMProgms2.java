class Animal{
    public void sleep(){
        System.out.println("Animal is sleepling");
    }
    public void breath(){
        System.out.println("Animal is breathing");
    }
    public void eat(){
        System.out.println("Animal is eating");
    }
}




class tiger extends Animal{
    
    @Override
    public void eat(){
        
        System.out.println("Tiger eats by hunting");
    }
    public void size(){
        System.out.println("Tiger size is very huge");
    }
}

class deer extends Animal{
    
    @Override
    public void eat(){
        System.out.println("Deer eats by grazing");
    }
    public void size(){
        
        System.out.println("Deer size is relatively Medium");
    }
}

class monkey extends Animal{
    
    @Override
    public void eat(){
        System.out.println("Monkey eats always by stealing");
    }
    public void size(){
        
        System.out.println("Monkey size is relatively small");
    }
}
 class IOSMProgms2 {
    
    public static void main(String[] args){
        
        tiger t = new tiger();
        deer d = new deer();
        monkey m = new monkey();
        
        
        t.eat();
        t.sleep();
        t.size();
        t.breath();
        
        System.out.println();
        
        
        d.eat();
        d.sleep();
        d.size();
        d.breath();
        
        System.out.println("");
        
        
        m.eat();
        m.sleep();
        m.size();
        m.breath();
    }
}

