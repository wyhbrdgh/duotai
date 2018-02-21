package charactor;

public class ADAPHero extends Hero implements AD,AP,mortal {
    public void magicAttack()
    {

    }
    public void physicAttack(){};
    //@Override
    public void die() {
        System.out.println(name+ " 这个物理魔法英雄挂了");
    }
}
