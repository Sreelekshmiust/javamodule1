package onedarray;

class Split{
Split() {  print();   }
void print() { System.out.println("A");
}
}
class B extends Split{
int i =   Math.round(3.5f);
public static void main(String[] args)  {
   Split a = new B();
   a.print();
}
void print() { System.out.println(i); }
}
