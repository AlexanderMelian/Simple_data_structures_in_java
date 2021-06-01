package priorityQueue;


class Main{
    public static void main(String[] args){
        Nodo x = new Nodo();
        x.add(3);
        x.add(2);
        x.add(1);
        System.out.println(x.toString());
        x.delete();
        x.delete();
        x.delete();
        System.out.println(x.toString());
        x.add(8);
        x.add(7);
        x.add(6);
        System.out.println(x.toString());
        
    }
}