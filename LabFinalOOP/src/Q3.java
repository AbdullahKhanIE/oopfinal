class A{
    public void m(){

    }
    public void m1(){               //sol 2
        System.out.println(1);
    }

}

class B extends A{
    public void m1(){
        System.out.println(1);
    }

    public static void main(String[] args) {
        A a = new B();
        a.m1();        //sol 1 ((B)a).m1();
    }

}
