package org.makassi.composite;

public abstract class Storable {
    private String type;
    private String name;
    private int size;


    public Storable(String name) {
        this.name = name;
    }

    public Storable(String name, int size){
        this.name = name;
        this.size = size;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSize(int size) {
        this.size = size;
    }

   protected int getSize(){
       return this.size;
   };

    protected void setType(String type){
       this.type = type;
    }
    protected String getType(){
        return this.type;
    }

    protected abstract void display()   ;

    protected String getName(){
        return this.name;
    };
}
