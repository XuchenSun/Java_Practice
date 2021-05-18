package Restaurant;

public class Restaurant {
    public static void Restaurant(String[] agrs)
    {
        int bags_of_raw_meat,bags_of_sauce;
        Chef chef_master=new Chef();

        bags_of_raw_meat=chef_master.buy_meat(10);
        bags_of_sauce=chef_master.buy_sauce(2);
    }
}

