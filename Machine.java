public class Machine {
    private Item[][] items ;

    public Machine(Item[][] items){
        this.items = new Item[items.length][items[0].length];
        for(int i =0;i<items.length;i++){
            for (int j =0;j<items[i].length;j++){
                this.items[i][j]  = new Item(items[i][j]);

            }
        }
    }

    public Item getItem(int row,int spot){
        return new Item(this.items[row][spot]);
    }

    public void setItem(Item item,int row,int spot){
        this.items[row][spot] = new Item(item);
    }
    

    public boolean dispense(int row,int spot){
        if(this.items[row][spot].getquantity()>0){
            this.items[row][spot].setquantity(this.items[row][spot].getquantity()-1);
            return true;
        }
        return false;
    }

     public String toString(){
        String temp=" ";
        for (int i = 0; i < items.length; i++) {
            temp+="\t";
            for (int j =0;j<items[0].length;j++) {
                temp += this.items[i][j].toString();
            }
            temp += "\n\n";
        }
        return temp;
     }





}
