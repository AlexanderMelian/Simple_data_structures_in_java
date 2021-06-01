package simpleQueue;

public class Nodo {
    Integer val;
    Nodo nex;

    public Nodo(){
    }
    public Nodo(Integer val){
        this.val = val;
    }


    public void add(Integer val){
        if(this.val == null){
            this.val = val;
        }
        else{
            if(this.nex == null){
                this.nex = new Nodo();
                this.nex.add(val);
            }
            else{
                this.nex.add(val);
            }
        }
    }

    public void delete(){
        if(this.nex != null){
            if(this.nex.nex != null){
                this.val = this.nex.val;
                this.nex.delete();
            }
            else{
                this.val = this.nex.val;
                this.nex = null;
            }
        }
        else if(this.val != null && this.nex == null){
            this.val = null;
        }
    }
    
    @Override
    public String toString() {
        return "Nodo [val=" + val +" + nex = "+nex+"]";
    }
    
}
