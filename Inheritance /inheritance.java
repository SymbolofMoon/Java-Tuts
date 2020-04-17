

class Add{
  int n1,n2,result;
  public void sum(){
      result= n1+n2;
  }

}

class Inheritance{

    public static void main (String ... args){
       AddSubMu obj = new AddSubMu();
       obj.n1=5;
       obj.n2=4;
       obj.sum();
       System.out.println(obj.result);
       obj.sub();
       System.out.println(obj.result);
       obj.mul();
       System.out.println(obj.result);


    }
}

class AddSub extends Add{//single level inheritance
    

  public void sub(){
    result= n1-n2;
  }
}

class AddSubMu extends AddSub{//Multi level inheritance
    

    public void mul(){
      result= n1*n2;
    }
  }