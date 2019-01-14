package chapter6.demo1;


/**
 * Created by ${wrd} on 2017/7/31.
 *
 */
public class PokerType
{
    //单牌
    public static int SINGLE = 1;

    //对子
    public static int PAIR = 2;

    //连对
    public static int PAIR_STRAIGHT = 22;

    //三同牌不带
    public static int THREE = 30;

    // 三带一
    public static int THREE_WITH_ONE = 31;

    //三同牌带二
    public static int THREE_WITH_TWO = 32;

    //飞机不带
    public static int PLANE = 330;

    //飞机带单
    public static int PLANE_WITH_ONE = 331;

    // 飞机带二
    public static int PLANE_WITH_TWO = 332;

    //炸弹
    public static int BOMB = 40;

    // 四带一
    public static int FOUR_WITH_ONE = 41;

    // 四带二
    //public static int FOUR_WITH_TWO = 42;

    // 四带三
    public static int FOUR_WITH_THREE = 43;

    // AAA不带或带1张 为炸弹
    public static int AAAB = 111;

    // AAA带2张 最大三带二
    public static int AAA_WITH_TWO = 32;

    // AAA带3张 最大四带三
    public static int AAA_WITH_THREE = 43;

    //顺子
    public static int STRAIGHT = 5;
}

