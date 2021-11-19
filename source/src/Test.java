/**
 * @program: List-String-list-new-ArrayList-
 * @description:
 * @author: Wu Xingjian
 * @create: 2021-11-19 16:10
 **/


public class Test {
    public static void main(String[] args) {

        Telemarketer telemarketer1 = new Telemarketer();
        Telemarketer telemarketer2 = new Telemarketer();

        HouseFly houseFly1 = new HouseFly();
        HouseFly houseFly2 = new HouseFly();

        IPest[] iPestsArr=new IPest[]{telemarketer1,telemarketer2,houseFly1,houseFly2};


        DiningRoom diningRoom = new DiningRoom(iPestsArr);

        diningRoom.ServeDinner();


    }
}
