package charactor;

public class Hero {
    public String name;
    public int hp;
    public void kill(mortal m)
    {
        System.out.println(name+"放了一个大招");
        m.die();
    }

    public static void main(String[] args) {
        Hero gl=new Hero();
        gl.name="盖伦";
        gl.hp=500;

        ADHero a1=new ADHero();
        a1.name="寒冰射手";
        APHero a2=new APHero();
        a2.name="火男";
        ADAPHero a3=new ADAPHero();
        a3.name="泽拉斯";

       gl.kill(a1);
       gl.kill(a2);
       gl.kill(a3);

    }
}
