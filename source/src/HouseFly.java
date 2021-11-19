class HouseFly   implements IPest {



    void FlyAroundYourHead(){

        System.out.println("wong wong wong !");

    }
    void LandOnThings(){
        System.out.println("pu pu pu!");

    }


    @Override
    public void BeAnnoying() {
        FlyAroundYourHead();
        LandOnThings();
    }
}