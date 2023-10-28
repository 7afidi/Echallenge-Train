import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws TrainException {

        // Testing all the 6 cases

        /* Question 1
        Train train=new Train(new ArrayList<>(Arrays.asList(
                new Head(),new Passager(),new Passager()
        )));

        train.print();

         */


        /* Question 2
        Train train =new Train(new ArrayList<>(Arrays.asList(
            new Head(),new Passager(),new Restaurant(),new Passager()
        )));
        train.print();

         */


        /* Question 3
         Train train=new Train(new ArrayList<>(Arrays.asList(
                new Head(),new Passager(),new Restaurant(),new Passager(),new DernierWagon()
        )));
        train.print();

         */

        /* Question 4
         Train train=new Train(new ArrayList<>(Arrays.asList(
                new Head(),new Passager(),new Restaurant(),new Passager(),new DernierWagon()
        )));
        train.detachEnd();
        train.print();
        train.detachHead();
        train.print();

         */

        /* Question 5

        Train train=new Train(new ArrayList<>(Arrays.asList(
            new Head(),new CargoVide(),new CargoVide(),new CargoVide()
        )));
        train.fill();
        train.print();;
        train.fill();
        train.print();
        train.fill();
        train.print();
        train.fill();

         */


        /* Question 6


        Train train=new Train(new ArrayList<>(Arrays.asList(

                new Head(),new Passager(),new CargoVide(),new Passager(),new CargoVide()
        )));

        train.print();
        train.fill();
        train.print();
        train.fill();
        train.print();


         */










    }
}