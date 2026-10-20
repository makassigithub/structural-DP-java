package org.makassi.composite;

public class File extends Storable{
   public File(String name, int size){
     super(name,size);
     this.setType("file");
   }

    @Override
    public void display() {
        System.out.println( this.getType() + "--" + this.getName()+"("+this.getSize()+"kb)");
    }
}
