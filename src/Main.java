

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.*;
public class Main extends JFrame
{
    public Main()
    {
        setTitle("ML Set");    //设置显示窗口标题
        setSize(1600,1200);    //设置窗口显示尺寸
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    //置窗口是否可以关闭
        setVisible(true);    //设置窗口是否可见
    }
    public static void main(String[] agrs)
    {
        new Main();    //创建一个实例化对象
    }
}