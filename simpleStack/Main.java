package simpleStack;

class Main{
    public static void main(String[] args){
        Nodo x = new Nodo();
        x.add(2);
        x.add(3);
        x.add(4);
        System.out.println(x.toString());
        x.delete();
        x.delete();
        x.delete();
        System.out.println(x.toString());
        x.add(5);
        x.add(6);
        x.add(7);
        System.out.println(x.toString());
    }
}