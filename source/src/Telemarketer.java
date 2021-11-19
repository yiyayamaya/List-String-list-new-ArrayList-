/**
 * @program: List-String-list-new-ArrayList-
 * @description:
 * @author: Wu Xingjian
 * @create: 2021-11-19 15:51
 **/


class Telemarketer   implements IPest {
    void CallDuringDinner(){
        System.out.println("ding ding ding ! ding ding ding !");
    }
    void ContinueTalkingWhenYouSayNo(){
        System.out.println("No!!!"+"ding ding ding ! ding ding ding !");

    }





    public void BeAnnoying() {
        CallDuringDinner();
        ContinueTalkingWhenYouSayNo();
    }
}