package charactor;

public class APHero extends Hero implements AP,mortal {
    public void magicAttack() {

    }

    @Override
    public void die() {
        System.out.println(name+ " 这个魔法英雄挂了");
    }
}
