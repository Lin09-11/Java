package draw.TankGame_;

import javax.swing.*;
import java.awt.*;

/**
 * @author lin
 * @creat 2022--11--23:15
 */
public class LinTankGame01 extends JFrame {

    //定义MyPanel
    MyPanel mp = null;
    public static void main(String[] args) {

        LinTankGame01 linTankGame01 = new LinTankGame01();
    }

    public LinTankGame01() {
        mp = new MyPanel();
        this.add(mp);//把面板(就是游戏的绘图区域)
        this.setSize(1000, 750);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}

