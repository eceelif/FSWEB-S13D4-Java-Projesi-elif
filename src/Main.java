import com.project.superhuman.Human;
import com.students.*;

public class Main {
    public static void main(String[] args) {

      /*  Human insanEgo = new Human();
        Human insanGokalp = new Human(2);
        Human humanElif  = new Human(3);


        System.out.println(insanEgo.getCityInfo());

        insanGokalp.getCityValue();
        System.out.println(insanGokalp.getCityInfo());
        insanGokalp.run(10);
        insanGokalp.run(100);


        System.out.println("Bu insan bu kadar koştu : "+ insanGokalp.runnerMeterValue());
*/
        //read from config
        Human.defaultTitle = "Yetişkin";

        Egemen egemenInsanIki = new Egemen();
        System.out.println("Egemenin sırrını söyle pls : " +egemenInsanIki.Unvan);
        System.out.println("İşte Egemenin sırrı: " + egemenInsanIki.getEgemenSecret());

        Gokalp gokalpInsanIkı = new Gokalp();
        System.out.println("Egemenin sırrına inanma");
        System.out.println("İşte Egemenin gerçek sırrı : " + gokalpInsanIkı.GetgokalpSecret());

        Elif elifInsanIki = new Elif();
        System.out.println("Gokalp in sırrını söyleme");
        System.out.println("Gokalp in sırrını söyleme : " + elifInsanIki.getElifDeneme() );


        Enes enesInsan = new Enes();
        System.out.println("Enes'in hobisi: " + enesInsan.getEnesHobie());

        Student tunc = new Student(44);
        int kanyaYas = tunc.Kanka.yas;


    }
}