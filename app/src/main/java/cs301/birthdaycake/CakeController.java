package cs301.birthdaycake;

public class CakeController {

    private CakeView cakeView;

    private CakeModel modelOfCake;

    public CakeController (CakeView viewOfCake){

        this.cakeView = viewOfCake;
        this.modelOfCake = viewOfCake.getCakeModel();
    }
}
