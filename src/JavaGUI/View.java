package JavaGUI;

import javax.swing.*;
import java.awt.*;

public class View {
    public void View(){

        setTitle("ML Set");    //设置显示窗口标题
        setSize(1600,1200);    //设置窗口显示尺寸
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    //置窗口是否可以关闭
        JLabel jl=new JLabel("这是使用JFrame类创建的窗口");    //创建一个标签
        Container c=getContentPane();    //获取当前窗口的内容窗格
        c.add(jl);    //将标签组件添加到内容窗格上
        setVisible(true);    //设置窗口是否可见

    }

    private Container getContentPane() {
        return getContentPane();
    }

    private void setVisible(boolean b) {
        setVisible(b);
    }

    private void setDefaultCloseOperation(int exitOnClose) {
        setDefaultCloseOperation(exitOnClose);
    }

    private void setSize(int i, int i1) {
        setSize(i,i1);
    }

    private void setTitle(String ml_set) {
        setTitle(ml_set);
    }


}
