public class MiniSimulateur {
    public static void main(String[] args) {
        // Création d'un colvert avec vol normal et coincoin
        Canard colvert = new Colvert();
        colvert.setComportementVol(new VolerAvecDesAiles());
        colvert.setComportementCancan(new Coincoin());
        colvert.afficher();
        colvert.effectuerVol();
        colvert.effectuerCancan();
        colvert.nager();
        System.out.println();

        // Création d'un canard en plastique qui ne vole pas et est muet
        Canard canardPlastique = new CanardEnPlastique();
        canardPlastique.setComportementVol(new NePasVoler());
        canardPlastique.setComportementCancan(new CanardMuet());
        canardPlastique.afficher();
        canardPlastique.effectuerVol();
        canardPlastique.effectuerCancan();
        canardPlastique.nager();
        System.out.println();

        // Creation d'un leurre avec propulsion à réaction et cancan normal
        Canard leurre = new Leurre();
        leurre.setComportementVol(new PropulsionAReaction());
        leurre.setComportementCancan(new Cancan());
        leurre.afficher();
        leurre.effectuerVol();
        leurre.effectuerCancan();
        leurre.nager();
        System.out.println();

        // Création d'un mandaria avec vol normal et coincoin
        Canard mandaria = new Mandaria();
        mandaria.setComportementVol(new VolerAvecDesAiles());
        mandaria.setComportementCancan(new Coincoin());
        mandaria.afficher();
        mandaria.effectuerVol();
        mandaria.effectuerCancan();
        mandaria.nager();
        System.out.println();

        // Création d'un prototype de canard (comportements déjà définis dans le constructeur : 
        //NePasVoler et Cancan)
        Canard prototype = new PrototypeCanard();
        prototype.afficher();
        prototype.effectuerVol();
        prototype.effectuerCancan();
        prototype.nager();
        System.out.println();

        // Exemple de changement dynamique de comportement : 
        //le colvert apprend à voler avec un réacteur et change son cancan
        System.out.println("Changement dynamique du comportement de vol et de cancan du colvert :");
        colvert.setComportementVol(new PropulsionAReaction());
        colvert.setComportementCancan(new Cancan());
        colvert.effectuerVol();
        colvert.effectuerCancan();
        System.out.println();

        // Autre exemple : un leurre qui devient muet et ne vole plus
        System.out.println("Changement dynamique du leurre :");
        leurre.setComportementVol(new NePasVoler());
        leurre.setComportementCancan(new CanardMuet());
        leurre.effectuerVol();
        leurre.effectuerCancan();
        System.out.println();

    }
}
