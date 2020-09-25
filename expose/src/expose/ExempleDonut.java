package expose;

public class ExempleDonut {

    public static void main(String[] args) {
        ParfumFraise donutFraise = new ParfumFraise();
        donutFraise.PatePrete();
        donutFraise.FaireLaPate();

        ParfumChocolat donutChocolat = new ParfumChocolat();
        donutChocolat.PatePrete();
        donutChocolat.FaireLaPate();
    }
}

abstract class PreparationDonut {
    public abstract void FaireLaPate();

    public void PatePrete() {
        System.out.println("Nous avons préparé la pate!");
    }
}

class ParfumFraise extends PreparationDonut {
    public void FaireLaPate() {
        System.out.println("Votre donut fraise est prêt!");
    }
}

class ParfumChocolat extends PreparationDonut {
    public void FaireLaPate() {
        System.out.println("Votre donut chocolat est prêt!");
    }
}