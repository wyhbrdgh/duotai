package charactor;

public class ADHero extends Hero implements AD,mortal {
    public void physicAttack(){};
    public void die() {
        System.out.println(name+ " 这个物理英雄挂了");
    }
}