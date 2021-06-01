package simpleQueue;


class Main{
    public static void main(String[] args){
        Nodo x = new Nodo();
        x.add(3);
        x.add(4);
        x.add(5);
        System.out.println(x.toString());
        x.delete();
        x.delete();
        x.delete();
        System.out.println(x.toString());
        x.add(6);
        x.add(7);
        x.add(8);
        System.out.println(x.toString());
        
    }
}