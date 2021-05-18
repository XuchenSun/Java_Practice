package Restaurant;

import JavaGUI.Time_Walker;

import javax.swing.*;

public class Main extends JFrame
{

    public Main()
    {
        setTitle("ML Set");    //设置显示窗口标题
        setSize(1600,1200);    //设置窗口显示尺寸
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    //置窗口是否可以关闭
        setVisible(true);    //设置窗口是否可见
        Time_Walker time_walker=new Time_Walker("Time Walker 1");
        time_walker.print_time();

    }
    public static void main(String[] agrs)
    {
        /*--------------------Step1: Prepare Food------------------------------------------------*/
        int raw_meat_in_bags,sauce_in_bags,raw_chicken_in_bags;
        Chef chef_master=new Chef();

        raw_meat_in_bags=chef_master.buy_meat(10);
        sauce_in_bags=chef_master.buy_sauce(2);
        raw_chicken_in_bags=chef_master.buy_chicken(3);


        /*--------------------Step2: Receive Order From Customer------------------------------------------------*/
        String order1,telephone_call_1, order_on_note1,food_based_on_order1;
        Waiter waiter1=new Waiter();
        Customer customer1=new Customer();
        telephone_call_1=customer1.call_and_order_food("Sweet and Sour Chicken");
        order_on_note1=waiter1.answer_call_and_write_order_on_note(telephone_call_1);
        waiter1.deliver_order_to_chef();

        /*--------------------Step3: Cook Food Based On Order------------------------------------------------*/
        chef_master.receive_order_from_waiter();
        food_based_on_order1=chef_master.cook_food(order_on_note1);
        raw_chicken_in_bags=chef_master.update_raw_food(raw_chicken_in_bags);
        System.out.println(raw_chicken_in_bags);


        /*--------------------Step4: Package Food Based On Order------------------------------------------------*/
        String final_product1;
        Kitchen_helper kitchen_helper1=new Kitchen_helper();
        kitchen_helper1.add_sauce_based_on_order(food_based_on_order1);
        final_product1=kitchen_helper1.package_order(food_based_on_order1);

        new Main();    //display page



    }
}