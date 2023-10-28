import java.lang.reflect.Array;
import java.security.Signature;
import java.util.ArrayList;

public class Train {

    private ArrayList<Wagons> wagons;

    public Train(ArrayList<Wagons> wagons) {
        this.wagons = wagons;

    }

    public void print() {
        StringBuilder stringBuilder = new StringBuilder();
        var i = 0;
        for (var item : wagons) {
            stringBuilder.append(item.representation());
            if (i != wagons.size() - 1) {
                stringBuilder.append("::");
            }
            i++;
        }
        System.out.println(stringBuilder);
    }

    public void detachHead() {
        for (int i =0;i<wagons.size();i++){
            if (wagons.get(i) instanceof Head){
                wagons.remove(i);
            }
        }
    }

    public void detachEnd() {
        for (int i =0;i<wagons.size();i++){
            if (wagons.get(i) instanceof DernierWagon){
                wagons.remove(i);
            }
        }

    }

    public void fill()throws TrainException{
        boolean notFound=true;
        for (int i =0;i<wagons.size();i++){
            if (wagons.get(i) instanceof CargoVide){
              wagons.set(i,new CargoPlein());
              notFound=false;
              return;
            }
        }
        if (notFound) throw new TrainException("all is full");
    }


}
