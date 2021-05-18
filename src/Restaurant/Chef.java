package Restaurant;

public class Chef {

    /*--------------------Buy Food------------------------------------------------*/
    public int buy_sauce(int numbers_of_bags){


        int bags_of_sauce=numbers_of_bags;


        return bags_of_sauce;
    }

    public int buy_meat(int numbers_of_bags){

        int bags_of_meat = numbers_of_bags;

        return bags_of_meat;
    }
    public int buy_chicken(int numbers_of_bags){

        int bags_of_chicken = numbers_of_bags;

        return bags_of_chicken;
    }

    /*--------------------Cook Food------------------------------------------------*/

    public void receive_order_from_waiter(){}

    public String cook_food(String order_in_note){



        return order_in_note;
    }

    public int update_raw_food(int raw_food){
        raw_food=raw_food-1;
        return raw_food;
    }



}
