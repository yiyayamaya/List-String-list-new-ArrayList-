/**
 * @program: List-String-list-new-ArrayList-
 * @description:
 * @author: Wu Xingjian
 * @create: 2021-11-19 16:18
 **/


class DiningRoom {

    IPest[] pestsArr;

    DiningRoom( IPest[] pests) {
        this.pestsArr=pests;
    }

    void ServeDinner() {

        for (IPest iPest : pestsArr) {
            iPest.BeAnnoying();
        }

    }
}
